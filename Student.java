class Student{
String name;
int id;

public String getName(){
return name;
}

Student(){
name ="NotKnown";
}

Student(String name){
 this.name =name;
}

public static void main(String[] args){

System.out.println("Siddharth -In the main");

Student s1 = new Student("He's GOOD!");
String sid = s1.getName();
System.out.println(sid);
}
}