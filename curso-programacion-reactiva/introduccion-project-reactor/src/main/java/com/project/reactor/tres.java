package com.project.reactor;

import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class tres {

    public static void main(String[] args) {
        Flux<String> nombres = Flux.just("Juan","Marcela","Rodrigo","Karla","Paola","Joaquin");
        List<String> lista = Arrays.asList("Ahorro","Inversion","Nomina");

        Flux<Object> nombreConTipoDeCuenta = nombres.filter(nombre-> nombre.equals("Juan"))
                .map(String::toUpperCase)
                .flatMap(nombre -> {
            return Flux.just(nombre,lista);
        });

        nombreConTipoDeCuenta.subscribe(System.out::println);
    }

}
