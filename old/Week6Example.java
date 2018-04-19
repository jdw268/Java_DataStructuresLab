import java.util.ArrayList;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.HashMap;

public class Week6Example {
    public static void main(String[] args) {
        switch (args[0]) {
            case "1":
                example_1();
                break;
            case "2":
                example_2();
                break;
            case "3":
                example_3();
                break;
            case "4":
                example_4();
                break;
            case "5":
                example_5();
                break;

        }
    }

    
    /*
    2-D Array
    */
    public static void example_1() {
        int[][] multi = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        for(int i = 0; i < multi.length; i++){
            for(int j = 0; j < multi.length; j++){
                System.out.println("I: " + i + " J: " + j + " multi[i][j]: " + multi[i][j]);
            }
        }
        for(int[] outer : multi){
            for (int inner : outer){
                System.out.println(inner);
            }
        }
    }

    
    /*
    ArrayLists
    */
    public static void example_2() {
        ArrayList<String> alist = new ArrayList<String>();
        for(int i = 0; i <= 10; i++){
            alist.add(Integer.toString(i));
        }
        System.out.println("ALIST: " + alist);
        alist.remove(2);
        alist.remove("9");
        System.out.println("ALIST: " + alist);
        alist.add(1, "hello");
        alist.set(5, "world");
        System.out.println("ALIST: " + alist);
        System.out.println("ALIST at index 5: " + alist.get(5));
    }

    
    /*
    Stacks
    */
    public static void example_3() {
        Stack<String> stack = new Stack<String>();
        for(int i = 0; i <= 10; i++){
            stack.push(Integer.toString(i));
            System.out.println("Stack: " + stack);
        }
        while(!stack.empty()){
            System.out.println("STACK POP: " + stack.pop());
            if(stack.empty()){continue;}
            System.out.println("STACK PEEK: " + stack.peek());
            System.out.println("STACK: " + stack);
        }
    }
    
    
    /*
    Queue
    */
    public static void example_4() {
        Queue<String> queue = new LinkedList<String>();
        for(int i = 0; i <= 10; i++){
            queue.offer(Integer.toString(i));
            System.out.println("QUEUE: " + queue);
        }
        while(queue.peek() != null){
            System.out.println("QUEUE POLL: " + queue.poll());
            if(queue.peek() == null){continue;}
            System.out.println("QUEUE PEEK: " + queue.peek());
            System.out.println("QUEUE: " + queue);
        }
    }
    

    /*
    HashMaps
    */
    public static void example_5() {
        HashMap<String, Integer> hash = new HashMap<String, Integer>();
        int sum = 0;
        for(int i = 0; i <= 10; i++){
            sum += i;
            hash.put(Integer.toString(i), sum);
            System.out.println("HashMap: " + hash);
        }
        System.out.println("Keys: " + hash.keySet());
        System.out.println("Values " + hash.entrySet());
        System.out.println("Key: 10 Value: " + hash.get("10"));
        for (String i : hash.keySet()){
            System.out.println("Key: " + i + " Value: " + hash.get(i));
        }
    }
}