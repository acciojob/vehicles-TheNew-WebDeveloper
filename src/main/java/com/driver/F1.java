package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned
    	super(name, 4, 2, 6, isManual, "F1", 1);
    }

    public void accelerate(int rate) {
        int newSpeed = getCurrentSpeed() + rate;

        if (newSpeed == 0) {
            stop();
            changeGear(1);
        } else {
            if (newSpeed <= 50)
                changeGear(1);
            else if (newSpeed <= 100)
                changeGear(2);
            else if (newSpeed <= 150)
                changeGear(3);
            else if (newSpeed <= 200)
                changeGear(4);
            else if (newSpeed <= 250)
                changeGear(5);
            else
                changeGear(6);

            changeSpeed(newSpeed, getCurrentDirection());
        }
    }

	@Override
	public int getCurrentGear() {
		// TODO Auto-generated method stub
		return super.getCurrentGear();
	}

	@Override
	public boolean isManual() {
		// TODO Auto-generated method stub
		return super.isManual();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}
    
    
}
