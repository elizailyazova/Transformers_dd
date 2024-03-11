package com.example.transformers_dd;

public class TransformerRed extends Transformer implements Printable {
    public int num_lasers;
    public String opisanieSelf;
    public TransformerRed(int energy, String name, int num_lasers, String opisanieSelf) {
        super(name, energy);
        this.num_lasers = num_lasers;
        this.opisanieSelf = opisanieSelf;
    }
    public int getNum_lasers() {
        return num_lasers;
    }


    public void setOpisanieSelf(String opisanieSelf) {this.opisanieSelf = opisanieSelf;}



    @Override
    public void shooting() {

    }
    public String printSelf() {

        opisanieSelf = (getName() + " YASS THE WIN OF MY LIFE " + getOpisanieSelf());
        return opisanieSelf;
    }

    private String getOpisanieSelf() {
        return opisanieSelf;
    }


}