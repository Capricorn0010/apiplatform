package com.chant.apiplatform.model;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * api响应日志输出model
 *
 * Author: 郑楷山
 * Date: 2019-08-29
 **/

@Accessors(chain = true)
@Data
public class SysResponseLog {


	/**
	 * 处理花费时间
	 */
	private long processTime;

	/**
	 * 错误码
	 */
	private int code;

	/**
	 * 返回状态 与http状态一致
	 */
	private int status;

	/**
	 * 异常类名
	 */
	private String exceptionClassName;

	/**
	 * 返回值
	 */
	private Object resultValue;

	/**
	 * 是否忽略保存参数和返回值
	 */
	private Boolean isIgnoreUri;


}
