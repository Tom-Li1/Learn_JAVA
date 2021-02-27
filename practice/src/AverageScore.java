import java.util.Random;
public class AverageScore {
    public static void main(String[] args) {
        Random random = new Random();
        String[] subjects = {"CFL", "MM2", "EAL", "PEP", "BAL", "MM1",
                "MM3", "PHY", "CHM", "ART", "ACC", "BM", "JSL"};
        String[] persons = {
                "Peter", "Jack", "Oliver", "Eason", "Ethan",
                "Eric", "Jasper", "Jason", "White", "Bill"};
        int[][] scores = new int[persons.length][subjects.length]; //20个人 13种科目
        float[][] subject_average = new float[2][subjects.length]; //第0数组存对应每科的总分 第1数组存相对应的人数
        float[][] person_average = new float[persons.length][2]; // 第零个元素存个人总分 第一个元素存个人选修课数量


        // 生成原始数据 将每人每科用随机数填充作为成绩
        for (int p = 0; p < scores.length; p++) { // 将每人每科成绩用随机数填充
            for (int s = 0; s < scores[0].length; s++) {
                scores[p][s] = random.nextInt(101);
            }
        }

        for (int p = 0; p < scores.length; p++) { // 后九门为选修课 每人只选三门
            int unselected;
            for (int i = 0; i < 6; i++) { // 随机抽取6门科目
                 do {
                    unselected = random.nextInt(9) + 4;
                } while (scores[p][unselected] == -1);
                scores[p][unselected] = -1; // 成绩设为-1代表未选修
            }
        }

        // 处理原始数据并存储
        for (int p = 0; p < persons.length; p++) {
            for (int s = 0; s < subjects.length; s++) {
                if (scores[p][s] != -1) {
                    person_average[p][0] += scores[p][s]; // 此人总分加上对应科目的分数
                    person_average[p][1]++; // 此人所选的科目数量自增1
                    subject_average[0][s] += scores[p][s]; // 此科总分加上对应的分数
                    subject_average[1][s]++; // 选修此科目的人数自增1
                }
            }
        }

        // 输出原始数据
        System.out.println("\t\t\t\t\t成绩单");
        for (String s : subjects) {
            System.out.print(s + "\t");
        }
        System.out.println();

        for (int i = 0; i < persons.length; i++) {
            for (int score : scores[i]) {
                System.out.print(score + "\t");
            }
            System.out.print(persons[i] + "\n");
        }

        // 输出统计结果
        System.out.println("\n科目平均分");
        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i] + ": " + (subject_average[0][i] / subject_average[1][i]));
        }

        System.out.println("\n个人平均分");
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i] + ": " + (person_average[i][0] / person_average[i][1]));
        }
    }
}