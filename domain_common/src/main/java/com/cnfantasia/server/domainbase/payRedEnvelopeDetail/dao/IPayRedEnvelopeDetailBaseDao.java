package com.cnfantasia.server.domainbase.payRedEnvelopeDetail.dao;

import java.util.Map;
import java.util.List;

import com.cnfantasia.server.business.pub.entity.PageModel;

import com.cnfantasia.server.domainbase.payRedEnvelopeDetail.entity.PayRedEnvelopeDetail;

/**
 * 描述:(粮票优惠详情) DAO层接口
 * 
 * @version 1.00
 * @author null
 * 
 */
public interface IPayRedEnvelopeDetailBaseDao {
	/**
	 * 根据条件查询(粮票优惠详情)信息
	 * @param paramMap
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	List<PayRedEnvelopeDetail> selectPayRedEnvelopeDetailByCondition(Map<String, Object> paramMap, boolean isDim);
	/**
	 * 按条件分页查询(粮票优惠详情)信息
	 * @param paramMap
	 * @param pageModel
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	List<PayRedEnvelopeDetail> selectPayRedEnvelopeDetailByCondition(Map<String, Object> paramMap, PageModel pageModel, boolean isDim);
	/**
	 * 根据序列号查询(粮票优惠详情)信息
	 * @param id
	 * @return
	 */
	PayRedEnvelopeDetail selectPayRedEnvelopeDetailBySeqId(java.math.BigInteger id);
	/**
	 * 根据条件查询满足条件的(粮票优惠详情)记录数
	 * @param paramMap
	 * @param isDim true表示模糊查询,false表示精确查询
	 * @return
	 */
	int selectPayRedEnvelopeDetailCount(Map<String, Object> paramMap, boolean isDim);
	/**
	 * 往(粮票优惠详情)新增一条记录
	 * @param payRedEnvelopeDetail
	 * @return
	 */
	int insertPayRedEnvelopeDetail(PayRedEnvelopeDetail payRedEnvelopeDetail);
	
	/**
	 * 批量新增(粮票优惠详情)信息
	 * @param payRedEnvelopeDetailList
	 * @return
	 */
	int insertPayRedEnvelopeDetailBatch(List<PayRedEnvelopeDetail> payRedEnvelopeDetailList);
	
	/**
	 * 更新(粮票优惠详情)信息
	 * @param payRedEnvelopeDetail
	 * @return
	 */
	int updatePayRedEnvelopeDetail(PayRedEnvelopeDetail payRedEnvelopeDetail);
	
	/**
	 * 批量更新(粮票优惠详情)信息
	 * @param payRedEnvelopeDetailList
	 * @return
	 */
	int updatePayRedEnvelopeDetailBatch(List<PayRedEnvelopeDetail> payRedEnvelopeDetailList);
	
	/**
	 * 根据序列号删除(粮票优惠详情)信息_逻辑删除
	 * @param id
	 * @return
	 */

	int deletePayRedEnvelopeDetailLogic(java.math.BigInteger id);
	
	/**
	 * 根据Id 批量删除(粮票优惠详情)信息_逻辑删除
	 * @param idList
	 * @return
	 */

	int deletePayRedEnvelopeDetailLogicBatch(List<java.math.BigInteger> idList);
	
	
//	/**
//	 * 根据序列号删除(粮票优惠详情)信息
//	 * @param id
//	 * @return
//	 */
//	public int deletePayRedEnvelopeDetail(java.math.BigInteger id);
//	
//	/**
//	 * 根据序列号批量删除(粮票优惠详情)信息
//	 * @param idList
//	 * @return
//	 */
//	public int deletePayRedEnvelopeDetailBatch(List<java.math.BigInteger> idList);
	
	
}
