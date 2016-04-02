package graph;

public class TestGraph implements Graph
{
	private Vertex[] vertexs;
	private Edge[] edges;
	public void setVertex(Vertex v) throws MaximumSizeReachedOnVertices
	{
	}
	public void setEdge(Edge e) throws NotUndirectedEdge, MaximumSizeReachedOnEdges
	{ 
	}
	public Vertex[] getVertexs()
	{
		return this.vertexs;
	}
	public Edge[] getEdges()
	{
		return this.edges;
	}

	public class MaximumSizeReachedOnEdges extends Exception 
	{
    	public String toString() {
        	return "Vous avez atteint le nombre maximum d'arêtes sur ce graphe.";
    	}
    }
    public class MaximumSizeReachedOnVertices extends Exception 
    {
    	public String toString() {
        	return "Vous avez atteint le nombre maximum de sommets sur ce graphe.";
    	}
	}
	public class MinimumSizeOfGraphNotRespected extends Exception 
	{

	    private int maxEdges;
	    private int maxVertices;

	    public MinimumSizeOfGraphNotRespected(int maxEdges, int maxVertices) 
	    {
	        this.maxEdges = maxEdges;
	        this.maxVertices = maxVertices;
	    }

	    public String toString() 
	    {
	        return "Il est necessaire d'avoir au moins 1 arête et 2 sommets, alors que vous n'avez autorisez que "
	                + this.maxEdges + " arêtes et " + this.maxVertices + " sommets.";
	    }
	}
	public class NotUndirectedEdge extends Exception 
	{
	    public String toString() {
	        return "Vous essayez d'ajouter une arête qui est dirigée à un graphe qui ne l'est pas.";
	    }
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
