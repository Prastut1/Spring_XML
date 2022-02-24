package com.Prastut.Spring_Properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Traditional way
       Country country = new Country("India",55000);
       System.out.println("Country name using constructor Java Object is:" + country.getName());
       System.out.println("Country population using constructor Java Object is:"+ country.getPopulation());
       country.setName("USA");
       System.out.println("Country population using getter Java Object is:"+country.getName());
       //Spring way
       ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
       Country countryBean1 = (Country)ac.getBean("country");
       String name = countryBean1.getName();
       long population = countryBean1.getPopulation();
       System.out.println("Country name using Spring Bean is:" + name);
       System.out.println("Country population using Spring Bean is:" + population);
//       ClassPathXmlApplicationContext bc = new ClassPathXmlApplicationContext("com.Prastut.Spring_Properties/ApplicationContext.xml");
//       Country countryBean = (Country)bc.getBean("connttuu");
//       String name1= countryBean.getName();
       
    }
}
