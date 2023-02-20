package Project2;
/*
We have to calculate the average of marks obtained in three subjects by student A and by student B.
Create class 'Marks' with an abstract method 'getPercentage' that will be returning the average percentage of marks.
Provide implementation of abstract method in classes 'A' and 'B'.
The constructor of student A takes the marks in three subjects as its parameters and the marks in
four subjects as its parameters for student B.
Test your code
 */
public abstract class Marks {
    abstract void getPercentage();
}

class A extends Marks{
    int scienceMark;
    int mathMark;
    int historyMark;
    A(int scienceMark, int mathMark, int historyMark) {
        this.scienceMark = scienceMark;
        this.mathMark = mathMark;
        this.historyMark = historyMark;
    }
    void getPercentage () {
        int averageMark = (scienceMark+mathMark+ historyMark)/3 ;
        if( averageMark >= 90) {
            System.out.println("Student A's average mark is A");
        } else if (averageMark >=80 && averageMark <90) {
            System.out.println("Student A's average mark is B");
        } else if (averageMark >=70 && averageMark<80) {
            System.out.println("Student A's average mark is C");
        } else if (averageMark >=50 && averageMark<70) {
            System.out.println("Student A's average mark is D");
        } else {
            System.out.println("Student A's average mark is F");
        }
    }

}

class B extends Marks{
    int scienceMark;
    int mathMark;
    int historyMark;
    int physicsMark;

    B(int scienceMark, int mathMark, int historyMark, int physicsMark) {
        this.scienceMark = scienceMark;
        this.mathMark = mathMark;
        this.historyMark = historyMark;
        this.physicsMark = physicsMark;
    }

    void getPercentage () {
        int averageGrade = (scienceMark + mathMark + historyMark + physicsMark)/4 ;
        if( averageGrade >= 90) {
            System.out.println("Student B's average mark is A");
        } else if (averageGrade >=80 && averageGrade <90) {
            System.out.println("Student B's average mark is B");
        } else if (averageGrade >=70 && averageGrade<80) {
            System.out.println("Student B's average mark is C");
        } else if (averageGrade >=50 && averageGrade<70) {
            System.out.println("Student B's average mark is D");
        } else {
            System.out.println("Student B's average mark is F");
        }
    }
}

class MarksTester {
    public static void main(String[] args) {
        A studentA = new A(70,62,95);
        studentA.getPercentage();

        B studentB = new B(90,81,70,60);
        studentB.getPercentage();
    }
}