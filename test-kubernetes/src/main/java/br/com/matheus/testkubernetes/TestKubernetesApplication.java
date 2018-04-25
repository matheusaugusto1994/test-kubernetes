package br.com.matheus.testkubernetes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import br.com.matheus.testkubernetes.util.Initialize;

@SpringBootApplication
public class TestKubernetesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(TestKubernetesApplication.class, args);
		Initialize.enrichDataBase(context);
	}
}
