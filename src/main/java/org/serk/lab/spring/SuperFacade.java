package org.serk.lab.spring;

import org.serk.lab.spring.domain.Animal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class SuperFacade {
	static Logger logger = LoggerFactory.getLogger(SuperFacade.class);


	@Autowired
	@Qualifier("BeautifulDog")
	Animal dog;

	Animal getDog() {
		logger.info("getNames {}", dog.getClass().getName());

		return dog;
	}


}
