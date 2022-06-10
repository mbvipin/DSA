package graphs;

import graphs.utils.GraphUtils;

import java.util.*;

public class ShortestPath {

    public static void main(String[] args) {

        GraphUtils utils=new GraphUtils();
        List<Edge<String>> edges=new LinkedList<>();

        Set<String> visited=new HashSet<>();

        edges.add(new Edge<>("W","X"));
        edges.add(new Edge<>("X","Y"));
        edges.add(new Edge<>("Z","Y"));
        edges.add(new Edge<>("Z","V"));
        edges.add(new Edge<>("W","V"));

        Graph<String> graph= utils.buildGraph(edges);

        System.out.println(shortestPathLength(graph,"W","Z",visited));
    }

    private static int shortestPathLength(Graph<String> graph, String source, String dest, Set<String> visited) {

        Queue<String> input=new LinkedList<>();

        Map<String,Integer> distanceMap=new HashMap<>();
        distanceMap.put(source,0);

        visited.add(source);

        input.add(source);

        while(!input.isEmpty())
        {
            String current=input.remove();

            int currentDistance=distanceMap.get(current);

            List<String> neighbors=graph.getNeighbors(current);

            if( neighbors!=null && neighbors.size() >0)
            {
                for(String neighbor: neighbors)
                {
                    if( !visited.contains(neighbor)) {

                        visited.add(neighbor);
                        input.add(neighbor);

                    }

                    if(neighbor== dest)
                    {
                        return currentDistance+1;
                    }

                    distanceMap.put(neighbor,currentDistance+1);


                }
            }

        }


  return -1;


    }
}
