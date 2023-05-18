package JobWage;

class Employees{
    public String name, office;
    public int age;
    private double salary;

    public void aboutMe() {
        System.out.println("name : " + this.name);
        System.out.println("age : " + this.age);
        System.out.println("office : " + this.office);
    }

    public void setSalary(double salary) {
        System.out.println("my salary : " + (this.salary = salary));
    }

    public void getTax(int howMuch) {
        System.out.println("need to pay : " + (salary * howMuch) / 100);
    }

}


// driver class
public class Government {
    public static void main(String[] args) {
        Employees a = new Employees();
        a.name = "AR";
        a.age = 20;
        a.office = "Bangladesh Bekar Association";  // bekar = unemployed

        a.aboutMe();
        a.setSalary(5000); // initially 5K salary
        a.getTax(5); // 5% of the salary
    }
}
