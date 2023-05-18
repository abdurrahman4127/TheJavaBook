package Football;

public class Driver {
    public static void main(String[] args)
    {
        RealMadrid rma = new RealMadrid();
        rma.teamName = "Real Madrid";
        rma.setAndShowNumberOfUCLs(13);
        rma.setSlogan("Hala Madrid");

        ManchesterUnited manutd = new ManchesterUnited();
        manutd.teamName = "Manchester United";
        manutd.setAndShowNumberOfUCLs(3);
        manutd.setSlogan("Glory Glory Manchester United");

        rma.showDetails();
        manutd.showDetails();
    }
}
