package com.wipro.java.designpattern.factory.factories;

import com.wipro.java.designpattern.factory.Button.Button;
import com.wipro.java.designpattern.factory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}