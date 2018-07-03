/**
 * <html>
 * <body>
 *  <P> Copyright JasonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 2018年7月1日 下午5:49:46</p>
 *  <p> Created by Jason </p>
 *  </body>
 * </html>
 */
package cn.ucaner.boot.elasticsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**     
* @Package：cn.ucaner.boot.elasticsearch   
* @ClassName：Application   
* @Description：   <p> Application </p>
* @Author： - Jason   
* @CreatTime：2018年7月1日 下午5:49:46   
* @Modify By：   
* @ModifyTime：  2018年7月1日
* @Modify marker：   
* @version    V1.0
*/
/*
 * @SpringBootApplication
 * 等价于@Configuration  @EnableAutoConfiguration @ComponentScan
 */
@SpringBootApplication
//@PropertySource({"classpath:application.properties"})
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
public class Application {
	
	// 程序启动入口
    // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

}
