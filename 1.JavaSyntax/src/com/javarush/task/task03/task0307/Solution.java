package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg zerg = new Zerg();
        zerg.name = "zerg";
        Zerg zerg1 = new Zerg();
        zerg1.name = "zerg1";
        Zerg zerg2 = new Zerg();
        zerg2.name = "zerg2";
        Zerg zerg3 = new Zerg();
        zerg3.name = "zerg3";
        Zerg zerg4 = new Zerg();
        zerg4.name = "zerg4";

        Protoss protoss = new Protoss();
        protoss.name = "proto";
        Protoss protoss1 = new Protoss();
        protoss1.name = "proto1";
        Protoss protoss3 = new Protoss();
        protoss3.name = "proto3";

        Terran terran = new Terran();
        terran.name = "terran";
        Terran terran1 = new Terran();
        terran1.name = "terran1";
        Terran terran2 = new Terran();
        terran2.name = "terran2";
        Terran terran3 = new Terran();
        terran3.name = "terran3";

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
