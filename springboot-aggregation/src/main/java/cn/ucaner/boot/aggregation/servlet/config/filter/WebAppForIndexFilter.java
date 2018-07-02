/*
 * <html>
 * <body>
 * <P> Copyright (c) 2017. </p>
 * <p> All rights reserved.</p>
 * <p> Created by Jason</p>
 * </body>
 * </html>
 */

package cn.ucaner.boot.aggregation.servlet.config.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
* @Title: WebAppForIndexFilter
* @Package cn.ucaner.servlet.config.filter
* @Description: 过滤index请求
* @Author Jason
* @Creator
* @Date 2017/12/10 -- 11:40
* @version V1.0
*/
//@WebFilter(filterName = "WebAppForIndexFilter", urlPatterns = { "/servlet/index" })
@Order(-5)
public class WebAppForIndexFilter implements Filter {

	private static final Logger LOGGER = LoggerFactory.getLogger(WebAppForIndexFilter.class);

    /**
     * 初始化
     * @param arg0
     * @throws ServletException
     */
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		LOGGER.info("WebAppForIndexFilter - {} -- 初始化SpringBean注册的过滤器...", new Date());
	}


    /**
     * 过滤处理
     * @param arg0
     * @param arg1
     * @param arg2
     * @throws IOException
     * @throws ServletException
     */
	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) arg0;
		
        LOGGER.info("WebAppForIndexFilter - Request URL: {}", request.getRequestURL().toString());
        LOGGER.info("WebAppForIndexFilter - Request port：{}", request.getServerPort());
        LOGGER.info("WebAppForIndexFilter - Request Method: {}", request.getMethod());
        
		HttpServletResponse response = (HttpServletResponse) arg1;
		response.setHeader("Current-Path", request.getServletPath());
        response.setHeader("Filter-Name", "WebAppForIndexFilter");
		response.setHeader("My-Name", "Andy");
		arg2.doFilter(arg0, arg1);
	}

	/**
	 * 销毁
	 */
	@Override
	public void destroy() {
		LOGGER.info("WebAppForIndexFilter - SpringBean注册的过滤器已销毁...");
	}
}
