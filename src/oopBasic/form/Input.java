package oopBasic.form;

public class Input<T> extends Form  implements ClickEvent{
    private T value;

    public Input(String id, T defaultValue) {
        super(id, null);
        this.value = defaultValue;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }
    
    @Override
    public String toString() {
        return "component id :" + this.getId() + 
            ", input value: " + this.getValue();
    }

    @Override
    public void click() {
       System.out.println("Input " + this.getId() + " clicked"); 
    }

}
