package com.oneeth.game.common;


/**
 * spring 对于 RuntimeException 异常才会进行事务回滚。
 * 
 * @author sxd
 * @since 2018/4/1
 */
public class OneethException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer code;

	private Exception exception;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Exception getException() {
		return exception;
	}

	public void setException(Exception exception) {
		this.exception = exception;
	}

	public OneethException(Integer code, Exception exception) {
		this.code = code;
		this.exception = exception;
	}
	public OneethException(Integer code) {
		this.code = code;
		this.exception = new Exception(code.toString());
	}
}