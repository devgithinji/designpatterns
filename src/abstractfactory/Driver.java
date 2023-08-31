package abstractfactory;

import abstractfactory.uifactory.WindowsUIFactory;

public class Driver {

    public static void main(String[] args) {
        Application application = new Application(new WindowsUIFactory());
        application.paint();
    }
}
