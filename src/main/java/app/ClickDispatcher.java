package app;

class Widget {
    public void onClick(String key) {
        System.out.println("Widget processing: " + key);
    }
}

class Button extends Widget {
    @Override
    public void onClick(String key) {
        System.out.println("Button processing: " + key);
    }
}

public class ClickDispatcher {

    public static void main(String[] args) {
        Button button = new Button();
        button.onClick("key");
    }
}
