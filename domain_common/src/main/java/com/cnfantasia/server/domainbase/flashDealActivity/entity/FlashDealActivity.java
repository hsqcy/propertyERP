package com.cnfantasia.server.domainbase.flashDealActivity.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(秒杀活动表) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class FlashDealActivity implements Serializable{
*/


public class FlashDealActivity extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/** 主键ID */
	public FlashDealActivity(){
	}
	public FlashDealActivity(FlashDealActivity arg){
		this.id = arg.getId();
	}
	/**
	public FlashDealActivity(BigInteger id,String title,String activityPic,String activityStartTime,String activityEndTime,BigInteger tEbuyProductFId,Long activityPrice,Long prizeCount,String introduceContent,String introduceRule,Integer isSettle,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState){
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
		FlashDealActivity other = (FlashDealActivity) obj;
		if (id == null) {
		return true;
	}
	
}