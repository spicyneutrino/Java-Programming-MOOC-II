package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AverageSensor implements Sensor {
    private List<Sensor> sensors = new ArrayList<>();

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    public List<Integer> readings() {
        List<Integer> sensorReadList = new ArrayList<>();
        sensorReadList = this.sensors.stream()
                .mapToInt(sensor -> {
                    try {
                        if (sensor.read()!=0){
                            return sensor.read();
                        }
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    return 0;
                })
                .boxed()
                .collect(Collectors.toList());
        return sensorReadList;
    }

    @Override
    public boolean isOn() {
        // TODO Auto-generated method stub
        boolean flag = true;
        for (Sensor eachSensor : this.sensors) {
            if (eachSensor.isOn() != true) {
                flag = false;
            }
        }
        return flag;
    }

    @Override
    public void setOn() {
        // TODO Auto-generated method stub
        for (Sensor eachSensor : this.sensors) {
            eachSensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor eachSensor : this.sensors) {
            eachSensor.setOff();
        }
    }

    
    public int read() {
        // TODO Auto-generated method stub
        if (!this.isOn() | this.sensors.isEmpty()) {
            throw new IllegalStateException();
        }
        if (this.sensors.size()==0){
            return 0;
        }

        int sum = 0;

        for (Sensor sensor : this.sensors) {
            try {
                if (sensor.read() != 0) {
                    sum += sensor.read();
                }

            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        int average = sum / this.sensors.size();

        return average;

    }
}
