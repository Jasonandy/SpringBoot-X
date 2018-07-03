/**
 * <html>
 * <body>
 *  <P> Copyright JasonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 2018年7月3日 下午3:07:54</p>
 *  <p> Created by Jason </p>
 *  </body>
 * </html>
 */
package cn.ucaner.boot.sourceanalysis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**     
* @Package：cn.ucaner.boot.sourceanalysis.controller   
* @ClassName：HelloController   
* @Description：   <p> HelloController  RESTful </p>
* @Author： - Jason   
* @CreatTime：2018年7月3日 下午3:07:54   
* @Modify By：   
* @ModifyTime：  2018年7月3日
* @Modify marker：   
* @version    V1.0
*/
//@Controller and @ResponseBody  = @RestController
@Controller
public class HelloController {
	
	@ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }

}
