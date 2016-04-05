package MyExceptions;

public class MaximumSizeReachedOnVertices extends Exception 
{
	public String toString() {
    	return "Vous avez atteint le nombre maximum de sommets sur ce graphe.";
	}
}
