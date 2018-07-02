/*
 * <html>
 * <body>
 * <P> Copyright (c) 2017. </p>
 * <p> All rights reserved.</p>
 * <p> Created by Jason</p>
 * </body>
 * </html>
 */

package cn.ucaner.boot.aggregation.servlet;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;

import cn.ucaner.boot.aggregation.servlet.config.filter.WebAppForIndexFilter;
import cn.ucaner.boot.aggregation.servlet.config.listener.WebAppListener2;

/**
* @Title: Applaction
* @Package cn.ucaner.servlet
* @Description: Applaction
* @Author Jason
* @Creator
* @Date 2017/12/10 -- 11:42
* @version V1.0
*/
@SpringBootApplication
@ServletComponentScan
public class Applaction {

	/**
	 * @Description: webAppForIndexFilterRegistrationBean
	 * @return FilterRegistrationBean
	 * @Autor: Jason
	 */
    @Bean
    public FilterRegistrationBean webAppForIndexFilterRegistrationBean() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setName("webAppForIndexFilter");
        WebAppForIndexFilter webAppForIndexFilter = new WebAppForIndexFilter();
        registrationBean.setFilter(webAppForIndexFilter);
        registrationBean.setOrder(-1);
        List<String> urlList = new ArrayList<>();
        urlList.add("/servlet/index");
        registrationBean.setUrlPatterns(urlList);
        return registrationBean;
    }

    /**
     * @Description: servletListenerRegistrationBean
     * @return ServletListenerRegistrationBean<WebAppListener2>
     * @Autor: Jason
     */
    @Bean
    public ServletListenerRegistrationBean<WebAppListener2> servletListenerRegistrationBean() {
        ServletListenerRegistrationBean<WebAppListener2> servletListenerRegistrationBean = new ServletListenerRegistrationBean<>();
        servletListenerRegistrationBean.setListener(new WebAppListener2());
        return servletListenerRegistrationBean;
    }


    /**
     * @Description: Just for test
     * @Autor: Jason
     */
    public static void main(String[] args) {
        SpringApplication.run(Applaction.class, args);
    }
}
