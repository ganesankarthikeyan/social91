/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Social.classes;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author karthikg
 */
@Configuration
public class MainClass {

    @Autowired
    PropertiesClass propertiesClass;

    @Autowired
    ColoredSteelFrame coloredSteelFrame;

    @Autowired
    NormalSteelFrame normalSteelFrame;

    @Autowired
    HandleBarWithBrakes handleBarWithBrakes;

    @Autowired
    HandlerBarWithOutBrakes handleBarWithOutBrakes;

    @Autowired
    OneSeating oneSeating;

    @Autowired
    TwoSeating twoSeating;

    @Autowired
    TubeTyre tubeTyre;

    @Autowired
    TubeLessTyre tubeLessTyre;

    @Autowired
    Gearless gearless;

    @Autowired
    FourGears fourGears;

    public static BlockingQueue<Map<String, Integer>> queue = new LinkedBlockingQueue<>();

    @PostConstruct
    public void reloadProperties() throws InterruptedException {
        System.out.println(propertiesClass.toString());
        takeInputsFromConsole();
    }

    private void takeInputsFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want 1.colored steel frame 2.normal steel frame?");
        int frame = scanner.nextInt();
        System.out.println("Do you want 1.handle with brakes 2.handle without breaks?");
        int handle = scanner.nextInt();
        System.out.println("Do you want 1.one seating 2.two seating?");
        int seats = scanner.nextInt();
        System.out.println("Do you want 1.wheels with tubes 2.wheels without tubes?");
        int wheels = scanner.nextInt();
        System.out.println("Do you want 1.gearless 2.fourgears?");
        int chain = scanner.nextInt();
//        System.out.println("frame is " + frame + " " + handle + " " + seats + " " + wheels + " " + chain);

        Map<String, Integer> map = new LinkedHashMap<>();
        if (frame == 1) {
            map.put("colored steel frame ", coloredSteelFrame.getColoredSteelFrame());
        } else if (frame == 2) {
            map.put("normal steel frame ", normalSteelFrame.getNormalSteelFrame());
        }

        if (handle == 1) {
            map.put("handle bar with brakes", handleBarWithBrakes.getHandleBarWithBrakes());
        } else if (handle == 2) {
            map.put("handle bar without brakes ", handleBarWithOutBrakes.getHandleBarWithOutBrakes());
        }

        if (seats == 1) {
            map.put("one seating ", oneSeating.getOneSeating());
        } else if (seats == 2) {
            map.put("two seating ", twoSeating.getTwoSeating());
        }

        if (wheels == 1) {
            map.put("wheels with tube ", tubeTyre.getTubeTyre());
        } else if (wheels == 2) {
            map.put("wheels without tube ", tubeLessTyre.getTubeLessTyre());
        }

        if (chain == 1) {
            map.put("gear less ", gearless.getGearLess());
        } else if (chain == 2) {
            map.put("four gears ", fourGears.getFourGears());
        }

        //System.out.println("map " + map);
//        System.out.println("queue " + queue);
        new Thread(new Producer(map, queue)).start();
//        System.out.println("queue " + queue);
        new Thread(new Consumer(queue)).start();

    }

}
