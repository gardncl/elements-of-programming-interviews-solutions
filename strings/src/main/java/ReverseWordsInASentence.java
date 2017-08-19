public class ReverseWordsInASentence {

    /*
    7.6
    */

    public static String reverseWordsInASentence(String input) {
        StringBuilder sentence = new StringBuilder();
        String[] words = input.split(" ");
        int i = words.length;
        while (i-- > 0)
            sentence.append(words[i]+" ");
        return sentence.toString().trim();
    }
}
