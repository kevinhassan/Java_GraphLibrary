package graph;

import java.util.ArrayList;

public interface Graph
{
	ArrayList<Vertext> vertexs = new ArrayList();
	ArrayList<Edge> edges = new ArrayList();

	public void setVertex(Vertex v);
	public void setEdge(Edge e);
	public Vertex getVertexs();
	public Edge getEdges();
}
