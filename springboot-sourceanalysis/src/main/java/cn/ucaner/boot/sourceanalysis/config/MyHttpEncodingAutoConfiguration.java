/**
 * <html>
 * <body>
 *  <P> Copyright JasonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 2018年7月3日 下午4:50:08</p>
 *  <p> Created by Jason </p>
 *  </body>
 * </html>
 */
package cn.ucaner.boot.sourceanalysis.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.web.HttpEncodingProperties;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.filter.OrderedCharacterEncodingFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;
import org.springframework.web.filter.CharacterEncodingFilter;

/**     
* @Package：cn.ucaner.boot.sourceanalysis.config   
* @ClassName：MyHttpEncodingAutoConfiguration   
* @Description：   <p> HttpEncodingAutoConfiguration[示列]</p>
* @Author： - Jason   
* @CreatTime：2018年7月3日 下午4:50:08   
* @Modify By：   
* @ModifyTime：  2018年7月3日
* @Modify marker：   
* @version    V1.0
*/
//@Configuration //表示这是一个配置类，以前编写的配置文件一样，也可以给容器中添加组件

//@EnableConfigurationProperties(MyHttpEncodingProperties.class)
//启动指定类的ConfigurationProperties功能；
//将配置文件中对应的值和HttpEncodingProperties绑定起来；
//并把HttpEncodingProperties加入到ioc容器中

//@ConditionalOnWebApplication//判断context is a web application
//Spring底层@Conditional注解（Spring注解版），根据不同的条件，如果满足指定的条件，整个配置类里面的配置就会生效


//@ConditionalOnClass(CharacterEncodingFilter.class) //CharacterEncodingFilter 字符过滤器
//判断当前项目有没有这个类CharacterEncodingFilter；SpringMVC中进行乱码解决的过滤器；

//@ConditionalOnProperty(prefix = "spring.http.encoding", value = "enabled", matchIfMissing = true)
//判断配置文件中是否存在某个配置  spring.http.encoding.enabled；如果不存在，判断也是成立的

/******************************************************************************************************
	1）、SpringBoot启动会加载大量的自动配置类
​	2）、我们看我们需要的功能有没有SpringBoot默认写好的自动配置类；
​	3）、我们再来看这个自动配置类中到底配置了哪些组件；（只要我们要用的组件有，我们就不需要再来配置了）
​	4）、给容器中自动配置类添加组件的时候，会从properties类中获取某些属性。我们就可以在配置文件中指定这些属性的值；

	xxxxAutoConfigurartion：自动配置类；
	给容器中添加组件
	xxxxProperties:封装配置文件中相关属性；

@Conditional派生注解（Spring注解版原生的@Conditional作用）
作用：必须是@Conditional指定的条件成立，才给容器中添加组件，配置配里面的所有内容才生效；
	@Conditional扩展注解	作用（判断是否满足当前指定条件）
	@ConditionalOnJava	系统的java版本是否符合要求
	@ConditionalOnBean	容器中存在指定Bean；
	@ConditionalOnMissingBean	容器中不存在指定Bean；
	@ConditionalOnExpression	满足SpEL表达式指定
	@ConditionalOnClass	系统中有指定的类
	@ConditionalOnMissingClass	系统中没有指定的类
	@ConditionalOnSingleCandidate	容器中只有一个指定的Bean，或者这个Bean是首选Bean
	@ConditionalOnProperty	系统中指定的属性是否有指定的值
	@ConditionalOnResource	类路径下是否存在指定资源文件
	@ConditionalOnWebApplication	当前是web环境
	@ConditionalOnNotWebApplication	当前不是web环境
	@ConditionalOnJndi	JNDI存在指定项
	
*******************************************************************************************************/
public class MyHttpEncodingAutoConfiguration {
	
	//已经和SpringBoot的配置文件映射了
	private final HttpEncodingProperties properties;  //  SpringBoot启动时默认的配置

	//只有一个有参构造器的情况下，参数的值就会从容器中拿
	public MyHttpEncodingAutoConfiguration(HttpEncodingProperties properties) {
		this.properties = properties;
	}

	@Bean //给容器中添加一个组件，这个组件的某些值需要从properties中获取
	@ConditionalOnMissingBean(CharacterEncodingFilter.class)///判断容器没有这个组件
	public CharacterEncodingFilter characterEncodingFilter() {
		CharacterEncodingFilter filter = new OrderedCharacterEncodingFilter();
		filter.setEncoding(this.properties.getCharset().name());
		return filter;
	}

	@Bean
	public LocaleCharsetMappingsCustomizer localeCharsetMappingsCustomizer() {
		return new LocaleCharsetMappingsCustomizer(this.properties);
	}

	private static class LocaleCharsetMappingsCustomizer
			implements EmbeddedServletContainerCustomizer, Ordered {

		private final HttpEncodingProperties properties;

		LocaleCharsetMappingsCustomizer(HttpEncodingProperties properties) {
			this.properties = properties;
		}

		@Override
		public void customize(ConfigurableEmbeddedServletContainer container) {
			if (this.properties.getMapping() != null) {
				container.setLocaleCharsetMappings(this.properties.getMapping());
			}
		}

		@Override
		public int getOrder() {
			return 0;
		}

	}

}
