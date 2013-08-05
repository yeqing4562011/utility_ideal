package com.ideal.utility.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @ClassName: ApplicationContextHolder
 * @Description: TODO
 * @author yq
 * @date 2013年8月5日 上午11:31:23
 * 
 */
public class ApplicationContextHolder implements ApplicationContextAware{
	
	private static Log log = LogFactory.getLog(ApplicationContextHolder.class);

	private static ApplicationContext applicationContext;

	/**
	 * 获取容器
	 * 
	 * @return
	 */
	public static ApplicationContext getApplicationContext() {
		if (applicationContext == null) {
			throw new IllegalStateException( "'applicationContext' property is null,ApplicationContextHolder not yet init.");
		}
		
		return applicationContext;
	}

	/**
	 * 获取BEAN
	 * 
	 * @param beanName
	 * @return
	 */
	public static Object getBean(String beanName) {
		return getApplicationContext().getBean(beanName);
	}
	
	/**
	 * 获取BEAN
	 * 
	 * @param <T>
	 * @param beanName
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T get(final String beanName) {
		return (T) getBean(beanName);
	}

	/**
	 * 清除容器引用
	 */
	public static void cleanHolder() {
		applicationContext = null;
	}

	/* (非 Javadoc) 
	* <p>Title: setApplicationContext</p> 
	* <p>Description: </p> 
	* @param applicationContext
	* @throws BeansException 
	* @see org.springframework.context.ApplicationContextAware#setApplicationContext(org.springframework.context.ApplicationContext) 
	*/ 
	
	@SuppressWarnings("static-access")
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		// TODO Auto-generated method stub
		if (this.applicationContext != null) {
			throw new IllegalStateException( "ApplicationContextHolder already holded 'applicationContext'.");
		}
		
		this.applicationContext = context;
		
		log.info("holded applicationContext, displayName:" + applicationContext.getDisplayName());
	}

}
