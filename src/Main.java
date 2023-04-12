//import Inheritance.Animal;
// import Inheritance.Animal;
import Inheritance.example1;
import Inheritance.example2;
import Inheritance.example3;

public class Main {
    public static void main(String[] args) {

        System.out.println("Eg for single Inheritance");
        example1 an = new example1("pinky" , 2); // single inheritance
        an.eat();
        an.weep();
        System.out.println();

        System.out.println("Eg for mutilevel Inheritance");
        example2 ad = new example2("roe",3); // mutilevel inheritance
        ad.eat();
        ad.weep();
        ad.cry();
        System.out.println();

        System.out.println("Eg for hierarchical Inheritance");
        example3 ans = new example3("pinky" , 4); // hierarchical Inheritance
        ans.eat();
        ans.weep();
        // ans.cry(); we cant use this method because it is in example 2

    }
}