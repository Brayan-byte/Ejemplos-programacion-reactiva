package com.project.reactor;

import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;

public class cuatro {
    public static void main(String[] args) {
        Flux<String> nombresHombres = Flux.just("Juan","Rodrigo","Joaquin");
        Flux<String> nombresMujeres = Flux.just("Marcela","Karla","Paola");

        Flux<String> nombresHombresYMujeres = Flux.merge(nombresHombres,nombresMujeres);
        nombresHombresYMujeres.subscribe(System.out::println);

    }
}
