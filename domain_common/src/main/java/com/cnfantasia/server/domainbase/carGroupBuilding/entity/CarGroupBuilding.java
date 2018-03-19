package com.cnfantasia.server.domainbase.carGroupBuilding.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
import java.lang.Integer;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(小区车禁配置表) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class CarGroupBuilding implements Serializable{
*/


public class CarGroupBuilding extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */
	private String account;
	/** 密码 */
	private String pwd;
	/** 小区对应的推送url */
	/** 总停车位数 */
	private Long parkingTotal;
	/** 当前停车位数 */
	private Long parkingCrnt;
	public CarGroupBuilding(){
	}
	public CarGroupBuilding(CarGroupBuilding arg){
		this.id = arg.getId();
		this.pwd = arg.getPwd();
		this.pushUrl = arg.getPushUrl();
		this.parkingCrnt = arg.getParkingCrnt();
		this.sys0AddTime = arg.getSys0AddTime();
	}
	/**
	 * @param pwd 密码
	 * @param pushUrl 小区对应的推送url
	 * @param parkingCrnt 当前停车位数
	 * @param sys0AddTime 购买时间
	public CarGroupBuilding(BigInteger id,BigInteger tGroupBuildingId,String tradeCode,String account,String pwd,String pushUrl,Long parkingTotal,Long parkingCrnt,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState){
		this.id = id;
		this.pwd = pwd;
		this.pushUrl = pushUrl;
		this.parkingCrnt = parkingCrnt;
		this.sys0AddTime = sys0AddTime;
	}

	@Override
	public String toString() {
		StringBuffer sbf = new StringBuffer();
		sbf.append("pwd=").append(pwd).append(";");
		sbf.append("pushUrl=").append(pushUrl).append(";");
		sbf.append("parkingCrnt=").append(parkingCrnt).append(";");
		sbf.append("sys0AddTime=").append(sys0AddTime).append(";");
	}
	
	public BigInteger getId() {
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Long getParkingTotal() {
		return parkingTotal;
	}
	public void setParkingTotal(Long parkingTotal) {
		this.parkingTotal = parkingTotal;
	}
	public Long getParkingCrnt() {
		return parkingCrnt;
	}
	public void setParkingCrnt(Long parkingCrnt) {
		this.parkingCrnt = parkingCrnt;
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
		CarGroupBuilding other = (CarGroupBuilding) obj;
		if (id == null) {
		return true;
	}
	
}