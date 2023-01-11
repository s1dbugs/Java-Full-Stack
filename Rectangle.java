class Rectangle{
double l;
double b;

Rectangle(double l, double b){
        this.l= l;
        this.b= b;
    } 
    double getperimeter(){
        return 2*(l+b);
    }
    public static void main(String[] args){
        Rectangle obj = new Rectangle(10, 20);
	double perimeter = obj.getperimeter();
        System.out.print(perimeter);
    }
}
