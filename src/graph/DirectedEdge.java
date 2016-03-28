package graph;
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
	/**
	* Returns the vertex beginning of the DirectedEdge
	* @return Vertex 
	*/
	public Vertex getVertexBegin();
	/**
	* Returns the vertex end of the DirectedEdge
	* @return Vertex 
	*/
	public Vertex getVertexEnd();
	/**
	* Set the vertex beginning of the DirectedEdge
	* Change v1 paramater for change beginning
	* @param v1
	*/
	public void setVertexBegin(Vertex v1);
	/**
	* Set the vertex end of the DirectedEdge
	* Change v2 paramater for change end
	* @param v2
	*/	
	public void setVertexEnd(Vertex v2);
}