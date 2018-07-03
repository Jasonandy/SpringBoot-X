/**
 * <html>
 * <body>
 *  <P> Copyright JasonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 2018年7月3日 下午3:32:45</p>
 *  <p> Created by Jason </p>
 *  </body>
 * </html>
 */
package cn.ucaner.boot.sourceanalysis.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**     
* @Package：cn.ucaner.boot.sourceanalysis.entity   
* @ClassName：Person   
* @Description：   <p> SpringBoot配置文件注入方式
* 将配置文件中配置的每一个属性的值，映射到这个组件中
* @ConfigurationProperties：告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定
* prefix = "person"：配置文件中哪个下面的所有属性进行一一映射
* 只有这个组件是容器中的组件，才能容器提供的@ConfigurationProperties功能
* 
* </p>
* @Author： - Jason   
* @CreatTime：2018年7月3日 下午3:32:45   
* @Modify By：   
* @ModifyTime：  2018年7月3日
* @Modify marker：   
* @version    V1.0
*/
@Component
//@PropertySource(value = {"classpath:person.properties,classpath:person.properties"})//加载指定的配置文件
@ConfigurationProperties(prefix = "person") //告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定
//只有这个组件是容器中的组件,才能容器提供的@ConfigurationProperties功能,默认从全局配置文件中获取值
//@Validated //支持参数校验
public class Person implements Serializable{

	private static final long serialVersionUID = -4462128041719244090L;
	
	 /**
     * <bean class="Person">
     *      <property name="lastName" value="字面量/${key}从环境变量、配置文件中获取值/#{SpEL}"></property>
     * <bean/>
     */
	/*Property: person.lastName
    Value: Jason
    Reason: 不是一个合法的电子邮件地址*/
	//@Email
	//@Value("${lastNameValue}")  //@Value("lastNameValue") 直接赋值进去了 #{SpEl} ${key} 变量里面取出
	//@Value("${person.lastName}")
	private String lastName;
    private Integer age;
    
    
    //@Value("true")
    private Boolean boss;
    private Date birth;

    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;

    public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Boolean getBoss() {
		return boss;
	}

	public void setBoss(Boolean boss) {
		this.boss = boss;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public Map<String, Object> getMaps() {
		return maps;
	}

	public void setMaps(Map<String, Object> maps) {
		this.maps = maps;
	}

	public List<Object> getLists() {
		return lists;
	}
	
	public void setLists(List<Object> lists) {
		this.lists = lists;
	}
	
	public Dog getDog() {
		return dog;
	}
	
	public void setDog(Dog dog) {
		this.dog = dog;
	}

	@Override
	public String toString() {
		return "[配置测试]Person [lastName=" + lastName + ", age=" + age + ", boss=" + boss + ", birth=" + birth + ", maps="
				+ maps + ", lists=" + lists + ", dog=" + dog + "]";
	}
	
}
