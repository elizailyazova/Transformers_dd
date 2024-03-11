package com.example.transformers_dd;

 public class TransformerYellow extends Transformer implements Printable{
    public int num_lasers;
    private String sound;
    public String opisanieSelf;
     public TransformerYellow(int energy, String name, int num_lasers, String sound) {
        super(name, energy);
        this.num_lasers = num_lasers;
        this.sound = sound;
    }

     public int getNum_lasers() { return num_lasers; }

     public String printSelf() {

         sound = (getName() + ": WOOOW ! I WON!" + getSound());
         return sound;
     }

     private String getSound() {
         return sound;
     }

     @Override
     public void shooting() {

     }
     public void setOpisanieSelf(String opisanieSelf) {this.opisanieSelf = opisanieSelf;}




 }
