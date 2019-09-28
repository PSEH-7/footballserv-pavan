package com.footballsts.sapient.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name="football", url = "https://apiv2.apifootball.com")
public interface FootballApiClient {

	@RequestMapping(method = RequestMethod.GET) 
	ResponseEntity<String> getLeagues(@RequestParam("action") String action,
			@RequestParam("country_id") String countryId, @RequestParam("APIkey") String apikey);

}
