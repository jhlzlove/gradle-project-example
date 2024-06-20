package org.jimmer.domain

/**
 * @author jhlz
 * @version x.x.x
 */
data class R<T>(val code: Int, val message: String, val data: T?) {
    companion object {
        fun <T> ok(data: T?): R<T> {
            return R(200, "OK", data)
        }

        fun ok(): R<Any> {
            return ok(null)
        }
    }

}