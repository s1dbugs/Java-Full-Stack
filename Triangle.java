class Triangle{
private double height;
private double base;
public Triangle(double h, double b){
this.height=h;
this.base=b;
}
public void getArea(){
double area=0.5*base*height;
System.out.println(area);
}
}


class Circle{
private double radius;
public Circle(double radius){
this.radius=radius;
}
public double getArea(){
return 3.14*radius*radius;
}
}
class calculator{
add(x,y);
substract(x,y)->


class mainClass{
public static void main(String[] args){
Circle circle=new Circle(5);
double circleArea=circle.getArea();
System.out.println("Area of the circle:" +circleArea);

Triangle t=new Triangle(6,5);
t.getArea();
}
}