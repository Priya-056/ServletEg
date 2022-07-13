package com.sonata.Springdemo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class AddressBook {
	
	private Address z;
	private ArrayList <Address> a=new ArrayList <Address>();
    public AddressBook()
    { }
   
    public void addAddress(Address z)
    {
       System.out.println(a.add(z));
    }
    public void modify(String email,String Lname,String Fname,String Street,String City,String State,String Country,int pin)
    {
        String e=email;
        String l=Lname;
        String f=Fname;
        String s=Street;
        String c=City;
        String s1=State;
        String c1=Country;
        int o=0;
        int p=pin;
        boolean b1=l.isBlank();
        boolean b2=f.isBlank();
        boolean b3=s.isBlank();
        boolean b4=c.isBlank();
        boolean b5=s1.isBlank();
        boolean b6=c1.isBlank();
        
        for(Address x:a)
        {
            if(e==x.getEmail())
            {
                if(b1==false)
                {
                    x.setLname(l);
                    o=1;
                }
                if(b2==false)
                {
                    x.setFname(f);
                    o=1;
                }
                if(b3==false)
                {
                    x.setStreet(s);
                    o=1;
                }
                if(b4==false)
                {
                    x.setCity(c);
                    o=1;
                }
                if(b5==false)
                {
                    x.setState(s1);
                    o=1;
                }
                if(b6==false)
                {
                    x.setCountry(c1);
                    o=1;
                }
                if(p!=0)
                {
                    x.setPin(p);
                    o=1;
                }
                
            }
        }
        if(o!=1)
        {
            System.out.println("Email Not Found");
        }
    }
    public void remove(Address z)
    {
        a.remove(z);
    }
    public void search(String email)
    {
        String e=email;
        int q=0;
        for(Address x:a)
        {
            if(e==x.getEmail())
            {
                System.out.println("Address Found");
                q=1;
            }
        }
        if(q!=1)
            System.out.println("Address Not Found");
    }
    public void MailAddr(String e)
    {
        String e1=e;
        for(Address x:a)
        {
            if(e==x.getEmail())
            {
                System.out.println("First name "+x.getFname()+" last name "+x.getLname()+" street "+x.getStreet()+" city "+x.getCity()+" state "+x.getState());
            }
        }
    }
    
    public void view()
    {
        for(Address z:a)
        {
        	
        System.out.println(z.getEmail());
        System.out.println(z.getLname());
        System.out.println(z.getFname());
        System.out.println(z.getStreet());
        System.out.println(z.getCity());
        System.out.println(z.getState());
        System.out.println(z.getCountry());
        System.out.println(z.getPin());
        }
    }
}

