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
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
* @Title: WebAppAllFilter
* @Package cn.ucaner.servlet.config.filter
* @Description: 过滤所有的请求
* @Author Jason
* @Creator
* @Date 2017/12/10 -- 11:40
* @version V1.0
*/
@WebFilter(filterName = "WebAppAllFilter", urlPatterns = { "/*" })
@Order(1) // 定义执行的优先级，数字越低，优先级越高
public class WebAppAllFilter implements Filter {

	private static final Logger LOGGER = LoggerFactory.getLogger(WebAppAllFilter.class);


	/**
	 * 初始化
	 * @param arg0
	 * @throws ServletException
	 */
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		LOGGER.info("WebAppAllFilter - {} -- 初始化注解实现的过滤器...", new Date());
	}


	/**
	 * 责任链模式
	 * @param arg0 请求
	 * @param arg1 响应
	 * @param arg2 过滤链
	 * @throws IOException
	 * @throws ServletException
	 */
	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) arg0;
        LOGGER.info("WebAppAllFilter - Request URL: {}", request.getRequestURL().toString());
        LOGGER.info("WebAppAllFilter - Request port：{}", request.getServerPort());
        LOGGER.info("WebAppAllFilter - Request Method: {}", request.getMethod());
		HttpServletResponse response = (HttpServletResponse) arg1;
		response.setHeader("Current-Path", request.getServletPath());
		response.setHeader("Filter-Name", "WebAppAllFilter");
		response.setHeader("My-Name", "Jason");
		arg2.doFilter(arg0, arg1);
	}

	/**
	 * 销毁
	 */
	@Override
	public void destroy() {
		LOGGER.info("WebAppAllFilter - 注解实现的过滤器已销毁...");
	}

}
