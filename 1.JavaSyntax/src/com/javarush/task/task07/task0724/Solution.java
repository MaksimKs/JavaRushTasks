package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human Alex = new Human("Алекс", true, 65);
        Human Michael = new Human("Майкл", true, 68);
        Human Olga = new Human("Ольга",false, 64);
        Human Kate = new Human("Катя",false,66);
        Human Den = new Human("Дэн",true,40,Alex,Olga);
        Human Helen = new Human("Лена", false, 39, Michael,Kate);
        Human Andry = new Human("Андрей", true,10,Den,Helen);
        Human Alis = new Human("Элис", false,8,Den,Helen);
        Human Nikolai = new Human("Николай",true,5,Den,Helen);
        System.out.println(Alex.toString());
        System.out.println(Michael.toString());
        System.out.println(Olga.toString());
        System.out.println(Kate.toString());
        System.out.println(Den.toString());
        System.out.println(Helen.toString());
        System.out.println(Andry.toString());
        System.out.println(Alis.toString());
        System.out.println(Nikolai.toString());
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human (String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human (String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }
            return text;
        }
    }
}