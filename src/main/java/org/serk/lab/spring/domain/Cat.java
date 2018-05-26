package org.serk.lab.spring.domain;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Cat implements Animal {

	public String getName() {
		return name;
	}

	private String name;

	public Cat(String name) {
		this.name = name;
	}



	@Override
	public void move() {

	}
}
