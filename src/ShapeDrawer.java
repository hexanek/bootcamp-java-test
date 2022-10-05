public class ShapeDrawer {

    private final Shape shape;

    public ShapeDrawer(Shape shape){
        this.shape = shape;
    }

    public void process(){
        System.out.println("Let's draw a shape");
        this.shape.draw();
        System.out.println("Shape has been drawn");
    }

}
