package com.company;

import java.beans.PropertyEditorSupport;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Scanner;


public class Lock {
    private ArrayList<Stage> stages = new ArrayList();
    private Printer printer = Printer.getInstance();
    private Scanner in = new Scanner(System.in);
    private int stageNumber = 9;


    public void lock() throws InterruptedException {
        ProcessThreads processThreads = new ProcessThreads();
        stages = processThreads.process();

    }

    public boolean unlock() {
        for (int i = 0; i < this.stageNumber; i++) {
            Stage currentStage = stages.get(i);
            printer.print("Стадия: " + (i + 1) + " Всего стадий: " + (this.stageNumber) + "\n");
            printer.print("Введите пороль: ");
            String password = in.next();
            if (!(password.equals(currentStage.getPassword())))
                return false;
        }
        return true;
    }

}
