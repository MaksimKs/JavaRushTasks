package com.javarush.task.task11.task1112;

/* 
Заклятые друзья
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class AppleIPhone {
        int screenSize;
        int flashMemory;
        int RAM;
        int processorFrequency;
        int batteryCapacity;

        public AppleIPhone (int screenSize, int flashMemory, int RAM,
                            int processorFrequency, int batteryCapacity) {
            this.screenSize = screenSize;
            this.flashMemory = flashMemory;
            this.RAM = RAM;
            this.processorFrequency = processorFrequency;
            this.batteryCapacity = batteryCapacity;
        }
    }

    public class SamsungGalaxyS2 extends AppleIPhone {
        public SamsungGalaxyS2 (int screenSize, int flashMemory, int RAM,
                                int processorFrequency, int batteryCapacity) {
            super(screenSize,flashMemory, RAM, processorFrequency, batteryCapacity);
        }
    }
}
