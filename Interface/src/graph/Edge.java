package graph;
import graph.Vertex;
/**
* The abstract class Edge composed of 2 Vertex
* @param Vertex v1 
* @param Vertex v2 
*/
public abstract class Edge
{
	protected Vertex v1;
	protected Vertex v2;

	public Vertex getVertexV1()
	{
		return this.v1;
	}
	public Vertex getVertexV2()
	{
		return this.v2;
	}
	public void setVertexV1(Vertex v1)
	{
		this.v1 = v1;
	}
	public void setVertexV2(Vertex v2)
	{
		this.v2 = v2;
	}
}
