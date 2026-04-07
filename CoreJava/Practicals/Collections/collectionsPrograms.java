package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class collectionsPrograms {

    static void ArrayListProgram(){
        System.out.println("--- ArrayList ---");
        List<String> al = new ArrayList<>();
        al.add("vaibhavi");
        al.add("abc");
        al.add("pqr");
        al.add("xyz");
        al.add("def");
        al.add("tuv");

        System.out.println("ArrayList : "+al);
        System.out.println("Element at index 2: " + al.get(2));
        System.out.println("Size: " + al.size());
        
        al.set(3, "lmao");
        System.out.println("After update : "+al);

        al.remove(4);
        System.out.println("After remove : "+al);

        System.out.println("Contains Vaibhavi: " + al.contains("Vaibhavi"));
        System.out.println("Index of Vaibhavi: " + al.indexOf("Vaibhavi"));

        Collections.sort(al);
        System.out.println("Sorted: " + al);

    }

    static void LinkedListProgram(){

        System.out.println("--- LinkedList ---");

        List<String> li = new LinkedList<>();
        li.add("mango");
        li.add("apple");
        li.add("pineapple");
        li.add("chickoo");
        li.add("banana");
        li.add("kiwi");
        
        System.out.println("LinkedList : "+li);

        System.out.println("First: " + ((LinkedList<String>) li).peekFirst());
        System.out.println("Last: " + ((LinkedList<String>) li).peekLast());

        System.out.println("\n--- LinkedList as Stack ---");
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(10); // push = addFirst
        stack.push(20);
        stack.push(30);
        System.out.println("Stack: " + stack);
        System.out.println("Pop: " + stack.pop()); // removes from top
        System.out.println("Stack after pop: " + stack);

    }

    static void HashSetProgram(){
        System.out.println("---HashSet---");
        List<Integer> listWithDuplicates = new ArrayList<>(
            Arrays.asList(10, 20, 30, 20, 10, 40, 50, 30, 60)
        );
        System.out.println("Original List: " + listWithDuplicates);

        // HashSet automatically removes duplicates!
        HashSet<Integer> set = new HashSet<>(listWithDuplicates);
        System.out.println("After removing duplicates: " + set);

    }

    static void HashMap(){
        System.out.println("---HashMap---");
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(1, "A");
        map.put(1, "B");
        map.put(3, "C");
        map.put(2, "A");
        
        System.out.println("Hashmap : "+map);

        System.out.println("Name of 2 : "+map.get(2));
    }

    public static void main(String[] args) {
        
        ArrayListProgram();

        LinkedListProgram();

        HashSetProgram();

        HashMap();
    }
}

// output :
// $ java -cp . Collections.collectionsPrograms
// --- ArrayList ---
// ArrayList : [vaibhavi, abc, pqr, xyz, def, tuv]
// Element at index 2: pqr
// Size: 6
// After update : [vaibhavi, abc, pqr, lmao, def, tuv]
// After remove : [vaibhavi, abc, pqr, lmao, tuv]
// Contains Vaibhavi: false
// Index of Vaibhavi: -1
// Sorted: [abc, lmao, pqr, tuv, vaibhavi]
// --- LinkedList ---
// LinkedList : [mango, apple, pineapple, chickoo, banana, kiwi]
// First: mango
// Last: kiwi
// --- LinkedList as Stack ---
// Stack: [30, 20, 10]
// Pop: 30
// // Stack after pop: [20, 10]
// ---HashSet---
// Original List: [10, 20, 30, 20, 10, 40, 50, 30, 60]
// After removing duplicates: [50, 20, 40, 10, 60, 30]
// ---HashMap---
// Hashmap : {1=B, 2=A, 3=C}
// Name of 2 : A
