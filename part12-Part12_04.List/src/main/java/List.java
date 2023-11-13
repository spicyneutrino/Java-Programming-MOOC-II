public class List<Type> {
    private Type[] values;
    int firstFreeIndex;

    public List() {
        this.values = (Type[]) new Object[10];
        this.firstFreeIndex = 0;
    }

    public void add(Type value) {
        if (this.firstFreeIndex == this.values.length) {
            grow();
        }

        this.values[this.firstFreeIndex] = value;
        this.firstFreeIndex++;
    }

    private void grow() {
        int newSize = (int) 1.5 * this.values.length;
        Type[] newValues = (Type[]) new Object[newSize];
        for (int i = 0; i < this.values.length; i++) {
            newValues[i] = this.values[i];
        }

        this.values = newValues;
    }

    public boolean contains(Type value) {
        return indexOfValue(value)!=-1;
    }

    public void remove(Type value){
        for (int i=0; i<this.firstFreeIndex;i++){
            if (this.values[i].equals(value)){
                moveToTheLeft(i);
                this.firstFreeIndex--;
            }
        }
        
    }

    public int indexOfValue(Type value){
        for(int i=0; i<this.firstFreeIndex;i++){
            if (this.values[i].equals(value)){
                return i;
            }
        }
        return -1;
    }
    private void moveToTheLeft(int fromIndex){
        for (int i=fromIndex;i<this.firstFreeIndex;i++){
            this.values[i]=this.values[i+1];
        }
    }
    public Type value(int index){
        if (index<0 || index>=this.firstFreeIndex){
            throw new IndexOutOfBoundsException("Index cannot be outside of [0," + this.firstFreeIndex +"]");
        }
        return this.value(index);
    }

    public int size() {
        return this.firstFreeIndex;
    }

    
}
