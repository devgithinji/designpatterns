package abstractfactory.os.mac;

import abstractfactory.CheckBox;

public class MacCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("mac checkbox");
    }
}
