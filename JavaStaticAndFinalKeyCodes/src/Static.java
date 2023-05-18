//static -> class specific; not object
//changes for all (inside the class)

class Student {
    String name;
    int rollNo;

    static String varsityName = "UIU";

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}

public class Static {
    public static void main(String[] args)
    {
        Student student1 = new Student("AR", 7);
        Student student2 = new Student("CR", 7);

        System.out.println(Student.varsityName); // "student1.varsity" will word as well
        System.out.println(Student.varsityName);  //UIU

        student1.varsityName = "AIUB"; //changing static value will apply for all property inside the class (Student.varsityName = "AIUB"; will work too)

        System.out.println(student1.varsityName); //AIUB  ; "Student.varsityName" will work
        System.out.println(student2.varsityName);  //AIUB

        // it's recommended to use class name instead of reference name while accessing the static attribute
    }
}
