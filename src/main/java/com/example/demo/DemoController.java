package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;

@RestController
public class DemoController {

	@Autowired
	DataClient dataClient;

    @GetMapping("/")
	public DemoDataDto getData() {
		return new DemoDataDto(System.getenv("SERVICE_NAME"));
	}

	@GetMapping("/other")
	public DemoDataDto getDataFromOtherService() {
		return dataClient.getData();
	}
}