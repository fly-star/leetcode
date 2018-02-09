public class NumberComplement {

    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i) == '1') {
                stringBuilder.append('0');
            } else if (s.charAt(i) == '0') {
                stringBuilder.append('1');
            }

        }
        return Integer.parseInt(stringBuilder.toString(), 2);
    }

    public static void main(String[] args) {
        NumberComplement numberComplement = new NumberComplement();
        System.out.println(numberComplement.findComplement(5));
    }
}
