class Triangle{
double base;
double height;

void getArea(){
double area=0.5*base*height;
System.out.println(area);
}
}

class Circle{
double radius;

Circle(double radius){
this.radius=radius;
}

void getArea(){
System.out.println("Area= "+3.14*radius*radius);
}

void getPerimeter(){
System.out.println("Perimeter= "+2*3.14*radius);
}
}

class Shape{
public static void main (String args[]){
Circle s1=new Circle(4);
s1.getArea();
s1.getPerimeter();
Triangle t1=new Triangle();
t1.getArea();
}
}

