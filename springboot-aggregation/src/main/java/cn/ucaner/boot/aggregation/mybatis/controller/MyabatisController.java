/*
 * <html>
 * <body>
 * <P> Copyright (c) 2017. </p>
 * <p> All rights reserved.</p>
 * <p> Created by Jason</p>
 * </body>
 * </html>
 */

package cn.ucaner.boot.aggregation.mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageHelper;

import cn.ucaner.boot.aggregation.mybatis.entity.Message;
import cn.ucaner.boot.aggregation.mybatis.entity.PageBean;
import cn.ucaner.boot.aggregation.mybatis.service.IMessageService;

/**
* @Title: MyabatisController
* @Package cn.ucaner.mybatis.controller
* @Description: MyabatisController 
* @Author Jason
* @Creator
* @Date 2017/12/10 -- 0:43
* @version V1.0
*/
@Controller
public class MyabatisController {

    @Autowired
    private IMessageService messageService;

    @RequestMapping("/{currentPage}/{pageSize}")
    public String index(Model model, @PathVariable("currentPage") int currentPage, @PathVariable("pageSize") int pageSize) {
        // 指定当前需要显示的页码(currentPage),页面列表长度（pageSize）
        PageHelper.startPage(currentPage, pageSize);
        model.addAttribute("page", new PageBean<Message>(messageService.list()));
        return "index";
    }

}
