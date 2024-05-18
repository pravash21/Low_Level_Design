package ChainOfResponsibility;

public class ChainCreator {
    public Managers createChain(){
        HiringManager hiringManager = new HiringManager(10000,"Hiring Manager");
        SeniorManager seniorManager = new SeniorManager(30000, "Senior Manager");
        Director director  = new Director(50000, "Director");

        hiringManager.setManager(seniorManager);
        seniorManager.setManager(director);
        return hiringManager;
    }
}