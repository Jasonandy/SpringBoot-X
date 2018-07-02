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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.resource.ResourceUrlProvider;

/**
* @Title: ResourceUrlProviderController
* @Package cn.ucaner.freemark.controller
* @Description: 处理静态资源URL:资源名称md5方式
 * <p/>
 * 页面引用方式：<code>${urls.getForLookupPath('/js/jquery.js') }</code>
 * <p/>
 * appliction.properties文件中添加如下配置：
 *      spring.resources.chain.strategy.content.enabled=true
 *      spring.resources.chain.strategy.content.paths=/**
 * <p/>
* @Author Jason
* @Creator
* @Date 2017/12/9 -- 23:08
* @version V1.0
*/
@ControllerAdvice
public class ResourceUrlProviderController {

    @Autowired
    private ResourceUrlProvider resourceUrlProvider;

    /**
     * 获取静态资源的工具
     * @return
     */
    @ModelAttribute("urls")
    public ResourceUrlProvider urls() {
        return this.resourceUrlProvider;
    }
}