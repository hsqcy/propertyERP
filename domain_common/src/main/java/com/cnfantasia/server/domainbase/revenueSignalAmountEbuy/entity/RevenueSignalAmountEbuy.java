package com.cnfantasia.server.domainbase.revenueSignalAmountEbuy.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(楼下店师傅收益明细补充表) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class RevenueSignalAmountEbuy implements Serializable{
*/


public class RevenueSignalAmountEbuy extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */
	public RevenueSignalAmountEbuy(){
	}
	public RevenueSignalAmountEbuy(RevenueSignalAmountEbuy arg){
		this.id = arg.getId();
	}
	/**
	public RevenueSignalAmountEbuy(BigInteger id,BigInteger tRevenueSignalAmountId,Double amountDiscount,Double amountReal,Double amountTotal,Double amountOrderReal,Double amountRefund,BigInteger tOrderDeliverId,BigInteger tUserId,String huaId,BigInteger tGroupBuildingId,String groupBuildingName,Integer payMethod,BigInteger tPcId,String pcName,BigInteger tAgentId,String agentName,String gbName,String flowNo,String payTm,String dredgeServiceName,Double amoutDeduct,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState){
		this.id = id;
	}

	@Override
	public String toString() {
		StringBuffer sbf = new StringBuffer();
	}
	
	public BigInteger getId() {
		if(amoutDeduct == null) {
			return 0.0;
		}
	
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
		RevenueSignalAmountEbuy other = (RevenueSignalAmountEbuy) obj;
		if (id == null) {
		return true;
	}
	
}