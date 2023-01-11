import java.util.*;
class Program{
int a,b;

Program(){
a=0;
b=0;
}

Program(int a, int b){
this.a=a;
this.b=b;
}
int getsum(){
return(a+b);
}

public static void main(String[] args){

Program obj = new Program(20,30);
System.out.println("Sum = "+ obj.getsum());
}
}