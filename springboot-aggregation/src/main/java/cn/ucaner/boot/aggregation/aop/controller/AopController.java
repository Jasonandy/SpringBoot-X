/*
 * <html>
 * <body>
 * <P> Copyright (c) 2017. </p>
 * <p> All rights reserved.</p>
 * <p> Created by Jason</p>
 * </body>
 * </html>
 */
package cn.ucaner.boot.aggregation.aop.controller;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.ucaner.boot.aggregation.aop.annotation.BusinessLogAnnotation;

@RestController
public class AopController {

	private static final Logger LOGGER = LoggerFactory.getLogger(AopController.class);

	@RequestMapping("/")
	public Object index(HttpServletRequest request) {
		Enumeration<String> enums = request.getParameterNames();
		List<String> params = new ArrayList<>();
		while (enums.hasMoreElements()) {
			String paraName = enums.nextElement();
			String param = paraName + ":" + request.getParameter(paraName);
			LOGGER.info(param);
			params.add(param);
		}
		return params;
	}


	@RequestMapping("/log")
	@BusinessLogAnnotation("查看log")
	public Object log(HttpServletRequest request) {
		//获取请求的url
		return request.getRequestURL();
	}
}
