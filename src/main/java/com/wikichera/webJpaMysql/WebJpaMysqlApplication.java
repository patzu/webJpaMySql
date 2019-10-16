package com.wikichera.webJpaMysql;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class WebJpaMysqlApplication {

    private static final Logger log = LoggerFactory.getLogger(WebJpaMysqlApplication.class);

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(WebJpaMysqlApplication.class);
        /*AdminRepository adminRepository = context.getBean(AdminRepository.class);

        Admin admin = new Admin("Ali", "123456");
        adminRepository.save(admin);
        System.out.println("One Admin is saved!");

        for (Admin items : adminRepository.findByUserName("davoud")) {
            System.out.println(items);
        }*/

        /*GenericDAOService daoService = context.getBean(GenericDAOService.class);
        Admin admin = new Admin("Mohammad", "123456");
        daoService.insert(admin);
        Admin admin2 = new Admin(null, "1111");
        daoService.insert(admin2);*/

    }
}