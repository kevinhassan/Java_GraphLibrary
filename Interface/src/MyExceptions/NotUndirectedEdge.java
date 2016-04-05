package MyExceptions;
public class NotUndirectedEdge extends Exception 
{
    public String toString() {
        return "Vous essayez d'ajouter une arête qui est dirigée à un graphe qui ne l'est pas.";
    }
}
