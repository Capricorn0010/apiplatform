package com.chant.apiplatform.constant;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 通用常量类
 *
 * Author: 郑楷山
 * Date: 2019-08-29
 **/

public class CommonConstant {

	/**
	 * 包名配置
	 */
	public static final String BASE_PACKAGE = "com.landray.www";
	public static final String BACKEND_CONTROLLER_PACKAGE = BASE_PACKAGE + ".api.controller";
	public static final String COMMON_CONTROLLER_PACKAGE = BASE_PACKAGE + ".common.controller";

	/**
	 * JSR 303 javax 包名
	 */
	public static final String JAVAX_VALIDATION = "javax.validation";

	/**
	 * spring 的验证包名
	 */
	public static final String SPRING_VALIDATION = "org.springframework.validation";

	/**
	 * spring web 下 参数绑定的包名
	 */
	public static final String SPRING_WEB_BIND = "org.springframework.web.bind";
	public static final String SPRING_HTTP_CONVERTER = "org.springframework.http.converter";

	/**
	 * 检索 和 排序 字段非法异常
	 */
	public static final String SEARCH_NOT_ALLOW = "org.springframework.dao.InvalidDataAccessApiUsageException";
	public static final String SORT_NOT_ALLOW = "org.springframework.data.mapping.PropertyReferenceException";

	/**
	 *  DAO下错误
	 */
	public static final String DAO_OPERATE_EXCEPTION = "org.springframework.dao.DataIntegrityViolationException";

	/**
	 * 异常返回字段名
	 */
	public static final String STATUS_CODE = "status";
	public static final String ERROR_CODE = "error";
	public static final String MESSAGE = "message";
	public static final String TIMESTAMP = "timestamp";

	/**
	 *  上传路径
	 */
	public static final String HTML_SUFFIX =  ".html";
	public static final String UPLOAD_FILE_PATH = "/upload-files";
	public static final Set<String> SCRIPT_SUFFIX_SET = new HashSet<>(Arrays.asList("js", "css"));
	public static final Set<String> IMAGE_SUFFIX_SET = new HashSet<>(Arrays.asList("bmp", "jpg", "png", "jpeg", "gif"));
	public static final Set<String> VIDEO_SUFFIX_SET = new HashSet<>(Arrays.asList("mp4", "flv","avi","3gp","rm","rmvb","wmv","mov"));
	public static final Set<String> DOC_SUFFIX_SET = new HashSet<>(Arrays.asList("doc", "docx", "pdf","txt"));

	public final static  Long MAX_IMAGE_SIZE = 5242880l;
	public final static  Long MAX_VIDEO_SIZE = 52428800l; //50M
	public final static  Long MAX_DOC_SIZE = 5242880l;

	public final static String PLAN_CONTENT_IMAGE_PATH = "/image/plan/content/image/" ;
	public final static String PLAN_CONTENT_JS_PATH = "/image/plan/content/js/" ;
	public final static String PLAN_CONTENT_CSS_PATH = "/image/plan/content/css/" ;
	public final static String PLAN_LOGO_IMAGE_PATH = "/image/plan/logo/" ;

	public final static String CASE_CONTENT_IMAGE_PATH = "/image/case/content/image/" ;
	public final static String CASE_CONTENT_JS_PATH = "/image/case/content/js/" ;
	public final static String CASE_CONTENT_CSS_PATH = "/image/case/content/css/" ;
	public final static String CASE_CUSTOM_IMAGE_PATH = "/image/case/custom/" ;
	public final static String CASE_LOGO_IMAGE_PATH = "/image/case/logo/" ;
	public final static String CASE_HOME_LOGO_IMAGE_PATH = "/image/case//home/logo/" ;
	public final static String CASE_HOME_BACK_IMAGE_PATH = "/image/case/home/back/" ;
	public final static String CASE_HOME_GRAY_IMAGE_PATH = "/image/case/home/back/" ;

	public final static String CASE_CATEGORY_IMAGE_PATH = "/image/case/category/image/";

	public final static String RELATE_CASE_IMAGE_PATH = "/image/case/relate/" ;

