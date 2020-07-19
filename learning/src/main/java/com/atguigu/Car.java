package com.atguigu;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Description
 * first bean
 * <p>
 * Data
 * 2020/7/15-19:27
 *
 * @author zrx
 * @version 1.0
 */

public class Car {
	private static final Log logger = LogFactory.getLog(Car.class);

	public Car() {
		logger.debug("init cat");
	}

	@Override
	public String toString() {
		return "this is a car";
	}
}
