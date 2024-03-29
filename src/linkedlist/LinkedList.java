package linkedlist;

public class LinkedList {

    private Node head;

    public LinkedList(Node node)
    {
        this.head=node;
    }

    public LinkedList() {

    }


    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public boolean remove(int data)
    {
        if(head ==null)
        {
            return false;
        }

        if(head.data==data)
        {
            this.head=head.next;
            return true;

        }



        Node pointerOne= this.head;
        Node pointerTwo= this.head.next;

        Node toBeDeleted=null;

        while( pointerTwo !=null)
        {
            if(pointerTwo.data==data)
            {
                toBeDeleted=pointerTwo;
                pointerTwo=pointerTwo.next;
                break;
            }

            pointerOne=pointerOne.next;
            pointerTwo=pointerTwo.next;

        }

        if(toBeDeleted!=null)
        {
            pointerOne.next=toBeDeleted.next;
            return true;
        }

        return false;
    }

    public void add (int data)
    {
        Node newNode=new Node(data);
        if( head ==null)
        {
            this.head=newNode;
        }

        else
        {
            newNode.setNext(this.head);
            this.head=newNode;
        }




    }

    public Node findNodeAtIndex(int index)
    {
        Node current=this.head;
        int pointer=0;



        while(current.next!=null)
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


    public void addAtIndex(int index,int data)
    {
        if(index <0)
        {
            System.out.println(" Index out of bounds");
        }

        // If its the first index, add can be used to append to the start
        if(index==0)
        {
            this.add(data);
        }

        else
        {
            Node newNode=new Node(data);
            // linkedlist.Node 1--> linkedlist.Node 2--> linkedlist.Node 2.1-->linkedlist.Node 3--> linkedlist.Node 4
            // Find node at index-1

            Node node=this.findNodeAtIndex(index-1);

            if(node==null)
            {
                System.out.println("Operation Can't be performed at this time");
            }

            else {
                // Store its next to a temp variable
                Node temp = node.getNext();

                // Point its next to the new node
                node.setNext(newNode);

                // Point next of new node to temp variable
                newNode.setNext(temp);
            }



        }










    }

    public int deleteAtIndex(int index)
    {
        if(index >=this.size() || index <0)
        {
            System.out.println(" Index out of bounds");
        }

        Node deletedNode=null;

        if(index ==0)
        {
            Node currentHead=this.head;
            deletedNode=currentHead;
            this.head=currentHead.getNext();
        }

        else
        {

            // linkedlist.Node 1--> linkedlist.Node 2--> linkedlist.Node 2.1-->linkedlist.Node 3--> linkedlist.Node 4 -->
            // linkedlist.Node 1 --> linkedlist.Node 2--> linkedlist.Node 3--> linkedlist.Node 4

            // Find node at index-1
            Node node=this.findNodeAtIndex(index-1);

            if(node==null)
            {
                System.out.println("Operation Can't be performed at this time");
            }
             deletedNode=node.getNext();
            node.setNext(node.getNext().getNext());
        }

        return deletedNode.getData();
    }







    public boolean isEmpty()
    {
        return (head== null);
    }

    public int size()
    {
        if( head==null)
        {
            return 0;
        }
        int count=1;
        Node current=head;

        while( current.getNext() !=null)
        {
            count+=1;
            current=current.getNext();

        }

        return count;

    }

    @Override
    public String toString() {

        StringBuilder linkedList=new StringBuilder();

        Node current=this.head;

        while(current!=null)
        {
            if(current.getData()== this.head.getData())
            {
                linkedList.append("Head :"+ current.getData());
            }

            else if(current.getNext()!= null)
            {
                linkedList.append(" -> "+current.getData());
            }
            else
            {
                linkedList.append("->Tail :"+current.getData());
            }

            current=current.getNext();

        }


        return linkedList.toString();
    }


}
