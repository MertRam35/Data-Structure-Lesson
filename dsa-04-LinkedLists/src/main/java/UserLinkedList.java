public class UserLinkedList {

    User head;
    User tail;
    int size;

    public UserLinkedList() {
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertLast(User node) {
        if (isEmpty()) {
            head = tail = node;

        }// list is not empty
        else {
            tail.next = node;
            tail = node;

        }
        size++;
    }


    public void printNames() {

        User current = head;
        while (current != null) {
            System.out.println(current.name);
            current = current.next;
        }
    }

    public void deleteByName(String name) {

        User prev = head;
        User current = head;

        while (current != null) {
            if (current.name.equals(name)) {
            // case1 head
                if (current==head){
                    if (head==tail){
                        tail=null;
                    }
                    head=current.next;
                    current.next=null;

                } else if (current==tail) {
                    prev.next=null;
                    tail=prev;

                }else {
                    prev.next=current.next;
                    current.next=null;

                }
                size--;
            }
            prev = current;
            current = current.next;
        }

    }


}
