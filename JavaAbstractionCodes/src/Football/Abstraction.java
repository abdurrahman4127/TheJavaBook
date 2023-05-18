package Football;

abstract class FootballTeam
{
    String teamName, slogan;
    int numberOfUCLs;

    void setAndShowNumberOfUCLs(int numberOfUCLs) {
        this.numberOfUCLs = numberOfUCLs;
    }

    void showDetails(){
        System.out.println("team name : " + teamName);
        System.out.println("number of UCL titles : " + numberOfUCLs);
        System.out.println("slogan : " + slogan + "\n");
    }

    abstract void setSlogan(String slogan);
}

class RealMadrid extends FootballTeam
{
    @Override
    void setSlogan(String slogan) {
        super.slogan = slogan;
    }
}

class ManchesterUnited extends FootballTeam
{
    @Override
    void setSlogan(String slogan) {
        super.slogan = slogan;
    }
}


