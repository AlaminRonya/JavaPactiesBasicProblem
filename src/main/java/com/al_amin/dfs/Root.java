package com.al_amin.dfs;

import lombok.Data;
import lombok.ToString;

import java.util.*;

@Data
class Vertex<T>{
    private final T data;
    private boolean visited;
    @ToString.Exclude
    private List<Vertex<T>> neighbors = new ArrayList<>();
}
class DFS<T>{
    public  void traverse(Vertex<T> startVertex ,  Vertex<T> end){
        Deque<Vertex<T>> stack = new LinkedList<>();
        stack.push(startVertex);
        while (!stack.isEmpty()){
            Vertex<T> current = stack.pop();
            if (!current.isVisited()){
                current.setVisited(true);
                System.out.print(current.getData()+"->");
                if (current.getData().equals(end.getData())){
                    break;
                }
                current.getNeighbors().forEach(stack::push);
            }

        }
        System.out.println();
    }
}

public class Root {



    public static void main(String[] args) {
        Vertex<Integer> v0 = new Vertex<>(0);
        Vertex<Integer> v1 = new Vertex<>(1);
        Vertex<Integer> v2 = new Vertex<>(2);
        Vertex<Integer> v3 = new Vertex<>(3);
        v0.setNeighbors(Arrays.asList(v1));
        v1.setNeighbors(Arrays.asList(v0, v2, v3));
        v2.setNeighbors(Arrays.asList(v0, v1, v3));
        v3.setNeighbors(Arrays.asList(v0, v1, v2));
//        System.out.println(v0);

        DFS<Integer> dfs = new DFS<>();
        dfs.traverse(v0, v2);
    }

}
