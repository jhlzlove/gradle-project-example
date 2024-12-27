package org.jimmer.resource

import jakarta.ws.rs.*
import jakarta.ws.rs.core.MediaType
import jakarta.ws.rs.core.Response
import org.babyfish.jimmer.sql.kt.KSqlClient
import org.babyfish.jimmer.sql.kt.ast.expression.eq
import org.jimmer.domain.Book
import org.jimmer.domain.id

/**
 * @author jhlz
 * @version x.x.x
 */
@Path("/book")
class BookResource(
    private val sqlClient: KSqlClient
) {

    @GET
    @Path("/list")
    fun page(
        @DefaultValue("0") @QueryParam("pageNum") pageNum: Int,
        @DefaultValue("1") @QueryParam("pageSize")  pageSize: Int
    ): Response {
        return Response.ok(
            sqlClient.createQuery(Book::class) {
                select(table)
            }.fetchPage(pageNum, pageSize)
        ).build()
    }

    @GET
    @Path("/{id}")
    fun getBook(@PathParam("id") id: Long): Response {
        return Response.ok(
            sqlClient.createQuery(Book::class) {
                where(table.id eq id)
                select(table)
            }.execute()
        ).build()
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    fun addOrUpdate(book: Book) = sqlClient.save(book)

    @DELETE
    @Path("/{id}")
    fun delete(@PathParam("id") id: Long) =  sqlClient.deleteById(Book::class, id)

}