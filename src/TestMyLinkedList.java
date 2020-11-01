public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);

        System.out.println(myLinkedList);

        System.out.println(myLinkedList.get(0));
//        System.out.println(myLinkedList.get(4));
        System.out.println(myLinkedList.get(3));

        myLinkedList.remove(1);
        System.out.println(myLinkedList);
        myLinkedList.remove(2);
        System.out.println(myLinkedList);
        myLinkedList.remove(0);
        System.out.println(myLinkedList);
        myLinkedList.remove(0);
        System.out.println(myLinkedList);

    }
}
