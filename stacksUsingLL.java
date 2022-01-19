import java.util.*;
public class Main {
    static Node top=null;
    static class Node{
        int data;
        Node next;
        Node (int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static void push(int val)
    {
         Node newnode=new Node(val);
         newnode.next=top;
         top=newnode;
         
    }
    public static void pop(){
        if(top==null)
        {
            System.out.println("Can't pop the value, your stack is empty");
        }
        else{
            int ans=peek();
            System.out.println(ans+ " is deleted!");
            top=top.next;
        }
        
    }
    public static void size()
    {
        Node temp=top;
        int size=0;
        while(temp!=null)
        {
            temp=temp.next;
            size++;
        }
        System.out.println("The size of your stack is :" + (size));
    }
    public static boolean isEmpty()
    {
        if(top==null)
        return true;
        return false;
    }
    public static int peek()
    {
        if(top==null)
        return Integer.MIN_VALUE;
        else
        return top.data;
    }
    public static void print()
    {
         if(top==null)
        {
            System.out.println("No elements in stack, your stack is empty");
        }
        else{
           Node temp=top;
           while(temp!=null)
           {
               System.out.print(temp.data+" ");
               temp=temp.next;
           }
           System.out.println();
           
        }
    }
    public static void main(String args[]) {
      Scanner s=new Scanner(System.in);
      boolean flag=true;
      while(flag)
      {
          System.out.println("1. Push the element into stack\n2. Pop the top element\n3.Print the size of stack\n4. Is the stack empty\n5. Print top element\n6.Print stack\n7. Quit ");
          int ch=s.nextInt();
          if(ch==1)
          {
              System.out.println("Enter the value:");
              int val=(s.nextInt());
              push(val);
              System.out.println(val+ " pushed successfully!");
          }
          else if(ch==2)
          {
              pop();
          }
          else if(ch==3)
          {
              size();
          }
          else if(ch==4)
          {
              if(isEmpty())
              System.out.println("Stack is empty");
              else
              System.out.println("Stack is not empty");
          }
          else if(ch==5)
          {
              if(peek()==Integer.MIN_VALUE)
              System.out.println("Sorry! there are no elements in your stack");
              else
              {
                  System.out.println("The peek element is: "+peek());
              }
          }
          else if(ch==6)
          {
              print();
          }
          else
          flag=false;
      }
    }
}
