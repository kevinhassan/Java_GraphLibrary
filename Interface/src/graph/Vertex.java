package graph;
/**
* The class Vertex is constitued of a name for the identification
* @param String name
* @return Vertex
*/
public class Vertex
{
	private String name;
	/**
	* Constructor of Vertex class
	* @param name 
	*/
	public Vertex(String name)
	{
		this.name = name;
	}
	/**
	* Get the name of Vertex object
	* @return String 
	*/
	public String getName()
	{
		return this.name;
	}
	/**
	* Set a name to Vertex object
	* @param name 
	*/
	public void setName(String name)
	{
		this.name = name;
	}
}
