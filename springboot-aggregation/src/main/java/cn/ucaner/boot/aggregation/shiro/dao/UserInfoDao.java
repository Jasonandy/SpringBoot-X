package cn.ucaner.boot.aggregation.shiro.dao;

import org.springframework.data.repository.CrudRepository;

import cn.ucaner.boot.aggregation.shiro.entity.UserInfo;

/**
* @Package：cn.ucaner.boot.aggregation.shiro.dao   
* @ClassName：UserInfoDao   
* @Description：   <p> UserInfoDao </p>
* @Author： - Jason   
* @CreatTime：2018年7月2日 下午4:51:21   
* @Modify By：   
* @ModifyTime：  2018年7月2日
* @Modify marker：   
* @version    V1.0
 */
public interface UserInfoDao extends CrudRepository<UserInfo,Long> {
	
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}