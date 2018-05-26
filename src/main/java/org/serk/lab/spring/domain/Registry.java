package org.serk.lab.spring.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

@Repository
public class Registry {
	static Logger logger = LoggerFactory.getLogger(Dog.class);


	@Bean("Tommy")
	public Animal createCat() {
		logger.info("create Tommy");

		return new Cat("Tom");
	}
}
