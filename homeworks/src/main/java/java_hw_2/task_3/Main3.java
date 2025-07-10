package java_hw_2.task_3;

public class Main3 {
    public static void main(String[] args) {
        String a = "Completely random text in English. In it, we just need to determine how man times the character 'a' occurs there. And we can use the split method and the length method.";
        String b = a.toLowerCase();
        int size = b.length();
        String abc = "a";
        int size_a = 0;
        String[] symbols = b.split("");
        for (int i = 0; i < size; i++) {
            if (symbols[i].equals(abc))
                size_a += 1;
        }
    System.out.println(size_a);
    }
}
