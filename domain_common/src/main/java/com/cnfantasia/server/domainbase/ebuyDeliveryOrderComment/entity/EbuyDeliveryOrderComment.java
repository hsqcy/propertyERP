package com.cnfantasia.server.domainbase.ebuyDeliveryOrderComment.entity;

/* */ import java.io.Serializable;/* */
import java.math.BigInteger;
/*  import com.cnfantasia.server.domain.pub.BaseEntity; */
/**
 * 描述:(运单备注) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/* */
public class EbuyDeliveryOrderComment implements Serializable{
/* */

/* 
public class EbuyDeliveryOrderComment extends BaseEntity{
 */
	private static final long serialVersionUID = 1L;
	/**  */
	public EbuyDeliveryOrderComment(){
	}
	public EbuyDeliveryOrderComment(EbuyDeliveryOrderComment arg){
		this.id = arg.getId();
	}
	/**
	public EbuyDeliveryOrderComment(BigInteger id,BigInteger tEbuyOrderFId,String comment,String addTime){
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
		EbuyDeliveryOrderComment other = (EbuyDeliveryOrderComment) obj;
		if (id == null) {
		return true;
	}
	
}