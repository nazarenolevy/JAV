package com.despegar.jav.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.despegar.jav.domain.Trip;
import com.despegar.jav.service.TripGenerator;

@Controller
@RequestMapping("/trip")
public class TripController {

	private TripGenerator tripGenerator;

	public TripController(TripGenerator tripGenerator) {
		this.tripGenerator = tripGenerator;
	}

	@RequestMapping(value = "/generate", method = RequestMethod.GET)
	@ResponseBody
	public Trip generate() {
		Trip trip = this.tripGenerator.generateTrip();
		return trip;
	}

	@RequestMapping(value = "/generate/{cityCode}", method = RequestMethod.GET)
	@ResponseBody
	public Trip generate(@PathVariable String cityCode) {
		return this.tripGenerator.generateTrip(cityCode);
	}
	
	@RequestMapping(value = "/generate", method = RequestMethod.POST)
	@ResponseBody
	public Trip generateWithBody(@RequestBody String cityCode) {
		return this.tripGenerator.generateTrip(cityCode);
	}

}
