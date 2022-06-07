package graphs.utils;

import graphs.Edge;
import graphs.Graph;

import java.util.List;

public class GraphUtils<E> {

    public   Graph<E> buildGraph(List<Edge<E>> edges) {

        Graph<E> graph=new Graph(edges.size());

        edges.forEach(edge-> graph.addBidirectionalEdge( edge.getStart(),  edge.getEnd()));

        return graph;
    }
}
