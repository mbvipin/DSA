package graphs;

public class Edge<E> {

    private E start;

    private E end;

    public E getStart() {
        return start;
    }

    public void setStart(E start) {
        this.start = start;
    }

    public E getEnd() {
        return end;
    }

    public void setEnd(E end) {
        this.end = end;
    }

    public Edge(E start, E end)
    {
        this.start=start;
        this.end=end;
    }


}
