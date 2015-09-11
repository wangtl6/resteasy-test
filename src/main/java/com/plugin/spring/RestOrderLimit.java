package com.plugin.spring;

import java.lang.reflect.Method;
import java.util.HashMap;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.aop.ThrowsAdvice;

import com.sitech.core.architecture.bean.RetInfo;

/**
 * REST日志AOP
 * 
 * @author wangtlc
 * 
 */
// @Slf4j
public class RestOrderLimit implements MethodInterceptor, ThrowsAdvice {

	private Logger logger = Logger.getLogger("ResLogAop");
	private static final String numAreaQry = "numAreaQry";// 归属地

	@Override
	public Object invoke(MethodInvocation invocation) {
		logger.info("获取接口名称：" + invocation.getMethod().getName());
		try {
			if (StringUtils.equals(invocation.getMethod().getName(), numAreaQry)) {
				RetInfo ret= new RetInfo();
				ret.setRetMsg("haha");
				return ret;
			} else if (StringUtils.equals(invocation.getMethod().getName(),"numAreaQry")) {
				logger.info("充值步骤违反交费流程>>>>" + invocation.getMethod().getName() + "is forbidden");
			}
			return invocation.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
			logger.error("充值步骤异常" + e.getMessage(), e);
		}
		return null;
	}
	 

	public void afterThrowing(Method method, Object[] os, Object target, Throwable ex) throws Throwable {
		logger.info("异常--REST返回：");
	}
}
