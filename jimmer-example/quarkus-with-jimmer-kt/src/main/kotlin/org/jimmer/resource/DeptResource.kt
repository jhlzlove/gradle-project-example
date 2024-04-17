package org.jimmer.resource

import jakarta.annotation.Resource
import jakarta.inject.Inject
import jakarta.ws.rs.Consumes
import jakarta.ws.rs.POST
import jakarta.ws.rs.Path
import jakarta.ws.rs.core.Response
import org.jimmer.domain.Dept
import org.jimmer.repository.DeptRepository

/**
 * @author jhlz
 * @since 2024/4/17 13:55
 * @version x.x.x
 */
@Resource
@Path("/dept")
class DeptResource @Inject constructor(val deptRepository: DeptRepository) {

    @POST
    @Consumes("application/json")
    @Path("/add")
    fun addDept(dept: Dept): Response {
        return Response.ok(deptRepository.addDept(dept)).build()
    }
}