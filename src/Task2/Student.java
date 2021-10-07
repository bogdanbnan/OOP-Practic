package Task2;

public class Student
{
    String fullName, lastName, group;
    double averageMark = 3;

    public static void main(String[] args)
    {
        Student student = new Student();
        Aspirant aspirant = new Aspirant();
        Student[] students = {student, aspirant};

        students[0].getScholarship();
        students[1].getScholarship();
    }

    void getScholarship()
    {
        if(averageMark>=5)
            System.out.println("Student's Scholarship = " + 100);
        else
            System.out.println("Student's Scholarship = " + 80);
    }
}

class Aspirant extends Student
{
    void getScholarship()
    {
        if(averageMark>=5)
            System.out.println("Aspirant's Scholarship = " + 200);
        else
            System.out.println("Aspirant's Scholarship = " + 180);
    }
}
