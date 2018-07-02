/*
 * <html>
 * <body>
 * <P> Copyright (c) 2017. </p>
 * <p> All rights reserved.</p>
 * <p> Created by Jason</p>
 * </body>
 * </html>
 */

package cn.ucaner.boot.aggregation.mybatis.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.ucaner.boot.aggregation.mybatis.entity.Message;
import cn.ucaner.boot.aggregation.mybatis.util.MyMapper;

/**
* @Title: MessageMapper
* @Package cn.ucaner.mybatis.mapper
* @Description: MessageMapper 
* @Author Jason
* @Creator
* @Date 2017/12/10 -- 0:44
* @version V1.0
*/
@Repository
public interface MessageMapper extends MyMapper<Message> {

	/**
	 * @Description: list 
	 * @return List<Message>
	 * @Autor: Jason
	 */
    List<Message> list();

    /**
     * @Description: count
     * @return int
     * @Autor: Jason
     */
    int count();
}
