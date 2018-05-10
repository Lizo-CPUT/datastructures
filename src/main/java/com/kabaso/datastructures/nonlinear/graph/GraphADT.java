package com.kabaso.datastructures.nonlinear.graph;

import com.kabaso.datastructures.Student;

public interface GraphADT {
    // Graph class ADT
    // Initialize the graph with some number of vertices
    void init(int n);

    // Return the number of vertices
    int nodeCount();

    // Return the current number of edges
    int edgeCount();

    // Get the value of node with index v
    Student getValue(int v);

    // Set the value of node with index v
    void setValue(int v, Student data);

    // Adds a new edge from node v to node w with weight wgt
    void addEdge(int v, int w, int wgt);

    // Get the weight value for an edge
    int weight(int v, int w);

    // Removes the edge from the graph.
    void removeEdge(int v, int w);

    // Returns true iff the graph has the edge
    boolean hasEdge(int v, int w);

    // Returns an array containing the indicies of the neighbors of v
    int[] neighbors(int v);

}
