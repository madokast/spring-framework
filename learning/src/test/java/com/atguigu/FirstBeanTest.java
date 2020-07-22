package com.atguigu;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Description
 * FirstBeanTest
 * <p>
 * Data
 * 2020/7/15-20:41
 *
 * @author zrx
 * @version 1.0
 */

public class FirstBeanTest {
	private static final Log logger = LogFactory.getLog(FirstBeanTest.class);

	@Test
	public void hello() {
		logger.info("hello spring 5");
	}

	@Test
	public void bean() {
		System.out.println("test bean");

		Resource resource = new ClassPathResource("first-bean.xml");

		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory(null);

		XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader((BeanDefinitionRegistry) beanFactory);

		beanDefinitionReader.loadBeanDefinitions(resource);

		Car car = beanFactory.getBean("car", Car.class);

		logger.info("car = " + car);

		// auto wire test
		PersonNeedACar person = new PersonNeedACar();
		logger.info("person = " + person);
		beanFactory.autowireBean(person);
		logger.info("person = " + person);

	}
}
