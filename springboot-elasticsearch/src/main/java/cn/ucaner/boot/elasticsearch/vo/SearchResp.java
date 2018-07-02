/**
 * <html>
 * <body>
 *  <P> Copyright JasonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 2018年7月2日 上午9:41:14</p>
 *  <p> Created by Jason </p>
 *  </body>
 * </html>
 */
package cn.ucaner.boot.elasticsearch.vo;

import java.io.Serializable;
import java.util.ArrayList;

/**     
* @Package：cn.ucaner.boot.elasticsearch.vo   
* @ClassName：SearchResp   
* @Description：   <p> SearchResp </p>
* @Author： - Jason   
* @CreatTime：2018年7月2日 上午9:41:14   
* @Modify By：   
* @ModifyTime：  2018年7月2日
* @Modify marker：   
* @version    V1.0
*/
public class SearchResp implements Serializable{

	private static final long serialVersionUID = 5480183460699822745L;
	
	/**
	 * 计数
	 */
	private Long total;

	/**
	 * 高亮
	 */
    private ArrayList<String> HighLighting;

    /**
     * 搜索text
     */
    private ArrayList<String> searchText;

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public ArrayList<String> getHighLighting() {
		return HighLighting;
	}

	public void setHighLighting(ArrayList<String> highLighting) {
		HighLighting = highLighting;
	}

	public ArrayList<String> getSearchText() {
		return searchText;
	}

	public void setSearchText(ArrayList<String> searchText) {
		this.searchText = searchText;
	}
    

}
