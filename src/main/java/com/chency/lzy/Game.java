package com.chency.lzy;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;
import java.util.Random;
import java.nio.file.FileSystem;

public class Game {

    public final static String[] start = new String[] {
            """
    
                      "You, come here."
                                    ╔══════════╗ ™
                     WALK OUT OF    ║  SCHOOL  ║
           "Come out of here!"      ╚══════════╝
    
                       "Did you finish your homework?"
            "Give it
                     to me!"
    
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
