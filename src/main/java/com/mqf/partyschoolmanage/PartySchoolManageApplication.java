package com.mqf.partyschoolmanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
@EnableOpenApi
//@ComponentScan(basePackages = {"com.mqf.partyschoolmanage.config"})
public class PartySchoolManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(PartySchoolManageApplication.class, args);
    }

}
