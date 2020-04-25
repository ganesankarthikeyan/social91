/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Social.classes;

import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author karthikg
 */
public class Consumer implements Runnable {

    private final BlockingQueue<Map<String, Integer>> queue;

    private static int count = 1;

    public Consumer(BlockingQueue<Map<String, Integer>> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        Map<String, Integer> map;
        try {
            while (true) {
                map = queue.take();
                getValues(map);
            }

        } catch (InterruptedException ex) {
            Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void getValues(Map<String, Integer> map) {
        try {
//            System.out.println("map " + map);
            int value = 0;

            for (Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
                value = value + entry.getValue();
            }
            System.out.println("Total Cycle Price " + count + " is " + value);
            System.out.println("************************************************");
            count++;
        } catch (Exception e) {
            System.out.println("Exception at getValues " + e);
        }

    }

}
