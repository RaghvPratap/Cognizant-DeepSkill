package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class libMgmtApp {
    public static void main(String[] args) {
        //creating the spring container that reads bean definitions from an XML file located in the classpath
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService service=context.getBean("bookService", BookService.class);
        service.displayService();
    }
}
