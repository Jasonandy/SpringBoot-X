/**
 * <html>
 * <body>
 *  <P> Copyright JasonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 2018年7月1日 下午5:44:54</p>
 *  <p> Created by Jason </p>
 *  </body>
 * </html>
 */
package cn.ucaner.boot.elasticsearch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.ucaner.boot.elasticsearch.entity.Employee;
import cn.ucaner.boot.elasticsearch.service.EmployeeService;

/**     
* @Package：cn.ucaner.boot.elasticsearch.controller   
* @ClassName：ElasticSearchController   
* @Description：   <p> ElasticSearchController </p>
* @Author： - Jason   
* @CreatTime：2018年7月1日 下午5:44:54   
* @Modify By：   
* @ModifyTime：  2018年7月1日
* @Modify marker：   
* @version    V1.0
*/
@RestController
@RequestMapping("/es")
//@PropertySource({"classpath:application.properties"})
public class ElasticSearchController {
	
   @Autowired
   private EmployeeService employeeService;

   /**
    * @Description: queryEmployeeByName
    * @param name
    * @param modelMap
    * @return String
    * @Autor: Jason
    */
   @RequestMapping("/queryEmployeeByName")
   public String queryEmployeeByName(String name, ModelMap modelMap){
	   Employee employee = employeeService.queryEmployeeByName(name);
       modelMap.addAttribute("employee",employee);
       modelMap.addAttribute("message","This is a message!");
       return "employee";
   }
   
   /**
    * @Description: saveEmployee
    * @param employee
    * @return Employee
    * @Autor: Jason
    */
   @RequestMapping(value = "/api/employee", method = RequestMethod.POST)
   public Employee saveEmployee(@RequestBody Employee employee) {
       return employeeService.saveEmployee(employee);
   }
   
   
   @RequestMapping(value = "/api/test", method = RequestMethod.GET)
   public String test() {
	   Employee queryEmployeeById = employeeService.queryEmployeeById("");
       return queryEmployeeById.toString();
   }

   
}
