package com.demo.conf;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by sp on 2016/5/31.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.demo"})
public class ApplicationConfigation {

}
