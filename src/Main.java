public class Main {

    public static void main(String[] args)
    {
        System.out.println("Hello World!");

        // 快速排序（double）
        Double[] numbers = {4.0, 2.0, 3.0, 9.0, 7.2, -8.2, 1.0, 2.0, 9.8, 6.0};
        QuickSort.sort(numbers);
        for (Double number : numbers) {
            System.out.printf("%s\n", number);
        }

        // 二分查找（字符串）
        String[] haystack = {"al", "bs", "css", "cssf", "slkj", "slkjsdjf", "zsa", "zss"};
        String[] needles = {"al", "bs", "css", "cssf", "slkj", "slkjsdjf", "zsa", "zss"};

        for (byte i = 0; i < needles.length; i++) {
            System.out.printf("%d: Position of %s is %d\n", i, needles[i], BinarySearch.searchString(haystack, needles[i]));
        }
    }
}
