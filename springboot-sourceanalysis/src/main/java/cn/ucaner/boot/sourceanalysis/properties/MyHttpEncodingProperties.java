/**
 * <html>
 * <body>
 *  <P> Copyright JasonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 2018年7月3日 下午5:00:01</p>
 *  <p> Created by Jason </p>
 *  </body>
 * </html>
 */
package cn.ucaner.boot.sourceanalysis.properties;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**     
* @Package：cn.ucaner.boot.sourceanalysis.properties   
* @ClassName：MyHttpEncodingProperties   
* @Description：   <p> MyHttpEncodingProperties 预先配置好</p>
* @Author： - Jason   
* @CreatTime：2018年7月3日 下午5:00:01   
* @Modify By：   
* @ModifyTime：  2018年7月3日
* @Modify marker：   
* @version    V1.0
*/

/****************************************总结********************************************************************
	1）、SpringBoot启动会加载大量的自动配置类
​	2）、我们看我们需要的功能有没有SpringBoot默认写好的自动配置类；
​	3）、我们再来看这个自动配置类中到底配置了哪些组件；（只要我们要用的组件有，我们就不需要再来配置了）
​	4）、给容器中自动配置类添加组件的时候，会从properties类中获取某些属性。我们就可以在配置文件中指定这些属性的值；

	xxxxAutoConfigurartion：自动配置类；
	给容器中添加组件
	xxxxProperties:封装配置文件中相关属性；

*************************************************************************************************************** */
@ConfigurationProperties(prefix = "spring.http.encoding")  //从配置文件中获取指定的值和bean的属性进行绑定
public class MyHttpEncodingProperties {
	
	public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");
	
	/**
	 * Charset of HTTP requests and responses. Added to the "Content-Type" header if not
	 * set explicitly.
	 */
	private Charset charset = DEFAULT_CHARSET;

	/**
	 * Force the encoding to the configured charset on HTTP requests and responses.
	 */
	private Boolean force;

	/**
	 * Force the encoding to the configured charset on HTTP requests. Defaults to true
	 * when "force" has not been specified.
	 */
	private Boolean forceRequest;

	/**
	 * Force the encoding to the configured charset on HTTP responses.
	 */
	private Boolean forceResponse;

	/**
	 * Locale to Encoding mapping.
	 */
	private Map<Locale, Charset> mapping;

	public Charset getCharset() {
		return this.charset;
	}

	public void setCharset(Charset charset) {
		this.charset = charset;
	}

	public boolean isForce() {
		return Boolean.TRUE.equals(this.force);
	}

	public void setForce(boolean force) {
		this.force = force;
	}

	public boolean isForceRequest() {
		return Boolean.TRUE.equals(this.forceRequest);
	}

	public void setForceRequest(boolean forceRequest) {
		this.forceRequest = forceRequest;
	}

	public boolean isForceResponse() {
		return Boolean.TRUE.equals(this.forceResponse);
	}

	public void setForceResponse(boolean forceResponse) {
		this.forceResponse = forceResponse;
	}

	public Map<Locale, Charset> getMapping() {
		return this.mapping;
	}

	public void setMapping(Map<Locale, Charset> mapping) {
		this.mapping = mapping;
	}

	boolean shouldForce(Type type) {
		Boolean force = (type == Type.REQUEST ? this.forceRequest : this.forceResponse);
		if (force == null) {
			force = this.force;
		}
		if (force == null) {
			force = (type == Type.REQUEST);
		}
		return force;
	}

	enum Type {

		REQUEST, RESPONSE

	}


}
