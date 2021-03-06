/**   
* Filename:    ISysParamManager.java   
* @version:    1.0  
* Create at:   2014年6月20日 上午9:18:34   
* Description:  
*   
* Modification History:   
* Date        Author      Version     Description   
* ----------------------------------------------------------------- 
* 2014年6月20日    shiyl      1.0         1.0 Version   
*/
package com.cnfantasia.server.business.pub.omsSysParam;

/**
 * @author wenfq 2015-03-27
 */
public interface IOmsSysParamManager {
	/**
	 * 初始化
	 */
	public void init();
	
	/**
   * 查询某个系统参数码对应的参数值
   * @param sysParaCode 系统参数码
   * @return 参数值
   */
  public String getSysParaValue(String sysParaCode);
  
  /**
   * 更新重新加载系统参数信息到缓存
   */
  public void updSysParaValue();
  
}
