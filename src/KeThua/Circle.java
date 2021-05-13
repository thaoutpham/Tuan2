package KeThua;

public class Circle extends Shape {
double radius;
    public Circle( String color, Boolean filled) {
     super(color,filled);
    }
    public void hinhTron(){
        double radius=1.0;
    }
    public void hinhTrong(){
        this.radius=radius;
        this.color=color;
        this.filled=filled;
    }
    public void setRadius(Double radius){
       this.radius=radius ;
    }
    public Double getRadius(){
        return radius;
    }
    public double getArea(double radius){
        return 3.14*radius*radius;
    }
    public double getPerimeter(double radius){
        return radius*3.14;
    }
    public String toString(){
        return "A Rectangle with width=xxx and length=zzz, which is a subclass of yyy";
    }
}
