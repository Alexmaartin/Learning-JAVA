package com.campusdual.polymorph;

public class Tablet extends Device implements IChargeable{
    public Tablet(String model, String brand) {
        super(model, brand);
    }

    public void changeScreenOrientation(){
        System.out.println("Switch screen orientation.");
    }

    @Override
    public void charge() {
        System.out.printf(this.getBrand() + " " + this.getModel() + "is charging at 33 W." );
    }

    @Override
    public void use() {
        System.out.println("Using with touch screen and keyboard");
    }
}
