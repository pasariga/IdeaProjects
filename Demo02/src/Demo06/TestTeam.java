package Demo06;

public class TestTeam {
    public static void main(String[] args) {
        Teammate[] team={
                new Teammate("Athena",50),
                new Teammate("Bob",50),
                new Teammate("David",50),
        };
        Healer h1=new Healer("Mike",20);
        h1.groupHeal(team);
        h1.groupHeal(team);
    }
}
