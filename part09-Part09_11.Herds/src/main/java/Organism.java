public class Organism implements Movable {
    private int xPosition, yPosition;

    public Organism(int x, int y){
        this.xPosition = x;
        this.yPosition = y;
    }
    public String toString(){
        //"x: 3; y: 6"
        return "x: " + this.xPosition + "; y: " + this.yPosition;
    }

    @Override
    public void move(int dx, int dy) {
        // TODO Auto-generated method stub
        this.xPosition+=dx;
        this.yPosition += dy;
    }
    
}
