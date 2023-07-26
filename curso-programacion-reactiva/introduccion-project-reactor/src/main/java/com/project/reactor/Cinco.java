package com.project.reactor;

import com.project.reactor.entity.Usuario;
import reactor.core.publisher.Flux;

public class Cinco {


    public static void main(String[] args) {
        Flux<String> nombres = Flux.just("Juan","Rodrigo","Joaquin");
        Flux<Integer> Edades = Flux.just(12,42,25);

        Flux<Usuario> usuariosFlux = Flux.zip(nombres,Edades, Usuario::new);


        usuariosFlux.subscribe(System.out::println);
    }

}
