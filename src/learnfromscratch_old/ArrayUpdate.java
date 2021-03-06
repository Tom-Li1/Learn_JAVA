public class ArrayUpdate {
    void updateArray(int[] arr, int index, int value) {
        arr[index] = value;
        System.out.println("修改后，arr的元素为：");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {1, 1, 4, 6, 1, 4};
        ArrayUpdate au = new ArrayUpdate();

        System.out.println("调用方法前，array的元素为：");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        au.updateArray(array, 3, 5);
        System.out.println("调用updateArray()后，array的元素为：");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
