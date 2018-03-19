package com.cnfantasia.server.domainbase.ebuyRefundAudit.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(商品审核不通过原因) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class EbuyRefundAudit implements Serializable{
*/


public class EbuyRefundAudit extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/** 主键,同t_ebuy_product.f_id */
	public EbuyRefundAudit(){
	}
	public EbuyRefundAudit(EbuyRefundAudit arg){
		this.id = arg.getId();
	}
	/**
	public EbuyRefundAudit(BigInteger id,String reason,Integer sys0DelState,Long refundRatio){
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
		EbuyRefundAudit other = (EbuyRefundAudit) obj;
		if (id == null) {
		return true;
	}
	
}