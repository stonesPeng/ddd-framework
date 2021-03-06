package com.medtreehealth.system.user.app.infrastructure.common

/**
 *@author honorstone
 *@date 2019/5/23 18:21
 */
data class CustomResponseEntity<T : Any>(
        val code: Int,
        val message: String,
        val data: T? = null

) {
    override fun toString(): String {
        return "CustomResponseEntity(code=$code, message='$message', data=$data)"
    }

}