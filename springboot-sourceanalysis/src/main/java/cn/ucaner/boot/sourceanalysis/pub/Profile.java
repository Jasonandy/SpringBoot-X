/**
 * <html>
 * <body>
 *  <P> Copyright JasonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 2018年7月3日 下午4:32:25</p>
 *  <p> Created by Jason </p>
 *  </body>
 * </html>
 */
package cn.ucaner.boot.sourceanalysis.pub;

/**     
* @Package：cn.ucaner.boot.sourceanalysis.pub   
* @ClassName：Profile   
* @Description：   <p> 配置文件 - Profile</p>
* @Author： - Jason   
* @CreatTime：2018年7月3日 下午4:32:25   
* @Modify By：   
* @ModifyTime：  2018年7月3日
* @Modify marker：   
* @version    V1.0
*/
/*******************************************************************************************************
1、多Profile文件
	主配置文件编写的时候，文件名可以是 application-{profile}.properties/yml,默认使用application.properties的配置
2、yml支持多文档块方式
	'---' 分割
3、激活指定profile
	1、在配置文件中指定 spring.profiles.active=dev
	2、命令行：
		java -jar springboot-sourceanalysis-1.1.1-SNAPSHOT.jar --spring.profiles.active=dev
	3、虚拟机参数
		-Dspring.profiles.active=dev
4、配置文件加载位置
	springboot 启动会扫描以下位置的application.properties或者application.yml文件作为Spring boot的默认配置文件
	–file:./config/    优先级最高
	–file:./
	–classpath:/config/
	–classpath:/        最低
	优先级由高到底，高优先级的配置会覆盖低优先级的配置；
	SpringBoot会从这四个位置全部加载主配置文件；互补配置；
	==我们还可以通过spring.config.location来改变默认的配置文件位置==
	项目打包好以后，我们可以使用命令行参数的形式，启动项目的时候来指定配置文件的新位置；
	指定配置文件和默认加载的这些配置文件共同起作用形成互补配置；
	java -jar springboot-sourceanalysis-1.1.1-SNAPSHOT.jar --spring.config.location=D:/application.properties
5、外部配置加载顺序
	SpringBoot也可以从以下位置加载配置； 优先级从高到低；高优先级的配置覆盖低优先级的配置，所有的配置会形成互补配置==
	1.命令行参数
	所有的配置都可以在命令行上进行指定
	java -jar springboot-sourceanalysis-1.1.1-SNAPSHOT.jar --server.port=8087 --server.context-path=/abc
	多个配置用空格分开； --配置项=值
	2.来自java:comp/env的JNDI属性
	3.Java系统属性（System.getProperties()）
	4.操作系统环境变量
	5.RandomValuePropertySource配置的random.*属性值
	==由jar包外向jar包内进行寻找；==
	==优先加载带profile==
	6.jar包外部的application-{profile}.properties或application.yml(带spring.profile)配置文件
	7.jar包内部的application-{profile}.properties或application.yml(带spring.profile)配置文件
	==再来加载不带profile==
	8.jar包外部的application.properties或application.yml(不带spring.profile)配置文件
	9.jar包内部的application.properties或application.yml(不带spring.profile)配置文件
	
	10.@Configuration注解类上的@PropertySource
	11.通过SpringApplication.setDefaultProperties指定的默认属性

6、More See https://docs.spring.io/spring-boot/docs/1.5.9.RELEASE/reference/htmlsingle/#boot-features-external-config
********************************************************************************************************/
public class Profile {
	
	

}
