package Module6;

import java.util.Arrays;


public class MyArrayList<T> {   //Further, instead of T, the class
    int index;
    public Object [] array;;
    int size;


    public MyArrayList(int size, Object[] array){
        this.array = array;
        this.size  = size;
    }


    public void add(T value ){

        Object[] arrayBigger = new Object[array.length + 1];
        System.arraycopy(array, 0, arrayBigger, 0, array.length);
        int t = arrayBigger.length-1;
        arrayBigger [t] = value;
        array = arrayBigger;
        size++;
    }

    //remove(int index) the item by the index
    public void remove(int index){
        for (int i = 0; i < array.length; i++) {
            array[index] = null;

        }

    }

    //clear() clear the collection
    public void clear(){
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }

    }

    //size() returns the size of the collection
    int total=0;
    public void size(){
        for (int i = 0; i < array.length; i++){
            total += Arrays.asList(array).indexOf(i);
        }
    }


    public Object get(int index) {

        return array[index];
    }


    public void print() {
        for (Object element : array) {
            System.out.print("" + element + " ");
        }
    }

}
