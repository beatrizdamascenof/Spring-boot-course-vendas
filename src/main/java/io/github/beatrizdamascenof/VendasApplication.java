package io.github.beatrizdamascenof;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
// o componentscan é uma forma de permitir que o spring enxergue os demais pacotes dentro do projeto, precisando só dizer o caminho dele
@ComponentScan(basePackages = {"io.github.beatrizdamascenof","io.github.beatrizdamascenof.repository",
        "io.github.beatrizdamascenof.service", "com.umabibliotecaexterna.projeto", "io.github.beatrizdamascenof.config"})
@RestController


public class VendasApplication {

//    @Autowired
//    @Qualifier("applicationName")  eles podem ser substituidos pelo application.name lá em resources > application.properties, que é o Value abaixo

    @Value("${application.name}")
    private String applicationName;

    @GetMapping("/hello") // rota de acesso da aplicação. ao rodar ele indica a porta no terminal e é só por localhost:8080/hello no chrome
    public String helloWorld(){
        return applicationName;
    }
    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}
