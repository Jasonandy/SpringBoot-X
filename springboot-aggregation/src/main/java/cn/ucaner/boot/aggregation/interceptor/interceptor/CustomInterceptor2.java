/*
 * <html>
 * <body>
 * <P> Copyright (c) 2017. </p>
 * <p> All rights reserved.</p>
 * <p> Created by Jason</p>
 * </body>
 * </html>
 */
package cn.ucaner.boot.aggregation.interceptor.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
* @Title: CustomInterceptor2
* @Package cn.ucaner.interceptor.interceptor
* @Description: CustomInterceptor2
* @Author Jason
* @Creator
* @Date 2017/12/10 -- 12:30
* @version V1.0
*/
public class CustomInterceptor2 implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("CustomInterceptor2拦截器开始工作，拦截到当前请求地址：" + httpServletRequest.getRequestURL().toString());
        // 只有返回true才会继续向下执行，返回false取消当前请求
        if (true) {
            System.out.println("没有权限访问：" + httpServletRequest.getRequestURL().toString());
            httpServletResponse.sendRedirect("/error1");
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        // 请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）
        System.out.println("CustomInterceptor2.postHandle:" + o);
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        // 在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作）
        System.out.println("CustomInterceptor2.afterCompletion:" + o);
    }
}
