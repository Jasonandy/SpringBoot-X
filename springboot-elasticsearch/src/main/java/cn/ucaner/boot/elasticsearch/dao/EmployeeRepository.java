/**
 * <html>
 * <body>
 *  <P> Copyright JasonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 2018年7月1日 下午5:38:19</p>
 *  <p> Created by Jason </p>
 *  </body>
 * </html>
 */
package cn.ucaner.boot.elasticsearch.dao;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

import cn.ucaner.boot.elasticsearch.entity.Employee;

/**     
* @Package：cn.ucaner.boot.elasticsearch.dao   
* @ClassName：EmployeeRepository   
* @Description：   <p> EmployeeRepository</p>
* @Author： - Jason   
* @CreatTime：2018年7月1日 下午5:38:19   
* @Modify By：   
* @ModifyTime：  2018年7月1日
* @Modify marker：   
* @version    V1.0
*/
@Component
public interface EmployeeRepository extends  ElasticsearchRepository<Employee,String>{

	/**
	 * @Description: queryEmployeeById 
	 * @param id
	 * @return Employee
	 * @Autor: Jason
	 */
	Employee queryEmployeeById(String id);
	
	
	/**
	 * @Description: queryEmployeeByName 
	 * @param name
	 * @return Employee
	 * @Autor: Jason
	 */
	Employee queryEmployeeByName(String name);
}
