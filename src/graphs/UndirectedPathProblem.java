package graphs;

import graphs.utils.GraphUtils;

import java.util.*;



public class UndirectedPathProblem {

    public static void main(String[] args) {



        GraphUtils utils=new GraphUtils();
        List<Edge<String>> edges=new LinkedList<>();

        edges.add(new Edge<>("i","j"));
        edges.add(new Edge<>("k","i"));
        edges.add(new Edge<>("m","k"));
        edges.add(new Edge<>("k","l"));



       Graph<String> graph= utils.buildGraph(edges);

       Set<String> visited=new HashSet<>();

        System.out.println(hasPathRecursiveUnDirected(graph,"i","l",visited));

        visited=new HashSet<>();
       System.out.println(hasPathRecursiveUnDirected(graph,"k","m",visited));

        visited=new HashSet<>();
        System.out.println(hasPathRecursiveUnDirected(graph,"i","n",visited));

    }

    private static boolean hasPathRecursiveUnDirected(Graph<String> graph, String source, String dest,Set<String> visited) {

        if(source==dest)
        {
            return true;
        }

        if(visited.contains(source))
        {
            return false;
        }

        visited.add(source);

        List<String> neighbors=graph.getNeighbors(source);

        if(neighbors!=null && neighbors.size() >0)
        {
            for(String neighbor:neighbors)
            {
                if(hasPathRecursiveUnDirected(graph,neighbor,dest,visited))
                {
                    return true;
                }
            }
        }



        return false;
    }


}
