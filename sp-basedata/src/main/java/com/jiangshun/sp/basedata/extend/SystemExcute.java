package com.jiangshun.sp.basedata.extend;

import java.util.concurrent.Callable;

import com.jiangshun.sp.basedata.extend.exception.ServiceException;

public class SystemExcute {
	public static void ExcuteServiceException(Action func) throws ServiceException, Exception {
		func.run();
	}

	public static <T> T ExcuteServiceException(Callable<T> func) throws ServiceException, Exception {
		return func.call();
	}
}
