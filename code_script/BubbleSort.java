public class BubbleSort {
    // 冒泡排序方法
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // 外层循环控制趟数
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false; // 用于优化：如果本轮没有交换，说明已排序好

            // 内层循环控制每一趟的比较次数
            for (int j = 0; j < n - 1 - i; j++) {
                // 如果前一个元素比后一个大，则交换
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // 如果本轮没有交换，直接结束
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 4, 2};

        System.out.println("排序前：");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        bubbleSort(numbers); // 调用冒泡排序

        System.out.println("\n排序后：");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
