package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="data", url="${feign.url}")
public interface DataClient {
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/",
        consumes = "application/json"
    )
    DemoDataDto getData();
}
