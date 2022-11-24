package oopBasic.component;

public class Button extends Component {

    public Button(String id) {
        super(id, null);
    }

    public void click() {
        System.out.println("button clicked");
    }
}
