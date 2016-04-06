package graph;

import graph.Vertex;
import graph.Edge;
/**
*	The Graph interface gather all others class in array Structure
*/
public interface Graph
{
	/**
	* Add the Vertex to the Vertex arrayList
	* @param Vertex
	*/
	public void setVertex(Vertex v);
	/**
	* Add the Edge to the Edge array
	* @param Edge
	*/
	public void setEdge(Edge e);
	/**
	* Returns the array of Vertex
	* @return Vertex
	*/
	public Vertex[] getVertexs();
	/**
	* Returns the array of Edge
	* @return Vertex
	*/
	public Edge[] getEdges();
}
