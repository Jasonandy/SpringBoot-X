/*
 * <html>
 * <body>
 * <P> Copyright (c) 2017. </p>
 * <p> All rights reserved.</p>
 * <p> Created by Jason</p>
 * </body>
 * </html>
 */

package cn.ucaner.boot.aggregation.mybatis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ucaner.boot.aggregation.mybatis.entity.Message;
import cn.ucaner.boot.aggregation.mybatis.mapper.MessageMapper;
import cn.ucaner.boot.aggregation.mybatis.service.IMessageService;

/**
* @Title: MessageServiceImpl
* @Package cn.ucaner.mybatis.service.impl
* @Description: MessageServiceImpl 
* @Author Jason
* @Creator
* @Date 2017/12/10 -- 1:02
* @version V1.0
*/
@Service
public class MessageServiceImpl implements IMessageService {

	/**
	 * MyMapper
	 */
	@Autowired
	private MessageMapper messageMapper;

	@Override
	public List<Message> list() {

		return messageMapper.list();
	}

	@Override
	public int count() {

		return messageMapper.count();
	}

}
