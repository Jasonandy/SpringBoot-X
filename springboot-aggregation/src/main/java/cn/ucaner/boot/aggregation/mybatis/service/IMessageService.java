/*
 * <html>
 * <body>
 * <P> Copyright (c) 2017. </p>
 * <p> All rights reserved.</p>
 * <p> Created by Jason</p>
 * </body>
 * </html>
 */

package cn.ucaner.boot.aggregation.mybatis.service;

import java.util.List;

import cn.ucaner.boot.aggregation.mybatis.entity.Message;

/**
* @Title: IMessageService
* @Package cn.ucaner.mybatis.service
* @Description: Imessage Service
* @Author Jason
* @Creator
* @Date 2017/12/10 -- 11:06
* @version V1.0
*/
public interface IMessageService {

	/**
	 * 查询列表
	 * @return
	 */
	List<Message> list();

	/**
	 * 统计个数
	 * @return
	 */
	int count();

}
