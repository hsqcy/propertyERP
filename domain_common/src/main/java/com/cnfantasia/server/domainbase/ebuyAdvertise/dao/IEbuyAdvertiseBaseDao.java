package com.cnfantasia.server.domainbase.ebuyAdvertise.dao;

import java.util.Map;
import java.util.List;

import com.cnfantasia.server.business.pub.entity.PageModel;

import com.cnfantasia.server.domainbase.ebuyAdvertise.entity.EbuyAdvertise;

/**
 * 描述:() DAO层接口
 * 
 * @version 1.00
 * @author null
 * 
 */
public interface IEbuyAdvertiseBaseDao {
	/**
	 * 根据条件查询()信息
	 * @param paramMap
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	public List<EbuyAdvertise> selectEbuyAdvertiseByCondition(Map<String, Object> paramMap, boolean isDim);
	/**
	 * 按条件分页查询()信息
	 * @param paramMap
	 * @param pageModel
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	public List<EbuyAdvertise> selectEbuyAdvertiseByCondition(Map<String, Object> paramMap, PageModel pageModel, boolean isDim);
	/**
	 * 根据序列号查询()信息
	 * @param id
	 * @return
	 */
	public EbuyAdvertise selectEbuyAdvertiseBySeqId(java.math.BigInteger id);
	/**
	 * 根据条件查询满足条件的()记录数
	 * @param paramMap
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	public int selectEbuyAdvertiseCount(Map<String, Object> paramMap, boolean isDim);
	/**
	 * 往()新增一条记录
	 * @param ebuyAdvertise
	 * @return
	 */
	public int insertEbuyAdvertise(EbuyAdvertise ebuyAdvertise);
	
	/**
	 * 批量新增()信息
	 * @param ebuyAdvertiseList
	 * @return
	 */
	public int insertEbuyAdvertiseBatch(List<EbuyAdvertise> ebuyAdvertiseList);
	
	/**
	 * 更新()信息
	 * @param ebuyAdvertise
	 * @return
	 */
	public int updateEbuyAdvertise(EbuyAdvertise ebuyAdvertise);
	
	/**
	 * 批量更新()信息
	 * @param ebuyAdvertiseList
	 * @return
	 */
	public int updateEbuyAdvertiseBatch(List<EbuyAdvertise> ebuyAdvertiseList);
	
	/**
	 * 根据序列号删除()信息_逻辑删除
	 * @param id
	 * @return
	 */
	
	public int deleteEbuyAdvertiseLogic(java.math.BigInteger id);
	
	/**
	 * 根据Id 批量删除()信息_逻辑删除
	 * @param idList
	 * @return
	 */
	
	public int deleteEbuyAdvertiseLogicBatch(List<java.math.BigInteger> idList);
	
	
//	/**
//	 * 根据序列号删除()信息
//	 * @param id
//	 * @return
//	 */
//	public int deleteEbuyAdvertise(java.math.BigInteger id);
//	
//	/**
//	 * 根据序列号批量删除()信息
//	 * @param idList
//	 * @return
//	 */
//	public int deleteEbuyAdvertiseBatch(List<java.math.BigInteger> idList);
	
	
}
