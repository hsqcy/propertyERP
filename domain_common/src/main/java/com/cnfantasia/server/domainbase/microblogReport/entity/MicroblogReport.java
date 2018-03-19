package com.cnfantasia.server.domainbase.microblogReport.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(微博信息举报表) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class MicroblogReport implements Serializable{
*/


public class MicroblogReport extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/** 主键,同t_ebuy_product.f_id */
	public MicroblogReport(){
	}
	public MicroblogReport(MicroblogReport arg){
		this.id = arg.getId();
	}
	/**
	public MicroblogReport(BigInteger id,BigInteger tMicroblogContentFId,String reportInfo,String areaInfo,Integer sys0DelState){
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
		MicroblogReport other = (MicroblogReport) obj;
		if (id == null) {
		return true;
	}
	
}