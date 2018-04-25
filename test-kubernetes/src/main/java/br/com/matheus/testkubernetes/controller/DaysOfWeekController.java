package br.com.matheus.testkubernetes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.matheus.testkubernetes.model.DayOfWeek;
import br.com.matheus.testkubernetes.service.DayOfWeekService;

@RestController
public class DaysOfWeekController {

	@Autowired
	private DayOfWeekService dayOfWeekService;
	
	@GetMapping("/days")
	public List<DayOfWeek> list(){
		return dayOfWeekService.listAll();
	}
	
}
