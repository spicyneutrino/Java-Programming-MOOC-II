public class Container {
    private int volume;

    public Container() {
        this.volume = 0;
    }

    public int getVolume() {
        return volume;
    }

    public void add(int addVolume) {

        if (addVolume > 0) {
            if (this.volume + addVolume > 100) {
                this.volume = 100;
            } else {
                this.volume += addVolume;
            }
        }
    }

    public void remove(int removeVolume) {
        if (removeVolume > 0) {
            if (this.volume - removeVolume <= 0) {
                this.volume = 0;
            } else {
                this.volume -= removeVolume;
            }
        }
    }

    public void moveTo(Container otherContainer, int amount) {
        if (amount > 0) {
            while (true) {
                
                this.remove(1);
                otherContainer.add(1);
                amount--;

                if ((this.volume == 0 || otherContainer.getVolume() == 100 || amount == 0)){
                    return;
                }
            }

        }
    }
}
