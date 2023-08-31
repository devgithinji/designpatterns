package abstractfactory.os.win;

import abstractfactory.Button;

public class WinButton implements Button {

    @Override
    public void paint() {
        System.out.println("win button");
    }
}
