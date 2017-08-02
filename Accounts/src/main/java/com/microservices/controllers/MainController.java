package com.microservices.controllers;

import java.util.List;
import java.util.Map;
//import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

//import com.microservices.vo.Greeting;

@RestController
@RequestMapping("/v1")
public class MainController {
	
	private final Logger logger = LoggerFactory.getLogger(MainController.class);
    
    @GetMapping
    public List<Object> findAllObjects(){
    	logger.info("GET ALL OBJECTS");
    	return null;
    }
    
    @GetMapping("/{objId}")
    public Object findObject(@PathVariable Long objId){
    	logger.info("GET MAPPING");
    	return null;
    }
    
    @PostMapping
    public Object createObject(@RequestBody Object obj){
    	logger.info("POST MAPPING");
    	return null;
    }
    
    @DeleteMapping("/{objId}")
    public void deleteObject(@PathVariable Long objId){
    	logger.info("DELETE MAPPING");
    }
    
    @PutMapping("/{objId}")
    public Object updateObject(@RequestBody Object obj, @PathVariable Long objId){
    	logger.info("PUT MAPPING");
    	return null;
    }
    
    @PatchMapping("/{objId}")
    public Object updateObject(@RequestBody Map<String, String> updates, @PathVariable Long objId){
    	logger.info("PATCH MAPPING");
    	return null;
    }
    
}
