package com.company;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        TestProgram testProgram = context.getBean("testProgram", TestProgram.class);

        System.out.println(testProgram.getName());

        context.close();
    }
}
