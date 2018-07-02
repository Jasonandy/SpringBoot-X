package cn.ucaner.boot.aggregation.docker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* @Package：cn.ucaner.boot.aggregation.docker.controller   
* @ClassName：DockerController   
* @Description：   <p> DockerController </p>
* @Author： - Jason   
* @CreatTime：2018年7月2日 下午5:53:25   
* @Modify By：   
* @ModifyTime：  2018年7月2日
* @Modify marker：   
* @version    V1.0
 */
@RestController
public class DockerController {
	
    @RequestMapping("/")
    public String index() {
        return "SpringBoot-Docker!";
    }
}