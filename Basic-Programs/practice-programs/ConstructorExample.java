public class ConstructorExample {
    int id;
    String name;
    int age;

    public ConstructorExample(){
        System.out.println("Default Constructor");

    }
    public ConstructorExample(int id,String name,int age){
        this.id= id;
        this.name= name;
        this.age= age;
    }
    void display(){
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System .out.println("Age: "+age);
    }

    public static void main(String[] args) {
        ConstructorExample cd= new ConstructorExample();
        ConstructorExample cdd= new ConstructorExample(1,"riddhi",19);
        cdd.display();
    }
}
