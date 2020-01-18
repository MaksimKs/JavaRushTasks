package com.javarush.task.task14.task1409;

/* 
Мосты
*/

public class Solution {
    public static void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());
    }

    public static void println(Bridge bridge) {
        if (bridge instanceof WaterBridge) {
            WaterBridge waterbridge = (WaterBridge) bridge;
            System.out.println(waterbridge.getCarsCount());
        } else if (bridge instanceof SuspensionBridge) {
            SuspensionBridge suspensionBridge = (SuspensionBridge) bridge;
            System.out.println(suspensionBridge.getCarsCount());
        }
    }
}

