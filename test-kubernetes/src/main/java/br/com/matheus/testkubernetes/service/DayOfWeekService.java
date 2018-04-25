package br.com.matheus.testkubernetes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.matheus.testkubernetes.model.DayOfWeek;
import br.com.matheus.testkubernetes.repository.DayOfWeekRepository;

@Service
public class DayOfWeekService {

	@Autowired
	private DayOfWeekRepository dayOfWeekRepository;
	
	public List<DayOfWeek> listAll(){
		return dayOfWeekRepository.findAll();
	}
}
