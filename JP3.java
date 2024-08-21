class Food {
    void type() {
        System.out.println("This is a type of food");
    }
}

class Fruit extends Food {
    void name() {
        System.out.println("This is a fruit");
    }
}

public class JP3 {
    public static void main(String[] args) {
        Fruit myFruit = new Fruit();
        myFruit.type();
        myFruit.name();
    }
}
