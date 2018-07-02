/*
 * <html>
 * <body>
 * <P> Copyright (c) 2017. </p>
 * <p> All rights reserved.</p>
 * <p> Created by Jason</p>
 * </body>
 * </html>
 */
package cn.ucaner.boot.aggregation.validator.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
* @Title: ValidatorConfig
* @Package cn.ucaner.validator.config
* @Description: ValidatorConfig
* @Author Jason
* @Creator
* @Date 2017/12/10 -- 12:46
* @version V1.0
*/
@Configuration
@Order(0)
public class ValidatorConfig extends WebMvcConfigurerAdapter {

    @Override
    public Validator getValidator() {
        LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
        return bean;
    }

    @Override
    public MessageCodesResolver getMessageCodesResolver() {
        return null;
    }
}
