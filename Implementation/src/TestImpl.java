package graph;

public class TestImpl 
{
	public static void main(String[] args)
	{
		Graph g = new ImplementGraph();
		Vertex v1 = new Vertex();
		Vertex v2 = new Vertex();
		Vertex v3 = new Vertex();
		Vertex v4 = new Vertex();
		g.addVertex(v1);
		System.out.println("I add v1 to graph");
		g.addVertex(v2);
		System.out.println("I add v2 to graph");
		g.addVertex(v3);
		System.out.println("I add v3 to graph");
		g.addVertex(v4);
		System.out.println("I add v4 to graph");
		UndirectedEdge undirE = new UndirectedEdge(v1,v2);
		System.out.println("I create undirected edge between v1 and v2");		
		DirectedEdge dirE = new DirectedEdge(v1,v4);
		System.out.println("I create directed edge between v1 and v4");		
		g.addDirectedEdge(v1,v2);
		System.out.println("I add undirected edge to graph");		
		g.addUndirectedEdge(v1,v4);
		System.out.println("I add directed edge to graph");		
		Vertex[] v = g.getNeighbours(v1); 
		System.out.println("I have " + v.length + " neighbours");
	}
}