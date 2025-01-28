package com.faang.bindu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Hello world!
 *
 */

@SpringBootApplication
//@EnableMongoRepositories(basePackages = "com.faang.bindu.repository")
public class App 
{

    public static void main( String[] args )
    {
        SpringApplication.run(App.class,args);
    }
}
