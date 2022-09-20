package linkedlist;

public class DoublyLinkedList {

  private DoublyLinkedNode head;

    private DoublyLinkedNode tail;

    private int size;

    public DoublyLinkedList(DoublyLinkedNode node)
    {
        this.head=node;
    }

    public DoublyLinkedList() {

    }

    public boolean removeAtIndex(int index)
    {
        if(index<0 && index > this.size )
        {
            throw new RuntimeException("Invalid Index");
        }

        if( index <=this.size/2)
        {
            DoublyLinkedNode node= this.head;

            for(int i=0; i<=size/2; i++)
            {

                if(i==index)
                {
                    remove(node);
                    return true;
                }

                node=node.getNext();

            }

        }

        else
        {
            DoublyLinkedNode node= this.tail;

            for(int j= (size/2)+1; j< size-1 ; j++)
            {
                if( j== index)
                {
                    remove(node);
                    return true;
                }

                node =node.getPrev();

            }
        }

        return false;

    }

    public int removeLast()
    {
        if(isEmpty())
        {
            throw new RuntimeException("Empty List");
        }

        size--;

        DoublyLinkedNode removedNode=this.tail;

        if(isEmpty())
        {
            this.head=null;
            this.tail=null;
        }

        else {
            this.tail = this.tail.getPrev();
            this.tail.setNext(null);
        }

        return removedNode.getData();


    }

    public int removeFirst()
    {
        if(isEmpty())
        {
            throw new RuntimeException("Empty List");
        }

        size--;

        DoublyLinkedNode removedNode=this.head;

        if(isEmpty())
        {
            this.head=null;
            this.tail=null;
        }

        else {
            this.head = this.head.getNext();
            this.head.setPrev(null);
        }

        return removedNode.getData();


    }

    public int peekFirst()
    {
        if(isEmpty())
        {
            throw new RuntimeException("List is Empty");
        }
        else
        {
            return this.head.getData();
        }
    }


    public int peekLast()
    {
        if(isEmpty())
        {
            throw new RuntimeException("List is Empty");
        }
        else
        {
            return this.tail.getData();
        }
    }

    public boolean isEmpty()
    {
        return this.size ==0;
    }

    public boolean remove (DoublyLinkedNode node)
    {
        if(node==null)
        {
            throw new RuntimeException("Invalid input");
        }

        if( node.getPrev()==null) removeFirst();
        if(node.getNext()==null) removeLast();

        return remove(node.getData());





    }


    public boolean remove (int element)
    {
        if(this.head==null)
        {
            return false;
        }


        if(head.getData()==element)
        {
            DoublyLinkedNode newHead=this.head.getNext();
            newHead.setPrev(null);
            this.head=newHead;
            size--;
            return true;
        }

        DoublyLinkedNode current=this.head;

        while(current!=null)
        {
            if(current.getData()==element)
            {
                current.getPrev().setNext(current.getNext());
                current.getNext().setPrev(current.getPrev());
                size--;
                return true;
            }

            current=current.getNext();
        }



  return false;

    }

    public void addLast(int element)
    {
        DoublyLinkedNode newNode=new DoublyLinkedNode();
        newNode.setData(element);
        newNode.setPrev(this.tail);
        this.tail.setNext(newNode);
        this.tail=newNode;

        size++;

    }

    public void addFirst(int element)
    {
        DoublyLinkedNode newNode=new DoublyLinkedNode();
        newNode.setData(element);

        if( isEmpty()) {
            this.head = newNode;
            this.tail = newNode;
        }

        else {
            newNode.setNext(this.head);
            this.head.setPrev(newNode);
        }

        this.head=newNode;

        size++;

    }

    public void add(int element)
    {
        DoublyLinkedNode newNode=new DoublyLinkedNode();
        newNode.setData(element);

        if(head==null)
        {
            this.head=newNode;
            this.tail=newNode;
        }

        else
        {

            addLast(element);


        }

        size++;

    }

    public DoublyLinkedNode findNodeAtIndex(int index)
    {
        DoublyLinkedNode current=this.head;
        int pointer=0;



        while(current.getNext()!=null)
        {
            current=current.getNext();
            pointer=pointer+1;
            if(pointer==index)
            {
                return current;
            }
        }

        return null;
    }


    public void addAtIndex(int index,int data) {
        if (index < 0) {
            System.out.println(" Index out of bounds");
        }

        // If its the first index, add can be used to append to the start
        if (index == 0) {
            this.add(data);
        } else {
            DoublyLinkedNode newNode = new DoublyLinkedNode();
            newNode.setData(data);
            // linkedlist.Node 1--> linkedlist.Node 2--> linkedlist.Node 2.1-->linkedlist.Node 3--> linkedlist.Node 4
            // Find node at index-1

            DoublyLinkedNode node = this.findNodeAtIndex(index - 1);

            if (node == null) {
                System.out.println("Operation Can't be performed at this time");
            } else {
                // Store its next to a temp variable
                DoublyLinkedNode temp = node.getNext();

                // Point its next to the new node
                node.setNext(newNode);

                // Point next of new node to temp variable
                newNode.setNext(temp);
                newNode.setPrev(node);

                temp.setPrev(newNode);
            }


        }
    }



    @Override
    public String toString() {

        StringBuilder linkedList=new StringBuilder();

        DoublyLinkedNode current=this.head;

        while(current!=null)
        {
            if(current.getData()== this.head.getData())
            {
                linkedList.append("Head :"+ current.getData());
                if(current.getNext()!=null) {
                    linkedList.append("{Next: " + current.getNext().getData() + "}");
                }
            }

            else if(current.getNext()!= null)
            {
                linkedList.append(" -> "+current.getData());
                linkedList.append("{Previous: "+ current.getPrev().getData()+"}");
                linkedList.append("{Next: "+ current.getNext().getData()+"}");
            }
            else
            {
                linkedList.append("->Tail :"+current.getData());
                linkedList.append("{Previous: "+ current.getPrev().getData()+"}");
            }

            current=current.getNext();

        }


        return linkedList.toString();
    }




}
