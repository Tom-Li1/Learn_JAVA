package learnfromscratch_new;

public class EscapeCharacter {
    public static void main(String[] args) {
        char[] characters = {'\\', '\'', '\"', '\u2650', '\101', '\t', '\n'};
        String[] names = {"反斜杠", "单引号", "双引号", "十六进制字符", "八进制字符", "制表符", "换行符"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + characters[i]);
        }
    }
}
