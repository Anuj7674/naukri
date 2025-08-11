package org.example;

import java.util.concurrent.*;

public class MainExecutorLauncher {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        executor.submit(() -> org.example.abcdPrintaabbccdd.main(new String[]{}));
        executor.submit(() -> org.example.alternatePrimeNumber.main(new String[]{}));
        executor.submit(() -> org.example.anagram.main(new String[]{}));
        executor.submit(() -> org.example.armstrong.main(new String[]{}));
        executor.submit(() -> org.example.checkForPrime.main(new String[]{}));

        executor.shutdown();
    }
}