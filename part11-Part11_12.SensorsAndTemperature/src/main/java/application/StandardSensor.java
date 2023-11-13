package application;


public class StandardSensor implements Sensor {
    private int num = 0;

    public StandardSensor(int num) {
        this.num = num;
    }

    @Override
    public boolean isOn() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public void setOn() {
        // nothing
    }

    @Override
    public void setOff() {
        // nothing
    }

    @Override
    public int read() {
        return this.num;
        // TODO Auto-generated method stub
    }

    

}
