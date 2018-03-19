package com.cnfantasia.server.domainbase.kitchenCookbook.entity;

/* import java.io.Serializable;*/
import java.math.BigInteger;
 import com.cnfantasia.server.domain.pub.BaseEntity;
/**
 * 描述:(厨房菜谱) 实体类
 * 
 * @version 1.00
 * @author null
 * 
 */
/*
public class KitchenCookbook implements Serializable{
*/


public class KitchenCookbook extends BaseEntity{

	private static final long serialVersionUID = 1L;
	/**  */
    /** 功效 */
    private String effect;
	public KitchenCookbook(){
	}
	public KitchenCookbook(KitchenCookbook arg){
		this.id = arg.getId();
        this.effect = arg.getEffect();
	}
	/**
	public KitchenCookbook(BigInteger id,String name,String picUrl,String desc,String effect,String eatWeight,String cookTime,String cookStep,String taste,String cookTech,String tips,String createTime,String sys0AddTime,String sys0UpdTime,String sys0DelTime,BigInteger sys0AddUser,BigInteger sys0UpdUser,BigInteger sys0DelUser,Integer sys0DelState,Long totalSupportCount){
		this.id = id;
        this.effect = effect;
	}

	@Override
	public String toString() {
		StringBuffer sbf = new StringBuffer();
        sbf.append("effect=").append(effect).append(";");
	}
	
	public BigInteger getId() {
    public String getEffect() {
        return effect;
    }
    public void setEffect(String effect) {
        this.effect = effect;
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
		KitchenCookbook other = (KitchenCookbook) obj;
		if (id == null) {
		return true;
	}
	
}