package learnfromscratch_new.practice;

public class MaxLoadage {
    public static void main(String[] args) {
        /* 单层货舱长2米宽4米
           正方体箱子边长1.5米
           求单层最大装载量 */
        int spaceWidth = 2;
        int spaceLength = 4;
        float boxSideLength = 1.5f;
        int maxLoadage = (int) ((spaceLength / boxSideLength) * (int) (spaceWidth / boxSideLength));
        System.out.println("The maximum loadage is: " + maxLoadage);
    }
}
