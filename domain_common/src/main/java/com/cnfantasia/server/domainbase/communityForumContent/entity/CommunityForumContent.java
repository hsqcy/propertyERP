package com.cnfantasia.server.domainbase.communityForumContent.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(社区论坛的帖子内容) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class CommunityForumContent implements Serializable{
*/


public class CommunityForumContent extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */
	public CommunityForumContent(){
	}
	public CommunityForumContent(CommunityForumContent arg){
		this.id = arg.getId();
	}
	/**
	public CommunityForumContent(BigInteger id,String createTime,String title,String text,BigInteger userId,String smallIconUrl,String smallTxt,String detailUrl,BigInteger tGroupBuildingFId,BigInteger tCommunityForumTypeFId,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState){
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
		CommunityForumContent other = (CommunityForumContent) obj;
		if (id == null) {
		return true;
	}
	
}