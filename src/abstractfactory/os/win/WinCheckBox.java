package abstractfactory.os.win;

import abstractfactory.CheckBox;

public class WinCheckBox implements CheckBox {

    @Override
    public void paint() {
        System.out.println("win checkbox");
    }
}
