package com.app.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.LocationStats;
import com.app.service.CoronaDataService;

@RestController
@CrossOrigin(origins="http://3.108.51.133:3000/")
public class DataController {
	
	@Autowired
	CoronaDataService coronaDataService;
	
	@GetMapping("/data")
	public List<LocationStats> home() throws IOException, InterruptedException {
		return coronaDataService.fetchData();
	}
}

