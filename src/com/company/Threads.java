package com.company;

import java.util.ArrayList;

public class Threads extends Thread{
    private Printer printer = Printer.getInstance();
    private ArrayList<Stage> stages;
    private int stageNumber = 3;
    private int lenght;
    private int stateNumber;
    private int id;

    public Threads(ArrayList<Stage> stages, int lenght, int stateNumber/*, int id*/) {
        this.stages = stages;
        this.lenght = lenght;
        this.stateNumber = stateNumber;
        //this.id = id;
    }
    @Override
    public void run(){
        for (int i = 0; i < this.stageNumber; i++) {
            Rand rand = new Rand();
            com.company.State state = StateFactory.getState(rand.randomInt2String(1, stateNumber), this.lenght);
            Stage stage = new Stage(state);
            stages.add(i, stage);
            //String result = String.valueOf(id);
            //printer.print("ID"+ " " + result);
        }
    }
}
