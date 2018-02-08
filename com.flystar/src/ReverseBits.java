public class ReverseBits {

    public int reverseBits(int n) {
        String string = Integer.toBinaryString(n);
        System.out.println(string.length());
        String reversedString = new StringBuilder(string).reverse().toString();
        // StringBuffer，线程安全，适合多线程环境；StringBuilder，线程不安全，适合单线程，速度最快
        return Integer.parseInt(reversedString, 2);
    }

    public static void main(String[] args) {
        ReverseBits reverseBits = new ReverseBits();
        int res = reverseBits.reverseBits(432615969);
        System.out.println(res);
//        System.out.println(res == 964176192 );
    }
}
