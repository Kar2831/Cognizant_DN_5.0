package design_patterns.singleton;

public class Logger {
    private static Logger instance;

    private Logger(){
        instance = this;
    }

    public static Logger getInstance(){
        if(instance != null){
            System.out.println("Instance already exists...");
            return instance;
        }else{
            System.out.println("Instance is created");
            return new Logger();
        }
    }
}
