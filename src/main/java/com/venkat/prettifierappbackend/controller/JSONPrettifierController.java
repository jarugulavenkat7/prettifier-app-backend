package com.venkat.prettifierappbackend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
@CrossOrigin("*")
@RestController
public class JSONPrettifierController {
	
@PostMapping("/format-json")
public String prettifyJSON(@RequestBody String uglyJsonString) {
	Gson gson = new GsonBuilder().setPrettyPrinting().create();
	JsonElement je = JsonParser.parseString(uglyJsonString);
	String prettyJsonString = gson.toJson(je);
	return prettyJsonString;
}
}
