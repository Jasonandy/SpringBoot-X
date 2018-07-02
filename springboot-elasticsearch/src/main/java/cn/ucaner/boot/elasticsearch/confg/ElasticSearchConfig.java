/**
 * <html>
 * <body>
 *  <P> Copyright JasonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 2018年7月1日 下午7:27:20</p>
 *  <p> Created by Jason </p>
 *  </body>
 * </html>
 */
package cn.ucaner.boot.elasticsearch.confg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

/**     
* @Package：cn.ucaner.boot.elasticsearch.confg   
* @ClassName：ElasticSearchConfig   
* @Description：   <p> ElasticSearchConfig </p>
* @Author： - Jason   
* @CreatTime：2018年7月1日 下午7:27:20   
* @Modify By：   
* @ModifyTime：  2018年7月1日
* @Modify marker：   
* @version    V1.0
*/
//@Configuration
//@EnableConfigurationProperties(ElasticSearchConfig.class)
public class ElasticSearchConfig {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ElasticSearchConfig.class);
	
	@Autowired
    private ElasticSearchProperties elasticSearchProperties;
	  
    /**
     * elk集群地址
     */
    @Value("${elasticsearch.ip}")
    private String hostName;
    /**
     * 端口
     */
    @Value("${elasticsearch.port}")
    private String port;
    /**
     * 集群名称
     */
    @Value("${elasticsearch.cluster.name}")
    private String clusterName;
 
    /**
     * 连接池
     */
    @Value("${elasticsearch.pool}")
    private String poolSize;
 
/*    @Bean
    public TransportClient init() {
        LOGGER.info("初始化开始。。。。。");
        TransportClient transportClient = null;
 
        try {
            // 配置信息
            Settings esSetting = Settings.builder()
                    .put("client.transport.sniff", true)//增加嗅探机制，找到ES集群
                    .put("thread_pool.search.size", Integer.parseInt(poolSize))//增加线程池个数，暂时设为5
                    .build();
            //配置信息Settings自定义,下面设置为EMPTY
            transportClient = new PreBuiltTransportClient(Settings.EMPTY);
            TransportAddress transportAddress = new TransportAddress(InetAddress.getByName(hostName), Integer.valueOf(port));
            transportClient.addTransportAddresses(transportAddress);
 
 
        } catch (Exception e) {
            LOGGER.error("elasticsearch TransportClient create error!!!", e);
        }
 
        return transportClient;
    }
*/

}
