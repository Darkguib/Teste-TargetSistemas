public class ReverterString {
    public String reverter (String s) {

        int n = s.length();
        char[] c = new char[n];

        for (int i = 0; i < n; i++) {
            c[n - i - 1] = s.charAt(i);
        }
        return String.copyValueOf(c);
    }
}
