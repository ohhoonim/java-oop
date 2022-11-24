package oopBasic.form;

public class Button extends Form implements ClickEvent, DragEvent {

    public Button(String id) {
        super(id, null);
    }

    public void click() {
        System.out.println("button "  + this.getId() + " clicked");
    }

    @Override
    public void drag() {
        System.out.println("button "  + this.getId() + " draged");
    }
}
