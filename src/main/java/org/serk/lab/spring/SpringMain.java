package org.serk.lab.spring;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@EnableAutoConfiguration
@ComponentScan(basePackages = "org.serk.lab.spring")
public class SpringMain {
    static Logger logger = LoggerFactory.getLogger(SpringMain.class);

    public static void main(String [] args) throws Exception {

        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(SpringMain.class);
        LogicFacade facade = ctx.getBean(LogicFacade.class);

        logger.info("start logic");
        facade.getNames();
        facade.getNames();


    }
}
