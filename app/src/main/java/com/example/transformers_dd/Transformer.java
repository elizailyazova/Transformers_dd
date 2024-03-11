package com.example.transformers_dd;

public class Transformer {

    public String name;
    public int energy;

    public Transformer(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
    public void minusEnergy(int n){
        energy = energy - n;
    }

    public void shooting() {

    }
}
