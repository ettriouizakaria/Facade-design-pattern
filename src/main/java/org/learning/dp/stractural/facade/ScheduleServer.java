package org.learning.dp.stractural.facade;

public class ScheduleServer {

    public void startBooting(){
        System.out.println("start booting...");
    }

    public void readSystemConfigFile(){
        System.out.println("reading config....");
    }

    public void init(){
        System.out.println("initializing the server!");
    }

    public void initializeContext(){
        System.out.println("initializing context...");
    }

    public void initializeListeners(){
        System.out.println("init the listeners...");
    }

    public Object createSystemObjects(){
        System.out.println("creating system objects...");
        return new String("System Object!");
    }

    public void releaseProcesses(){
        System.out.println("releasing processes!");
    }

    public void destory(){
        System.out.println("destructing...");
    }

    public void destroySystemObjects(){
        System.out.println("destroying system objects...");
    }

    public void destoryListeners(){
        System.out.println("destroying listeners...");
    }

    public void shutdown(){
        System.out.println("the server shutdown successfully!");
    }
}
