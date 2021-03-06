public class TraverseArray {
    public static void main(String[] args) {
        String names[] = {"Peter", "Oliver", "Sperm", "Penis", "Shit"};

        System.out.print("Names in array are: "); //普通遍历数组
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }

        System.out.print("\nNow show names again: "); //增强型遍历数组
        for (String i : names) {
            System.out.print(i + " ");
        }
    }
}
