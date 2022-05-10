package ru.netology.sqr;

public class SQRService {
    public int theBest(int limitMin, int limitMax) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (Math.pow (i, 2) >= 200 && Math.pow (i, 2) <= 300) {
                count++;
            }
        }
        return count;
    }

}