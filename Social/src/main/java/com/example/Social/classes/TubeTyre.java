/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Social.classes;

import com.example.Social.interfaces.Wheels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author karthikg
 */
@Component
public class TubeTyre implements Wheels{
    
    @Autowired
    PropertiesClass propertiesClass;
    
    public int getTubeTyre(){
        return propertiesClass.getWheelsWithTube();
    }
}
