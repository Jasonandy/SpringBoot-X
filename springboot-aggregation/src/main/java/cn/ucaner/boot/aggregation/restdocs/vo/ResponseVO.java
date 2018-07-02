/*
 * <html>
 * <body>
 * <P> Copyright (c) 2017. </p>
 * <p> All rights reserved.</p>
 * <p> Created by Jason</p>
 * </body>
 * </html>
 */
package cn.ucaner.boot.aggregation.restdocs.vo;

import lombok.Getter;
import lombok.Setter;

/**
* @Title: ResponseVO
* @Package cn.ucaner.restdocs.vo
* @Description: ResponseVO
* @Author Jason
* @Creator
* @Date 2017/12/10 -- 12:16
* @version V1.0
*/
@Getter
@Setter
public class ResponseVO<T> {

	/**
	 * 状态码
	 */
    private int statusCode;
    
    /**
     * 响应信息
     */
    private String message;
    
    /**
     * 数据
     */
    private T data;

    public ResponseVO(int statusCode, String message, T data) {
        this.statusCode = statusCode;
        this.message = message;
        this.data = data;
    }
}
