package graphs;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstTraversal {

    public static void main(String[] args) {

        Graph<String> graph=new Graph<>(6);

        graph.addEdge("a","b");
        graph.addEdge("a","c");

        graph.addEdge("b","d");
        graph.addEdge("c","e");
        graph.addEdge("d","f");

        doBreadthTraversal(graph,"a");


    }

    private static void doBreadthTraversal(Graph<String> graph, String source) {

        Queue<String> queue=new LinkedList<>();

        queue.add(source);

        while(!queue.isEmpty())
        {
            String current=queue.remove();

            System.out.println(current);

            List<String> neighbors=graph.getNeighbors(current);

            if(neighbors!=null && neighbors.size() >0)
            {
                for(String neighbor: neighbors)
                {
                    queue.add(neighbor);
                }
            }


        }
    }
}
