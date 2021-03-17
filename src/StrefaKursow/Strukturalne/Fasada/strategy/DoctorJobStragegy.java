package StrefaKursow.Strukturalne.Fasada.strategy;

public class DoctorJobStragegy implements JobStrategy {
    @Override
    public void doYourJob() {
        System.out.println("Cure people");
    }
}
