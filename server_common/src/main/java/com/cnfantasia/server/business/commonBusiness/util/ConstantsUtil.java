/**
 * 
 */
package com.cnfantasia.server.business.commonBusiness.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 类说明：
 * 
 * @author hunter
 * @since 2014年6月9日下午5:19:39
 */
public class ConstantsUtil {
	private static Properties prop = new Properties();
	
	static {
		InputStream in = ConstantsUtil.class.getResourceAsStream("/com/cnfantasia/server/business/pub/constants.properties");
		try {
			prop.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String getValue(String key){
		return prop.getProperty(key);
	}


	public static void main(String args[]) {
		System.out.println(ConstantsUtil.getValue("sms.sendurl"));
	}
}
