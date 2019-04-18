package com.company;

public class Valection<E> {
    private E[] arr;
    private int size;

    @SafeVarargs
    public Valection(int size, E ... elements){
        arr = elements;
    }

    public E[] getArr() {
        return arr;
    }

    public void print(){
        for(E el : arr){
            System.out.print(el.toString() + "\t");
        }
    }

    public E get(int index){
        E  element = arr[index];
        return element;
    }
}
