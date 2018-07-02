/**
 * <html>
 * <body>
 *  <P> Copyright JasonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 2018年7月1日 下午5:55:26</p>
 *  <p> Created by Jason </p>
 *  </body>
 * </html>
 */
package cn.ucaner.boot.elasticsearch.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ucaner.boot.elasticsearch.dao.EmployeeRepository;
import cn.ucaner.boot.elasticsearch.entity.Employee;
import cn.ucaner.boot.elasticsearch.service.EmployeeService;

/**     
* @Package：cn.ucaner.boot.elasticsearch.service.impl   
* @ClassName：EmployeeServiceImpl   
* @Description：   <p> EmployeeServiceImpl </p>
* @Author： - Jason   
* @CreatTime：2018年7月1日 下午5:55:26   
* @Modify By：   
* @ModifyTime：  2018年7月1日
* @Modify marker：   
* @version    V1.0
*/
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeServiceImpl.class);
	
	@Autowired
    private EmployeeRepository employeeRepository;

	@Override
	public Employee queryEmployeeById(String id) {
		LOGGER.info("queryEmployeeById");
		return employeeRepository.queryEmployeeById(id);
	}

	@Override
	public Employee queryEmployeeByName(String name) {
		LOGGER.info("queryEmployeeByName");
		return employeeRepository.queryEmployeeByName(name);
	}

	@Override
	public List<Employee> searchEmployee(Integer pageNumber, Integer pageSize, String name) {
	/*	// 分页参数
        Pageable pageable = new PageRequest(pageNumber, pageSize);

        // Function Score Query
       FunctionScoreQueryBuilder functionScoreQueryBuilder = QueryBuilders.functionScoreQuery()
                .add(QueryBuilders.boolQuery().should(QueryBuilders.matchQuery("name", name)),
                    ScoreFunctionBuilders.weightFactorFunction(1000))
                .add(QueryBuilders.boolQuery().should(QueryBuilders.matchQuery("name", name)),
                        ScoreFunctionBuilders.weightFactorFunction(100));

        // 创建搜索 DSL 查询
        SearchQuery searchQuery = new NativeSearchQueryBuilder()
                .withPageable(pageable)
                .withQuery(functionScoreQueryBuilder).build();

        
        LOGGER.info("\n searchEmployee(): searchName [" + name + "] \n DSL  = \n " + searchQuery.getQuery().toString());

        Page<Employee> searchPageResults = employeeRepository.search(searchQuery);
        
        return searchPageResults.getContent();*/
		return null;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

}
