package graph;

import java.util.ArrayList;
/**
*	The Graph interface gather all others class in ArrayList Structure
*	@param vertexs ArrayList composed of Vertex
*	@param edges ArrayList composed of Edge
*/
public interface Graph
{
	ArrayList<Vertex> vertexs = new ArrayList();
	ArrayList<Edge> edges = new ArrayList();
	/**
	* Add the Vertex to the Vertex arrayList
	* @param Vertex 
	*/
	public void setVertex(Vertex v);
	/**
	* Add the Edge to the Edge arrayList
	* @param Edge 
	*/
	public void setEdge(Edge e);
	/**
	* Returns the Vertex arrayList
	* @return Vertex 
	*/
	public Vertex getVertexs();
	/**
	* Returns the Edge arrayList
	* @return Vertex 
	*/
	public Edge getEdges();
}
