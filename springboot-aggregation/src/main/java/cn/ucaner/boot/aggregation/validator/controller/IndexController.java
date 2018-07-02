/*
 * <html>
 * <body>
 * <P> Copyright (c) 2017. </p>
 * <p> All rights reserved.</p>
 * <p> Created by Jason</p>
 * </body>
 * </html>
 */
package cn.ucaner.boot.aggregation.validator.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.ucaner.boot.aggregation.validator.model.Other;
import cn.ucaner.boot.aggregation.validator.model.User;

/**
* @Title: IndexController
* @Package cn.ucaner.validator.controller
* @Description: IndexController
* @Author Jason
* @Creator
* @Date 2017/12/10 -- 12:46
* @version V1.0
*/
@Controller
public class IndexController {

    @RequestMapping("/")
    public ModelAndView index() {

        return new ModelAndView("index");
    }

    @RequestMapping("/saveUser")
    public ModelAndView saveUser(@Validated User user, BindingResult userResult, @Validated Other other, BindingResult otherResult, Model model) {
        List<Map<String, String>> errorList = new ArrayList<>();

        loadErrorList(userResult, errorList);
        loadErrorList(otherResult, errorList);

        model.addAttribute("user", user);
        model.addAttribute("other", other);
        model.addAttribute("errorList", errorList);
        return new ModelAndView("index");
    }

    private void loadErrorList(BindingResult userResult, List<Map<String, String>> errorList) {
        Map<String, String> map = null;
        if (userResult.hasErrors()) {
            List<FieldError> errors = userResult.getFieldErrors();
            for (FieldError error : errors) {
                map = new HashMap<String, String>();
                map.put("field", error.getField());
                map.put("message", error.getDefaultMessage());
                errorList.add(map);
            }
        }
    }
}
