package com.chant.apiplatform.model;

import com.chant.apiplatform.enums.ExceptionEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 通用业务异常model
 *
 * Author: 郑楷山
 * Date: 2019-08-29
 **/

@EqualsAndHashCode(callSuper = true)
@Data
public class BusinessException extends RuntimeException {

	private int status;

	private int error;

	private String message;

	ExceptionEnum exceptionEnum;

	private Object[] args;


	/**
	 * @param exceptionEnum 异常枚举
	 */
	public BusinessException(ExceptionEnum exceptionEnum) {
		this(exceptionEnum, (String) null);
	}

	/**
	 * @param exceptionEnum 异常枚举
	 * @param cause         原因
	 */
	public BusinessException(ExceptionEnum exceptionEnum, Throwable cause) {
		this(exceptionEnum, null, cause);
	}

	/**
	 * @param exceptionEnum 异常枚举
	 * @param detailMessage 明细信息
	 */
	public BusinessException(ExceptionEnum exceptionEnum, String detailMessage) {

		this(exceptionEnum, detailMessage, null);
	}


	/**
	 * @param exceptionEnum 异常枚举
	 * @param detailMessage 明细信息
	 * @param cause         原因
	 **/
	public BusinessException(ExceptionEnum exceptionEnum, String detailMessage, Throwable cause) {
		this(exceptionEnum, cause, detailMessage);
	}

	/**
	 * @param exceptionEnum 错误枚举
	 * @param cause         cause
	 * @param args          不定参数,对应枚举中的描述的内容,注意缺少的话会报错
	 */
	public BusinessException(ExceptionEnum exceptionEnum, Throwable cause, Object... args) {

		super(String.format(exceptionEnum.getDescription(), args),
				cause,
				true,
				false);
		this.exceptionEnum = exceptionEnum;
		this.message = String.format(exceptionEnum.getDescription(), args);
		this.status = exceptionEnum.getStatus();
		this.error = exceptionEnum.getError();
		this.args = args;

	}

}
