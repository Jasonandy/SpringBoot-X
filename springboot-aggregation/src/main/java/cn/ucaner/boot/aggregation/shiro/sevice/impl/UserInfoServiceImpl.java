package cn.ucaner.boot.aggregation.shiro.sevice.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.ucaner.boot.aggregation.shiro.dao.UserInfoDao;
import cn.ucaner.boot.aggregation.shiro.entity.UserInfo;
import cn.ucaner.boot.aggregation.shiro.sevice.UserInfoService;

/**
* @Package：cn.ucaner.boot.aggregation.shiro.sevice.impl   
* @ClassName：UserInfoServiceImpl   
* @Description：   <p> UserInfoServiceImpl </p>
* @Author： - Jason   
* @CreatTime：2018年7月2日 下午5:10:22   
* @Modify By：   
* @ModifyTime：  2018年7月2日
* @Modify marker：   
* @version    V1.0
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
	
    @Resource
    private UserInfoDao userInfoDao;
    
    
    @Override
    public UserInfo findByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findByUsername()");
        return userInfoDao.findByUsername(username);
    }
}