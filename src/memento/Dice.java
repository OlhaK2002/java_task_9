package memento;

public class Dice {
    public static int roll(){
        return (int) (1 + Math.random() * (6 - 1));
    }
    public static int rollStat(){
        int arr_roll[] = new int[6];
        int max1 = 0, max2 = 0, max3 = 0;
        for (int i = 0; i < 6; i++) {
            arr_roll[i] = roll();
        }
        for (int i = 0; i < 6; i++) {
            if (arr_roll[i] >= max1) {
                max3 = max2;
                max2 = max1;
                max1 = arr_roll[i];
            } else if (arr_roll[i] >= max2) {
                max3 = max2;
                max2 = arr_roll[i];
            } else if (arr_roll[i] > max3)
                max3 = arr_roll[i];
        }
        return max1 + max2 + max3;
    }
}
