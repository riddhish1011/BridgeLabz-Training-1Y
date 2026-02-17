public class ConstructorCar {
    String model;
    int Engine;

    ConstructorCar() {
        System.out.println("Default Constructor called");
    }

    ConstructorCar(String model, int Engine) {
        this.model = model;
        this.Engine = Engine;
    }

    void display() {
        System.out.println("model: " + model);
        System.out.println("Engine: " + Engine);
    }

    public static void main(String[] args) {
        ConstructorCar cd = new ConstructorCar();
        ConstructorCar cdd = new ConstructorCar("Nexa", 19);
        cdd.display();
    }
}
