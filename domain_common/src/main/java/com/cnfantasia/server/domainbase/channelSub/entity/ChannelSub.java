package com.cnfantasia.server.domainbase.channelSub.entity;

/* import java.io.Serializable;*/
import java.lang.Long;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(子渠道表) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class ChannelSub implements Serializable{
*/


public class ChannelSub extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */
	public ChannelSub(){
	}
	public ChannelSub(ChannelSub arg){
		this.id = arg.getId();
	}
	/**
	public ChannelSub(Long id,String name,BigInteger tChanneFId,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState){
		this.id = id;
	}

	@Override
	public String toString() {
		StringBuffer sbf = new StringBuffer();
	}
	
	public Long getId() {
	
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
		ChannelSub other = (ChannelSub) obj;
		if (id == null) {
		return true;
	}
	
}