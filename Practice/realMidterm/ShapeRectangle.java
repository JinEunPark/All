package realMidterm;

public class ShapeRectangle extends Shape {

    Shape shape;

    private String name;
    private int min;
    private int max;
    private double area;

    public ShapeRectangle(String name, int max, int min){
        this.name = name;
        this.max = max;
        this.min = min;
    }

    int x1 = MyRandom.randInt(max,min);
    int x2 = MyRandom.randInt(max,min);

    int y1 = MyRandom.randInt(max,min);
    int y2 = MyRandom.randInt(max,min);





    @Override
    public void calcBounds() {
        if(x1>x2){
            super.setMaxBoundsX(x1);
            super.setMinBoundsX(x2);
        }else{
            setMaxBoundsX(x2);
            setMinBoundsX(x1);
        }

        if(y1>y2){
            super.setMaxBoundsX(y1);
            super.setMinBoundsX(y2);
        }else{
            setMaxBoundsX(y2);
            setMinBoundsX(y1);
        }
    }

    @Override
    public String getShapeName() {
        return "name:" + name + getMaxBoundsX()+ getMaxBoundsY()+getMinBoundsX()+getMinBoundsY() ;
    }


}
