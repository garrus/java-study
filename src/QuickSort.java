public class QuickSort {
    
    public static void sort(Double[] numbers)
    {
        sort(numbers, 0, numbers.length - 1);
    }

    public static void sort(Double[] numbers, int startPos, int endPos)
    {
        if (endPos == startPos) {
            return;
        }
        if (endPos - startPos == 1) {
            if (numbers[startPos] > numbers[endPos]) {
                swap(numbers, startPos, endPos);
            }
            return;
        }
        
        Double s = numbers[startPos];

        int i = startPos + 1;
        int j = endPos;

        while (true) {
            while (s <= numbers[j] && j > i) j--;
            while (s > numbers[i] && i < j) i++;
            if (j > i) {
                swap(numbers, i, j);
            } else {
                if (s > numbers[i]) {
                    swap(numbers, startPos, i);
                } else {
                    i = startPos;
                }
                break;
            }
        }

        if (i > startPos + 1) {
            sort(numbers, startPos, i - 1);
        }
        if (i < endPos - 1) {
            sort(numbers, i + 1, endPos);
        }
    }

    private static void swap(Double[] numbers, int posA, int posB)
    {
        Double t = numbers[posA];
        numbers[posA] = numbers[posB];
        numbers[posB] = t;
    }
}
