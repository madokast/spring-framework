package com.atguigu;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Description
 * PersonNeedACar
 * <p>
 * Data
 * 2020/7/22-13:52
 *
 * @author zrx
 * @version 1.0
 */

public class PersonNeedACar {
	private static final Log logger = LogFactory.getLog(Car.class);

	@Autowired
	private Car car;


	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "PersonNeedACar{" +
				"car=" + car +
				'}';
	}
}
