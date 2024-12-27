package org.jimmer.resource

import jakarta.ws.rs.*
import jakarta.ws.rs.core.MediaType
import jakarta.ws.rs.core.Response
import org.babyfish.jimmer.sql.kt.KSqlClient
import org.jimmer.domain.Store
import org.jimmer.domain.fetchBy

/**
 * @author jhlz
 * @version x.x.x
 */
@Path("/store")
class StoreResource(
    private val sqlClient: KSqlClient
) {

    @GET
    @Path("/list")
    fun page(
        @DefaultValue("0") @QueryParam("pageNum") pageNum: Int,
        @DefaultValue("1") @QueryParam("pageSize") pageSize: Int
    ): Response {
        return Response.ok(
            sqlClient.createQuery(Store::class) {
                select(
                    table.fetchBy {
                        storeName()
                        books {
                            bookName()
                            authors {
                                username()
                            }
                        }
                    }
                )
            }.fetchPage(pageNum, pageSize)
        ).build()
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    fun addOrUpdate(store: Store) = sqlClient.save(store)

    @DELETE
    @Path("/{id}")
    fun deleteById(@PathParam("id") id: Long) = sqlClient.deleteById(Store::class, id)
}