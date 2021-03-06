public class Exercise1Class {
    public static void main(String[] args) {
        // 最初数据：科目成绩和人名
        int[][] scores = {
                // {Java, Database, C++}
                {100, 90, -1},
                {98, 95, -1},
                {95, -1, 90},
                {86, -1, 92}
        };
        String[] persons = {"Elliott", "Howell", "Jeff", "Scott"};
        String[] subjects = {"Java", "Database", "C++"};

        // 初始化用来存储最终数据的数组
        float[] person_average = new float[4];
        float[] subject_average = new float[3];

        // 计算科目平均分
        for (int sbj = 0; sbj < subjects.length; sbj++) {
            int sum = 0;
            int person = 0;
            for (int psn = 0; psn < persons.length; psn++) {
                if (scores[psn][sbj] != -1){
                    sum += scores[psn][sbj];
                    person++;
                }
            }
            subject_average[sbj] = ((float)sum / (float)person);
        }

        // 计算个人平均分
        for (int psn = 0; psn < persons.length; psn++) {
            int sum = 0;
            int subject = 0;
            for (int sbj = 0; sbj < subjects.length; sbj++) {
                if (scores[psn][sbj] != -1) {
                    sum += scores[psn][sbj];
                    subject++;
                }
            }
            person_average[psn] = ((float) sum / (float) subject);
        }

        // 输出结果
        System.out.println("科目平均分");
        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i] + ": " + subject_average[i]);
        }

        System.out.println("\n个人平均分");
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i] + ": " + person_average[i]);
        }
    }
}