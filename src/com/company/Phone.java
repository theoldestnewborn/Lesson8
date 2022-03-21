package com.company;

public class Phone {
    int weight;
    String model, number;

    public Phone(int weight, String model, String number) {
        this(model, number);
        this.weight = weight;
    }

    public Phone(String model, String number) {
        this.model = model;
        this.number = number;
    }
    public String getName () {
        return this.model;
    }

    public Phone() {
    }

    void getInfo() {
        System.out.println(this.model + " " + this.weight + " " + this.number);
    }

    public void receiveCall(String callerName) {
        System.out.println(callerName + " is calling on " + getNumber());
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println(callerName + " " + callerNumber + " is calling");
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage (String ... number) {
        for (int i=0; i< number.length; i++)
            System.out.println(number[i] + " is calling on " + getName());
    }
}
