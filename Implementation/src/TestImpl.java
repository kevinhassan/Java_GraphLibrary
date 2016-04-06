package graph;

public class TestImpl 
{
	public void main(String[] args)
	{
		ImplementGraph g = new ImplementGraph();
		Vertex v1 = new Vertex();
		Vertex v2 = new Vertex();
		Vertex v3 = new Vertex();
		Vertex v4 = new Vertex();
		g.addVertex(v1);
		g.addVertex(v2);
		g.addVertex(v3);
		g.addVertex(v4);
		UndirectedEdge dirE = new UndirectedEdge(v1,v2);
		DirectedEdge undirE = new DirectedEdge(v3,v4);
		g.addDirectedEdge(v1,v2);
		g.addUndirectedEdge(v3,v4);
		Vertex[] v = g.getNeighbours(v1); 
	}
}