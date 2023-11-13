public class Hideout<T> implements Cloneable {
    private T hiddenObject;

    public void putIntoHideout(T toHide){
        this.hiddenObject = toHide;
    }

    public T takeFromHideout(){
        T copyObject = this.hiddenObject;
        this.hiddenObject =null;
        return copyObject;
    }

    public boolean isInHideout(){
        if (this.hiddenObject==null){
            return false;
        }
        return true;
    }



}
