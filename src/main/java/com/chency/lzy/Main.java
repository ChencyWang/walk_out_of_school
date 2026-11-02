package com.chency.lzy;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import com.chency.lzy.Game;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.print(Arrays.toString(Game.start));
        System.out.print("©2026 Github ChencyWang All rights reserved. Violators will be prosecuted.\n");
        Thread.sleep(5600);
        Game.clearScreen();
        String UserName;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your username > ");
        UserName = sc.nextLine();
        System.out.print(UserName);
        System.exit(0);
    }
}
