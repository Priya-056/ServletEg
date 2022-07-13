package com.sonata.Springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sonata.Springdemo.impl.Add;
import com.sonata.Springdemo.impl.Addcall;

@SpringBootApplication
public class SpringdemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringdemoApplication.class, args);
		//Addition add=new Add();
		//System.out.println(adddadd(10,20));
		
		//Addcall  addCall = (Addcall) ctx.getBean("addcall");
		//Addcall  addCall1 = (Addcall) ctx.getBean("addcall");
		//System.out.println(addCall.callAdd());
		//System.out.println(addCall);
		//System.out.println(addCall1);
		AddressBook book =(AddressBook) ctx.getBean("addressBook");
		AddressBook book1 =(AddressBook) ctx.getBean("addressBook");
		Address ad=(Address) ctx.getBean("address");
		ad.setEmail("abc@gmail,com");
		ad.setCity("Vellore");
		ad.setCountry("India");
		ad.setFname("priya");
		ad.setLname("s");
		ad.setPin(632014);
		ad.setState("tamilnadu");
		ad.setStreet("xyz street");
		
		
		System.out.println(book);
		System.out.println(ad);
		book.addAddress(ad);
		book.view();


	}

}
