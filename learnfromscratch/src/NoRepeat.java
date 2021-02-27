public class NoRepeat {
    public static void main(String[] args) {
        int scores[] = {1, 2, 1, 4, 5, 6, 1, 2, 3, 5};

        System.out.println("The list before reverse:");
        for (int i : scores) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        int newScores[] = new int[scores.length];
        int index = 0;
        boolean isRepetition = false;
        newScores[index++] = scores[0];

        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < index; j++) {
                if (scores[i] == newScores[j]) {
                    isRepetition = true;
                    break;
                }
            }
            if (!isRepetition) {
                newScores[index++] = scores[i];
            }
            isRepetition = false;
        }

        scores = new int[index];
        System.arraycopy(newScores, 0, scores, 0, index);
        System.out.println("The list after no-repeat:");
        for (int i : scores) {
            System.out.print(i + " ");
        }
        newScores = null;
    }
}
