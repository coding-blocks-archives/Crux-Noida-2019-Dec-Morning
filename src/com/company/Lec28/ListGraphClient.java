package com.company.Lec28;

public class ListGraphClient {

    public static void main(String[] args) {

        AdjacencyListGraph<String> graph =new AdjacencyListGraph<>();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");

        graph.addEdge("C","D");
        graph.addEdge("A","C");
        graph.addEdge("A","B");
        graph.addEdge("D","B");
        graph.addEdge("A","D");

//        graph.BFT();
        System.out.println(graph.bipartite());
//        graph.display();
    }
}
