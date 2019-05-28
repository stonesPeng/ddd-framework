package com.medtreehealth.system.user.api.infrastructure.common

/**
 *@author honorstone
 *@date 2019/5/23 18:21
 */
data class CustomResponseEntity<T : Any>(
        val code: Int,
        val message: String,
        val data: T?

) {
    override fun toString(): String {
        return "CustomResponseEntity(code=$code, message='$message', data=$data)"
    }

}