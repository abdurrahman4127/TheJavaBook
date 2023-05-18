package StudentInformation;

/*   Create a class named 'Student' with String variable 'name', integer variable 'roll_no',
     String variable ‘phone’ number and ‘address’.
          a. Create two objects of the Student Class.
         b. Assign and print the roll number, phone number and address of two students
 */

class Student {
    String name, phone, address;
    int roll_no;

    Student(String name, String phone, String address, int roll_no) {
        System.out.println("name : " + (this.name = name));
        System.out.println("phone no. : " + (this.phone = phone));
        System.out.println("address : " + (this.address = address));
        System.out.println("roll no. : " + (this.roll_no = roll_no));
    }
}

public class StudentsInfo {
    public static void main(String[] args)
    {
        Student ar = new Student("Abdur Rahman","016**19**0*...", "Bangladesh", 7);
        System.out.println();
        Student tn = new Student("Thao Nhi","+849844*2***...", "Vietnam", 3);
    }
}
