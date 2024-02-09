package Service;

public interface Painting {

    default void paint(){
        System.out.println("I am painted");
    }
}
