package sample;

import java.util.LinkedList;

public class Linkedlistex {
    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("item1");
        linkedList.add("item2");
        linkedList.add("item3");
        linkedList.add("item4");
        linkedList.add("item5");
        linkedList.add("item6");
        linkedList.add("item7");
        linkedList.add("item8");

        System.out.println(linkedList);

        linkedList.addFirst("First one");
        linkedList.addLast("Last item");
        System.out.println("content after addition"+linkedList);

        Object firstvar=linkedList.get(0);
        System.out.println(firstvar);
        //System.out.println(linkedList);
        linkedList.set(0,"change first one");
        System.out.println(linkedList);
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);
        linkedList.add(0,"newly added");
        System.out.println(linkedList);
        linkedList.remove(2);
        System.out.println(linkedList);



    }
}
