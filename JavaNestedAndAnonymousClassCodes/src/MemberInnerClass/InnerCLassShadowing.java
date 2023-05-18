package MemberInnerClass;

public class InnerCLassShadowing {
    int x = 10;

    class Inner {
        int x = 20;

        public void show(int x) {
            System.out.println("Parameter: " + x);  //referring to line no.11
            System.out.println("Inner Variable: " + this.x); //referring to line no.8
            System.out.println("Outer Variable: " + InnerCLassShadowing.this.x); //to line no.5
        }
    }

    public static void main(String[] args)
    {
        InnerCLassShadowing ins = new InnerCLassShadowing();
        Inner in = ins.new Inner();

        in.show(30);
    }
}

/*
        output :
     Parameter:30
     inner variable 20
     outer variable: 10
*/