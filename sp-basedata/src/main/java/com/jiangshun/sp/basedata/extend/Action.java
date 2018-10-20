package com.jiangshun.sp.basedata.extend;

import com.jiangshun.sp.basedata.extend.exception.ServiceException;

@FunctionalInterface
public interface Action {
	public abstract void run() throws ServiceException, Exception;
}