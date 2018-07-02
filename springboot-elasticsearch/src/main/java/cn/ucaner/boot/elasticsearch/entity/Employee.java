/**
 * <html>
 * <body>
 *  <P> Copyright JasonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 2018年7月1日 下午5:39:03</p>
 *  <p> Created by Jason </p>
 *  </body>
 * </html>
 */
package cn.ucaner.boot.elasticsearch.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**     
* @Package：cn.ucaner.boot.elasticsearch.entity   
* @ClassName：Employee   
* @Description：   <p> Employee </p>
* @Author： - Jason   
* @CreatTime：2018年7月1日 下午5:39:03   
* @Modify By：   
* @ModifyTime：  2018年7月1日
* @Modify marker：   
* @version    V1.0
*/
@Document(indexName = "megacorp",type = "employee", shards = 1,replicas = 0, refreshInterval = "-1")
public class Employee implements Serializable{
	
	private static final long serialVersionUID = -1585995814817069853L;

	@Id
	private String id;
	
	private String name;
	
	private Integer age;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	
}
