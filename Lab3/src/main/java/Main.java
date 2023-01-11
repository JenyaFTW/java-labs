import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Lorel ipsusi");
        System.out.printf("Before: %s\n", sb);

        int startIdx = 0;
        int lastIdx = 1;

        while (lastIdx < sb.length()) {
            int nextIdx = lastIdx + 1;

            if (nextIdx >= sb.length() || sb.charAt(nextIdx) == ' ') {
                char last = sb.charAt(lastIdx);
                for (int i = startIdx; i < lastIdx; i++) {
                    if (sb.charAt(i) == last) {
                        sb.deleteCharAt(i);
                        lastIdx--;
                    }
                }
                startIdx = lastIdx + 1;
                lastIdx = startIdx + 1;
            } else {
                lastIdx += 1;
            }
        }

        System.out.printf("After: %s\n", sb);
    }
}
