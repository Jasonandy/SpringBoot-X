package cn.ucaner.boot.aggregation.shiro.web;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @Package：cn.ucaner.boot.aggregation.shiro.web   
* @ClassName：UserInfoController   
* @Description：   <p> UserInfoController </p>
* @Author： - Jason   
* @CreatTime：2018年7月2日 下午5:10:52   
* @Modify By：   
* @ModifyTime：  2018年7月2日
* @Modify marker：   
* @version    V1.0
 */
@Controller
@RequestMapping("/userInfo")
public class UserInfoController {

    /**
     * 用户查询.
     * @return
     */
    @RequestMapping("/userList")
    @RequiresPermissions("userInfo:view")//权限管理;
    public String userInfo(){
        return "userInfo";
    }

    /**
     * 用户添加;
     * @return
     */
    @RequestMapping("/userAdd")
    @RequiresPermissions("userInfo:add")//权限管理;
    public String userInfoAdd(){
        return "userInfoAdd";
    }

    /**
     * 用户删除;
     * @return
     */
    @RequestMapping("/userDel")
    @RequiresPermissions("userInfo:del")//权限管理;
    public String userDel(){
        return "userInfoDel";
    }
}