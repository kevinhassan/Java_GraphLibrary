package graph;

public class TestGraph implements Graph
{
	Vertex[] vertexs;
	Edge[] edges;
	public void setVertex(Vertex v)
	{

	}
	public void setEdge(Edge e)
	{

	}
	public Vertex[] getVertexs()
	{
		return this.vertexs;
	}
	public Edge[] getEdges()
	{
		return this.edges;
	}

	public static void main(String[] args)
	{
		Vertex v1 = new Vertex("sommet 1");
		Vertex v2 = new Vertex("sommet 2");
		DirectedEdge e1 = new DirectedEdge(v1,v2);
		Graph g = null;
		g.setVertex(v1);
		g.setVertex(v2);
		g.setEdge(e1);
	}
}
