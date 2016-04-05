package graph;

public class ImplementGraph implements graph
{

	private Vertex[] sommet;
	private Edge[] arete

	public addVertex (Vertex vertex)
	{
		boolean flag = false;
		int x = 0;
		while(x<this.sommet.length() && this.sommet.length() != 0)
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

	public remove (Vertex vertex)
	{
		boolean flag = false;
		int x = 0;
		while(x<this.sommet.length() && this.sommet.length() != 0 && !this.sommet[x].equals(vertex))
		{
				x = x + 1;
		}
		if(x==this.sommet.length())
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
}
