import java.util.*;

class ArrayListCode {
    void arrayListMethod() {
        ArrayList<Integer> arraylist1 = new ArrayList<>();
        arraylist1.add(100);
        arraylist1.add(200);
        arraylist1.add(100);
        arraylist1.add(0);
        arraylist1.add(900);
        arraylist1.add(600);
        
        System.out.println("Elements of the list: ");
        
        Iterator<Integer> iterate = arraylist1.iterator();
        
        while (iterate.hasNext()) {
            System.out.println(iterate.next());
        }
    }
}

public class New001 {
    public static void main(String[] args) {
        ArrayListCode obj = new ArrayListCode();
        obj.arrayListMethod();
    }
}