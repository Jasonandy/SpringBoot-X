/**
 * <html>
 * <body>
 *  <P> Copyright JasonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 2018年7月1日 下午5:49:19</p>
 *  <p> Created by Jason </p>
 *  </body>
 * </html>
 */
package cn.ucaner.boot.elasticsearch;

import java.util.Iterator;

import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.ucaner.boot.elasticsearch.dao.EmployeeRepository;
import cn.ucaner.boot.elasticsearch.entity.Employee;

/**     
* @Package：cn.ucaner.boot.elasticsearch   
* @ClassName：ElasticSearchTest   
* @Description：   <p> ElasticSearchTest </p>
* @Author： - Jason   
* @CreatTime：2018年7月1日 下午5:49:19   
* @Modify By：   
* @ModifyTime：  2018年7月1日
* @Modify marker：   
* @version    V1.0
*/
@RunWith(SpringRunner.class)
@SpringBootTest(classes=Application.class)
public class ElasticSearchTest {
	
	@Autowired
   private EmployeeRepository employeeRepository;
	
   @Test
   public void testSearch(){
		String queryString="testSearch";//搜索关键字
		QueryStringQueryBuilder builder=new QueryStringQueryBuilder(queryString);
		Iterable<Employee> searchResult = employeeRepository.search(builder);
		Iterator<Employee> iterator = searchResult.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}

}
