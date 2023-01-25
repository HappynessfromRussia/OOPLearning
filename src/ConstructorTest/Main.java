package ConstructorTest;

public class Main {


    public static void main(String[] args) {
//        Person person = new Person("Sergei", 28, "Proletarskaya", "8800555535");
//        Person.getCounter();
        Fraction fraction = new Fraction(1, 2);

        PersonOne oleg = new PersonOne("Koin", "", 'm');
        System.out.println(oleg);

        Employee olga = new Employee("Svetova", "Olga", 'f',"accountant");
//        olga.setFirstName("Olga");
//        olga.setLastName("Svetova");
//        olga.setGender('f');

        System.out.println(olga);
        olga.tellMeWhoAreU();

        PersonOne olga2 = olga;

        System.out.println(olga2);
        ((Employee) olga2).tellMeWhoAreU();

    }
}

//class Person {
//    int id;
//    private String name;
//    private int age;
//    private static int counter = 0;
//
//    public static int getCounter() {
//        return counter;
//    }
//
//    static {
//        System.out.println(counter);
//    }
//
////    public String address;
////    private String phone;
//
//    public Person(String name, int age, String address, String phone) {
//        id = counter++;
//        this.name = name;
//        this.age = age;
//    }
//        this.address = address;
//        this.phone = phone;


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


//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        if (age > 0 && age < 110)
//            this.age = age;
//    }
//}

class Fraction {
    int numerator;
    int denominator = 1;

    public Fraction(int numerator, int denominator) {

        if (denominator == 0) {
            System.out.println("denominator cant be zero");
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

}

class PersonOne {
    protected String firstName;
    protected String lastName;
    protected char gender; // m - male, f - female

    @Override
    public String toString() {
        return "PersonOne{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public PersonOne() {
        this("", "", '-');
    }

    public PersonOne(String lastName) {
        this(lastName, "", '-');
    }

    public PersonOne(String lastName, String firstName, char gender) {
        this(lastName, firstName);
        this.gender = gender;
    }

    public PersonOne(String lastName, String firstName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

class Employee extends PersonOne {

    protected String position;

    public Employee(String lastName, String firstName, char gender, String position) {
        super(lastName, firstName, gender);
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "position='" + position + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                '}';
    }

    public void tellMeWhoAreU(){
        System.out.println("Hello I am Employee, and my class is" + getClass());
    }
}