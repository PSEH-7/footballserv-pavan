package com.footballsts.sapient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.footballsts.sapient.feignclient.FootballApiClient;

@SpringBootApplication
@EnableFeignClients
public class FootballstsApplication implements CommandLineRunner  {

	@Autowired
	FootballApiClient footballApiClient;
	
	public static void main(String[] args) {
		SpringApplication.run(FootballstsApplication.class, args);
	}
	
	@Override
	public void run(String... strings) throws Exception {

		System.out.println("Output###: "+footballApiClient.getLeagues("get_leagues", "41", "9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978").getBody());
		System.out.println("Output###: "+footballApiClient.getStandings("get_standings", "149", "9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978").getBody());
		System.out.println("Output###: "+footballApiClient.getCountries("get_countries", "9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978").getBody());
	}


}
