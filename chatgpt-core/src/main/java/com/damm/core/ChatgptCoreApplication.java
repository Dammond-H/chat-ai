package com.damm.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 黄林强
 * @ClassName ChatgptCoreApplication
 * @description: TODO
 * @date 2024年07月07日
 * @version: 1.0
 */
@SpringBootApplication(scanBasePackages = {"com.damm.core"})
public class ChatgptCoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(ChatgptCoreApplication.class, args);
    }
}
