package StrefaKursow.Kreacyjne.Singleton;

public class Logger1 {
    private static Logger1 instance;

    private Logger1(){}

    public static Logger1 getInstance(){
        if(Logger1.instance == null){
            instance = new Logger1();
            return instance;
        }
        else{
            return instance;
        }
    }

    public void logToConsole(){
        System.out.println("Logi konsoli");
    }
}
