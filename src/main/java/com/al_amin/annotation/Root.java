package com.al_amin.annotation;

public class Root {
    public static void main(String[] args) {
        LRB lrb = new LRB();
        if (lrb.getClass().isAnnotationPresent(Music.class)
                && lrb.getClass().isAnnotationPresent(MusicBand.class)){
            System.out.println("Band Music");
        }else {
            System.out.println("Not a band music");
        }
    }
}
