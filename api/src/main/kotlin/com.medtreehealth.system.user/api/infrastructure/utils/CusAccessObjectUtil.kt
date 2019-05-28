package com.medtreehealth.system.user.api.infrastructure.utils

import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

/**
 * @author honorstone
 * @date 2019/4/4 10:58
 */
object CusAccessObjectUtil {
    /**
     * 获取用户真实IP地址，不使用request.getRemoteAddr();的原因是有可能用户使用了代理软件方式避免真实IP地址,
     *
     *
     * 可是，如果通过了多级反向代理的话，X-Forwarded-For的值并不止一个，而是一串IP值，究竟哪个才是真正的用户端的真实IP呢？
     * 答案是取X-Forwarded-For中第一个非unknown的有效IP字符串。
     *
     *
     * 如：X-Forwarded-For：192.168.1.110, 192.168.1.120, 192.168.1.130,
     * 192.168.1.100
     *
     *
     * 用户真实IP为： 192.168.1.110
     *
     * @param request
     * @return
     */
    fun getIpAddress(request: HttpServletRequest): String? {
        var ip: String? = request.getHeader("x-forwarded-for")
        if (ip == null || ip.length == 0 || "unknown".equals(ip, ignoreCase = true)) {
            ip = request.getHeader("Proxy-Client-IP")
        }
        if (ip == null || ip.length == 0 || "unknown".equals(ip, ignoreCase = true)) {
            ip = request.getHeader("WL-Proxy-Client-IP")
        }
        if (ip == null || ip.length == 0 || "unknown".equals(ip, ignoreCase = true)) {
            ip = request.getHeader("HTTP_CLIENT_IP")
        }
        if (ip == null || ip.length == 0 || "unknown".equals(ip, ignoreCase = true)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR")
        }
        if (ip == null || ip.length == 0 || "unknown".equals(ip, ignoreCase = true)) {
            ip = request.remoteAddr
        }
        return ip
    }

    fun doGet(request: HttpServletRequest, response: HttpServletResponse) {
        val uri = request.requestURI//返回请求行中的资源名称
        val url = request.requestURL.toString()//获得客户端发送请求的完整url
        val ip = request.remoteAddr//返回发出请求的IP地址
        val params = request.queryString//返回请求行中的参数部分
        val host = request.remoteHost//返回发出请求的客户机的主机名
        val port = request.remotePort//返回发出请求的客户机的端口号。
        println(ip)
        println(url)
        println(uri)
        println(params)
        println(host)
        println(port)
    }
}
