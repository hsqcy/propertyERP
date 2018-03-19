package com.cnfantasia.server.domainbase.ebuySupplyMerchantHasUser.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(用户供应商关系表) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class EbuySupplyMerchantHasUser implements Serializable{
*/


public class EbuySupplyMerchantHasUser extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */
	public EbuySupplyMerchantHasUser(){
	}
	/**
	public EbuySupplyMerchantHasUser(BigInteger id,String tMerchantId,String tUserId,Integer isFirstLogin,String updateTm,Integer sys0DelState){
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
		EbuySupplyMerchantHasUser other = (EbuySupplyMerchantHasUser) obj;
		if (id == null) {
		return true;
	}
	
}