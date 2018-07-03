/**
 * <html>
 * <body>
 *  <P> Copyright JasonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 2018年7月3日 下午4:09:11</p>
 *  <p> Created by Jason </p>
 *  </body>
 * </html>
 */
package cn.ucaner.boot.sourceanalysis.entity;

import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

/**     
* @Package：cn.ucaner.boot.sourceanalysis.entity   
* @ClassName：XmlBean   
* @Description：   <p> XmlBean 
* Xml配置的方式还是不够方便,SpringBoot推荐使用全注解的方式
* 1.配置类@Configuration -->Spring配置文件
* 2.使用@Bean给容器中添加组件
* </p>
* @Author： - Jason   
* @CreatTime：2018年7月3日 下午4:09:11   
* @Modify By：   
* @ModifyTime：  2018年7月3日
* @Modify marker：   
* @version    V1.0
*/
@Component
@ImportResource(locations = {"classpath:beans.xml"})//导入Spring的配置文件，让配置文件里面的内容生效
public class XmlBean {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "XmlBean [name=" + name + "]";
	}
	
}
