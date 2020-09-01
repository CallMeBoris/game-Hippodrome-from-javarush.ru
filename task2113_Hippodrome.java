package com.javarush.task.task21.task2113;

import java.util.*;

public class Hippodrome {
    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    private  List<Horse> horses;

    public static void main(String[] args) throws InterruptedException {
        List<Horse> horsi = new ArrayList<>();
        game = new Hippodrome(horsi);
        Horse horse1 = new Horse("Max",3,0);
        Horse horse2 = new Horse("Alex",3,0);
        Horse horse3 = new Horse("Rick",3,0);
        Horse horse4 = new Horse("Jack",3,0);
        Horse horse5 = new Horse("Ignat",3,0);
        game.getHorses().add(horse1);
        game.getHorses().add(horse2);
        game.getHorses().add(horse3);
        game.getHorses().add(horse4);
        game.getHorses().add(horse5);
        game.run();
        game.printWinner();
    }

    static Hippodrome game;

    public  void move(){
        for (int i=0;i<getHorses().size();i++){
            getHorses().get(i).move();
        }
    }
    public  void run() throws InterruptedException {
        for (int i=0;i<100;i++){
            move();
            print();
            Thread.sleep(200);
        }
    }
    public  void print(){
        for (int i=0;i<getHorses().size();i++){
            getHorses().get(i).print();
        }
        for (int j=0;j<10;j++){
            System.out.println();
        }
    }

    public Horse getWinner(){
        double a=0;
        for (int i=0;i<getHorses().size();i++){
            if (getHorses().get(i).distance>a){
                a= getHorses().get(i).distance;
            }
        }
        for (int j=0;j<getHorses().size();j++){
            if (getHorses().get(j).distance==a){
                return getHorses().get(j);
            }
        }
        return getHorses().get(0);
    }
    public void printWinner(){
        System.out.println("Winner is "+getWinner().getName()+"!");
    }

    }