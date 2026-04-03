public class WrapperToPrimitive {
    public static void main(String[] args) {
        Double d = 45.67;

        double primitiveDouble = d; // auto-unboxing
        int primitiveInt = d.intValue(); // casting

        System.out.println("Double: " + primitiveDouble);
        System.out.println("Int: " + primitiveInt);
    }
}