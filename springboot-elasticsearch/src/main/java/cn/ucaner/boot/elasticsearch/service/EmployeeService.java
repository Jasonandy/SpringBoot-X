/**
 * <html>
 * <body>
 *  <P> Copyright JasonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 2018年7月1日 下午5:54:47</p>
 *  <p> Created by Jason </p>
 *  </body>
 * </html>
 */
package cn.ucaner.boot.elasticsearch.service;

import java.util.List;

import cn.ucaner.boot.elasticsearch.entity.Employee;

/**     
* @Package：cn.ucaner.boot.elasticsearch.service   
* @ClassName：EmployeeService   
* @Description：   <p> EmployeeService </p>
* @Author： - Jason   
* @CreatTime：2018年7月1日 下午5:54:47   
* @Modify By：   
* @ModifyTime：  2018年7月1日
* @Modify marker：   
* @version    V1.0
*/
public interface EmployeeService {

	/**
	 * @Description: queryEmployeeById
	 * @param id
	 * @return Employee
	 * @Autor: Jason
	 */
	Employee queryEmployeeById(String id);
	
	/**
	 * @Description: saveEmployee
	 * @param employee
	 * @return Employee
	 * @Autor: Jason
	 */
	Employee saveEmployee(Employee employee);

	/**
	 * @Description: queryEmployeeByName 
	 * @param name
	 * @return Employee
	 * @Autor: Jason
	 */
	Employee queryEmployeeByName(String name);
	
	/**
	 * @Description: 根据关键 function score query 权重分分页查询 
	 * @param pageNumber
	 * @param pageSize
	 * @param name
	 * @return List<Employee>
	 * @Autor: Jason
	 */
    List<Employee> searchEmployee(Integer pageNumber, Integer pageSize, String name);
}
