package org.serk.lab.spring.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Candy {
	static Logger logger = LoggerFactory.getLogger(Candy.class);


	@Offline
	private Sparrow sparrow;

	@Required
	@Autowired
	@Qualifier("Tommy")
	void setCat(Animal animal) {
		animal.move();
		logger.info("set cat {}");
	}
}
