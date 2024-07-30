import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {
        // 1. ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add("orange");
        arrayList.add("grape");
        arrayList.add("mango");
        arrayList.add("kiwi");
        arrayList.add("strawberry");
        arrayList.add("pineapple");
        arrayList.add("watermelon");
        arrayList.add("cherry");

        // Add an element
        arrayList.add("lemon");

        // Iterate using Iterator
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Add element at specific index
        arrayList.add(2, "pear");

        // Remove an element
        arrayList.remove("banana");
        arrayList.remove(3);

        // Update element at specific index
        arrayList.set(1, "blueberry");

        // Check element presence
        System.out.println(arrayList.contains("apple"));
        System.out.println(arrayList.contains("fig"));

        // Get element at index
        System.out.println(arrayList.get(4));

        // Size of ArrayList
        System.out.println(arrayList.size());

        // Remove all elements
        arrayList.clear();

        // 2. HashMap
        HashMap<Integer, String> studentMap = new HashMap<>();
        studentMap.put(1, "Alice");
        studentMap.put(2, "Bob");
        studentMap.put(3, "Charlie");
        studentMap.put(4, "David");
        studentMap.put(5, "Emily");
        studentMap.put(6, "Frank");
        studentMap.put(7, "Grace");
        studentMap.put(8, "Henry");
        studentMap.put(9, "Ivy");
        studentMap.put(10, "Jack");

        // Fetch value
        System.out.println(studentMap.get(3));

        // Create a clone
        HashMap<Integer, String> studentMapClone = (HashMap<Integer, String>) studentMap.clone();

        // Check key and value presence
        System.out.println(studentMap.containsKey(3));
        System.out.println(studentMap.containsValue("Charlie"));

        // Check if map is empty
        System.out.println(studentMap.isEmpty());

        // Print size
        System.out.println(studentMap.size());

        // Print keys
        System.out.println(studentMap.keySet());

        // Remove key-value pair
        studentMap.remove(5);

        // Copy to another map
        HashMap<Integer, String> anotherMap = new HashMap<>(studentMap);

        // 3. HashSet
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("red");
        hashSet.add("blue");
        hashSet.add("green");
        hashSet.add("yellow");
        hashSet.add("orange");
        hashSet.add("purple");
        hashSet.add("pink");
        hashSet.add("brown");
        hashSet.add("black");
        hashSet.add("white");

    }
}
