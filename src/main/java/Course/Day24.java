package Course;

import java.util.*;
class Node4{
    int data;
    Node4 next;
    Node4(int d){
        data=d;
        next=null;
    }

}
class Day24
{

    public static Node4 removeDuplicates(Node4 head) {

        //head has 0  or 1 element
        if (head == null || head.next == null)
                return head;

        //head has 2 or more elements
        Node4 temp = head;
        while (temp.next != null) {
            if (temp.data == temp.next.data)
                //skipping temp.next because we already have the same date in the temp
                temp.next = temp.next.next;
            else
                //data here is different then next so just go to next
                temp = temp.next;
        }
        return head;
    }

    public static  Node4 insert(Node4 head,int data)
    {
        Node4 p=new Node4(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node4 start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;
        }
        return head;
    }
    public static void display(Node4 head)
    {
        Node4 start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Node4 head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);

    }
}