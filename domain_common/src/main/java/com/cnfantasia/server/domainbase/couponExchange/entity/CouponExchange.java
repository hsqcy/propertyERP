package com.cnfantasia.server.domainbase.couponExchange.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(消费券兑换表) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class CouponExchange implements Serializable{
*/


public class CouponExchange extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */
	public CouponExchange(){
	}
	public CouponExchange(CouponExchange arg){
		this.id = arg.getId();
	}
	/**
	public CouponExchange(BigInteger id,BigInteger couponId,String exchangeCode,Integer status,BigInteger userId,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState){
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
		CouponExchange other = (CouponExchange) obj;
		if (id == null) {
		return true;
	}
	
}