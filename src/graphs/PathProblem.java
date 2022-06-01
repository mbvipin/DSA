package graphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PathProblem {

    public static void main(String[] args) {

        Graph<String> graph=new Graph<>(6);

        graph.addEdge("a","b");
        graph.addEdge("a","c");

        graph.addEdge("b","d");
        graph.addEdge("c","e");
        graph.addEdge("d","f");

        System.out.println(hasPath(graph,"a","f"));
        System.out.println(hasPath(graph,"b","e"));

        System.out.println(hasPathRecursive(graph,"a","f"));
        System.out.println(hasPathRecursive(graph,"b","e"));
    }

    private static boolean hasPathRecursive(Graph<String> graph, String source, String dest) {

        if( source==dest)
        {
            return true;
        }

        List<String> neighbors=graph.getNeighbors(source);

        if(neighbors!=null && neighbors.size() >0)
        {
            for( String neighbor: neighbors)
            {
                if(hasPathRecursive(graph,neighbor,dest))
                {
                    return true;
                }
            }
        }

        return false;

    }

    private static boolean hasPath(Graph<String> graph, String source, String dest) {

        Queue<String> input=new LinkedList<>();

        input.add(source);

        while(!input.isEmpty())
        {
            String current= input.remove();

            if(current==dest)
            {
                return true;
            }

            List<String> neighbors=graph.getNeighbors(current);

            if(neighbors!=null && neighbors.size() >0)
            {
                for( String neighbor: neighbors)
                {
                    input.add(neighbor);
                }
            }


        }



        return false;
    }
}
