public class CircleBasic{
double radius= 10.5;
String color;

CircleBasic(){
radius=10.4;
}

CircleBasic(double radius){
this.radius=radius;
this.color=color;
}

CircleBasic(double radius, String color){
this.radius=radius;
}

double getArea(){
double area=0;
area=3.14*radius*radius;
return area;
}

String getColor(){
return this.color;
}

public static void main(String[] args){
CircleBasic cb=new CircleBasic();
CircleBasic cb2=new CircleBasic(11.5);
CircleBasic cb3=new CircleBasic(12.5);
CircleBasic cb4=new CircleBasic(14.5,"red");


double area=cb.getArea();
double area11=cb2.getArea();
double area12=cb3.getArea();
double area14=cb4.getArea();
string color=cbc.getColor();


System.out.println("Area is" + area);
System.out.println("Area 11.5 is" + area11);
System.out.println("Area 12.5 is" + area12);
System.out.println("Area is=" + area14,"and color is=" + color);

}
}