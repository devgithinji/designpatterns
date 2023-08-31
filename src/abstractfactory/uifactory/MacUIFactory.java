package abstractfactory.uifactory;

import abstractfactory.Button;
import abstractfactory.CheckBox;
import abstractfactory.os.mac.MacButton;
import abstractfactory.os.mac.MacCheckBox;

public class MacUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
