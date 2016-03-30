package graph;
/**
* The abstract class Edge composed of 2 Vertex
* @param Vertex v1 
* @param Vertex v2 
*/
public abstract class Edge
{
	private Vertex v1;
	private Vertex v2;
	/**
	* Returns the vertex v1 of Edge'specific class
	* @return Vertex
	*/
	public Vertex getVertexV1();
	/**
	* Returns the vertex v2 of Edge'specific class
	* @return Vertex
	*/
	public Vertex getVertexV2();
	/**
	* Set the vertex v1 of Edge'specific class
	* @param Vertex 
	*/
	public void setVertexV1(Vertex v1);
	/**
	* Set the vertex v2 of Edge'specific class
	* @param Vertex 
	*/	
	public void setVertexV2(Vertex v2);

}
