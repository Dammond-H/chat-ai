package com.damm.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 黄林强
 * @ClassName ChatgptAdminApplication
 * @description: TODO
 * @date 2024年03月02日
 * @version: 1.0
 */
@SpringBootApplication(scanBasePackages = {"com.damm.admin"})
public class ChatgptAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(ChatgptAdminApplication.class, args);
    }
}
