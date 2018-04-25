package br.com.matheus.testkubernetes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.matheus.testkubernetes.model.DayOfWeek;

public interface DayOfWeekRepository extends JpaRepository<DayOfWeek, Long>{

}
