package graph;

public class DirectedEdge extends Edge
{
	public DirectedEdge(Vertex beginVertex,Vertex endVertex)
	{
		this.v1 = beginVertex;
		this.v2 = endVertex;
	}

	public Vertex getVertexBegin()
	{
		return this.v1;
	}
	public Vertex getVertexEnd()
	{
		return this.v2;
	}
}