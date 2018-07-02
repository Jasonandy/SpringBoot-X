/*
 * <html>
 * <body>
 * <P> Copyright (c) 2017. </p>
 * <p> All rights reserved.</p>
 * <p> Created by Jason</p>
 * </body>
 * </html>
 */

package cn.ucaner.boot.aggregation.servlet.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


/**
* @Title: ServletController
* @Package cn.ucaner.servlet.controller
* @Description: ServletController
* @Author Jason
* @Creator
* @Date 2017/12/10 -- 11:41
* @version V1.0
*/
@RestController
@RequestMapping("/servlet")
public class ServletController {

	@RequestMapping("/index")
	public Object index() {
		return new Date() + " - index";
	}
	
	@RequestMapping("/filter1")
	public Object filter1() {
		return new Date() + " - filter1";
	}
	
	@RequestMapping("/filter2")
	public Object filter2() {
		return new Date() + " - filter2";
	}
}
