/*
 * <html>
 * <body>
 * <P> Copyright (c) 2017. </p>
 * <p> All rights reserved.</p>
 * <p> Created by Jason</p>
 * </body>
 * </html>
 */

package cn.ucaner.boot.aggregation.mybatis.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
* @Package：cn.ucaner.boot.aggregation.mybatis.util   
* @ClassName：MyMapper   
* @Description：   <p> 继承自己的MyMapper </p>
* @Author： - Jason   
* @CreatTime：2018年7月2日 上午10:48:26   
* @Modify By：   
* @ModifyTime：  2018年7月2日
* @Modify marker：   
* @version    V1.0
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
    // 特别注意，该接口不能被扫描到，否则会出错
}
