public class CustomTacoBox implements TacoBox {
    private int tacos;

    public CustomTacoBox(int tacos) {
        this.tacos = tacos;
    }

    @Override
    public int tacosRemaining() {
        // TODO Auto-generated method stub
        return this.tacos;
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        if(this.tacos-1>=0){
            this.tacos--;
        };

    }
}
