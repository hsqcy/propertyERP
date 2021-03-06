package com.cnfantasia.server.domainbase.messagePrint.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;import java.lang.String;import java.lang.Integer;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(消息打印) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class MessagePrint implements Serializable{
*/


public class MessagePrint extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */	private BigInteger id;	/**  */	private BigInteger tMessageFId;	/** 页眉 */	private String pageHeader;	/** 落款 */	private String signature;	/** 是否有解放区二维码 */	private Integer rqCode;
	public MessagePrint(){
	}
	public MessagePrint(MessagePrint arg){
		this.id = arg.getId();		this.tMessageFId = arg.gettMessageFId();		this.pageHeader = arg.getPageHeader();		this.signature = arg.getSignature();		this.rqCode = arg.getRqCode();		this.sys0AddTime = arg.getSys0AddTime();		this.sys0UpdTime = arg.getSys0UpdTime();		this.sys0DelTime = arg.getSys0DelTime();		this.sys0AddUser = arg.getSys0AddUser();		this.sys0UpdUser = arg.getSys0UpdUser();		this.sys0DelUser = arg.getSys0DelUser();		this.sys0DelState = arg.getSys0DelState();
	}
	/**	 * 	 * @param id 	 * @param tMessageFId 	 * @param pageHeader 页眉	 * @param signature 落款	 * @param rqCode 是否有解放区二维码	 * @param sys0AddTime 	 * @param sys0UpdTime 	 * @param sys0DelTime 	 * @param sys0AddUser 	 * @param sys0UpdUser 	 * @param sys0DelUser 	 * @param sys0DelState 记录状态	 */
	public MessagePrint(BigInteger id,BigInteger tMessageFId,String pageHeader,String signature,Integer rqCode,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState){
		this.id = id;		this.tMessageFId = tMessageFId;		this.pageHeader = pageHeader;		this.signature = signature;		this.rqCode = rqCode;		this.sys0AddTime = sys0AddTime;		this.sys0UpdTime = sys0UpdTime;		this.sys0DelTime = sys0DelTime;		this.sys0AddUser = sys0AddUser;		this.sys0UpdUser = sys0UpdUser;		this.sys0DelUser = sys0DelUser;		this.sys0DelState = sys0DelState;
	}

	@Override
	public String toString() {
		StringBuffer sbf = new StringBuffer();		sbf.append("id=").append(id).append(";");		sbf.append("tMessageFId=").append(tMessageFId).append(";");		sbf.append("pageHeader=").append(pageHeader).append(";");		sbf.append("signature=").append(signature).append(";");		sbf.append("rqCode=").append(rqCode).append(";");		sbf.append("sys0AddTime=").append(sys0AddTime).append(";");		sbf.append("sys0UpdTime=").append(sys0UpdTime).append(";");		sbf.append("sys0DelTime=").append(sys0DelTime).append(";");		sbf.append("sys0AddUser=").append(sys0AddUser).append(";");		sbf.append("sys0UpdUser=").append(sys0UpdUser).append(";");		sbf.append("sys0DelUser=").append(sys0DelUser).append(";");		sbf.append("sys0DelState=").append(sys0DelState).append(";");		return sbf.toString();
	}
	
	public BigInteger getId() {		return id;	}	public void setId(BigInteger id) {		this.id = id;	}	public BigInteger gettMessageFId() {		return tMessageFId;	}	public void settMessageFId(BigInteger tMessageFId) {		this.tMessageFId = tMessageFId;	}	public String getPageHeader() {		return pageHeader;	}	public void setPageHeader(String pageHeader) {		this.pageHeader = pageHeader;	}	public String getSignature() {		return signature;	}	public void setSignature(String signature) {		this.signature = signature;	}	public Integer getRqCode() {		return rqCode;	}	public void setRqCode(Integer rqCode) {		this.rqCode = rqCode;	}
	
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
		MessagePrint other = (MessagePrint) obj;
		if (id == null) {			if (other.id != null)				return false;		} else if (!id.equals(other.id))			return false;
		return true;
	}
	
}
