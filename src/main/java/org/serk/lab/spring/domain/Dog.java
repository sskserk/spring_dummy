package org.serk.lab.spring.domain;

import org.serk.lab.spring.LogicFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("BeautifulDog")
//@Scope("prototype")
public class Dog implements Animal {
    static Logger logger = LoggerFactory.getLogger(Dog.class);


    public Dog() {
        logger.info("New Dog");
    }

    @Override
    public void move() {

    }
}
