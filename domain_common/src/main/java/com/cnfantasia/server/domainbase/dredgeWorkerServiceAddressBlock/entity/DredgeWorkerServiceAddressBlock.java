package com.cnfantasia.server.domainbase.dredgeWorkerServiceAddressBlock.entity;

/* */ import java.io.Serializable;/* */
import java.math.BigInteger;
/*  import com.cnfantasia.server.domain.pub.BaseEntity; */
/**
 * 描述:(疏通师傅服务行政区) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/* */
public class DredgeWorkerServiceAddressBlock implements Serializable{
/* */

/* 
public class DredgeWorkerServiceAddressBlock extends BaseEntity{
 */
	private static final long serialVersionUID = 1L;
	/**  */
	public DredgeWorkerServiceAddressBlock(){
	}
	/**
	public DredgeWorkerServiceAddressBlock(BigInteger id,BigInteger tAddressBlockFId,BigInteger tUserFId){
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
		DredgeWorkerServiceAddressBlock other = (DredgeWorkerServiceAddressBlock) obj;
		if (id == null) {
		return true;
	}
	
}