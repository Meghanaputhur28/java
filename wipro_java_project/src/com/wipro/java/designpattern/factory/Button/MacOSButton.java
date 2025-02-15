package com.wipro.java.designpattern.factory.Button;


public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}