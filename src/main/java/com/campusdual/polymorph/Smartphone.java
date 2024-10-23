package com.campusdual.polymorph;

public class Smartphone extends Device implements IChargeable{

    public Smartphone(String model, String brand) {
        super(model, brand);
    }

    public void makeACall(){
        System.out.println("Making a call.");
    }

    @Override
    public void charge() {
        System.out.printf(this.getBrand() + " " + this.getModel() + "is charging at 15 W." );
    }

    @Override
    public void use() {
        System.out.println("Using with touch screen.");
    }
}
