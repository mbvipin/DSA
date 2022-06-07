package graphs;

import graphs.utils.GraphUtils;

import java.util.*;

public class ConnectedComponentsCount {

    public static void main(String[] args) {

        ConnectedComponentsCount connectedComponentsCount=new ConnectedComponentsCount();
        GraphUtils utils=new GraphUtils();
        List<Edge<Integer>> edges=new LinkedList<>();

        edges.add(new Edge<>(0,8));
        edges.add(new Edge<>(0,1));
        edges.add(new Edge<>(0,5));


        edges.add(new Edge<>(5,8));

        edges.add(new Edge<>(2,3));
        edges.add(new Edge<>(2,4));
        edges.add(new Edge<>(3,4));

        Graph<Integer> graph= utils.buildGraph(edges);

        System.out.println(connectedComponentsCount.countNumberOfConnectedComponents(graph));





    }

    private  int countNumberOfConnectedComponents(Graph<Integer> graph) {

        int count=0;

       Map<Integer,List<Integer>> adjMap= graph.getAdjacencyMap();

       Set<Integer> visited=new HashSet<>();

       for( Integer key : adjMap.keySet())
       {
           count+= doDepthFirstSearch(graph,key,visited);
       }

        return count;




    }

    private int doDepthFirstSearch (Graph<Integer> graph,Integer node, Set<Integer> visited)
    {
        if(visited.contains(node))
        {
            return 0;
        }

        visited.add(node);

        Stack<Integer> depthSearch=new Stack<>();

        depthSearch.push(node);

        while(!depthSearch.isEmpty())
        {
            Integer current=depthSearch.pop();

            List<Integer> neighbors=graph.getNeighbors(current);

            if(neighbors!=null && neighbors.size()>0)
            {
                neighbors.stream().forEach(neighbor->  doDepthFirstSearch(graph,neighbor,visited));
            }

        }

      return 1;
    }
}
