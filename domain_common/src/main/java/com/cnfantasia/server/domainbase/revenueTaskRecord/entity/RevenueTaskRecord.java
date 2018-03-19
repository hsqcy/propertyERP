package com.cnfantasia.server.domainbase.revenueTaskRecord.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(定时同步收益额记录表) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class RevenueTaskRecord implements Serializable{
*/


public class RevenueTaskRecord extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */
	public RevenueTaskRecord(){
	}
	public RevenueTaskRecord(RevenueTaskRecord arg){
		this.id = arg.getId();
	}
	/**
	public RevenueTaskRecord(BigInteger id,String startTime,String finishTime,Integer miniRoleType,BigInteger miniRoleId,Integer goalType,Long succCount,Long failedCount,String lastSynTime,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState,String excepStackInfo){
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
		RevenueTaskRecord other = (RevenueTaskRecord) obj;
		if (id == null) {
		return true;
	}
	
}