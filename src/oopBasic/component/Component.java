package oopBasic.component;

public class Component {
    private int width;
    private int height;
    private String id;
    private String title;

    public Component(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getId() {
        return this.id;
    }

    public  void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}