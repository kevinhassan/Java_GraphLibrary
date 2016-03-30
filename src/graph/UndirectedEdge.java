package graph;
/**
* The class UnDirectedEdge represents an Edge with non specific direction 
* The Edge is composed of 2 Vertex
* @param Vertex v1 
* @param Vertex v2 
* @return UnDirectedEdge
*/
public class UndirectedEdge extends Edge
{
	public UndirectedEdge(Vertex v1,Vertex v2)
	{
		this.v1 = v1;
		this.v2 = v2;
	}
}
