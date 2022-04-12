package com.vasinartem.ugadaika;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class CustomSpringEventListener implements ApplicationListener<CustomSpringEvent> {
    @Override
    public void onApplicationEvent(CustomSpringEvent event) {
        Scanner gm = new Scanner(System.in);
        int random_number = (int) (Math.random() * 1000);
        System.out.println("privet");
        System.out.println("otgadai chislo: ");
        int count = gm.nextInt();
        //  System.out.println(random_number);  // проверка загаданного числа
        for (int i = 1; i < 10; i++) {
            if (random_number > count) {
                System.out.println("bolwe ");
            } else if (random_number < count) {
                System.out.println("menwe ");

            } else {
                System.out.println("eto ono " + random_number);
                break;
            }
            count = gm.nextInt();
        }
    }
}