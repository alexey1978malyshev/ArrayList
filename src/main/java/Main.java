public class Main {
    public static void main(String[] args) {
        IList<Integer> list = new GBArrayList<>();
       // System.out.println(list.size());
        list.add(11);
        list.add(19);
        list.add(2);
        //System.out.println(list.size());
       // System.out.println(list.get(2));
        list.update(2, 99);
        //System.out.println(list.get(2));
        list.add(33);
       // System.out.println(list);
        list.remove(2);
        //System.out.println(list);

//        IList<String> strList = new GBArrayList<>();
//        strList.add("Hello");
//        strList.add("aaaa");
//        strList.add("aaddd");
//        strList.add("eerrr");
//        System.out.println(strList.get(2));
        GBLinkedList<Integer> newList = new GBLinkedList<>();
        newList.add(5);
        newList.add(3);
        newList.add(55);
        newList.add(12);
        newList.add(4);
        newList.add(88);

        System.out.println(newList.get(2));
        System.out.println(newList.size());
        newList.addFirst(566);
        System.out.println(newList.get(0));
        System.out.println(newList.get(6));
        System.out.println(newList.getLast());

    }
}
