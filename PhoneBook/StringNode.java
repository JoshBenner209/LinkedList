package PhoneBook;
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
            String data=current.data;
            int coma1=data.indexOf(","); // stop search at comma
            String subData1=data.substring(0, coma1);// get name
            String name= subData1;
            if(name.equals(info)){ // if found return position
            return index;
        }
        index++;
        current= current.next;
        }
        return -1; // not found. Return -1
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
            while(current.next!=null){
                current=current.next;
            }
            current.next=new Node(info);
        }

    }
    //insert node at given index with given data
    public void addAnyWhere(int index,String info){
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
            String result= "["+front.data+"]\n";
            Node current = front.next;
            while(current!=null){
                result+="[ "+current.data+" ]\n";
                current=current.next;
            }
            return result;
        }
    }

}