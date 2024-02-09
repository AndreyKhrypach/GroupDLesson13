package Service;

@FunctionalInterface
public interface Square {
    double PI = 3.14;
    int calculate(int x);

    default void print(){
        System.out.println("square printed");
    }
    static void paint(){
        System.out.println("square painted");
    }
}
