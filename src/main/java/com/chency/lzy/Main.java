package com.chency.lzy;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import com.chency.lzy.Game;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.print(Arrays.toString(Game.start));
        System.out.flush();
        System.out.print("©2026 Github ChencyWang All rights reserved. Violators will be prosecuted.\n");
        System.out.flush();
        Thread.sleep(5600);
        String UserName;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your username > ");
        System.out.flush();
        UserName = sc.nextLine();
        System.out.print("Hello ! " + UserName + " ! Welcome to the game ! ");
        System.out.flush();
        Game.sleep_print("Alright, classmates, let's look at this question.",100);
        System.out.flush();
    }
}
