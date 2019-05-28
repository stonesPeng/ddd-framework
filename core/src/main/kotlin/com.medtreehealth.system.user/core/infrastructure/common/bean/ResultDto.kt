package com.medtreehealth.system.user.core.infrastructure.common.bean

/**
 *@author honorstone
 *@date 2019/5/22 17:13
 */
data class ResultDto<T> (
        val status:Boolean,
        val message:String?=null,
        val data:T?=null
)