package com.sun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *  用来指定该项目为Eureka的服务注册中心
 * @author Sunxf
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaApp 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(EurekaApp.class, args);
        System.out.println( "---------- EurekaApp start success ! ------------" );
    }
}
