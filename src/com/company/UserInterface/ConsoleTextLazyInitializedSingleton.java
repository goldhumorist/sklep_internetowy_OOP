package com.company.UserInterface;

public class ConsoleTextLazyInitializedSingleton implements Loger{

    private ConsoleTextLazyInitializedSingleton() {
    }
    private static ConsoleTextLazyInitializedSingleton instanceObjectOfLog = null;


    public static ConsoleTextLazyInitializedSingleton getInstance(){
        if(instanceObjectOfLog == null){
            instanceObjectOfLog = new ConsoleTextLazyInitializedSingleton();
        }
        return instanceObjectOfLog;
    }

    @Override
    public void ShowInfoLoger(String infoFromLoger) {
        System.out.println(infoFromLoger);
    }

}
