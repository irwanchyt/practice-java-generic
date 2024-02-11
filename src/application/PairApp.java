package src.application;

import src.practice.generic.Pair;

public class PairApp {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<String, Integer>("irwan",100);

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
