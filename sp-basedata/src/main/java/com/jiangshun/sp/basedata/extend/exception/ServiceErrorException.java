package com.jiangshun.sp.basedata.extend.exception;


public class ServiceErrorException extends ServiceException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4485804107906345304L;

	public ServiceErrorException() {
		super();
	}

	public ServiceErrorException(String message) {
		this.message = message;
		this.code = "error";
	}

	public static ServiceErrorException Default(String message) {
		return new ServiceErrorException(message);
	}

}
