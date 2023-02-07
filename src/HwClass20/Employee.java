package HwClass20;
/*
Create an Employee class that will have variables and methods. Constructor that should initialize instance variables
Create 2 subclasses FullTime and PartTime Employees that should have own variables and methods.
Create a Tester Subclass from FullTime Employee and add some features and methods to the Tester Class.
Test your code!
*/
public class Employee {
    String name;
    String Id;

    void printInfo(){
        System.out.println("Name: "+name+" Employee: "+Id);
    }

    Employee( String name, String Id){
        this.name=name;
        this.Id=Id;
    }
}

class FullTime extends Employee{
    int hours;
    void hoursFull(){
        System.out.println("Work full time as a QA tester");
    }
    FullTime(String name, String Id) {
        super(name, Id);
    }
}
class PartTime extends Employee{
    PartTime(String name, String Id){
        super(name, Id);
    }
    int days;
    void partHours (){
        System.out.println("We work less hours ");
    }
}
class TesterSubClass extends FullTime{

    TesterSubClass(String name, String Id) {
        super(name, Id);
    }
    int bonus;
    void sdet(){
        System.out.println("Will get the job after school is over!!!");
    }

    public static void main(String[] args) {
        TesterSubClass test=new TesterSubClass("Mike", "MK123");
        test.printInfo();
        test.hoursFull();
        test.sdet();

    }
}
