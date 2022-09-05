package com.al_amin.generic;

public class GenericList <T>{
    private T[] items;
    private int count;

    public GenericList() {
        this.items = (T[]) new Object[10];
        this.count = 0;
    }

    public void add(T item){
        if (items.length == count){
            T[] newItems = (T[]) new Object[items.length * 2];
            for (int i = 0; i < count; i++){
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count++] = item;
    }
    public T getItem(int index){
        if (index<0 || index >= count){
            throw new IllegalArgumentException("Index is incorrect!");
        }
        return items[index];
    }

    public void removedAt(int position){
        if (position <= 0 || position > count){
            throw new IllegalArgumentException("Index is incorrect!");
        }
        for (int i = position-1; i < count-1; i++){
            items[i] = items[i+1];
        }
        count--;
    }
    public int indexOf(T item){
        for (int i = 0; i < count; i++){
            if (items[i].equals(item))
                return i;
        }
        return -1;
    }

    public void print(){
        for (int i = 0; i < count; i++){
            System.out.print(items[i]+" ");
        }
        System.out.println();
    }
}
