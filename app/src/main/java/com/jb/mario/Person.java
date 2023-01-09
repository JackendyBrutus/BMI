package com.jb.mario;

public class Person {
    private double weigth;
    private double height;
    private double bmi;

    public Person(double weigth, double height) {
        this.weigth = weigth;
        this.height = height;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public void computeBmi(){
        bmi = weigth / Math.pow(height, 2);
    }

    public int findCategory(){
        if(bmi >= 0 && bmi < 15){
            return 1;
        }
        else if(bmi >= 15 && bmi < 16){
            return 2;
        }
        else if(bmi >= 16 && bmi < 18.5){
            return 3;
        }
        else if(bmi >= 18.5 && bmi < 25){
            return 4;
        }
        else if(bmi >= 25 && bmi < 30){
            return 5;
        }
        else if(bmi >= 30 && bmi < 35){
            return 6;
        }
        else if(bmi >= 35 && bmi < 40){
            return 7;
        }
        else{
            return 8;
        }
    }
}
