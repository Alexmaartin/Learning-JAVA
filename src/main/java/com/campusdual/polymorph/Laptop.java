package com.campusdual.polymorph;

public class Laptop extends Device implements IChargeable{

    public Laptop(String model, String brand) {
        super(model, brand);
    }

    public void behaviorOnCloseScreen(){
        System.out.println("Close screen, preventing power-saving mode");
    }

    @Override
    public void charge() {
        System.out.printf(this.getBrand() + " " + this.getModel() + "is charging at 65 W." );
    }

    @Override
    public void use() {
        System.out.println("Using with keyboard and mouse.");
    }
}
