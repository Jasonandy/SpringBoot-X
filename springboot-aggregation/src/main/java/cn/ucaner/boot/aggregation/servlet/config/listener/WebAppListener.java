/*
 * <html>
 * <body>
 * <P> Copyright (c) 2017. </p>
 * <p> All rights reserved.</p>
 * <p> Created by Jason</p>
 * </body>
 * </html>
 */

package cn.ucaner.boot.aggregation.servlet.config.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
* @Title: WebAppListener
* @Package cn.ucaner.servlet.config.listener
* @Description: WebAppListener通过注解实现的监听器开始初始化...
* @Author Jason
* @Creator
* @Date 2017/12/10 -- 11:46
* @version V1.0
*/
@WebListener
public class WebAppListener implements ServletContextListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(WebAppListener.class);


    /**
     * ServletContextListener 初始化
     * @param arg0
     */
    @Override
    public void contextInitialized(ServletContextEvent arg0) {
        LOGGER.info("WebAppListener通过注解实现的监听器开始初始化...");
    }


    /**
     * ServletContextListener 销毁
     * @param arg0
     */
    @Override
    public void contextDestroyed(ServletContextEvent arg0) {
        LOGGER.info("WebAppListener通过注解实现的监听器已销毁...");
    }

}
