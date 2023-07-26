package com.project.reactor;

import reactor.core.publisher.Flux;

public class dos {


    public static void main(String[] args) {
        Flux<String> nombres = Flux.just("Juan","Marcela","Rodrigo","Karla","Paola","Joaquin");
        Flux<String> nombresMayusculas = nombres.map(String::toUpperCase)
                .filter(nombre -> nombre.startsWith("J"));

        nombresMayusculas.subscribe(System.out::println);

    }




}
