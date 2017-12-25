public class BinarySearch {

    static public int searchString(String[] haystack, String needle) {

        int p = 0,
            q = haystack.length - 1,
            t = q / 2;
        byte ret;

        while ((ret = strcmp(needle, haystack[t])) != 0) {
            if (ret > 0) {
                if (t == p) {
                    return -1;
                }
                p = t;
                t = (p + q) / 2;
                if (t == p) {
                    t = p + 1;
                }
            } else {
                if (t == q) {
                    return -1;
                }
                q = t;
                t = (p + q) / 2;
            }
        }

        return t;
    }

    /**
     * 比较两个字符串，不区分大小写
     *
     * @param A 字符串A
     * @param B 字符串B
     * @return byte 返回 -1, 0或1 当 字符串A 小于，等于或者大于 字符串B 时。
     */
    static private byte stricmp(String A, String B) {

        if (A.equalsIgnoreCase(B)) {
            return 0;
        }
        char ca, cb;
        for (int i = 0; i < Math.max(A.length(), B.length()); i++) {

            if (i == A.length()) {
                return -1;
            }
            if (i == B.length()) {
                return 1;
            }

            ca = A.charAt(i);
            cb = B.charAt(i);

            // 都处理成大写
            if (Character.isLowerCase(ca)) {
                ca -= 32;
            }
            if (Character.isLowerCase(cb)) {
                cb -= 32;
            }

            if (ca != cb) {
                return ca > cb ? (byte)1 : -1;
            }
        }

        return 0;
    }

    /**
     * 比较两个字符串，区分大小写
     *
     * @param A 字符串A
     * @param B 字符串B
     * @return byte 返回 -1, 0或1 当 字符串A 小于，等于或者大于 字符串B 时。
     */
    static private byte strcmp(String A, String B) {

        if (A.equals(B)) {
            return 0;
        }

        char ca, cb;
        for (int i = 0; i < Math.max(A.length(), B.length()); i++) {

            if (i == A.length()) {
                return -1;
            }
            if (i == B.length()) {
                return 1;
            }

            ca = A.charAt(i);
            cb = B.charAt(i);

            if (ca != cb) {
                return ca > cb ? (byte)1 : -1;
            }
        }

        return 0;
    }
}
