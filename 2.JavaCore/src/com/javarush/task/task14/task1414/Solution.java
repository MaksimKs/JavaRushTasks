package com.javarush.task.task14.task1414;

/* 
MovieFactory
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean rightCond = true;
        while (rightCond) {
            String keyFromConsole = reader.readLine();
            if (keyFromConsole.equals("soapOpera")) {
                Movie movie = MovieFactory.getMovie(keyFromConsole);
                System.out.println(movie.getClass().getSimpleName());
            } else if (keyFromConsole.equals("cartoon")) {
                Movie movie = MovieFactory.getMovie(keyFromConsole);
                System.out.println(movie.getClass().getSimpleName());
            } else if (keyFromConsole.equals("thriller")) {
                Movie movie = MovieFactory.getMovie(keyFromConsole);
                System.out.println(movie.getClass().getSimpleName());
            } else {
                MovieFactory.getMovie(keyFromConsole);
                rightCond = false;
            }
        }
    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            } else if ("cartoon".equals(key)) {
                movie = new Cartoon();
            } else if ("thriller".equals(key)) {
                movie = new Thriller();
            }
            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie {
    }

    static class Thriller extends Movie {
    }
}
