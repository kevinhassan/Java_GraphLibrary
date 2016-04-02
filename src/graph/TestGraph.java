package graph;
import MyExceptions.*;

public class TestGraph implements Graph
{
	private Vertex[] vertexs;
	private Edge[] edges;
	public void setVertex(Vertex v)
	{
		try{
			throw new MaximumSizeReachedOnVertices();
		}catch(MaximumSizeReachedOnVertices exception)
		{
			exception.toString();
		}
	}
	public void setEdge(Edge e)
	{ 
		try{
			throw new NotUndirectedEdge();
		}catch(NotUndirectedEdge exception1)
		{
			exception1.toString();
		}	
		try{
			throw new MaximumSizeReachedOnEdges();
		}catch(MaximumSizeReachedOnEdges exception2)
		{
			exception2.toString();
		}	
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
