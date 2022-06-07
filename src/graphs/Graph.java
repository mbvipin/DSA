package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.util.Map;

public class Graph<E> {

    private int numberOfNodes;

    private Map<E, List<E>> adjacencyMap;

    public Graph(int numberOfNodes)
    {
        this.numberOfNodes=numberOfNodes;
        adjacencyMap=new HashMap<>();

    }

    public List<E> getNeighbors(E source)
    {
        return adjacencyMap.get(source);
    }



    public void addEdge(E source,E dest)
    {
        if(adjacencyMap.get(source)== null)
        {
            adjacencyMap.put(source,new ArrayList<>());
        }
        adjacencyMap.get(source).add(dest);
    }

    public Map<E, List<E>> getAdjacencyMap() {
        return adjacencyMap;
    }

    public void setAdjacencyMap(Map<E, List<E>> adjacencyMap) {
        this.adjacencyMap = adjacencyMap;
    }

    public void addBidirectionalEdge(E source, E dest)
    {

        addEdge(source,dest);
        addEdge(dest,source);

    }



}
