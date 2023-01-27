public class StringNode{
    private Node front;
 // constructs an empty list
    public StringNode(){
        front = null;
    }
    //size of list is=count
    public int getsize(){
        int count=0;
        Node current= front;
        while(current!=null){
            current=current.next;
            count++;
        }
        return count;
    }
    //search for paticaular entry and return index
    //return -1 if not found
    public int getIndex(String info){
        int index=0;
        Node current= front;
        while(current!=null){
        if(current.data.equals(info)){
            return index;
        }
        index++;
        current= current.next;
        }
        return -1;
    }
    //enter an index number and return data
    public String getData(int index){
        return nodeAt(index).data;

    }
    private Node nodeAt(int index) {
        Node current=front;
        for(int i=0;i<index;i++){
            current=current.next;
        }
        return current;
    }
    //add new node to end
    public void add(String info){
        if(front==null){
            front=new Node(info);
        }else{
            Node current = front;
            while(current!=null){
                current=current.next;
            }
            current.next=new Node(info);
        }

    }
    //insert node at given index with given data
    public void add(int index,String info){
        //front of list
        if(index==0){
            front = new Node(info,front);
        }else{
            Node current = nodeAt(index-1); // get node before
            current.next = new Node(info,current.next);
        }
    }
    public void removeNode(int index){
        if(index==0){
            front=front.next; // leapfrog first node
        }else{
            Node current = nodeAt(index-1);//node before index
            current.next=current.next.next;//leapfrog to next node  
        }
    }
    //print out linked list
    public String toString(){
        if(front ==null){
            return"[]";
        }else{
            String result= "["+front.data;
            Node current = front.next;
            while(current!=null){
                result+=", "+current.data;
                current=current.next;
            }
            result+="]";
            return result;
        }
    }

}