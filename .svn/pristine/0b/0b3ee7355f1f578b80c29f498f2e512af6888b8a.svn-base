package com.gt.util;

import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;

import com.gt.model.Tlinksys;
import com.gt.model.Tmetadata;

public class FormatValidata {

	/**
	 * 元数据格式校验
	 * 
	 * @param dataReg
	 *            元数据对象实体
	 *
	 */
	public static String isValidate(Tmetadata dataReg, Map<String, String> mustflg) {
		String errDesc = "";// 单条数据的错误信息描述
		// 如果颗粒度有一项填写,就进行格式检验返回true
		if (StringUtils.isNotBlank(dataReg.getGranule1val()) || StringUtils.isNotBlank(dataReg.getGranule2val())
				|| StringUtils.isNotBlank(dataReg.getGranule3val())) {
			// 验证颗粒度是否填写完整
			// 验证颗粒度1输入是否符合规则
			errDesc = checkGranule(dataReg.getGranule1(), dataReg.getGranule1val(), "K1", errDesc);
			// 验证颗粒度2是否符合规则
			errDesc = checkGranule(dataReg.getGranule2(), dataReg.getGranule2val(), "K2", errDesc);
			// 验证颗粒度3是否符合规则
			errDesc = checkGranule(dataReg.getGranule3(), dataReg.getGranule3val(), "K3", errDesc);
		}
		// 验证MARC记录001标识号
		errDesc = checkField(dataReg.getMarccd(), FieldUtil.marcLen, "MARC记录001标识号", errDesc, mustflg.get("marccd"));
		if (StringUtils.isNotBlank(dataReg.getMarccd()) && !checkSysCd(dataReg.getMarccd())) {
			errDesc += (" && " + "MARC记录001标识号格式填写错误");
		}
		// 验证资源名(题名)
		errDesc = checkField(dataReg.getTitle(), FieldUtil.titleLen, "标题名(资源名称)", errDesc, mustflg.get("title"));
		// 验证作者
		errDesc = checkField(dataReg.getCreator(), FieldUtil.creatorLen, "作者", errDesc, mustflg.get("creator"));
		// 验证ISBN
		errDesc = checkField(dataReg.getIsbn(), FieldUtil.isbnLen, "ISBN", errDesc, mustflg.get("isbn"));
		// 验证ISSN
		errDesc = checkField(dataReg.getIssn(), FieldUtil.issnLen, "ISSN", errDesc, mustflg.get("issn"));
		// 验证语种
		errDesc = checkField(dataReg.getLang(), FieldUtil.languageLen, "语种", errDesc, mustflg.get("lang"));
		// 验证出版者
		errDesc = checkField(dataReg.getPub(), FieldUtil.pubLen, "出版者", errDesc, mustflg.get("pub"));
		// 验证出版时间
		errDesc = checkField(dataReg.getPubdate(), FieldUtil.pubDataLen, "出版时间", errDesc, mustflg.get("pubdate"));
		// 验证关联
		errDesc = checkField(dataReg.getAssinfo(), FieldUtil.assLen, "关联", errDesc, mustflg.get("assinfo"));
		// 验证来源
		errDesc = checkField(dataReg.getObjsource(), FieldUtil.sourceLen, "来源", errDesc, mustflg.get("objsource"));
		// 验证描述信息
		errDesc = checkField(dataReg.getObjdesc(), FieldUtil.descLen, "描述信息", errDesc, mustflg.get("objdesc"));
		// 验证主题词
		errDesc = checkField(dataReg.getTheme(), FieldUtil.themeLen, "主题词", errDesc, mustflg.get("theme"));
		// 验证版本信息
		errDesc = checkField(dataReg.getVersion(), FieldUtil.versionLen, "版本信息", errDesc, mustflg.get("version"));
		// 验证版权信息
		errDesc = checkField(dataReg.getCopyright(), FieldUtil.copyrightLen, "版权信息", errDesc, mustflg.get("copyright"));
		// 扩展字段1信息
		errDesc = checkField(dataReg.getExpndfield1(), FieldUtil.expndLen, "扩展字段1", errDesc, mustflg.get("expndfield1"));
		// 扩展字段2信息
		errDesc = checkField(dataReg.getExpndfield2(), FieldUtil.expndLen, "扩展字段2", errDesc, mustflg.get("expndfield2"));
		// 扩展字段3信息
		errDesc = checkField(dataReg.getExpndfield3(), FieldUtil.expndLen, "扩展字段3", errDesc, mustflg.get("expndfield3"));
		// 扩展字段4信息
		errDesc = checkField(dataReg.getExpndfield4(), FieldUtil.expndLen, "扩展字段4", errDesc, mustflg.get("expndfield4"));
		// 扩展字段5信息
		errDesc = checkField(dataReg.getExpndfield5(), FieldUtil.expndLen, "扩展字段5", errDesc, mustflg.get("expndfield5"));
		// 扩展字段6信息
		errDesc = checkField(dataReg.getExpndfield6(), FieldUtil.expndLen, "扩展字段6", errDesc, mustflg.get("expndfield6"));
		// 扩展字段7信息
		errDesc = checkField(dataReg.getExpndfield7(), FieldUtil.expndLen, "扩展字段7", errDesc, mustflg.get("expndfield7"));
		// 扩展字段8信息
		errDesc = checkField(dataReg.getExpndfield8(), FieldUtil.expndLen, "扩展字段8", errDesc, mustflg.get("expndfield8"));
		// 扩展字段9信息
		errDesc = checkField(dataReg.getExpndfield9(), FieldUtil.expndLen, "扩展字段9", errDesc, mustflg.get("expndfield9"));
		// 扩展字段10信息
		errDesc = checkField(dataReg.getExpndfield10(), FieldUtil.expndLen, "扩展字段10", errDesc, mustflg.get("expndfield10"));
		return errDesc;
	}

