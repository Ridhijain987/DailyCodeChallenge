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





// LinkedList program2 -----------> Take a list as input from user and delete numbers greater than 25

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList <Integer> list= new LinkedList<Integer>();
        System.out.println("Enter the size of Linked List");
        int num=sc.nextInt();
        System.out.println("Enter the values in the list");
        while(num>0){
            list.addLast(sc.nextInt());
            num--;
        }
        for(int i=0;i<list.size();i++){
            if(list.get(i)>25){
                list.remove(i);
            }
        }
        System.out.print(list);
    }
}





