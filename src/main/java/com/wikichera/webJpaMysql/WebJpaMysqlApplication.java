package com.wikichera.webJpaMysql;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class WebJpaMysqlApplication implements ApplicationRunner {

    private static final Logger log = LoggerFactory.getLogger(WebJpaMysqlApplication.class);

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(WebJpaMysqlApplication.class);

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
}