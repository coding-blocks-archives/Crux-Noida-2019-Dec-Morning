package com.company.Lec30;

public class EggDrop {

    public static int eggdrop(int egg, int floor){
        if (floor == 0){
            return 0;
        }

        if (egg == 1){
            return floor;
        }

        int min = floor;

        for (int i = 1; i <= floor ; i++) {
            int down = eggdrop(egg - 1, i-1);
            int up = eggdrop(egg, floor - i);

            int current = Math.max(up, down) + 1;

            if (current < min){
                min = current;
            }
        }
        return min;
    }
}
