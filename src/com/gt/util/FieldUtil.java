package com.gt.util;

import java.util.List;

public class FieldUtil {

	
	/**
	 * 数据来源系统编号
	 */
	public static final String SYS_CD = "SYS_CD";
	/**
	 * 数据来源系统内部唯一编号
	 */
	public static final String SYS_IN_ID = "SYS_IN_ID";
	/**
	 * 文件格式编号
	 */
	public static final String F_CD = "F_CD";
	public static final String FORMAT = "FORMAT";
	/**
	 * 资源类型编号
	 */
	public static final String T_CD = "T_CD";
	public static final String T_CDTYPE = "TYPE";
	/**
	 * MARC记录001标识号
	 */
	public static final String MARC_CD = "MARC_CD";
	/**
	 * 资源名(题名)
	 */
	public static final String TITLE = "TITLE";
	/**
	 * 作者
	 */
	public static final String CREATOR = "CREATOR";
	/**
	 * ISSN
	 */
	public static final String ISSN = "ISSN";
	/**
	 * ISBN
	 */
	public static final String ISBN = "ISBN";
	/**
	 * 语种
	 */
	public static final String LANG = "LANG";
	public static final String LANGUAGE = "LANGUAGE";
	/**
	 * 出版者
	 */
	public static final String PUB = "PUB";
	public static final String PUBLISHER = "PUBLISHER";
	/**
	 * 出版时间
	 */
	public static final String PUB_DATE = "PUB_DATE";
	public static final String DATE = "DATE";
	/**
	 * 标识粒度1
	 */
	public static final String GRANULE_1 = "GRANULE_1";
	/**
	 * 标识粒度2
	 */
	public static final String GRANULE_2 = "GRANULE_2";

	/**
	 * 标识粒度3
	 */
	public static final String GRANULE_3 = "GRANULE_3";

	/**
	 * 标识粒度1-值
	 */
	public static final String GRANULE_1_VAL = "GRANULE_1_VAL";

	/**
	 * 标识粒度2-值
	 */
	public static final String GRANULE_2_VAL = "GRANULE_2_VAL";

	/**
	 * 标识粒度3-值
	 */
	public static final String GRANULE_3_VAL = "GRANULE_3_VAL";

	/**
	 * 描述信息
	 */
	public static final String OBJ_DESC = "OBJ_DESC";
	public static final String DESCRIPTION = "DESCRIPTION";
	/**
	 * 来源
	 */
	public static final String OBJ_SOURCE = "OBJ_SOURCE";
	public static final String SOURCE = "SOURCE";

	/**
	 * 关联
	 */
	public static final String ASS_INFO = "ASS_INFO";


	/**
	 * 唯一标识符
	 */
	public static final String CDOI = "CDOI";

	/**
	 * 扩展字段1
	 */
	public static final String EXPND_FIELD1 = "EXPND_FIELD1";

	/**
	 * 扩展字段2
	 */
	public static final String EXPND_FIELD2 = "EXPND_FIELD2";

	/**
	 * 扩展字段3
	 */
	public static final String EXPND_FIELD3 = "EXPND_FIELD3";

	/**
	 * 扩展字段4
	 */
	public static final String EXPND_FIELD4 = "EXPND_FIELD4";

	/**
	 * 扩展字段5
	 */
	public static final String EXPND_FIELD5 = "EXPND_FIELD5";

	/**
	 * 扩展字段6
	 */
	public static final String EXPND_FIELD6 = "EXPND_FIELD6";

	/**
	 * 扩展字段7
	 */
	public static final String EXPND_FIELD7 = "EXPND_FIELD7";

	/**
	 * 扩展字段8
	 */
	public static final String EXPND_FIELD8 = "EXPND_FIELD8";

	/**
	 * 扩展字段9
	 */
	public static final String EXPND_FIELD9 = "EXPND_FIELD9";

	/**
	 * 扩展字段10
	 */
	public static final String EXPND_FIELD10 = "EXPND_FIELD10";

	/**
	 * 文件格式编号长度
	 */
	public static final int fcdLen = 4;
	
	/**
	 * 资源类型编号长度
	 */
	public static final int tcdLen = 4;

	/**
	 * 颗粒度长度
	 */
	public static final int gran = 72;
	
	/**
	 * 颗粒度值长度
	 */
	public static final int granVal = 1024;
	
	/**
	 * MARC记录001标识号
	 */
	public static final int marcLen = 16;
	
	/**
	 * 资源标题名长度
	 */
	public static final int titleLen = 256;

	/**
	 * 作者长度
	 */
	public static final int creatorLen = 256;
	
	/**
	 * isbn长度
	 */
	public static final int isbnLen = 256;
	
	/**
	 * issn长度
	 */
	public static final int issnLen = 256;
	
	/**
	 * 语种长度
	 */
	public static final int languageLen = 20;
	
	/**
	 * 出版者长度
	 */
	public static final int pubLen = 256;
	
	/**
	 * 出版时间长度
	 */
	public static final int pubDataLen = 128;
	
	/**
	 * 验证信息长度
	 */
	public static final int assLen = 128;
	
	/**
	 * 来源长度
	 */
	public static final int sourceLen = 128;
	
	/**
	 * 来源长度
	 */
	public static final int descLen = 1024;
	
	/**
	 * 扩展字段长度
	 */
	public static final int expndLen = 128;
	
	/**
	 * 主题词长度
	 */
	public static final int themeLen = 256;
	
	/**
	 * 版权长度
	 */
	public static final int copyrightLen = 256;
	
	/**
	 * 版本长度
	 */
	public static final int versionLen = 256;
	
}
