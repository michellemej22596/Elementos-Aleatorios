package models;

public class Queue<T> {
	
    private Object[] data;
    private final int length;
    private int pointer;
    
    public Queue(int length) {
        this.length = length;
        this.data = new Object[length];
        this.pointer = -1;
    }
    public void add(Object element) {
        this.data[pointer+1] = element;
        pointer = (pointer < length - 1) ? pointer + 1 : pointer;
    }
    public Object[] getData() {
        return this.data;
    }
    public int getLength() {
        return length;
    }
    public Object pop() {
        Object value = this.data[0];
        for (int i = 0; i < data.length-1; i++) {
            data[i] = data[i+1];            
        }
        this.data[pointer] = null;
        pointer--;
        return value;
    }
}
