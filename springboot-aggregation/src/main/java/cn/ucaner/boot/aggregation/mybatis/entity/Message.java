/*
 * <html>
 * <body>
 * <P> Copyright (c) 2017. </p>
 * <p> All rights reserved.</p>
 * <p> Created by Jason</p>
 * </body>
 * </html>
 */

package cn.ucaner.boot.aggregation.mybatis.entity;

import java.io.Serializable;
import java.util.Date;

/**
* @Title: Message
* @Package cn.ucaner.mybatis.entity
* @Description: Message
* @Author Jason
* @Creator
* @Date 2017/12/10 -- 0:43
* @version V1.0
*/
public class Message implements Serializable {

	private static final long serialVersionUID = 2128346393707857300L;

	private Integer id;
	private String nickName;
	private String ip;
	private Date insertTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Date getInsertTime() {
		return insertTime;
	}

	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}

}
