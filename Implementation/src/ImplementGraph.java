package graph;

public class ImplementGraph implements graph
{

	private Vertex[] sommet;
	private Edge[][] arete

	public addVertex (Vertex vertex)
	{
		boolean flag = false;
		int x = 0;
		while((x<this.sommet.length()) && (this.sommet.length() != 0))
		{
				if(this.sommet[x].equals(vertex))
					{flag = true;}
				x = x + 1;
		}
		if(flag == false)
		{
			Vertex[this.sommet.length()+1] temp = this.sommet;
			temp[temp.length()-1] = vertex;
			this.sommet = temp;
		}
	}

	public removeVertex (Vertex vertex)
	{
		boolean flag = false;
		int x = 0;
		while((x<this.sommet.length()) && (this.sommet.length() != 0) && !this.sommet[x].equals(vertex))
		{
				x = x + 1;
		}
		if(x!=this.sommet.length())
		{
			for(int i = x; i<this.sommet.length();i++)
			{
				this.sommet[i]=this.sommet[i+1];
			}
			Vertex[this.sommet.length()-1] temp;
			for(i = 0; i<temp.length();i++)
			{
				temp[i]=this.sommet[i];
			}
			this.sommet = temp;
		}
	}
	
	public void addDirectedEdge(Vertex source, Vertex destination)
	{
		addVertex(source);
		addVertex(destination);
		
		boolean flag = false;
		int x = 0;
		int y = 0;
		while((x<this.sommet.length()) && (this.sommet.length() != 0) && this.sommet[x].equals(source))
		{
			x = x + 1;
		}
		while((y<this.sommet.length()) && (this.sommet.length() != 0) && this.sommet[y].equals(destination))
		{
			y = y + 1;
		}
			Edge[x][y] = 1;
			Edge[y][x] = 1;
		}
	}
	
	
	
	public void removeDirectedEdge(Vertex source, Vertex destination)
	{
		Edge edge1 = new DirectedEdge(source, destination);
		boolean flag = false;
		int x = 0;
		while((x<this.arete.length()) && (this.arete.length() != 0) && !this.arete[x].equals(edge1))
		{
				x = x + 1;
		}
		if(x!=this.arete.length())
		{
			for(int i = x; i<this.arete.length();i++)
			{
				this.arete[i]=this.arete[i+1];
			}
			Edge[this.arete.length()-1] temp;
			for(i = 0; i<temp.length();i++)
			{
				temp[i]=this.arete[i];
			}
			this.arete = temp;
		}
	}
	
	
	public void addDirectedEdge(Vertex source, Vertex destination)
	{
		addVertex(source);
		addVertex(destination);
		
		boolean flag = false;
		int x = 0;
		int y = 0;
		while((x<this.sommet.length()) && (this.sommet.length() != 0) && this.sommet[x].equals(source))
		{
			x = x + 1;
		}
		while((y<this.sommet.length()) && (this.sommet.length() != 0) && this.sommet[y].equals(destination))
		{
			y = y + 1;
		}
			Edge[x][y] = 1;
			Edge[y][x] = 1;
		}
	}
	
	
	
	public void RemoveUndirectedEdge(Vertex source, Vertex destination)
	{
		Edge edge1 = new UndirectedEdge(source, destination);
		Edge edge2 = new UndirectedEdge(source, destination);
		boolean flag = false;
		int x = 0;
		while(x<this.arete.length() && (this.arete.length() != 0) && !this.arete[x].equals(edge1) && !this.arete[x].equals(edge2))
		{
				x = x + 1;
		}
		if(x!=this.arete.length())
		{
			for(int i = x; i<this.arete.length();i++)
			{
				this.arete[i]=this.arete[i+1];
			}
			Edge[this.arete.length()-1] temp;
			for(i = 0; i<temp.length();i++)
			{
				temp[i]=this.arete[i];
			}
			this.arete = temp;
		}
	}
	
	
	
}
