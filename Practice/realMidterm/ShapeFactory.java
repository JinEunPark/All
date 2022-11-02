package realMidterm;

public class ShapeFactory implements ShapeFactoryInterface{
    Shape shape;
    @Override
    public Shape createShape(String type, String name, int min, int max) {
        if(type == "Rectangle"){
             shape = new ShapeRectangle(name,min,max);
        }else if(type == "Triangle"){
            shape = new ShapeTriangle(name,min,max);
        }
        return shape;
    }
}
