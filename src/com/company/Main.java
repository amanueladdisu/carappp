package com.company;

public class Main {

    public static void main(String[] args) {
	String ct = " the red Porsche ";
	car carobject = new car();
	carobject.setstart(ct);
		System.out.println(carobject.car());
		System.out.println(carobject.setSpeed());
    carobject.setstop();

    }
}
