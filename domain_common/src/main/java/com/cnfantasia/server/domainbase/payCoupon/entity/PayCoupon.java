package com.cnfantasia.server.domainbase.payCoupon.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(优惠表) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class PayCoupon implements Serializable{
*/


public class PayCoupon extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */
	public PayCoupon(){
	}
	public PayCoupon(PayCoupon arg){
		this.id = arg.getId();
	}
	/**
	public PayCoupon(BigInteger id,BigInteger tEbuyOrderFId,Integer type,Long amount,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState){
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
		PayCoupon other = (PayCoupon) obj;
		if (id == null) {
		return true;
	}
	
}