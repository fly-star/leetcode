import java.util.Arrays;

public class JewelsAndStones {

    public int numJewelsInStones(String J, String S) {
        int count = 0;
        char[] chars = J.toCharArray();
        for (char c:
             chars) {
            for (int i=0;i<S.length();i++) {
                if (S.charAt(i) == c) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        JewelsAndStones jewelsAndStones = new JewelsAndStones();
        jewelsAndStones.numJewelsInStones("aA", "aAAbbbb");
        jewelsAndStones.numJewelsInStones("z", "ZZ");
    }
}
