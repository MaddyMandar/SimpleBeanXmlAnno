package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class GreetingApp 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("greetings.xml");
        Greetings festivalGreetings = ctx.getBean("festivalGreetings",Greetings.class);
        
        System.out.println(festivalGreetings.sayGreet());
    }
}
