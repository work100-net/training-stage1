package net.work100.training.stage1.advance.generic;

/**
 * <p>Title: Test</p>
 * <p>Description: </p>
 *
 * @author liuxiaojun
 * @date 2020-02-04 19:23
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2020-02-04   liuxiaojun     初始创建
 * -----------------------------------------------
 */
public class Test {
    public static void main(String[] args) {
        // -------------------泛型方法 printArray--------------------
        // 创建不同类型数组： Integer, Double 和 Character
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("整型数组元素为:");
        printArray(intArray); // 传递一个整型数组

        System.out.println("双精度型数组元素为:");
        printArray(doubleArray); // 传递一个双精度型数组

        System.out.println("字符型数组元素为:");
        printArray(charArray); // 传递一个字符型数组

        System.out.println("---------------------------------");

        // -------------------比较三个值并返回最大值--------------------
        System.out.printf("%d, %d 和 %d 中最大的数为 %d", 3, 4, 5, maximum(3, 4, 5));
        System.out.println();

        System.out.printf("%.1f, %.1f 和 %.1f 中最大的数为 %.1f", 6.6, 8.8, 7.7, maximum(6.6, 8.8, 7.7));
        System.out.println();

        System.out.printf("%s, %s 和 %s 中最大的数为 %s", "pear", "apple", "orange", maximum("pear", "apple", "orange"));
        System.out.println();
    }

    // 泛型方法 printArray
    public static <E> void printArray(E[] inputArray) {
        // 输出数组元素
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    // 比较三个值并返回最大值
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x; // 假设x是初始最大值
        if (y.compareTo(max) > 0) {
            max = y; //y 更大
        }
        if (z.compareTo(max) > 0) {
            max = z; // 现在 z 更大
        }
        return max; // 返回最大对象
    }
}
