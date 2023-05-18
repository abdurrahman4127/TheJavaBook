package StudentYear;

class Students {
    double theory,lab;

    public Students(double theory, double lab) {
        this.theory = theory;
        this.lab = lab;
    }

    void printSum() {
        System.out.println("StudentYear.Students total : " + theory + lab);
    }
}

class finalYearStudents extends Students {
    double thesis;

    public finalYearStudents(double theory, double lab, double thesis) {
        super(theory,lab);
        this.thesis = thesis;
    }

    void printSum() {
        System.out.println("StudentYear.finalYearStudents total : " + (theory + lab + theory));
    }
}

public class InheritanceClassWork {
    public static void main(String[] args)
    {
        Students s1 = new Students(86,78);
        s1.printSum();

        Students s2 = new  finalYearStudents(87,90,82);
        s2.printSum();
    }
}
