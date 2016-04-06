package graph;

import graph.Edge;
import graph.Graph;
import graph.UndirectedEdge;
import graph.Vertex;
import graph.DirectedEdge;

public class TestImpl {

	public static void main(String[] args) {
		
		System.out.println("### Start ###");
		
		System.out.println("--- Create vertices (but not added to the graph) ---");
		System.out.println("Create A");
		Vertex vertexA = new Vertex("A");
		System.out.println("	| A successfully created !");
		System.out.println("Create B");
		Vertex vertexB = new Vertex("B");
		System.out.println("	| B successfully created !");
		System.out.println("Create C");
		Vertex vertexC = new Vertex("C");
		System.out.println("	| C successfully created !");
		System.out.println("Create D");
		Vertex vertexD = new Vertex("D");
		System.out.println("	| D successfully created !");
		System.out.println("Create E");
		Vertex vertexE = new Vertex("E");
		System.out.println("	| E successfully created !");
		
		// Create few undirected Edges
		System.out.println("--- Create undirected edges (but not added to the graph) ---");
		System.out.println("Create A-B");
		Edge unEdge1 = new UndirectedEdge(vertexA, vertexB);
		System.out.println("	| A-B successfully created !");
		System.out.println("Create B-C");
		Edge unEdge2 = new UndirectedEdge(vertexB, vertexC);
		System.out.println("	| B-C successfully created !");
		System.out.println("Create C-C");
		Edge unEdge3 = new UndirectedEdge(vertexC, vertexC);
		System.out.println("	| C-C successfully created !");
		
		// Create few directed Edges
		System.out.println("--- Create directed edges (but not added to the graph) ---");
		System.out.println("Create A->C");
		Edge diEdge1 = new DirectedEdge(vertexA, vertexC);
		System.out.println("	| A->C successfully created !");
		System.out.println("Create C->D");
		Edge diEdge2 = new DirectedEdge(vertexC, vertexD);
		System.out.println("	| C->D successfully created !");
		System.out.println("Create D->A");
		Edge diEdge3 = new DirectedEdge(vertexD, vertexA);
		System.out.println("	| D->A successfully created !");
		
		// Create a matrix about an undirected graph
		System.out.println("--- Create an undirected graph with max to 6 edges and 6 vertices ---");
		ImplGraph undMatrix1 = new ImplGraph(6, 6, false);
		
		System.out.println("- Add vertices -");
		System.out.println("Add vertex A to graph");
		undMatrix1.setVertex(vertexA);
		System.out.println("	| A successfully added !");
		System.out.println("Add vertex B to graph");
		undMatrix1.setVertex(vertexB);
		System.out.println("	| B successfully added !");
		System.out.println("Add vertex C to graph");
		undMatrix1.setVertex(vertexC);
		System.out.println("	| C successfully added !");
		System.out.println("Add vertex D to graph");
		undMatrix1.setVertex(vertexD);
		System.out.println("	| D successfully added !");
		System.out.println("Add vertex E to graph");
		undMatrix1.setVertex(vertexE);
		System.out.println("	| E successfully added !");
		System.out.println("Add vertex E to graph");
		undMatrix1.setVertex(vertexE);	// test about existing Vertex -- OK
		System.out.println("	| E not added ! (good)");
		System.out.println("Add vertex A to graph");
		undMatrix1.setVertex(vertexA);	// test to out of range the array of vertices -- OK
		System.out.println("	| A not added ! (good)");
		
		System.out.println("- Add edges -");
		System.out.println("Add edge A-B to graph");
		undMatrix1.setEdge(unEdge1);
		System.out.println("	| A-B successfully added !");
		System.out.println("Add edge B-C to graph");
		undMatrix1.setEdge(unEdge2);
		System.out.println("	| B-C successfully added !");
		System.out.println("Add edge C-C to graph");
		undMatrix1.setEdge(unEdge3);
		System.out.println("	| C-C successfully added !");
		System.out.println("Add edge C-C to graph");
		undMatrix1.setEdge(unEdge3);	// test about existing Edge -- OK
		System.out.println("	| C-C not added ! (good)");
		System.out.println("Add edge A->C to graph");
		undMatrix1.setEdge(diEdge1);	// test about directed Edge in undirected graph -- OK
		System.out.println("	| A->C not added ! (good)");
		
		System.out.println("- Get all vertices -");
		undMatrix1.getVertexs();
		System.out.println("	| Getter works !");
		
		System.out.println("- Get all edges -");
		undMatrix1.getEdges();
		System.out.println("	| Getter works !");
		
		// Create a matrix about a directed graph
		System.out.println("--- Create a directed graph with max to 10 edges and 10 vertices ---");
		ImplGraph dirMatrix1 = new ImplGraph(10, 10, true);
				
		System.out.println("Add vertex A to graph");
		dirMatrix1.setVertex(vertexA);
		System.out.println("	| A successfully added !");
		System.out.println("Add vertex B to graph");
		dirMatrix1.setVertex(vertexB);
		System.out.println("	| B successfully added !");
		System.out.println("Add vertex C to graph");
		dirMatrix1.setVertex(vertexC);
		System.out.println("	| C successfully added !");
		System.out.println("Add vertex D to graph");
		dirMatrix1.setVertex(vertexD);
		System.out.println("	| D successfully added !");
		System.out.println("Add vertex E to graph");
		dirMatrix1.setVertex(vertexE);
		System.out.println("	| E successfully added !");
		System.out.println("Add vertex E to graph");
		dirMatrix1.setVertex(vertexE);	// test about existing Vertex -- OK
		System.out.println("	| E not added ! (good)");
		System.out.println("Add vertex A to graph");
		dirMatrix1.setVertex(vertexA);	// test to out of range the array of vertices -- OK
		System.out.println("	| A not added ! (good)");
		
		System.out.println("Add edge A->C to graph");
		dirMatrix1.setEdge(diEdge1); 
		System.out.println("	| A->C successfully added !");
		System.out.println("Add edge C->D to graph");
		dirMatrix1.setEdge(diEdge2);
		System.out.println("	| C->D successfully added !");
		System.out.println("Add edge D->A to graph");
		dirMatrix1.setEdge(diEdge3);
		System.out.println("	| D->A successfully added !");
		System.out.println("Add edge D->A to graph");
		dirMatrix1.setEdge(diEdge3);	// test about existing Edge -- OK
		System.out.println("	| D->A not added ! (good)");
		System.out.println("Add edge A->C to graph");
		dirMatrix1.setEdge(unEdge1);	// test about undirected Edge in directed graph -- OK
		System.out.println("	| A->C not added ! (good)");
		
		System.out.println("- Get all vertices -");
		undMatrix1.getVertexs();
		System.out.println("	| Getter works !");
		
		System.out.println("- Get all edges -");
		undMatrix1.getEdges();
		System.out.println("	| Getter works !");
		
		// Try to create a matrix impossible to create
		System.out.println("--- Create a bad matrix with max to 0 edge and 1 vertex (error) ---");
		ImplGraph undMatrix2 = new ImplGraph(0, 1, false);	// OK
		System.out.println("	| Can't create the matrix ! (good)");
		
		System.out.println("### End ###");
	}
}
