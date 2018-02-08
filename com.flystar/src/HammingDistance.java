public class HammingDistance {

    public int hammingDistance(int x, int y) {
        // 先异或运算，再转换为二进制字符串，然后统计字符1的个数
        int count = 0;
        int res = x^y;
        String string = Integer.toBinaryString(res);
        for (char c: string.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        HammingDistance hammingDistance = new HammingDistance();
        hammingDistance.hammingDistance(1, 4);

    }
}
