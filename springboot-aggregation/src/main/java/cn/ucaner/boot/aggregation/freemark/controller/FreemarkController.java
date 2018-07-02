/*
 * <html>
 * <body>
 * <P> Copyright (c) 2017. </p>
 * <p> All rights reserved.</p>
 * <p> Created by Jason</p>
 * </body>
 * </html>
 */
package cn.ucaner.boot.aggregation.freemark.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
* @Package：cn.ucaner.boot.aggregation.freemark.controller   
* @ClassName：FreemarkController   
* @Description：   <p> FreemarkController </p>
* @Author： - Jason   
* @CreatTime：2018年7月2日 上午10:54:16   
* @Modify By：   
* @ModifyTime：  2018年7月2日
* @Modify marker：   
* @version    V1.0
 */
@Controller
public class FreemarkController {

	@RequestMapping("/")
	public String index(Model model) {
		return "index";
	}

	@RequestMapping("/toUpload")
	public String toUpload(Model model) {
		return "upload";
	}

	@RequestMapping("/toFormdata")
	public String formdata(Model model) {
		return "formdata";
	}

	@RequestMapping("/upload")
	@ResponseBody
	public String upload(@RequestParam("file") MultipartFile[] files, String name,HttpServletRequest request) {
		if(files != null){
			for(MultipartFile file : files){
				System.out.println(file.getOriginalFilename());
			}
		}
		System.out.println(request.getParameter("name"));
		return name;
	}

	@RequestMapping("/formdata")
	@ResponseBody
	public String formdata(@RequestParam("file") MultipartFile[] files, String name,HttpServletRequest request) {
		if(files != null){
			for(MultipartFile file : files){
				System.out.println(file.getOriginalFilename());
			}
		}
		System.out.println(request.getParameter("name"));
		return name;
	}
}
