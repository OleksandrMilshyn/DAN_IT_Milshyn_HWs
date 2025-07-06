package hw_2.task_2;

public class Main2 {
    public static void main(String[] args) {
        String phrase = "Testing, is my favourite job";
        String[] phrase1 = phrase.split(" ");
        boolean a = true;
        int abc = 0;
        for (int i = 0; i < phrase1.length; i++) {
            if (phrase1[i].endsWith(",")) {
                phrase1[i] = phrase1[i].substring(0, phrase1[i].length() - 1);
            }
            System.out.println("word" + (i + 1) + "=" + phrase1[i] +", word length = " + phrase1[i].length());
            abc = phrase1[0].length();
            if (abc < phrase1[i].length())
                a = false;
            if (i + 1 == phrase1.length)
                System.out.println(a);

        }
    }
}