	/**
	 * 颗粒度检查
	 * 
	 * @param granule
	 *            颗粒度编号
	 * @param granuleVal
	 *            颗粒度值
	 * @param msg
	 *            序号
	 * @param errDesc
	 *            错误信息
	 * @return 错误信息
	 */
	private static String checkGranule(String granule, String granuleVal, String msg, String errDesc) {
		if (StringUtils.isNotBlank(granule)) {// 编号非空
			if (granule.length() > FieldUtil.gran) {// 编号长度错误
				errDesc += (" && " + "颗粒度" + msg + "编号长度过长;");
			} else {
				String[] granules = granule.toUpperCase().split("@");// 编号格式检验
				for (int i = 0; i < granules.length; i++) {
					if (!isK(granules[i])) {
						errDesc += (" && " + "颗粒度" + msg + "编号格式错误;");
					}
				}
			}
			if (StringUtils.isNotBlank(granuleVal)) {// k1值不为空
				if (granuleVal.length() > FieldUtil.granVal) {
					errDesc += (" && " + "颗粒度" + msg + "值长度过长;");
				} else {
					String[] granuleVals = granuleVal.split("@");
					for (int i = 0; i < granuleVals.length; i++) {
						if (!validateGranule(granuleVals[i])) {
							errDesc += (" && " + "颗粒度" + msg + "值格式错误;");
						}
					}
				}
			} else if ("T1K1V1".equals(granule)) {
				// T1K1V1时，值可以为空
			} else {// k1值为空
				errDesc += (" && " + "颗粒度" + msg + "值未填写;");
			}
		} else if (StringUtils.isNotBlank(granuleVal)) {// 编号为空，k1值不为空
			errDesc += (" && " + "颗粒度" + msg + "编号未填写;");
		}
		return errDesc;
	}

	/**
	 * 效验字段方法1
	 * 
	 * @param mustMap
	 * @param dataReg
	 * @param fieldName
	 * @param dbLen
	 * @return
	 * 
	 */
	private static String checkField(String dataRegField, int dbLen, String msg, String errDesc, String MustField) {
		if (Constants.MUSTFLG.equals(MustField) && StringUtils.isBlank(dataRegField)) {
			errDesc += (" && " + msg + "未填写");
		} else if (StringUtils.isNotBlank(dataRegField) && isString(dataRegField) && dataRegField.length() > dbLen) {
			errDesc += (" && " + msg + "填写长度大于最大长度" + dbLen + "位");
		}
		return errDesc;
	}

