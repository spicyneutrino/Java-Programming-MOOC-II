package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {
    private boolean status = false;

    @Override
    public boolean isOn() {
        // TODO Auto-generated method stub
        return this.status;
    }

    @Override
    public void setOn() {
        // TODO Auto-generated method stub
        this.status = true;
    }

    @Override
    public void setOff() {
        // TODO Auto-generated method stub
        this.status = false;
    }

    @Override
    public int read() {
        if (this.isOn() == true) {
            return new Random().nextInt(61) - 30;
        }
        throw new IllegalStateException();
    }

}
