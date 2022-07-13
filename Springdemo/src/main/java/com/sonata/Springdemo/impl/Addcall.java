package com.sonata.Springdemo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.sonata.Springdemo.Addition;

@Component
@Scope(value="prototype")
public class Addcall {
	@Autowired
	Addition add;
	
public int callAdd() {
		
		return add.add(10, 40);
	}

}
