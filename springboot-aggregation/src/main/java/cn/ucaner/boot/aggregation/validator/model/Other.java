/*
 * <html>
 * <body>
 * <P> Copyright (c) 2017. </p>
 * <p> All rights reserved.</p>
 * <p> Created by Jason</p>
 * </body>
 * </html>
 */
package cn.ucaner.boot.aggregation.validator.model;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Pattern;

/**
* @Title: Other
* @Package cn.ucaner.validator.model
* @Description: Other
* @Author Jason
* @Creator
* @Date 2017/12/10 -- 12:47
* @version V1.0
*/
public class Other {

    @Length(max = 18, min = 15, message = "身份证长度为15或者18位")
    private String idcard;

    @Pattern(regexp = "[0-9]{11}", message = "手机号格式错误")
    private String phone;

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Other{" +
                "idcard='" + idcard + '\'' +
                ", phone=" + phone +
                '}';
    }
}
