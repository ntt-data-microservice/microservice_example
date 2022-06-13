package com.nttdata.functional;

import com.nttdata.functional.api.AccountApi;
import com.nttdata.functional.service.AccountService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class FunctionalProgrammingApplication {

	public static void main(String[] args) {
		SpringApplication.run(FunctionalProgrammingApplication.class, args);
		System.out.println("Hello Programmers");

		AccountApi accountApi = new AccountApi();
		AccountService accountService = new AccountService(accountApi);
		//accountService.getAccountEach();
		//accountService.getAccountForeach();
		//accountService.getAccountsStreams();
		//accountService.getAccountsFilter();
		//accountService.getAccountsMap();
		accountService.getAccountsMapTrans();
	}

}
