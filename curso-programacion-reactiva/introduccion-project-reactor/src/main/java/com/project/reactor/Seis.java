package com.project.reactor;

import org.reactivestreams.Subscription;
import reactor.core.publisher.BaseSubscriber;
import reactor.core.publisher.Flux;

public class Seis {

    public static void main(String[] args) {
        Flux<Integer> rango = Flux.range(1,1000).log();

        rango.subscribe(new BaseSubscriber<Integer>() {
            @Override
            protected void hookOnSubscribe(Subscription subscription) {
                request(5);
            }

            @Override
            protected void hookOnNext(Integer value) {
                if(value == 4){
                    value = 8;
                }
            }
        });
    }


}
