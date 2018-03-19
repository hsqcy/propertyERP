package com.cnfantasia.server.domainbase.groupBuilding.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(小区信息) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class GroupBuilding implements Serializable{
*/


public class GroupBuilding extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */
	public GroupBuilding(){
	}
	public GroupBuilding(GroupBuilding arg){
		this.id = arg.getId();
	}
	/**
	public GroupBuilding(BigInteger id,String tel,Integer payPeriodStart,Integer payPeriodEnd,BigInteger tPropertyManagementFId,String name,BigInteger tBlockFId,BigInteger tAddressBlockSelfDefinedFId,Integer level,Integer signStatus,String lightCooperationTime,Integer cooperationType,String highCooperationTime,String allCooperationTime,Integer propfeeCanpay,String pinyinName,Integer checkStatus,String auditDesc,BigInteger creater,String iconUrl,String picDescUrl,String addressDesc,BigInteger tPropertyCompanyFId,BigInteger tCompanyUserFId,String neighborName,String neighborTel,String streetName,String streetTel,String contectUser,String contectTel,Integer sourceType,String baiduLocatLng,String baiduLocatLat,Long baiduPrecise,String baiduLevel,Integer propertyMonthChange,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState,String szgt01Seqid,String szgt01Presellno,String szgt01Enterprisename,String szgt01Allowtime,String szgt02Contractflowno,String szgt02Area,String szgt02Usedesc,String szgt02Floor,String szgt02Roomsrccode,String szgt02Agentname,String szgt02Agenttel,String szgt02Publishtime,Integer baiduFetchStatus,Integer mljFetchStatus,Integer fetchStatus,Integer ebuyFetchStatus,Integer keyStatus,Integer isPrefer,String preferName,Integer hlbSwitch,Integer settlementDay,Integer verificationStatus,Integer carMonthIsOpen,Integer carTmpIsOpen,Integer needBillIsOpen,Long billAmtAvg,Integer propertyPeriodType,String periodMonths,String billPrintDesc,Integer isSendWyMsg){
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
		GroupBuilding other = (GroupBuilding) obj;
		if (id == null) {
		return true;
	}
	
}