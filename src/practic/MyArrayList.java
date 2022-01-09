package practic;

import java.sql.Array;
import java.util.Arrays;

public class MyArrayList {

    private static final int INITIAL_CAPACITY = 10;
    private int[] elementData;
    private int size = 0;

    public MyArrayList(){
        elementData = new int[INITIAL_CAPACITY];
    }
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.delete(2);
//        list.add(99,9);
//        System.out.println(list.indexOf(10));
        list.getData();
    }


    void add(int value){
        increaseCapacity();
        elementData[size] = value;
        size ++;
    }

    private void increaseCapacity() {
        if (size == elementData.length) {
            elementData = Arrays.copyOf(elementData, elementData.length * 2);
        }
    }

    void add(int value, int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size "
                    + index);
        }
        increaseCapacity();
        System.arraycopy(elementData, index,
                elementData, index + 1,
                size - index);
        elementData[index] = value;
        size++;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size "
                    + index);
        }
        return elementData[index];
    }

    int indexOf(int value){

            for (int i = 0; i < size; i++) {
                if (value == elementData[i]) {
                    return i;
                }
            }

        return -1;
    }

    void delete(int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size "
                    + index);
        }
        int i;
        for (i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
        elementData[i] = 0;
        size--;
    }
    
    void getData(){
        System.out.print("My Array List : ");
        for (int i = 0; i < size; i++) {
            System.out.print(elementData[i] + " ");
        }
        System.out.println("\n List Length ="+elementData.length);
    }



}
