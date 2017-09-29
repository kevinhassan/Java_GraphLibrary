package graph;

public class TestGraph {

	public static void main(String[] args) {
		Vertex v1 = new Vertex("sommet 1");
		Vertex v2 = new Vertex("sommet 2");
		DirectedEdge e1 = new DirectedEdge(v1,v2);
		Graph g = new ImplGraph(5, 5, true);
		g.setVertex(v1);
		g.setVertex(v2);
		g.setEdge(e1);
	}
}
