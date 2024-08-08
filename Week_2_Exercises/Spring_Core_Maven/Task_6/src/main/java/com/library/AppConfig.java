package com.library;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.library")
public class AppConfig {
    // This class is used for component scanning
}
