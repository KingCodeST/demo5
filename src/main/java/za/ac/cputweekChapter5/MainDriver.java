package za.ac.cputweekChapter5;

public class MainDriver {

    public static void main(String[] args )
    {

        Leaf leaf1 =new Leaf("Bob");
        Leaf leaf2 =new Leaf("Fred");
        Leaf leaf3 =new Leaf("Sue");
        Leaf leaf4=new Leaf("Ellen");
        Leaf  leaf5=new Leaf("Joe");

        Composite composite1=new Composite();
        composite1.add(leaf1);
        composite1.add(leaf2);

        Composite composite2=new Composite();
        composite2.add(leaf3);composite2.add(leaf4);

        Composite composite3=new Composite();
        composite3.add(composite1);
        composite3.add(composite2);
        composite3.add(leaf5);

        System.out.println("Calling sayHello on leaf1");
        leaf1.sayHello();
        System.out.println("Calling sayHello on composite 1");
        composite1.sayHello();
        System.out.println("Calling sayHello on composite 2");
        composite2.sayHello();
        System.out.println("Calling sayHello on composite 3");
        composite3.sayHello();



    }


}