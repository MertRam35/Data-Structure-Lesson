public class UserApp {

    public static void main(String[] args) {

        UserLinkedList myList = new UserLinkedList();

        myList.insertLast(new User("ramazan", "mert"));
        myList.insertLast(new User("ramazan1", "mert"));
        myList.insertLast(new User("ramazan2", "mert"));


        myList.printNames();
        System.out.println("=================");
        myList.deleteByName("ramazan1");
        myList.printNames();


    }
}
