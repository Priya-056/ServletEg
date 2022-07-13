package com.sonata.Springdemo.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.sonata.Springdemo.Address;
import com.sonata.Springdemo.AddressBook;
import com.sonata.Springdemo.ManageAddress;

public class CreateAddressBookImp implements ManageAddress {

	@Autowired
	AddressBook addressBook;
	
	@Autowired
	Address address;

	@Override
	public AddressBook createAddressBook() {
		address.setEmail("abc.com");
		addressBook.addAddress(address);
		return addressBook;
	}

}
