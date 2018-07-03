/**
 * <html>
 * <body>
 *  <P> Copyright JasonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 2018年7月3日 下午4:16:42</p>
 *  <p> Created by Jason </p>
 *  </body>
 * </html>
 */
package cn.ucaner.boot.sourceanalysis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cn.ucaner.boot.sourceanalysis.service.SpringBootService;

/**     
* @Package：cn.ucaner.boot.sourceanalysis.config   
* @ClassName：MyAppConfig   
* @Description：   <p> MyAppConfig 全注解方式注入 </p>
* <note>
* @Configuration：指明当前类是一个配置类；就是来替代之前的Spring配置文件
* 在配置文件中用<bean><bean/>标签添加组件
* </note>
* @Author： - Jason   
* @CreatTime：2018年7月3日 下午4:16:42   
* @Modify By：   
* @ModifyTime：  2018年7月3日
* @Modify marker：   
* @version    V1.0
*/
@Configuration
//@Configuration 包含了 @Component 注入到IOC容器里面去了
public class MyAppConfig {
	
	/**
	 * @Description: 将方法的返回值添加到容器中,容器中这个组件默认的id就是方法名 
	 * <xml>
	 * 		<beans>
	 * 				<bean id="methods" class="SpringBootService.clazz"></bean>
	 * 		</beans>
	 * </xml>
	 * 
	 * @return SpringBootService
	 * @Autor: Jason
	 */
    @Bean
    public SpringBootService springBootService(){
        System.out.println("******配置类@Bean给容器中添加组件了*******");
        return new SpringBootService();
    }

}
