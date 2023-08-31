package abstractfactory.uifactory;


import abstractfactory.Button;
import abstractfactory.CheckBox;

public interface UIFactory {
    Button createButton();

    CheckBox createCheckBox();
}
