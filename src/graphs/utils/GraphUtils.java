package graphs.utils;

import graphs.Edge;
import graphs.Graph;

import java.util.ArrayList;
import java.util.List;

public class GraphUtils<E> {

    public   Graph<E> buildGraph(List<Edge<E>> edges) {

        Graph<E> graph=new Graph(edges.size());

        edges.forEach(edge-> graph.addBidirectionalEdge( edge.getStart(),  edge.getEnd()));

        return graph;
    }

    public static List<List<String>>  createGrid() {


        List<List<String>> grid=new ArrayList<>();

        List<String> firstRow=new ArrayList<>();

        firstRow.add("W");
        firstRow.add("L");
        firstRow.add("W");
        firstRow.add("W");
        firstRow.add("W");

        grid.add(firstRow);

        List<String> secondRow=new ArrayList<>();

        secondRow.add("W");
        secondRow.add("L");
        secondRow.add("W");
        secondRow.add("W");
        secondRow.add("W");

        grid.add(secondRow);

        List<String> thirdRow=new ArrayList<>();

        thirdRow.add("W");
        thirdRow.add("W");
        thirdRow.add("W");
        thirdRow.add("L");
        thirdRow.add("W");

        grid.add(thirdRow);

        List<String> fourthRow=new ArrayList<>();

        fourthRow.add("W");
        fourthRow.add("W");
        fourthRow.add("L");
        fourthRow.add("L");
        fourthRow.add("W");

        grid.add(fourthRow);

        List<String> fifthRow=new ArrayList<>();

        fifthRow.add("L");
        fifthRow.add("W");
        fifthRow.add("W");
        fifthRow.add("L");
        fifthRow.add("L");

        grid.add(fifthRow);

        List<String> sixthRow=new ArrayList<>();

        sixthRow.add("L");
        sixthRow.add("L");
        sixthRow.add("W");
        sixthRow.add("W");
        sixthRow.add("W");

        grid.add(sixthRow);

        return grid;
    }
}
