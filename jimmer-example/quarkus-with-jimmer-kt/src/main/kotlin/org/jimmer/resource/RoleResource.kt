package org.jimmer.resource

import jakarta.annotation.Resource
import jakarta.inject.Inject
import jakarta.ws.rs.*
import jakarta.ws.rs.core.MediaType
import jakarta.ws.rs.core.Response
import org.jimmer.domain.Role
import org.jimmer.repository.RoleRepository

/**
 * @author jhlz
 * @since 2024/4/17 14:23
 * @version x.x.x
 */
@Path("/role")
@Resource
class RoleResource @Inject constructor(val roleRepository: RoleRepository) {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    fun add(role: Role) = Response.ok(roleRepository.addRole(role)).build()

    @GET
    @Path("/{id}")
    fun getRoleById(@PathParam("id") id: Long) = Response.ok(roleRepository.getRoleById(id)).build()

    @DELETE
    @Path("/{id}")
    fun deleteRoleById(@PathParam("id") id: Long) = Response.ok(roleRepository.deleteRoleById(id)).build()
}