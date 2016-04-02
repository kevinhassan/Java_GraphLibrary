package MyExceptions;
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
