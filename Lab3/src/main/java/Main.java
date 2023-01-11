import java.util.StringTokenizer;

public class Main {
    public static void removeLastLetterOccurrences(StringBuffer sb) {
        int i = 0;
        boolean nextWord = true;
        while (i < sb.length()) {
            char currentChar = sb.charAt(i);
            if (Character.isLetter(currentChar)) { // Check if currentChar is a letter
                if(nextWord){
                    int j = i + 1;
                    while (j < sb.length() && Character.isLetter(sb.charAt(j))){
                        j++;
                    }
                    if(j-i>1) {
                        sb.deleteCharAt(j-1);
                    }
                    nextWord = false;
                }
                i++;
            } else {
                nextWord = true;
                i++;
            }
        }
    }


    public static void main(String[] args) {
//        StringBuffer sb = new StringBuffer("aa bb");
//        StringBuffer sb = new StringBuffer("aa ba");
//        StringBuffer sb = new StringBuffer("ab bb");
//        StringBuffer sb = new StringBuffer("aba bab");
//        StringBuffer sb = new StringBuffer("aaaaaaaaa");
        StringBuffer sb = new StringBuffer("aadaacaaabaa");
        System.out.printf("Before: %s\n", sb);

        int startIdx = 0;
        int lastIdx = 1;

        while (lastIdx < sb.length()) {
            int nextIdx = lastIdx + 1;

            if (nextIdx >= sb.length() || sb.charAt(nextIdx) == ' ') {
                char last = sb.charAt(lastIdx);

                int idx = sb.lastIndexOf(String.valueOf(last), lastIdx - 1);
                while (idx >= startIdx) {
                    sb.deleteCharAt(idx);
                    lastIdx--;
                    idx = sb.lastIndexOf(String.valueOf(last), lastIdx - 1);
                }

                startIdx = lastIdx + 2;
                lastIdx = startIdx + 1;
            } else {
                lastIdx += 1;
            }
        }

        System.out.printf("After: %s\n", sb);
    }
}
