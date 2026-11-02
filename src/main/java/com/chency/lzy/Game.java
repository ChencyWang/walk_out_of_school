package com.chency.lzy;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;
import java.util.Random;
import java.nio.file.FileSystem;

public class Game {

    public final static String[] start = new String[] {
            """
                                                                  \s
                                                                  \s
         WALK OUT OF            "You, come here."                 \s
                                   ╔══════════╗                   \s
                                   ║  SCHOOL  ║                   \s
          "Come out of here!"      ╚══════════╝                      \s
                                                                  \s
                      "Do you finish your homework?"              \s
           "Give                                                   \s
                  me!"                                            \s
"""};
    public static void sleep_print(String @NotNull [] say, int ms) throws InterruptedException {
        for (String s : say) {
            System.out.print(s);
            Thread.sleep(ms);
        }
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void main(String[] args){

    }
}
