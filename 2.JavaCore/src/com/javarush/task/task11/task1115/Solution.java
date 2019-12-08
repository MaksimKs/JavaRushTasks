package com.javarush.task.task11.task1115;

/* 
От школьника до квалифицированного раба
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Schoolboy {
        int educationLevel;
        public Schoolboy (int educationLevel) {
            this.educationLevel = educationLevel;
        }
    }

    public class Student extends Schoolboy{
        public Student (int educationLevel) {
            super(educationLevel);
        }
    }

    public class Worker extends Student{
        public Worker (int educationLevel) {
            super(educationLevel);
        }
    }

    public class Slave extends Worker {
        public Slave (int educationLevel) {
            super(educationLevel);
        }
    }
}
