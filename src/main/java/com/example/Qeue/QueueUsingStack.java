package com.example.Qeue;

import java.util.Stack;

public class QueueUsingStack {
  private final Stack<Integer> first;
  private final Stack<Integer> second;

  public QueueUsingStack() {
      first = new Stack<>();
      second = new Stack<>();
  }


  //in this case insert efficient
  public void insert(int val){
      first.push(val);

  }
  public int remove(){
      while(!first.isEmpty()){
          second.push(first.pop());
      }

      int temp = second.pop();

      while(!second.isEmpty()){
          first.push(second.pop());
      }
      return temp;
  }

  public int peek(){
      while(!first.isEmpty()){
          second.push(first.pop());
      }
      int temp = second.peek();
      while(!second.isEmpty()){
          first.push(second.pop());
      }
      return temp;

  }

  public void display(){
      System.out.println(first);
  }

    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        System.out.println(queue.peek());
        queue.display();
    }
}
