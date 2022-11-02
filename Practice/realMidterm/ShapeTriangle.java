package realMidterm;

import java.util.ArrayList;

public class ShapeTriangle extends Shape{

    Shape shape;
    private String name;
    int min;
    int max;
    public ShapeTriangle(String name, int max, int min){
        this.name = name;
        this.max = max;
        this.min = min;
    }

    int x1 = MyRandom.randInt(max,min);
    int y1 = MyRandom.randInt(max,min);
    int x2 = MyRandom.randInt(max,min);
    int y2 = MyRandom.randInt(max,min);
    int x3 = MyRandom.randInt(max,min);
    int y3 = MyRandom.randInt(max,min);

    ArrayList<Integer> xlist = new ArrayList<>();
    ArrayList<Integer> ylist = new ArrayList<>();
    int x[] = {x1,x2,x3};
    int y[] = {y1,y2,y3};



    @Override
    public String toString() {
        return super.toString();
    }


    @Override
    public void calcBounds() {
        int xbounds = x1;
        int ybounds = y1;

        for(int i = 0; i<3; i++){
            if(xbounds < x[i]){
                xbounds = x[i];
            }
            if(ybounds< y[i]){
                ybounds = y[i];
            }
        }
        for(int i = 0; i<3; i++){
            if(xbounds > x[i]){
                xbounds = x[i];
            }
            if(ybounds> y[i]){
                ybounds = y[i];
            }
        }
        super.setMaxBoundsX(xbounds);
        super.setMaxBoundsY(ybounds);
    }

    @Override
    public String getShapeName() {
        return "name:" + name + getMaxBoundsX()+ getMaxBoundsY()+getMinBoundsX()+getMinBoundsY() ;
    }


}
