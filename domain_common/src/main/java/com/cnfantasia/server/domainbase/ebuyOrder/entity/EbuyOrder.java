package com.cnfantasia.server.domainbase.ebuyOrder.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(订单表) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class EbuyOrder implements Serializable{
*/


public class EbuyOrder extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */
	public EbuyOrder(){
	}
	public EbuyOrder(EbuyOrder arg){
		this.id = arg.getId();
	}
	/**
	public EbuyOrder(BigInteger id,String orderNo,BigInteger buyerId,BigInteger currRoomId,BigInteger gbId,String buyTime,Long amount,Long amountPoint,Long totalCouponAmount,Integer status,Integer type,Long totalDeliveryFee,String payMethod,String payTime,String refundTime,Integer payStatus,String delivPeopleName,String delivPhone,String delivAddressArea,String delivAddressDetail,Integer delivTargetType,BigInteger delivTargetId,String delivmName,Long delivmFee,BigInteger creater,String delivmDesc,Integer delivStatus,String logisticsname,String logisticsecode,Integer pointType,String invoiceCompanyName,String invoiceProductTypeName,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState,Integer clientPayStatus,String subChannel,BigInteger billTypeId,Integer isPropFee,String deviceId){
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
		EbuyOrder other = (EbuyOrder) obj;
		if (id == null) {
		return true;
	}
	
}