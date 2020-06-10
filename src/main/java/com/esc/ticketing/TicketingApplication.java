package com.esc.ticketing;

import com.esc.ticketing.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TicketingApplication {

    public static void main(String[] args) {
        SpringApplication.run(TicketingApplication.class, args);
        /*ApplicationContext ctx = SpringApplication.run(TicketingApplication.class, args);
        User user = ctx.getBean(User.class);
        user.setName("Amol");
        System.out.println(user);*/
    }

}
