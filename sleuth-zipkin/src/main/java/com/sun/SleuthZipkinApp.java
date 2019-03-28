package com.sun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import zipkin.server.EnableZipkinServer;

@EnableZipkinServer
@SpringBootApplication
@EnableDiscoveryClient
public class SleuthZipkinApp {
	public static void main(String[] args) {
		SpringApplication.run(SleuthZipkinApp.class, args);
		System.out.println("----------- Sleuth zipkin start success! -----------");
	}
}
