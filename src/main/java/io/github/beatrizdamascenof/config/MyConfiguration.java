package io.github.beatrizdamascenof.config;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("development") //roda a classe somente no perfil setado (nesse caso, development), ele tem q tar habilitado em properties
public class MyConfiguration {

    @Bean
    public CommandLineRunner executar(){
        return args -> {
            System.out.println("Executando a config de desenvolvimento");
        };
    }
//    @Bean (name = "applicationName") //se não declarar nome, ele pega o nome do metodo
//    public String applicationName(){
//        return "Sistema de Vendas";
//    }
// Esse Bean foi eliminado para ser substituido pelo resource > application.properties
}
