package com.sit.Springdemo2;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main(String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context =
                new ClassPathXmlApplicationContext("config.xml");

        User c1 = (User) context.getBean("cust1");
        System.out.println(c1);

     User c2 = (User) context.getBean("cust2");
        System.out.println(c2);
        
    }
}
