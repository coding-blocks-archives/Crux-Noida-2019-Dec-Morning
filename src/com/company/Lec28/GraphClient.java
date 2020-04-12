package com.company.Lec28;

public class GraphClient {

    public static void main(String[] args) {

        AdjacencyMapGraph<String> graph = new AdjacencyMapGraph<>();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");

        graph.addEdgeWeight("A","B",4);
        graph.addEdgeWeight("A","C",2);
        graph.addEdgeWeight("B","C",1);


        AdjacencyMapGraph<String> graph1 = graph.kruskal();

        graph1.display();

    }
}
