package example2;

public class Main {
    public static void main(String[] args) {
        WordMultiple wordMultiple = new WordMultiple();
        System.out.println(wordMultiple.wordMultiple(new String[]{"a", "b", "a", "c", "b"}));
        // Output: {a=true, b=true, c=false}

        System.out.println(wordMultiple.wordMultiple(new String[]{"c", "b", "a"}));
        // Output: {a=false, b=false, c=false}

        System.out.println(wordMultiple.wordMultiple(new String[]{"c", "c", "c", "c"}));
        // Output: {c=true}
    }

}
