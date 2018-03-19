package com.cnfantasia.server.domainbase.communitySupply.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(社区商家信息) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class CommunitySupply implements Serializable{
*/


public class CommunitySupply extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */
	public CommunitySupply(){
	}
	public CommunitySupply(CommunitySupply arg){
		this.id = arg.getId();
	}
	/**
	public CommunitySupply(BigInteger id,String name,String pinyinName,String desc,Long avgConsume,Double starLevel,Long openHoursStart,Long openHoursEnd,String openHoursDesc,BigInteger tCommunitySupplyTypeFId,String addressDetail,Long order,String picUrl,Integer sourceType,String baiduStreetId,String baiduUid,String baiduLocatLat,String baiduLocatLng,String mljiaShopId,String mljiaShopShopBustiness,String mljiaShopCertificationStar,String mljiaShopArea,String mljiaShopCredit,String mljiaShopBusinessStartTime,String mljiaShopBusinessEndTime,String mljiaShopImgUrl,String mljiaShopImgUrl2,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState){
		this.id = id;
	}

	@Override
	public String toString() {
		StringBuffer sbf = new StringBuffer();
	}
	
	public BigInteger getId() {
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CommunitySupply other = (CommunitySupply) obj;
		if (id == null) {
		return true;
	}
	
}