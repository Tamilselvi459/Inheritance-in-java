package Inheritance;
class Animal{
    String name;
    Animal(String name){
        this.name = name;
    }
    public void eat(){
        System.out.println(name+" is eating");
    }

}
public class example1 extends Animal {
    int age;

    public example1(String name, int age) {
        super(name);
        this.age = age;
    }
    public void weep(){
        System.out.println(name +" is weeping!!!");
    }


}

