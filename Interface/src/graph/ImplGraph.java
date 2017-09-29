package graph;


import graph.Edge;

import graph.Graph;
import graph.UndirectedEdge;
import graph.Vertex;
import graph.DirectedEdge;

/**
 * Implementation of Graph interface with an adjacency matrix
 * @author Gauchoux, Robilliard
 */
public class ImplGraph implements Graph {

	/**
	 * Array containing the edges of the graph
	 */
	private Edge[] edges;
	
	/**
	 * Counter to know the number of edges already saved
	 */
	private int edgesCounter;
	
	/**
	 * Array containing the vertices of the graph
	 */
	private Vertex[] vertices;
	
	/**
	 * Counter to know the number of vertices already saved
	 */
	private int verticesCounter;
	
	/**
	 * Array of array to create an adjacency matrix
	 */
	private boolean[][] adjacencyMatrix;
	
	/**
	 * Figure out if the graph is directed or not
	 */
	private boolean graphIsDirected;
	
	/**
	 * Create a graph with adjacencyMatrix
	 * @param maxEdges The maximum number of Edges in the graph, must be >= 1
	 * @param maxVertices The maximum number of Vertices in the graph, must be >= 2
	 * @param graphIsDirected True if the graph is Directed, False if it is Undirected
	 */
	public ImplGraph(int maxEdges, int maxVertices, boolean graphIsDirected) {
		if (maxEdges < 1 || maxVertices < 2) {
			System.out.println("There must be at least 1 edge and 2 vertices allowed, you have just authorized "
			+ maxEdges + " edges and " + maxVertices + " vertices.");
		} else {
			this.edges = new Edge[maxEdges];
			this.edgesCounter = 0;
			this.vertices = new Vertex[maxVertices];
			this.verticesCounter = 0;
			this.adjacencyMatrix = new boolean[maxVertices][maxVertices];
			this.graphIsDirected  = graphIsDirected;
			
			for (int i = 0; i < maxVertices; i++) {
				for (int j = 0; j < maxVertices; j++) {
					this.adjacencyMatrix[i][j] = false;
				}
			}
		}
		
	}
	
	@Override
	public Edge[] getEdges() {
		return this.edges;
	}

	@Override
	public Vertex[] getVertexs() {
		return this.vertices;
	}

	@Override
	public void setEdge(Edge edge) {
		if (this.edgesCounter >= this.edges.length) {
			System.out.println("You have reached the maximum amount of edges in the graph.");
		} else if (!vertexExist(edge.getVertexV1()) || !vertexExist(edge.getVertexV2())) {
			System.out.println("One or more of the edge's vertices is not in the graph.");
		} else if (edgeExist(edge)) {
			System.out.println("The edge is already in the graph.");
		} else if (this.graphIsDirected && edge.getClass() == UndirectedEdge.class) {
			System.out.println("You try to add an undirected edge to a directed graph.");
		} else if (!this.graphIsDirected && edge.getClass() == DirectedEdge.class) {
			System.out.println("You try to add a directed edge to an undirected graph.");
		} else {
			this.edges[this.edgesCounter] = edge;
			this.edgesCounter++;
			int vertex1Index = vertexPosition(edge.getVertexV1());
			int vertex2Index = vertexPosition(edge.getVertexV2());
			this.adjacencyMatrix[vertex2Index][vertex1Index] = true;
			if (!this.graphIsDirected) {
				this.adjacencyMatrix[vertex1Index][vertex2Index] = true;
			}
		}
	}

	@Override
	public void setVertex(Vertex vertex) {
		if (this.verticesCounter >= this.vertices.length) {
			System.out.println("You have reached the maximum amount of vertices in the graph.");
		} else if (vertexExist(vertex)) {
			System.out.println("The vertex is already in the graph.");
		} else {
			this.vertices[this.verticesCounter] = vertex;	
			this.verticesCounter++;
		}
		
	}
	
	/**
	 * Check if the vertex exist in the graph
	 * @param vertex The vertex to check.
	 * @return True if the vertex is in the graph, False else.
	 */
	private boolean vertexExist(Vertex vertex) {
		for (int i = 0; i < this.verticesCounter; i++) {
			if (this.vertices[i] == vertex) {
				return true;
			} 
		} 
		return false;
	}
	
	/**
	 * Find the position of a vertex in the array structure (vertices)
	 * @param vertex The vertex to get the position.
	 * @return Return the position of the vertex in vertices or return -1 if the vertex not exists.
	 */
	private int vertexPosition(Vertex vertex) {
		for (int i = 0; i < this.verticesCounter; i++) {
			if (this.vertices[i] == vertex) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * Check if the edge is in the array of edges in the graph.
	 * @param edge The edge to check.
	 * @return True if the edge is in the graph, False else.
	 */
	private boolean edgeExist(Edge edge) {
		for (int i = 0; i < this.edgesCounter; i++) {
			if (this.edges[i] == edge) {
				return true;
			} 
		} 
		return false;
	}

}
