package com.company;
import java.util.Scanner;

public class App {

    private Printer printer = Printer.getInstance();

    public void Start() throws InterruptedException {
        Lock electronicLock = new Lock();

        electronicLock.lock();

        while(!(electronicLock.unlock()))
            printer.print("Пороль неверный. Попробуйте еще ");

        printer.print("Пороль введен верно");
    }
}