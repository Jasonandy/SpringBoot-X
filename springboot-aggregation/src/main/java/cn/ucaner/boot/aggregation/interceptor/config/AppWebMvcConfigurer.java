/*
 * <html>
 * <body>
 * <P> Copyright (c) 2017. </p>
 * <p> All rights reserved.</p>
 * <p> Created by Jason</p>
 * </body>
 * </html>
 */
package cn.ucaner.boot.aggregation.interceptor.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import cn.ucaner.boot.aggregation.interceptor.interceptor.CustomInterceptor1;
import cn.ucaner.boot.aggregation.interceptor.interceptor.CustomInterceptor2;

/**
* @Title: AppWebMvcConfigurer
* @Package cn.ucaner.interceptor.config
* @Description: AppWebMvcConfigurer
* @Author Jason
* @Creator
* @Date 2017/12/10 -- 12:29
* @version V1.0
*/
@Configuration
public class AppWebMvcConfigurer extends WebMvcConfigurerAdapter {

    public void addInterceptors(InterceptorRegistry registry) {
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
        registry.addInterceptor(new CustomInterceptor1())
                .excludePathPatterns("/error1/**")
                .addPathPatterns("/random1/**");
        registry.addInterceptor(new CustomInterceptor2())
                .excludePathPatterns("/error1/**")
                .addPathPatterns("/random2/**");
        super.addInterceptors(registry);
    }

}
