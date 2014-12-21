package com.yy.service.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * Desc: spring bean的容器
 *
 * @author Sapphire
 *
 * @Since 创建时间:2014年12月21日 下午5:39:47
 */
public class AppCtx {
	private static AppCtx appCtx = new AppCtx();

	private ApplicationContext applicationContext;

	private AppCtx() {
		applicationContext = new ClassPathXmlApplicationContext(
				"ApplicationContext.xml");
	}

	public static synchronized AppCtx getInstance() {
		if (appCtx == null) {
			appCtx = new AppCtx();
		}

		return appCtx;
	}

	public <T> T getBean(Class<T> t) {
		return applicationContext.getBean(t);
	}

	public <T> T getBean(String name) {
		return (T) applicationContext.getBean(name);
	}
}
