import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.Source;

class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Solution {
  public static List<String> linkedListValues(Node<String> head) {
      List<String> vals = new ArrayList<>();
      for(Node<String> ptr = head; ptr != null; ptr = ptr.next) vals.add(ptr.val);
      return vals;
  }

  public static void main(String[] args) {
    Node<String> a = new Node<>("a");
    Node<String> b = new Node<>("b");
    Node<String> c = new Node<>("c");
    Node<String> d = new Node<>("d");
    a.next = b;
    b.next = c;
    c.next = d;
    // a -> b -> c -> d
    System.out.println(Solution.linkedListValues(a));
    // -> [ "a", "b", "c", "d" ]

    // extra credit
    Node<String> head = new Node<>("a");
    String alphabet = "abcdefghijklmnopqrstuvqxyz";
    Node<String> ptr = head;
    for (int i = 1; i < alphabet.length(); i++) {
      ptr.next = new Node<>(alphabet.charAt(i) + "");
      ptr = ptr.next;
    }
    System.out.println(Solution.linkedListValues(head));
  }
}
