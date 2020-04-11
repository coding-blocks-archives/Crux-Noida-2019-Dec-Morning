package com.company.Lec28;

import java.util.LinkedList;

public class AdjacencyListGraph<T> {

    LinkedList<Vertex> vertices;

    public AdjacencyListGraph() {
        this.vertices = new LinkedList<>();
    }

    public void addVertex(T value){
         vertices.add(new Vertex(value));
    }

    public void addEdge(T first, T second){

        Vertex f= get(first);
        Vertex s= get(second);

        if(f!=null && s!=null){
            f.neighbours.add(s);
            s.neighbours.add(f);
        }
    }

    public void display(){

        for (Vertex vertex: vertices) {

            System.out.print(vertex.value+ " => ");
            for (Vertex padosi: vertex.neighbours) {

                System.out.print(padosi.value + " ");
            }
            System.out.println();
        }
    }

    public Vertex get(T value){

        for (Vertex vertex: vertices) {

            if(vertex.value.equals(value)){
                return vertex;
            }
        }
        return null;
    }

    class Vertex{
        T value;
        LinkedList<Vertex> neighbours;

        public Vertex(T value) {
            this.value = value;
            this.neighbours = new LinkedList<>();
        }
    }
}
