package oopBasic.form;

public class Title extends Form implements DragEvent {

    public Title(String id, String title) {
        super(id, title);
    }

    @Override
    public void drag() {
       System.out.println("Title " + this.getId() + " clicked"); 
    }
    
}
