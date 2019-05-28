package com.medtreehealth.system.user.api.controller

import com.medtreehealth.system.user.api.application.dto.ParamsDto
import com.medtreehealth.system.user.api.infrastructure.common.CustomResponseEntity
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

/**
 *@author honorstone
 *@date 2019/5/28 9:50
 */
@RestController
@Api(tags = ["测试接口管理"], value = "APIs for Test ")
class ExampleController {
    private val log:Logger = LoggerFactory.getLogger(ExampleController::class.java)

    @ApiOperation("测试方法")
    @PostMapping("/test")
    fun testMethod(@RequestBody dto:ParamsDto):CustomResponseEntity<String> = run{
        throw Exception("abcdasdadad")
            CustomResponseEntity(1, "", "bingo $dto")
    }

}