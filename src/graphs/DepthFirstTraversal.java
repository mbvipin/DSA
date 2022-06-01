package graphs;

import java.util.List;
import java.util.Stack;

public class DepthFirstTraversal {

    public static void main(String[] args) {

        Graph<String> graph=new Graph<>(6);

        graph.addEdge("a","b");
        graph.addEdge("a","c");

        graph.addEdge("b","d");
        graph.addEdge("c","e");
        graph.addEdge("d","f");

        doDepthTraversal(graph,"a");




    }

    private static void doDepthTraversal(Graph<String> graph, String source) {

        Stack<String> stack=new Stack<>();

        stack.push(source);

        while(!stack.isEmpty())
        {
            String current= stack.pop();
            System.out.println(current);

            List<String> neighbors=graph.getNeighbors(current);

            if(neighbors!=null && neighbors.size() >0) {
                for (String neighbor : neighbors) {
                    stack.push(neighbor);
                }

            }


        }
    }
}
