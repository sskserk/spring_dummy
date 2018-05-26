package org.serk.lab.spring.domain;

import org.springframework.stereotype.Component;

@Component
public class Sparrow implements Animal {
	String getName() {
		return "Sparrow";
	}
}
