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
            int current = Math.max(eggdrop(egg - 1, i-1),eggdrop(egg, floor - i));

            if (current < min){
                min = current;
            }
        }
        return min + 1;
    }



    //  Iterative Soln discussed
}
