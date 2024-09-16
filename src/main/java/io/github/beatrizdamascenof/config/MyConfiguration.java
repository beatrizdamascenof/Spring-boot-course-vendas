package io.github.beatrizdamascenof.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean (name = "applicationName") //se não declarar nome, ele pega o nome do metodo
    public String applicationName(){
        return "Sistema de Vendas";
    }

}
