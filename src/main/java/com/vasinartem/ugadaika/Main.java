package com.vasinartem.ugadaika;

public class Main {
    public static void main(String[] args) {
        CustomSpringEvent customSpringEvent = new CustomSpringEvent(CustomSpringEvent.class, "igra");
        CustomSpringEventListener q = new CustomSpringEventListener();
        q.onApplicationEvent(customSpringEvent);
    }
}
