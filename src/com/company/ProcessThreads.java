package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ProcessThreads {
    private ArrayList<Stage> stages = new ArrayList();
    private Scanner in = new Scanner(System.in);
    private Printer printer = Printer.getInstance();

    public ArrayList<Stage> process() throws InterruptedException {
        printer.print("Введите длину поролей");
        int length = in.nextInt();
        printer.print("Число вариаций пороля");
        int stateNumber = in.nextInt();
        //int id1 = 1;
        //int id2 = 2;
        //int id3 = 3;

        Threads thread1 = new Threads(stages, length, stateNumber /*, id1*/);
        Threads thread2 = new Threads(stages, length, stateNumber/*, id2*/);
        Threads thread3 = new Threads(stages, length, stateNumber/*, id3*/);

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        return stages;
    }
}
