package com.company;

public class Main {


        public static void main(String[] args) {

            List l = new Node(1,new Node(2,new Node(3,new Nil())));

            l = l.add(4,1);
            System.out.println(l);
//        System.out.println(l.countOdd()); // questo dovrebbe stampare 2

            System.out.println("Inverti l'array");

            List reverse = new Nil();


            List list = l;
            while(!(list instanceof Nil)){
                reverse = reverse.add(((Node)list).getValue(),0);
                reverse = new Node(((Node)list).getValue(),reverse);
                list = list.getNext();
            }for(List i = l; i instanceof Node; i = i.getNext()){
            String value = ((Node) i).getValue();
            reverse = new Node(value,reverse);
        }
        System.out.println(reverse);



            //       System.out.println(l.doubleValue()); // questo deve stampare 2 8 4 6

            List l2 = new Node(1,new Node(4,new Node(2,new Node(3,new Nil()))));
//        System.out.println(l.equals(l2)); // questo deve stampare true
//        System.out.println(l.equals(l.doubleValue())); // questo deve stampare false
        }
    }

