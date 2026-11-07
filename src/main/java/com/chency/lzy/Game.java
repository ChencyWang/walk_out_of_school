package com.chency.lzy;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;
import java.util.Random;
import java.nio.file.FileSystem;
import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;

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
