package cn.ucaner.boot.freemark.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.resource.ResourceUrlProvider;

/**
* @Package：cn.ucaner.boot.freemark.controller   
* @ClassName：ResourceUrlProviderController   
* @Description：   <p> 处理静态资源URL:资源名称md5方式 </p>
* <p>
* 页面引用方式：<code>${urls.getForLookupPath('/js/jquery.js') }</code>
* 	appliction.properties文件中添加如下配置：
* 		spring.resources.chain.strategy.content.enabled=true
* 		spring.resources.chain.strategy.content.paths=/**
* </p>
* @Author： - Jason   
* @CreatTime：2018年7月1日 下午4:01:16   
* @Modify By：   
* @ModifyTime：  2018年7月1日
* @Modify marker：   
* @version    V1.0
 */
@ControllerAdvice
public class ResourceUrlProviderController {

    @Autowired
    private ResourceUrlProvider resourceUrlProvider;

    @ModelAttribute("urls")
    public ResourceUrlProvider urls() {
        return this.resourceUrlProvider;
    }
}