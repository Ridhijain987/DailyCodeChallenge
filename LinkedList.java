// LinkedList Program1 ----->  make a list of items and search a particular item and print index......

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println();
        LinkedList <Integer> list= new LinkedList<Integer>();
        list.addFirst(1);
        list.addLast(5);
        list.addLast(7);
        list.addLast(3);
        list.addLast(8);
        list.addLast(2);
        list.addLast(3);
        System.out.println(list);
        int value=7;
        for(int i=0;i<list.size();i++){
            if(list.get(i)==value){
                System.out.println("value present at "+i+ "th index");
            }
        }
    }
}
