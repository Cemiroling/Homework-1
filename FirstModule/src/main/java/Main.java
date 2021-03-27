public class Main {
    public static void main(String[] args) {
        int[] ms = new int[1000];
        for (int i = 0; i < ms.length; i++) {
            ms[i] = 2 * i;
        }
        BinarySearch.search(ms, 546);
    }
}
