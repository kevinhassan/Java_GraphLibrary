package graph;

public class ImplementGraph implements Graph
{

	private Vertex[] sommet;
	private Edge[][] matIncid;

	public void addVertex (Vertex vertex)
	{
		boolean flag = false;
		int x = 0;
		if(sommet != null){
			/*while(x<sommet.length && sommet.length != 0)
			{
				if(sommet[x].equals(vertex))
				{
					flag = true;
				}
				x = x + 1;
			}//On cherche le vertex s'il est présent*/
			if(flag == false)
			{
				Vertex[] temp1 = new Vertex[sommet.length+1];

				for(int i = 0; i<sommet.length;i++)
				{
					temp1[i] = sommet[i];//On augmente la taille du tableau
				}
				temp1[temp1.length-1] = vertex;//On ajoute l'éléments
				sommet = temp1;//On modifie l'attribut
				
				Edge[][] temp2 = new Edge[sommet.length+1][sommet.length+1];//A chaque ajout de point notre matrice augmente le nbr de colonne et ligne
				matIncid = temp2;
			}
		}
		else
		{
			Vertex[] v = new Vertex[1];
			v[0] = vertex;
			sommet = v;
			Edge[][] temp3 = new Edge[1][1];
			matIncid = temp3;
		}
	}

	public void removeVertex (Vertex vertex)
	{
		boolean flag = false;
		int x = 0;
		while((x<sommet.length) && (sommet.length != 0) && !sommet[x].equals(vertex))
		{
			x = x + 1;
		}
		//On trouve le vertex
		if(x!=sommet.length)
		{
			for(int i = x; i<sommet.length;i++)
			{
				sommet[i]=sommet[i+1];
			}
			Vertex[] temp = new Vertex[sommet.length-1];
			for(int i = 0; i<temp.length;i++)
			{
				temp[i]=sommet[i];
			}
			sommet = temp;
		}
		//Supprimer une ligne et une colonne dans la matrice
	}
	
	public void addDirectedEdge(Vertex source, Vertex destination)
	{

		DirectedEdge e = new DirectedEdge(source,destination);
		int posV1 = 0;
		int posV2 = 0;

		int x = 0;
		//On récupére les positions des vertex correspondants
		while (x<sommet.length&&sommet.length!= 0) 
		{
			if (sommet[x].equals(source))
			{
				posV1 = x;
			}
			else if (sommet[x].equals(destination))
			{
				posV2 = x;
			}
			x = x + 1;
		}
		//On a les positions 
		if (matIncid[posV1][posV2]==null)
		{
			matIncid[posV1][posV2] = e;
			matIncid[posV2][posV1] = e;
		}
		else
		{
			System.out.println("Impossible to add DirectedEdge");
		}
	}
	
	
	
	public void removeDirectedEdge(Vertex source, Vertex destination)
	{
		DirectedEdge e = new DirectedEdge(source,destination);
		int posV1 = 0;
		int posV2 = 0;
		boolean flag1 = false;
		boolean flag2 = false;

		int x = 0;
		//On récupére les positions des vertex correspondants
		while ((x<sommet.length) && (sommet.length != 0) && (!flag1) && (!flag2))
		{
			if (sommet[x].equals(source))
			{
				flag1 = true;
				posV1 = x;
			}
			else if (sommet[x].equals(destination))
			{
				flag2 = true;
				posV2 = x;
			}
			x = x + 1;			
		}
		//On a les positions on met null pour supprimer le edge
		if (flag1 == true && flag2 == true && matIncid[posV1][posV2]!=null)
		{
			matIncid[posV1][posV2] = null;
			matIncid[posV2][posV1] = null;
		}
		else
		{
			System.out.println("Impossible to remove DirectedEdge");
		}
	}	
	
	public void addUndirectedEdge(Vertex source, Vertex destination)
	{

		UndirectedEdge e = new UndirectedEdge(source,destination);
		int posV1 = 0;
		int posV2 = 0;

		int x = 0;
		//On récupére les positions des vertex correspondants
		while ((x<sommet.length) && (sommet.length != 0))
		{
			if (sommet[x].equals(source))
			{
				posV1 = x;
			}
			else if (sommet[x].equals(destination))
			{
				posV2 = x;
			}
			x = x + 1;			
		}
		//On a les positions 
		if (matIncid[posV1][posV2]==null)
		{
			matIncid[posV1][posV2] = e;
			matIncid[posV2][posV1] = e;
		}
		else
		{
			System.out.println("Impossible to add DirectedEdge");
		}
	}
	
	
	
	public void RemoveUndirectedEdge(Vertex source, Vertex destination)
	{
		UndirectedEdge e = new UndirectedEdge(source,destination);
		int posV1 = 0;
		int posV2 = 0;
		boolean flag1 = false;
		boolean flag2 = false;

		int x = 0;
		//On récupére les positions des vertex correspondants
		while ((x<sommet.length) && (sommet.length != 0) && (!flag1) && (!flag2))
		{
			if (sommet[x].equals(source))
			{
				flag1 = true;
				posV1 = x;
			}
			else if (sommet[x].equals(destination))
			{
				flag2 = true;
				posV2 = x;
			}
			x = x + 1;			
		}
		//On a les positions on met null pour supprimer le edge
		if (flag1 == true && flag2 == true && matIncid[posV1][posV2]!=null)
		{
			matIncid[posV1][posV2] = null;
			matIncid[posV2][posV1] = null;
		}
		else
		{
			System.out.println("Impossible to remove UndirectedEdge");
		}
	}	
	public Vertex[] getNeighbours(Vertex source)
	{
		int posV = 0;
		int x = 0;
		int y =0;
		boolean flag = false;
		Vertex[] neighbours = new Vertex[getDegree(source)];
		//S'il est relié à un point => avoir un voisin => degré >0
		if(getDegree(source)>0)
		{
			while ((x<sommet.length) && (sommet.length != 0) && (!flag))
			{
				if (sommet[x].equals(source))
				{
					flag = true;
					posV = x;
				}	
				x = x + 1;					
			}
			//On a trouvé l'élément
			if (x!=sommet.length)
			{
				//On parcourt 
				for(int i=0;i<sommet.length;i++)
				{
					//Si on trouve un edge => qu'il a un sommet relié à lui 
					if(matIncid[posV][i] !=null)
					{
						neighbours[y] = sommet[i];
						y++;
					}
				}
			}
			else
			{
				System.out.println("Vertex unknown!");
			}
		}
		else
		{
			System.out.println("Vertex doesn't have neighbours");
		}
		return neighbours;
	}
	public int getDegree(Vertex source)
	{
		int degree = 0;
		int x = 0;
		boolean flag = false;

		while (x<sommet.length && !sommet[x].equals(source))
		{
			x = x + 1;					
		}

		if(x == sommet.length){System.out.println("Vertex inconnu");}	
		
		else if(sommet[x].equals(source))	
		{
			for(int i=0;i<sommet.length;i++)
			{
				//Si on trouve un edge => qu'il a un sommet relié à lui 
				if(matIncid[x][i] != null)
				{
					degree ++;
				}
			}
		}
		return degree;
	}
}
