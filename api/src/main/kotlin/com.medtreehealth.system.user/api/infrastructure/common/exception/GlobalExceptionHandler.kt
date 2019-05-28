package com.medtreehealth.system.user.api.infrastructure.common.exception

import com.medtreehealth.system.user.api.infrastructure.common.CustomResponseEntity
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler
import java.lang.reflect.UndeclaredThrowableException
import javax.servlet.http.HttpServletRequest

/**
 *@author honorstone
 *@date 2019/5/28 12:12
 */
@RestControllerAdvice
class GlobalExceptionHandler : ResponseEntityExceptionHandler() {

    private val PRINT_FORMAT: String = "---DefaultException Handler---Host {} invokes url {} ERROR: {}";


    private val log: Logger = LoggerFactory.getLogger(GlobalExceptionHandler::class.java)

    @ExceptionHandler(Exception::class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    fun defaultErrorHandler(req: HttpServletRequest, e: Exception): ResponseEntity<CustomResponseEntity<Any>> = run {
        val err = e.message ?: let { (e as UndeclaredThrowableException).undeclaredThrowable.message }


        log.info(PRINT_FORMAT, req.getRemoteHost(), req.getRequestURL(), err ?: "")
        ResponseEntity.status(HttpStatus.OK)
                .body(CustomResponseEntity(
                        0,
                        err ?: ""
                ))
    }
}