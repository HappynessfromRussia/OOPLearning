package ConstructorTest;

public class Main {
    public static final Integer MAGNIFIER = 10000;

    public static void main (String[] args) throws Exception{
        Person person = new Person("Sergei", 28, "Proletarskaya","8800555535");
        Person.getCounter();
        Fraction fraction = new Fraction(1,10);

    }
}

class Person{
    int id;
    private String name;
    private int age;
    private static int counter = 0;

    public static int getCounter() {
        return counter;
    }

    static {
        System.out.println(counter);
    }

//    public String address;
//    private String phone;

    public Person(String name, int age, String address, String phone){
        id = counter++;
        this.name = name;
        this.age = age;
//        this.address = address;
//        this.phone = phone;
    }

//    public void displayName(){
//        System.out.printf("Name %s \n", name);
//    }
//
//     void displayAge(){
//        System.out.printf("Age %d \n", age);
//    }

//    private void displayAdress(){
//        System.out.printf("Adress %s \n ",address );
//
//    }
//
//    protected void displayPhone(){
//        System.out.printf("Phone %s \n", phone);
//    }
//


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >0 && age < 110)
         this.age = age;
    }
}

class Fraction{
    int numerator;
    int denominator = 1;

    public Fraction(int numerator, int denominator){

        if (denominator==0){
            System.out.println("denominator cant be zero");
            return;
        }
       this.numerator = numerator;
        this.denominator = denominator;
    }

}