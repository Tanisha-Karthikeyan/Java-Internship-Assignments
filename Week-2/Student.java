public class Student
{
    String name;
    int rollno;
    float marks;

    Student(String name, int rollno, float marks)
    {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }
    void display()
    {
        System.out.println("Student Details");
        System.out.println("Name : " + name);
        System.out.println("Roll No : " + rollno);
        System.out.println("Marks : " + marks);
    }

    public static void main(String[] args)
    {
        Student s1 = new Student("Tanisha", 101, 98.5f);

        s1.display();
    }
}