package com.pom.dao;

import org.apache.commons.lang3.RandomStringUtils;

public class BeanFactory {

	
	public void setUpDataForNewUser(CreateUserBean bean) {
		bean.setFirstName(RandomStringUtils.randomAlphabetic(5));
		bean.setLastName(RandomStringUtils.randomAlphabetic(5));
		bean.setPassword("Manoj@123");
	}
}
