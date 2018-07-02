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

/**
* @Title: WebAppListener2
* @Package cn.ucaner.servlet.config.listener
* @Description: WebAppListener2通过SpringBean实现的监听器开始初始化...
* @Author Jason
* @Creator
* @Date 2017/12/10 -- 11:41
* @version V1.0
*/
public class WebAppListener2 implements ServletContextListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(WebAppListener2.class);

    /**
     * ServletContextListener 初始化
     * @param arg0
     */
    @Override
    public void contextInitialized(ServletContextEvent arg0) {
        LOGGER.info("WebAppListener2通过SpringBean实现的监听器开始初始化...");
    }

    /**
     * ServletContextListener 销毁
     * @param arg0
     */
    @Override
    public void contextDestroyed(ServletContextEvent arg0) {
        LOGGER.info("WebAppListener2通过SpringBean实现的监听器已销毁...");
    }
}
