class ConstructorDemo{
int id;
String name;
int age;
//public ConstructorDemo(){
//	System.out.println("Constructor Program");
//}
public ConstructorDemo(int id, String name,int age){
	this.id = id;
	this.name= name;
	this.age= age;
}
void Display(){
	System.out.println("ID: "+id);
	System.out.println("NAME: "+name);
	System.out.println("AGE: "+age);
}
public static void main(String[] args){
ConstructorDemo cd= new ConstructorDemo(1,"vanshika",19);
System.out.println(cd);
cd.Display();
}
}