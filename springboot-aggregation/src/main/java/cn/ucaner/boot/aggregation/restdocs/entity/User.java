/*
 * <html>
 * <body>
 * <P> Copyright (c) 2017. </p>
 * <p> All rights reserved.</p>
 * <p> Created by Jason</p>
 * </body>
 * </html>
 */
package cn.ucaner.boot.aggregation.restdocs.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
* @Title: User
* @Package cn.ucaner.restdocs.entity
* @Description: User 
* @Author Jason
* @Creator
* @Date 2017/12/10 -- 12:16
* @version V1.0
*/
@Getter
@Setter
public class User {
	
	/**
	 * id
	 */
    private Integer id;
    
    /**
     * 姓名
     */
    private String name;
    
    /**
     * 年龄
     */
    private Integer age;
    
    /**
     * 生日
     */
    private Date birthday;

    public User() {
    }

    public User(Integer id, String name, Integer age, Date birthday) {
        setId(id);
        setName(name);
        setAge(age);
        setBirthday(birthday);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
