package com.company.Lec28;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class AdjacencyMapGraph<T> {

    Map<T,Vertex> vertexMap;

    Map<Vertex, Vertex> parent = new HashMap<>();

    public AdjacencyMapGraph() {
        this.vertexMap = new HashMap<>();
    }

    public void addVertex(T value){

        vertexMap.put(value,new Vertex(value));
    }

    public void addEdge(T first, T second){

        vertexMap.get(first).neighbours.put(vertexMap.get(second),1);
        vertexMap.get(second).neighbours.put(vertexMap.get(first),1);
    }

    public void addEdgeWeight(T first, T second, Integer weight){

        vertexMap.get(first).neighbours.put(vertexMap.get(second),weight);
        vertexMap.get(second).neighbours.put(vertexMap.get(first),weight);
    }

    public void setParent(){

        for (Vertex vertex:vertexMap.values()) {

            parent.put(vertex,null);
        }
    }

    public boolean union(Vertex first, Vertex second){

        Vertex f = find(first);
        Vertex s = find(second);

        if(f!=s){
            parent.put(f,s);
            return true;
        }
        return false;
    }

    public Vertex find(Vertex vertex){

        while(parent.get(vertex)!=null){

            vertex= parent.get(vertex);
        }
        return vertex;
    }

    public AdjacencyMapGraph<T> kruskal(){

        setParent();

        ArrayList<Edge> edges =new ArrayList<Edge>();

        AdjacencyMapGraph<T> map = new AdjacencyMapGraph<>();

        for (T values: vertexMap.keySet()) {
            map.addVertex(values);
        }

        for (Vertex vertex : vertexMap.values()) {

            for (Vertex padosi: vertex.neighbours.keySet()) {

                edges.add(new Edge(vertex,padosi,vertex.neighbours.get(padosi)));
            }
        }

        edges.sort(new Comparator<Edge>() {
            @Override
            public int compare(Edge o1, Edge o2) {
                return o1.weight-o2.weight;
            }
        });

        for (Edge edge: edges) {

            if(union(edge.first,edge.second)){
                map.addEdgeWeight(edge.first.value,edge.second.value,edge.weight);
            }
        }

        return map;
    }

    public void display(){

        for (Vertex vertex: vertexMap.values()) {

            System.out.print(vertex.value + " => ");

            for (Vertex padosi:vertex.neighbours.keySet()) {
                System.out.print(padosi.value + " ");
            }

            System.out.println();
        }

    }

    class Vertex{

        T value;
        Map<Vertex,Integer> neighbours;

        public Vertex(T value) {
            this.value =value;
            this.neighbours = new HashMap<>();
        }
    }

    class Edge{

        Vertex first;
        Vertex second;
        Integer weight;

        public Edge(Vertex first, Vertex second, Integer weight) {
            this.first = first;
            this.second = second;
            this.weight = weight;
        }
    }


}
