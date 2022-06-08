package graphs;

import graphs.utils.GraphUtils;

import java.util.*;

public class LargestConnectedComponentCount {

    public static void main(String[] args) {

        LargestConnectedComponentCount test=new LargestConnectedComponentCount();
        GraphUtils utils=new GraphUtils();
        List<Edge<Integer>> edges=new LinkedList<>();

        edges.add(new Edge<>(0,8));
        edges.add(new Edge<>(0,1));
        edges.add(new Edge<>(0,5));

        edges.add(new Edge<>(0,2));
        edges.add(new Edge<>(5,8));

        edges.add(new Edge<>(2,3));
        edges.add(new Edge<>(2,4));
        edges.add(new Edge<>(3,4));

        edges.add(new Edge<>(10,11));
        edges.add(new Edge<>(12,13));

        Graph<Integer> graph= utils.buildGraph(edges);

        System.out.println(test.getLargestConnectedComponentCount(graph));


    }

    private int getLargestConnectedComponentCount(Graph<Integer> graph) {

        int maxCount=0;

        Set<Integer> visited=new HashSet<>();

        Map<Integer,List<Integer>> adjMap=graph.getAdjacencyMap();

        for(Integer key: adjMap.keySet())
        {
            if(!visited.contains(key))
            {
                int count=getCountOfComponents(graph,key,visited);

                if(count > maxCount)
                {
                    maxCount=count;
                }
            }
        }


        return maxCount;


    }

    private int getCountOfComponents(Graph<Integer> graph, Integer key, Set<Integer> visited) {

        int count=0;

        Stack<Integer> input=new Stack<>();

        visited.add(key);

        input.push(key);

        while(!input.isEmpty())
        {
            Integer current=input.pop();

            count=count+1;

            for(Integer neighbor: graph.getNeighbors(current))
            {
                if(!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    input.push(neighbor);
                }

            }

        }

        return count;
    }
}
