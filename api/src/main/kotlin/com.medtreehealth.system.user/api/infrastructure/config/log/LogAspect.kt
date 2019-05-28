package com.medtreehealth.system.user.api.infrastructure.config.log

import org.aspectj.lang.JoinPoint
import org.aspectj.lang.annotation.AfterReturning
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.aspectj.lang.annotation.Pointcut
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import org.springframework.validation.Errors
import java.util.*
import javax.servlet.http.HttpServletResponse

/**
 * @author honorstone
 * @date 2019/4/4 11:12
 */
@Component
@Aspect
class LogAspect {

    private val log: Logger = LoggerFactory.getLogger(LogAspect::class.java)

    @Pointcut("execution(public * com.medtreehealth.system.user.api.controller..*.*(..))")
    fun pointcut() {
        // point cut empty body
    }

    @Before("pointcut()")
    fun logMethodInvokeParam(joinPoint: JoinPoint) {
        val param = listOf(joinPoint.args).filter { o -> Objects.nonNull(o) && o !is HttpServletResponse && o !is Errors }
                .map { i -> i.toString() }
                .reduce { o, t -> "($o), ($t)" }
        log.info("Method:[{}], ParamsDto:[{}]", joinPoint.signature.name, param)
    }

    @AfterReturning(pointcut = "pointcut()", returning = "result")
    fun logMethodReturn(joinPoint: JoinPoint, result: Any?): Any? {
        log.info("Method:[{}], Result:[{}]", joinPoint.signature.name, result?.toString() ?: "null")
        return result
    }

}
