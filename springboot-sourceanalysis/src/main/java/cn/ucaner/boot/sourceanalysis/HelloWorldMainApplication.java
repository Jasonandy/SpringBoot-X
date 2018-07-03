/**
 * <html>
 * <body>
 *  <P> Copyright JasonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 2018年7月3日 下午3:05:05</p>
 *  <p> Created by Jason </p>
 *  </body>
 * </html>
 */
package cn.ucaner.boot.sourceanalysis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*************************************************************
@SpringBootApplication
	Spring Boot应用标注在某个类上说明这个类是SpringBoot的主配置类,SpringBoot就应该运行这个类的main方法来启动SpringBoot应用;
	@SpringBootConfiguration //Spring Boot的配置类
		@Configuration//Spring配置类
			@Component//Spring组件
	@EnableAutoConfiguration //开启自动配置功能
		@AutoConfigurationPackage//自动配置包
		@Import(EnableAutoConfigurationImportSelector.class)
			//​Spring的底层注解@Import，给容器中导入一个组件,导入的组件由AutoConfigurationPackages.Registrar.class
			//[将主配置类(@SpringBootApplication标注的类)的所在包及下面所有子包里面的所有组件扫描到Spring容器]
			 List<String> configurations = getCandidateConfigurations(annotationMetadata,attributes);//selector
			 	ClassLoader.getSystemResources(FACTORIES_RESOURCE_LOCATION)//FACTORIES_RESOURCE_LOCATION = "META-INF/spring.factories"
			 		//"META-INF/spring.factories" 配置了许多预先配置的内容
			 		扫描所有jar包类路径下 META-INF/spring.factories
			 		把扫描到的这些文件的内容包装成properties对象
			 		从properties中获取到EnableAutoConfiguration.class类（类名）对应的值，然后把他们添加在容器中
			 			eg:org.springframework.boot.autoconfigure.web.HttpEncodingAutoConfiguration
			 				@Configuration
							@EnableConfigurationProperties(HttpEncodingProperties.class)
							@ConditionalOnWebApplication
							@ConditionalOnClass(CharacterEncodingFilter.class)
							@ConditionalOnProperty(prefix = "spring.http.encoding", value = "enabled", matchIfMissing = true)
						//HttpEncodingProperties 将属性值配置进入该自动配置类(完成配置)
						//@ConditionalXXX 一系列判断条件  判断是否需要自动配置进去
						
						
			 		
	@ComponentScan(excludeFilters = {
			@Filter(type = FilterType.CUSTOM, classes = TypeExcludeFilter.class),
			@Filter(type = FilterType.CUSTOM, classes = AutoConfigurationExcludeFilter.class) })
*************************************************************/
@SpringBootApplication
public class HelloWorldMainApplication {
	
	
	public static void main(String[] args) {
		 // Spring应用启动起来 ConfigurableApplicationContext 配置容器并且启动
        SpringApplication.run(HelloWorldMainApplication.class,args);
        
	}

}
