package StrefaKursow.Kreacyjne.Singleton;

public class Logger2 {
    private static Logger2 instance;

    private Logger2(){}

    public static Logger2 getInstance(){
        return SingletonHolder.INSTANCE;
        //Bill Pugh
    }

    private static class SingletonHolder{
        private static final Logger2 INSTANCE = new Logger2();
    }

    public void logToConsole(){
        System.out.println("Logi konsoli");
    }
}
