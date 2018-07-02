/*
 * <html>
 * <body>
 * <P> Copyright (c) 2017. </p>
 * <p> All rights reserved.</p>
 * <p> Created by Jason</p>
 * </body>
 * </html>
 */

package cn.ucaner.boot.aggregation.mybatis.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.stereotype.Component;

import com.github.pagehelper.PageHelper;

/**
* @Title: AppMybatisConfiguration
* @Package cn.ucaner.mybatis.config
* @Description: AppMybatisConfiguration
* @Author Jason
* @Creator
* @Date 2017/12/10 -- 0:43
* @version V1.0
*/
@Component
//指定扫描的mapper接口所在的包
@MapperScan("cn.ucaner.boot.aggregation.mybatis")
public class AppMybatisConfiguration {

    private static final String TYPE_ALIASES_PACKAGE = "cn.ucaner.boot.aggregation.mybatis";
    private static final String MAPPER_LOCATION = "classpath:/testMybatis/*.xml";

    @Bean
    @Autowired
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        final SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        // 分页插件
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("reasonable", "true");
        properties.setProperty("supportMethodsArguments", "true");
        properties.setProperty("returnPageInfo", "check");
        properties.setProperty("params", "count=countSql");
        pageHelper.setProperties(properties);
        // 添加插件
        // PageHelper是Interceptor接口的实现类
        // 基于接口实现的多态
        // 指向接口的引用（pageHelper）必须是实现了该接口的一个类的实例程序（implements Interceptor），在运行时，根据对象引用的实际类型来执行对应的方法。
        // 也就是说，可以根据这个特性，对SpringBoot定制特殊功能。
       // sqlSessionFactoryBean.setPlugins(new Interceptor[]{pageHelper});


        //testMybatis.typeAliasesPackage：指定domain类的基包，即指定其在*Mapper.xml文件中可以使用简名来代替全类名（看后边的UserMapper.xml介绍）
        sqlSessionFactoryBean.setTypeAliasesPackage(TYPE_ALIASES_PACKAGE);
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(MAPPER_LOCATION));

        return sqlSessionFactoryBean.getObject();
    }
}
