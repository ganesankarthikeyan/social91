/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Social.classes;

import java.time.Clock;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 *
 * @author karthikg
 */
public class Producer implements Runnable {

    private final BlockingQueue<Map<String, Integer>> queue;

    public Map<String, Integer> map;

    public Producer(Map<String, Integer> map, BlockingQueue<Map<String, Integer>> queue) {
        this.map = map;
        this.queue = queue;
    }

    @Override
    public void run() {
        saveInQueue();
    }

    private void saveInQueue() {
        try {
            long startTime = System.currentTimeMillis();
            long endTime;
            if (map != null) {
                for (int i = 0; i < 1000; i++) {
                    Map<String, Integer> dupMap = new LinkedHashMap();
                    endTime = System.currentTimeMillis();
                    long diff = endTime - startTime;
                    //diff percentage must be increased

                    int value = 0;
                    int value1 = 0;
                    for (Map.Entry<String, Integer> entry : map.entrySet()) {
                        value = entry.getValue();
                        int percentage = (int) diff;
                        value1 = value + ((value * percentage) / 100);
                        //System.out.println("value " + value + " " + value1);
                        dupMap.put(entry.getKey(), value1);
                    }
                    //System.out.println("map " + dupMap);
                    queue.put(dupMap);
                    //System.out.println(diff + " " + map);
                }
            }

            endTime = System.currentTimeMillis();
            System.out.println("TIME " + (endTime - startTime));
        } catch (Exception e) {
            System.out.println("Exception at saveInQueue " + e);
        }

    }

}
