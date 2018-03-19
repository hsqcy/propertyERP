package com.cnfantasia.server.domainbase.groupBuildingRegister.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(注册的小区信息) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class GroupBuildingRegister implements Serializable{
*/


public class GroupBuildingRegister extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */
	public GroupBuildingRegister(){
	}
	public GroupBuildingRegister(GroupBuildingRegister arg){
		this.id = arg.getId();
	}
	/**
	public GroupBuildingRegister(BigInteger id,String name,String addressDesc,BigInteger tAddressBlockFId,BigInteger tPropertyCompanyFId,BigInteger tChannelPartnerRecommendFId,Integer auditstatus,String auditDesc,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState){
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
		GroupBuildingRegister other = (GroupBuildingRegister) obj;
		if (id == null) {
		return true;
	}
	
}