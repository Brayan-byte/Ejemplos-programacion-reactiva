package com.project.reactor;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class uno {
    public static void main(String[] args) {

        //Publisher
        Mono<String> nombre = Mono.just("Juan");
        Flux<String> nombres = Flux.just("Juan","Marcela","Rodrigo","Karla","Paola");

        //Suscribirnos
        nombre.log().subscribe();
        nombres.log().subscribe();


    }
}
