package com.testproject.controllers;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/job")
@CrossOrigin("*")
public class JobController {

    @GetMapping("/list")
    public Object getListController(){

    final String uri = "http://dev3.dansmultipro.co.id/api/recruitment/positions.json";
    RestTemplate restTemplate = new RestTemplate();
    Object result = restTemplate.getForObject(uri, Object.class);
    return result;

        
    }

    @GetMapping("/{id}")
    public Object getDetailController(@PathVariable String id){
    final String uri = "http://dev3.dansmultipro.co.id/api/recruitment/positions/" + id;
    RestTemplate restTemplate = new RestTemplate();
    Object result = restTemplate.getForObject(uri, Object.class);
    return result;

        
    }
    
}
