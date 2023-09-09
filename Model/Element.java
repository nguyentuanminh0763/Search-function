package Model;

public class Element {
    private int sizeArray;
    private int array[];

    public Element(int sizeArray, int[] array) {
        this.sizeArray = sizeArray;
        this.array = array;
    }

    public Element() {
    }
    

    public int getSizeArray() {
        return sizeArray;
    }

    public void setSizeArray(int sizeArray) {
        this.sizeArray = sizeArray;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
    
    
}
