package lab5;


public class Main {
    public static void main(String[] args) {

        Cat firstCat = new Cat("Tom", "grey", 5);


        System.out.println("Cat name " + firstCat.getName());
        System.out.println("Cat colour " + firstCat.getColour());
        System.out.println("Cat age " + firstCat.getAge());


        firstCat.play();
        firstCat.feed();
        firstCat.sleep();

    }
}
