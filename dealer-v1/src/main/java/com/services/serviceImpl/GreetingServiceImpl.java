package com.services.serviceImpl;

import com.services.BaseService;
import com.services.IGreetingService;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;

@Service
public class GreetingServiceImpl extends BaseService implements IGreetingService{

    //esempio local interface, local enum, metodo statico dentro la classe anonima

    @Override
    public void test() {
        enum LocalEnum{A,B,C}
        interface LocalInterface {
            void test(LocalEnum e);
        }
        LocalInterface r = new LocalInterface() {
            static final AtomicInteger callCounter = new AtomicInteger();
            @Override
            public void test(LocalEnum e) {
                System.out.println(callCounter.incrementAndGet());
                System.out.println(e);
                staticInAnonymos();
            }
            static void staticInAnonymos(){
                System.out.println("Sono statico");
            }
        };
        r.test(LocalEnum.A);
    }
}
