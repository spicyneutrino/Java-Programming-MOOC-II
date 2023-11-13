public class TripleTacoBox implements TacoBox{
    private int tacos;
    public TripleTacoBox(){
        this.tacos = 3;
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
