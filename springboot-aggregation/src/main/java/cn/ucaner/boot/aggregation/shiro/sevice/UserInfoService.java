package cn.ucaner.boot.aggregation.shiro.sevice;

import cn.ucaner.boot.aggregation.shiro.entity.UserInfo;

/**
* @Package：cn.ucaner.boot.aggregation.shiro.sevice   
* @ClassName：UserInfoService   
* @Description：   <p> UserInfoService </p>
* @Author： - Jason   
* @CreatTime：2018年7月2日 下午5:10:02   
* @Modify By：   
* @ModifyTime：  2018年7月2日
* @Modify marker：   
* @version    V1.0
 */
public interface UserInfoService {
	
	/**
	 * @Description: 通过username查找用户信息
	 * @param username
	 * @return UserInfo
	 * @Autor: Jason
	 */
    public UserInfo findByUsername(String username);
}