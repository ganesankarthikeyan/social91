/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Social.classes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author karthikg
 */
@Component
public class PropertiesClass {

    @Override
    public String toString() {
        return "PropertiesClass{" + "fourgears=" + fourgears + ", coloredSteelFrame=" + coloredSteelFrame + ", normalSteelFrame=" + normalSteelFrame + ", handleBarWithBrakes=" + handleBarWithBrakes + ", handleBarWithoutBrakes=" + handleBarWithoutBrakes + ", oneSeating=" + oneSeating + ", twoSeating=" + twoSeating + ", wheelsWithTube=" + wheelsWithTube + ", wheelsWithOutTube=" + wheelsWithOutTube + ", gearless=" + gearless + '}';
    }

    @Value("${fourgears}")
    private int fourgears;

    @Value("${coloredsteelframe}")
    private int coloredSteelFrame;

    @Value("${normalsteelframe}")
    private int normalSteelFrame;

    @Value("${handlebarwithbrakes}")
    private int handleBarWithBrakes;

    @Value("${handlebarwithoutbrakes}")
    private int handleBarWithoutBrakes;

    @Value("${oneseating}")
    private int oneSeating;

    @Value("${twoseating}")
    private int twoSeating;

    @Value("${wheelswithtube}")
    private int wheelsWithTube;

    @Value("${wheelswithouttube}")
    private int wheelsWithOutTube;

    @Value("${gearless}")
    private int gearless;

    public int getColoredSteelFrame() {
        return coloredSteelFrame;
    }

    public void setColoredSteelFrame(int coloredSteelFrame) {
        this.coloredSteelFrame = coloredSteelFrame;
    }

    public int getNormalSteelFrame() {
        return normalSteelFrame;
    }

    public void setNormalSteelFrame(int normalSteelFrame) {
        this.normalSteelFrame = normalSteelFrame;
    }

    public int getHandleBarWithBrakes() {
        return handleBarWithBrakes;
    }

    public void setHandleBarWithBrakes(int handleBarWithBrakes) {
        this.handleBarWithBrakes = handleBarWithBrakes;
    }

    public int getHandleBarWithoutBrakes() {
        return handleBarWithoutBrakes;
    }

    public void setHandleBarWithoutBrakes(int handleBarWithoutBrakes) {
        this.handleBarWithoutBrakes = handleBarWithoutBrakes;
    }

    public int getOneSeating() {
        return oneSeating;
    }

    public void setOneSeating(int oneSeating) {
        this.oneSeating = oneSeating;
    }

    public int getTwoSeating() {
        return twoSeating;
    }

    public void setTwoSeating(int twoSeating) {
        this.twoSeating = twoSeating;
    }

    public int getWheelsWithTube() {
        return wheelsWithTube;
    }

    public void setWheelsWithTube(int wheelsWithTube) {
        this.wheelsWithTube = wheelsWithTube;
    }

    public int getWheelsWithOutTube() {
        return wheelsWithOutTube;
    }

    public void setWheelsWithOutTube(int wheelsWithOutTube) {
        this.wheelsWithOutTube = wheelsWithOutTube;
    }

    public int getGearless() {
        return gearless;
    }

    public void setGearless(int gearless) {
        this.gearless = gearless;
    }

    public int getFourgears() {
        return fourgears;
    }

    public void setFourgears(int fourgears) {
        this.fourgears = fourgears;
    }

}
