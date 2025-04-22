package org.learning.dp.stractural.facade;

public class Example {

    public Example(){
        //withoutFacade();
        withFacade();
    }
    public static void main(String[] args) {
        new Example();
    }

    private void withoutFacade(){
        ScheduleServer scheduleServer = new ScheduleServer();

        scheduleServer.startBooting();
        scheduleServer.readSystemConfigFile();
        scheduleServer.init();
        scheduleServer.initializeContext();
        scheduleServer.initializeListeners();
        scheduleServer.createSystemObjects();
        System.out.println("Start working......");
        System.out.println("After work done.........");

        scheduleServer.releaseProcesses();
        scheduleServer.destory();
        scheduleServer.destroySystemObjects();
        scheduleServer.destoryListeners();
        scheduleServer.shutdown();
    }

    private void withFacade(){
        ScheduleServer scheduleServer = new ScheduleServer();
        ScheduleServerFacade facadeServer = new ScheduleServerFacade(scheduleServer);

        facadeServer.startServer();
        System.out.println("Start working......");
        System.out.println("After work done.........");

        facadeServer.stopServer();

    }

}
