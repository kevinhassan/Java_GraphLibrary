package graph;
import graph.Edge;
/**
* The class DirectedEdge represents an Edge with a specific direction 
* The Edge is composed of 2 Vertex
* One Vertex for the beginning and the other one for the end
* @param Vertex v1 for the beginning
* @param Vertex v2 for the end
* @return DirectedEdge
*/
public class DirectedEdge extends Edge
{
	/**
	* Constructor 
	* @param beginVertex the DirectedEdge's beginning
	* @param endVertex the DirectedEdge's end
	*/
	public DirectedEdge(Vertex beginVertex,Vertex endVertex)
	{
		this.v1 = beginVertex;
		this.v2 = endVertex;
	}
}
