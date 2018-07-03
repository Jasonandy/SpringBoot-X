/**
 * <html>
 * <body>
 *  <P> Copyright JasonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 2018年7月3日 下午3:43:34</p>
 *  <p> Created by Jason </p>
 *  </body>
 * </html>
 */
package cn.ucaner.boot.sourceanalysis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import cn.ucaner.boot.sourceanalysis.entity.Person;
import cn.ucaner.boot.sourceanalysis.entity.XmlBean;
import cn.ucaner.boot.sourceanalysis.service.SpringBootService;

/**     
* @Package：cn.ucaner.boot.sourceanalysis   
* @ClassName：SpringBootConfigApplicationTest   
* @Description：   <p> SpringBoot单元测试 </p>
* @Author： - Jason   
* @CreatTime：2018年7月3日 下午3:43:34   
* @Modify By：   
* @ModifyTime：  2018年7月3日
* @Modify marker：   
* @version    V1.0
*/
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootConfigApplicationTest {

	@Autowired
	Person person;
	
	@Autowired
	XmlBean xmlBean;

	@Autowired
	ApplicationContext ioc;

	@Test
	public void testSpringBootService(){
		boolean flag = ioc.containsBean("springBootService");
		SpringBootService bean = ioc.getBean(SpringBootService.class);
		System.out.println(flag);
		System.out.println(bean);
	}

	@Test
	public void contextLoads() {
		System.out.println(person);
	}
	
	@Test
	public void xmlBeanLoads() {
		System.out.println(xmlBean);//XmlBean [name=jasonandy.xmlbeans]
	}
	
}
