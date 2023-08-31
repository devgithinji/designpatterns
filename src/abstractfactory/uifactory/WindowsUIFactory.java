package abstractfactory.uifactory;

import abstractfactory.Button;
import abstractfactory.CheckBox;
import abstractfactory.os.win.WinButton;
import abstractfactory.os.win.WinCheckBox;

public class WindowsUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }
}
