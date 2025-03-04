package com.wipro.java.designpattern.factory.factories;

import com.wipro.java.designpattern.factory.Button.Button;
import com.wipro.java.designpattern.factory.Button.WindowsButton;
import com.wipro.java.designpattern.factory.checkboxes.Checkbox;
import com.wipro.java.designpattern.factory.checkboxes.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}