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

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import cn.ucaner.boot.aggregation.mybatis.entity.Message;

/**
* @Title: MessageAnnotationMapper
* @Package cn.ucaner.mybatis.mapper
* @Description: MessageAnnotationMapper 
* @Author Jason
* @Creator
* @Date 2017/12/10 -- 1:02
* @version V1.0
*/
@Mapper
public interface MessageAnnotationMapper {


    @Select("SELECT NICK_NAME FROM custom")
    @Results({@Result(property = "nickName",  column = "NICK_NAME")})
    List<Message> list();
}
