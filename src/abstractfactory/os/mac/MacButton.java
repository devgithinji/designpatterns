package abstractfactory.os.mac;

import abstractfactory.Button;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("mac button");
    }
}