	public final static String INFO_CONTENT_IMAGE_PATH = "/image/info/content/image/" ;
	public final static String INFO_CONTENT_JS_PATH = "/image/info/content/js/" ;
	public final static String INFO_CONTENT_CSS_PATH = "/image/info/content/css/" ;
	public final static String INFO_LOGO_IMAGE_PATH = "/image/info/logo/" ;
	public final static String INFO_PAGE_BANNER_PATH = "/image/banner/info/" ;

	public final static String ACTIVITY_IMAGE_PATH = "/image/activity/" ;

	public final static String HOME_PAGE_BANNER_PATH = "/image/banner/homepage/" ;

	public final static String PROMOTE_IMAGE_PATH = "/image/promote/" ;
	public final static String PROMOTE_VIDEO_PATH = "/video/promote/" ;

	public final static String PLAN_INDUSTRY_DOC_PATH = "/doc/plan-industry/" ;

	/**
	 *  异常类型
	 */
	public static final String SYSTEM_EXCEPTION = "系统异常";
	public static final String CUSTOM_EXCEPTION = "业务异常";

	/**
	 * token
	 */
	public static final String TOKEN_HEADER = "Authorization";
	public static final String TOKEN_PREFIX = "Bearer ";
	public static final String TOKEN_REFRESH = "X-Refresh-Token";
	public static final String TOKEN_SECRET = "ThisisthelandraywwwSYSTEMsecret20190828";

	/**
	 * 换行符
	 */
	public static final String LINE_SEPARATOR = System.getProperty("line.separator");

	/**
	 * 请求头
	 */
	public static final String X_REAL_IP = "X-Real-IP";
	public static final String X_FORWARDED_FOR = "X-Forwarded-For";

	/**
	 * 日志输出格式
	 */
	public static final String LOG_REQUEST_FORMAT = LINE_SEPARATOR + "@->> 接收请求日志:{}" ;
	public static final String LOG_RESPONSE_FORMAT = LINE_SEPARATOR+"<<-@ 响应请求日志:{}";
	public static final String LOG_EXCEPTION_BEFORE = LINE_SEPARATOR + "API日志拦截器before 出现异常.";
	public static final String LOG_EXCEPTION_AFTER_RETURNING = LINE_SEPARATOR + "API日志拦截器after returning 出现异常.";
	public static final String LOG_THROWING_AFTER_THROWING = LINE_SEPARATOR + "API日志拦截器after throwing 出现异常.";
	/*	public static final String LOG_ENTITY_INIT_ADD_FAIL = LINE_SEPARATOR + "@ ->新增实体时初始化失败:{}";
        public static final String LOG_ENTITY_INIT_UPDATE_FAIL = LINE_SEPARATOR + "@ ->更新实体时初始化失败:{}";
        public static final String LOG_JWT_AUTHORIZATION_FAIL = LINE_SEPARATOR + "JWT授权错误 :" ;*/
	public static final String LOG_JWT_AUTHENTICATION_SUCCESS = LINE_SEPARATOR + "JWT鉴权成功 :";

	/**
	 * 默认搜索和排序字段
	 */
	public static final String SEARCH_NAME = "name";
	public static final Integer SEARCH_ORDER_VALUE = 0;

	/**
	 * redis相关
	 */
	public final static String REDIS_GLOBAL = "global:";
	public final static String REDIS_UPDATE_COUNT = REDIS_GLOBAL + "update-count";

	public final static String REDIS_DEFAULT_VALUE = "0";

	public final static String REDIS_DEFAULT_CACHE_NAMESPACE ="cache:";

	public final static String REDIS_PATH_INFO_LIKES = "info:likes:";
	public final static String REDIS_INFO_LIKES_ALL_KEYS = REDIS_PATH_INFO_LIKES + "*";
	public final static String REDIS_PATH_ACTIVITY_CLICKS = "activity:clicks:";
	public final static String REDIS_ACTIVITY_CLICKS_ALL_KEYS = REDIS_PATH_ACTIVITY_CLICKS + "*";
	public final static String REDIS_PATH_PLAN_LIKES = "plan:likes:";
	public final static String REDIS_PLAN_LIKES_ALL_KEYS = REDIS_PATH_PLAN_LIKES + "*";
	public final static String REDIS_PATH_CASE_LIKES = "case:likes:";
	public final static String REDIS_CASE_LIKES_ALL_KEYS = REDIS_PATH_CASE_LIKES + "*";

}
