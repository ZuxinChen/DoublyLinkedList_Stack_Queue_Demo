
package com.mycompany.dllists_stacks_queues.Stack;

/**
 *
 * @author MoaathAlrajab
 */
class Stack {
   private LinkedList linkedList;
    
   Stack() {
      linkedList = new LinkedList();
   }
   
   public void push(int newData) {
      // Create a new node and prepend
      Node newNode = new Node(newData);
      linkedList.prepend(newNode);
   }
    public void pushChar(char c) {
      // Create a new node and prepend
      Node newNode = new Node(c);
      linkedList.prepend(newNode);
   }
    
   public int pop() {
      // Copy list head's data
      int poppedItem = linkedList.getHeadData();
      
      // Remove list head
      linkedList.removeAfter(null);
      
      // Return popped item
      return poppedItem;
   }
   
   public void print() {
      linkedList.printList();
   }
   public void printStr() {
      linkedList.printListStr();
   }
   
   public boolean isEmpty(){
      /*
       if(linkedList.size() == 0){
           return true;
       }
    */
      if(linkedList.getHead() == null){
           return true;
       }
       return false;
   }
   
   public int size(){
       return linkedList.size();
   }
}
