package org.jimmer

import io.quarkus.test.common.http.TestHTTPEndpoint
import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import org.hamcrest.CoreMatchers.notNullValue
import org.jimmer.resource.AuthorResource
import org.junit.jupiter.api.Test

@QuarkusTest
class QuarkusMainTest {

    @Test
    @TestHTTPEndpoint(AuthorResource::class)
    fun getAuthor() {
        given().`when`()
            .contentType("application/json")
            .get("/list")
            .then()
            .body("rows", notNullValue())
    }

}