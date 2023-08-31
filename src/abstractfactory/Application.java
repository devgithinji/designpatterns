package abstractfactory;

import abstractfactory.uifactory.UIFactory;

public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(UIFactory factory) {
        this.button = factory.createButton();
        this.checkBox = factory.createCheckBox();
    }

    public void paint() {
        button.paint();
        checkBox.paint();
    }
}
