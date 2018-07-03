/**
 * <html>
 * <body>
 *  <P> Copyright JasonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 2018年7月3日 下午3:33:35</p>
 *  <p> Created by Jason </p>
 *  </body>
 * </html>
 */
package cn.ucaner.boot.sourceanalysis.entity;

import java.io.Serializable;

/**     
* @Package：cn.ucaner.boot.sourceanalysis.entity   
* @ClassName：Dog   
* @Description：   <p> Dog </p>
* @Author： - Jason   
* @CreatTime：2018年7月3日 下午3:33:35   
* @Modify By：   
* @ModifyTime：  2018年7月3日
* @Modify marker：   
* @version    V1.0
*/
public class Dog implements Serializable{

	private static final long serialVersionUID = 4123912705399952737L;

	private String name;
	
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "[配置测试]Dog [name=" + name + ", age=" + age + "]";
	}
	
	

}
