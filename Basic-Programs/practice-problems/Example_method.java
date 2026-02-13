class Example_method{
public static int add (int a,int b){
return a+b;
}
int add(int a, int b, int c){
return a+b+c;
}
public static void main(String[] args){
System.out.println(add(10,20));
System.out.println(add(10,20,30));
Example_method ex= new Example_method();
ex.add(10,20,30);
}
}
