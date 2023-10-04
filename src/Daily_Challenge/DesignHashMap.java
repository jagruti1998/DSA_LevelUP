package Daily_Challenge;

import java.util.HashMap;
        import java.util.Scanner;
public class DesignHashMap {

    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Put key-value pair");
            System.out.println("2. Get value by key");
            System.out.println("3. Remove key-value pair");
            System.out.println("4. Quit");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter key: ");
                    int key = scanner.nextInt();
                    System.out.print("Enter value: ");
                    int value = scanner.nextInt();
                    myHashMap.put(key, value);
                    System.out.println("Key-value pair added.");
                    break;
                case 2:
                    System.out.print("Enter key to get value: ");
                    int getKey = scanner.nextInt();
                    int retrievedValue = myHashMap.get(getKey);
                    System.out.println("Value for key " + getKey + ": " + retrievedValue);
                    break;
                case 3:
                    System.out.print("Enter key to remove: ");
                    int removeKey = scanner.nextInt();
                    myHashMap.remove(removeKey);
                    System.out.println("Key-value pair removed.");
                    break;
                case 4:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }
    }
}

class MyHashMap {
    private HashMap<Integer, Integer> map;

    public MyHashMap() {
        map = new HashMap<>();
    }

    public void put(int key, int value) {
        map.put(key, value);
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        return -1;
    }

    public void remove(int key) {
        map.remove(key);
    }
}
