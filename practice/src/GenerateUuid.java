import java.util.UUID;

public class GenerateUuid {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            //注意replaceAll前面的是正则表达式
            String uuid = UUID.randomUUID().toString().substring(0, 4);
            System.out.println(uuid);
        }
    }
}