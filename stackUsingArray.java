
import java.util.*;
public class  Main {
    static int top=-1;
    static int max=10;
    static int []a=new int[max];
     
    public static void push(int val)
    {
        if(top==max-1) // isFull condition
        System.out.println("Can't insert the value, your stack is full");
        else
        {
            top++;
            a[top]=val;
        }
    }
    public static void pop(){
        if(isEmpty())
        {
            System.out.println("Can't pop the value, your stack is empty");
        }
        else{
            int ans=peek();
            System.out.println(ans+ "is deleted!");
            top--;
         }  
    }
    public static void size()
    {
        System.out.println("The size of your stack is :" + (top+1));
    }
    public static boolean isEmpty()
    {
        if(top==-1)
        return true;
        return false;
    }
    public static int peek()
    {
        if(top==-1)
        return Integer.MIN_VALUE;
        else
        return a[top];
    }
    public static void main(String args[]) {
      Scanner s=new Scanner(System.in);
      boolean flag=true;
      while(flag)
      {
          System.out.println("1. Push the element into stack\n2. Pop the top element\n3.Print the size of stack\n4. Is the stack empty\n5. Print top element\n6. Quit ");
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
          else
          flag=false;
      }
    }
}
