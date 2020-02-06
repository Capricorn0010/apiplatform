package com.chant.apiplatform.model;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * api请求日志输出model
 *
 * Author: 郑楷山
 * Date: 2019-08-29
 **/

@Accessors(chain = true)
@Data
public class SysRequestLog {

	/**
	 * 请求对应的IP地址
	 */
	private String requestIPAddress;

	/**
	 * 处理请求的
	 */
	private String processServiceName;

	/**
	 * 请求开始时间
	 */
	private long requestTime;

	/**
	 * 调用的方法名称
	 */
	private String methodName;

	/**
	 * 请求的uri
	 */
	private String requestUri;

	/**
	 * 参数
	 */
	private Object[] parameter;

	/**
	 * 请求的UUID
	 */
	private String requestId;


}
