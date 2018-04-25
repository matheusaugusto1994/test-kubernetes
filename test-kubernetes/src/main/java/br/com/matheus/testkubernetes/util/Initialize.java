package br.com.matheus.testkubernetes.util;

import java.time.DayOfWeek;
import java.util.Arrays;

import org.springframework.context.ConfigurableApplicationContext;

import br.com.matheus.testkubernetes.repository.DayOfWeekRepository;

public class Initialize {

	public static void enrichDataBase(ConfigurableApplicationContext context) {
		DayOfWeekRepository dayOfWeekRepository = context.getBean(DayOfWeekRepository.class);
		Arrays.asList(DayOfWeek.values()).forEach(day -> {
			dayOfWeekRepository.save(new br.com.matheus.testkubernetes.model.DayOfWeek(day.toString()));
		});
	}

}
