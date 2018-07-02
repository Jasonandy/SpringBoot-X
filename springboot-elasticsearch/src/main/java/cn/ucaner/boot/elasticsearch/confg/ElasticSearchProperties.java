/**
 * <html>
 * <body>
 *  <P> Copyright JasonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 2018年7月1日 下午7:36:15</p>
 *  <p> Created by Jason </p>
 *  </body>
 * </html>
 */
package cn.ucaner.boot.elasticsearch.confg;

/**     
* @Package：cn.ucaner.boot.elasticsearch.confg   
* @ClassName：ElasticSearchProperties   
* @Description：   <p> ElasticSearchProperties </p>
* @Author： - Jason   
* @CreatTime：2018年7月1日 下午7:36:15   
* @Modify By：   
* @ModifyTime：  2018年7月1日
* @Modify marker：   
* @version    V1.0
*/
//@ConfigurationProperties(prefix = "spring.data.elasticsearch")
public class ElasticSearchProperties {
	
	 /**
     * 名称
     */
    private String clusterName;

    /**
     * 节点
     */
    private String clusterNodes;

    /**
     * 端口号
     */
    private int port = 9200;

    
	public String getClusterName() {
		return clusterName;
	}

	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
	}

	public String getClusterNodes() {
		return clusterNodes;
	}

	public void setClusterNodes(String clusterNodes) {
		this.clusterNodes = clusterNodes;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	@Override
	public String toString() {
		return "ElasticSearchProperties [clusterName=" + clusterName + ", clusterNodes=" + clusterNodes + ", port="+ port + "]";
	}

}
