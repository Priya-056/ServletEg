package com.sonata.Springdemo.impl;

import org.springframework.stereotype.Component;

import com.sonata.Springdemo.Addition;

@Component
public class Add implements Addition {

	@Override
	public int add(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1+n2;
	}

}
