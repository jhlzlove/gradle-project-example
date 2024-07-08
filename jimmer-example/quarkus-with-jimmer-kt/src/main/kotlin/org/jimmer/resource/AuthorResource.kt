package org.jimmer.resource

import jakarta.ws.rs.*
import jakarta.ws.rs.core.MediaType
import jakarta.ws.rs.core.Response
import org.babyfish.jimmer.sql.kt.KSqlClient
import org.babyfish.jimmer.sql.kt.ast.expression.eq
import org.jimmer.domain.Author
import org.jimmer.domain.id
import org.jimmer.repository.AuthorRepository

/**
 * @author jhlz
 * @version x.x.x
 */
@Path("/author")
class AuthorResource(
    private val authorRepository: AuthorRepository,
    private val sqlClient: KSqlClient
) {
    /**
     * 分页查询
     */
    @GET
    @Path("/list")
    fun page(
        @DefaultValue("0") @QueryParam("pageNum") pageNum: Int,
        @DefaultValue("1") @QueryParam("pageSize")  pageSize: Int
    ): Response {
        return Response.ok(
            sqlClient.createQuery(Author::class) {
                select(table)
            }.fetchPage(pageNum, pageSize)
        ).build()
    }

    /**
     * 查询
     */
    @GET
    @Path("/{id}")
    fun getAuthor(@PathParam("id") id: Long): Response {
        return Response.ok(
            sqlClient.createQuery(Author::class) {
                where(table.id eq id)
                select(table)
            }.execute()
        ).build()
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    fun addOrUpdate(author: Author): Response = Response.ok(authorRepository.addOrUpdate(author)).build()

    /**
     * 删除
     */
    @DELETE
    @Path("/{id}")
    fun delete(@PathParam("id") id: Long): Response {
        return Response.ok(
            sqlClient.deleteById(Author::class, id)
        ).build()
    }
}