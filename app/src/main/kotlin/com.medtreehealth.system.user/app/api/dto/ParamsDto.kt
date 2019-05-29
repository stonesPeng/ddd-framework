package com.medtreehealth.system.user.app.api.dto

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

/**
 *@author honorstone
 *@date 2019/5/28 9:53
 */
@ApiModel(value="参数数据传输对象")
data class ParamsDto (

        @ApiModelProperty(value="id" ,required=true) @NotNull(message = "应用编号非空")
        private val id:Long,
        @ApiModelProperty(value="name" ,required=true) @NotBlank(message = "姓名非空")
        private val name:String
) {
        override fun toString(): String {
                return "ParamsDto(id=$id, name='$name')"
        }
}