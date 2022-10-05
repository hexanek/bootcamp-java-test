public class Main {
    public static void main(String[] args) {
        ShapeDrawer drawer = new ShapeDrawer(new Circle());
        drawer.process();
        drawer = new ShapeDrawer(new Rectangle());
        drawer.process();
    }
}