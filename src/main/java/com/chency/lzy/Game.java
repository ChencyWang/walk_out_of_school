package com.chency.lzy;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;
import java.util.Random;
import java.nio.file.FileSystem;

public class Game {

    public final static String[] start = new String[] {
            """
          
          WALK OUT OF            "You, come here."
                                    ╔══════════╗
                                    ║  SCHOOL  ║
           "Come out of here!"      ╚══════════╝
          
                       "Do you finish your homework?"
            "Give
                   me!"
          
    """
    };

    public static void sleep_print(String say, int ms) throws InterruptedException {
        for (int i = 0;i < say.length();i ++) {
            System.out.print(say.charAt(i));
            System.out.flush();
            Thread.sleep(ms);
        }
    }
    public static void main(String[] args){

    }
}
