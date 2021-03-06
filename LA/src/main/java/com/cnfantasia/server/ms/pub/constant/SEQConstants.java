package com.cnfantasia.server.ms.pub.constant;

/**
 * 描述:所有表的序列号字段存储
 * 
 * @version 1.00
 * @author syl
 * 
 */
public class SEQConstants {
	/** OMS系统参数表 */
	public static final String t_oms_comm_sys_para = "omsCommSysPara";
	/** OMS统一Uuid表 */
	public static final String t_oms_comm_uuid = "omsCommUuid";
	/** OMS功能表 */
	public static final String t_oms_permi_function = "omsPermiFunction";
	/** OMS角色表 */
	public static final String t_oms_permi_role = "omsPermiRole";
	/** OMS角色功能关系 */
	public static final String t_oms_permi_role_has_t_oms_permi_function = "omsPermiRoleHasTOmsPermiFunction";
	/** OMS用户表 */
	public static final String t_oms_user = "omsUser";
	/** OMS用户角色关系 */
	public static final String t_oms_user_has_t_oms_permi_role = "omsUserHasTOmsPermiRole";

	/** 高尔夫组团表 */
	public static final String t_golf_group = "golfGroup";
	/** 高尔夫组团详细表 */
	public static final String t_golf_group_detail = "golfGroupDetail";

}