	/**
	 * 字符串验证
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isString(String str) {
		// 2012-9-28特殊字符效验、保留|符号、元数据备份时使用该符号
		// String symStr = "'\"<>?%|＜＞＇“‘？＂％｜";
		String symStr = "|";
		for (int i = 0; i < symStr.length(); i++) {
			if (str.indexOf(symStr.charAt(i)) >= 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 验证颗粒度格式是否正确
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isK(String str) {
		Pattern pattern = Pattern.compile("[T]{1}[1-9]*[K]{1}[1-9]*[V]{1}[1-9]*");
		return pattern.matcher(str).matches();
	}

	/**
	 * 验证字符串是否为数字 - ,组合成如:"1,2" "1,1-2" "1-2,1-2" "1-2"
	 * 
	 * @param str
	 * @return
	 */
	public static boolean validateGranule(String str) {
		str = str.replaceAll("[a-zA-Z]", "");
		if (!isStartOfDigital(str)) {
			return false;
		}
		if (!isEndOfDigital(str)) {
			return false;
		}

		Pattern pattern = Pattern.compile("^([0-9]+)|([0-9]+-[0-9]+)$");
		String tmpStr[] = str.split(",");
		for (int i = 0; i < tmpStr.length; i++) {
			Matcher matcher = pattern.matcher(tmpStr[i]);
			boolean res = matcher.matches();
			if (!res) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 验证字符串是否又由数字开头
	 * 
	 * @param str
	 * @return
	 */
	private static boolean isStartOfDigital(String str) {
		Pattern sp = Pattern.compile("^[0-9](.)*");
		Matcher sm = sp.matcher(str);
		return sm.matches();
	}

	/**
	 * 验证字符串是否由数字结尾
	 * 
	 * @param str
	 * @return
	 */
	private static boolean isEndOfDigital(String str) {
		Pattern ep = Pattern.compile("(.)*[0-9]$");
		Matcher em = ep.matcher(str);
		return em.matches();
	}

	/**
	 * 资源类型、文件格式检验
	 * 
	 * @param paramList
	 *            存在的格式集合
	 * @param dataRegField
	 *            待检验格式
	 * @param dbLen
	 *            允许的最大长度
	 * @param msg
	 *            检验的数据名称
	 * @param errDesc
	 *            错误信息
	 * @return 错误信息
	 */
	private static String checkField3(List<String> paramList, String dataRegField, int dbLen, String msg,
			String errDesc) {

		if (StringUtils.isBlank(dataRegField)) {
			errDesc += (" && " + msg + "未填写 ");
		} else if (dataRegField.length() > dbLen || !paramList.contains(dataRegField.toUpperCase())) {
			errDesc += (" && " + msg + "不存在 ");
		}
		return errDesc;
	}

	/**
	 * 效验字符串是否合法
	 * 
	 * @param dateStr
	 * @return
	 */
	public static boolean checkSysCd(String dateStr) {
		return checkStrByReg(dateStr, "^\\w+$");
	}

	/**
	 * 根据正则判断字符串
	 * 
	 * @param str
	 * @return
	 */
	public static boolean checkStrByReg(String str, String regex) {
		Pattern pat = Pattern.compile(regex);
		Matcher mat = pat.matcher(str);
		if (mat.find()) {
			return true;
		}
		return false;
	}

	/**
	 * 页面下拉选格式验证
	 * 
	 * @param str
	 * @return
	 */
	public static boolean cSelect(String str) {
		if (StringUtils.isBlank(str) || "请选择".equals(str)) {
			return false;
		}
		return true;
	}

	/**
	 * 注册参数格式化
	 * 
	 * @param request
	 * @param str
	 * @return
	 */
	public static Tmetadata formatTmetadata(HttpServletRequest request, Tmetadata data) {
		
		String syscd2 = request.getParameter( "syscd2");		
		String granule1 = request.getParameter( "granule1");
		String granule2 = request.getParameter( "granule2");
		String granule3 = request.getParameter( "granule3");
		
		if (cSelect(syscd2)) {
			Tlinksys sys = new Tlinksys();
			sys.setSyscd(syscd2);
			data.setTlinksys(sys);
		} 
		if(cSelect(granule1)){
			data.setGranule1(null);
			data.setGranule1val(null);
		}
		if(cSelect(granule2)){
			data.setGranule2(null);
			data.setGranule2val(null);
		}
		if(cSelect(granule3)){
			data.setGranule3(null);
			data.setGranule3val(null);
		}
		
		return data;
	}
	/**
	 * 注册参数验证
	 * 
	 * @param request
	 * @param str
	 * @return
	 */
	public static String checkReg(HttpServletRequest request, String parm) {
		
		String str = request.getParameter(parm);		
		if (cSelect(str)) {
			return str;
		} 
		return null;
	}
}
