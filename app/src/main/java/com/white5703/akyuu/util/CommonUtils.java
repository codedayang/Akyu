package com.white5703.akyuu.util;

import com.white5703.akyuu.entity.Note;

import java.util.List;
import java.util.Random;

public class CommonUtils {
    /**
     * 获取范围内的随机整数
     * @param min 最小值
     * @param max 最大值
     * @return 得到的随机数
     */
    public static long genRandomNumber(long min,long max) {
        Random random = new Random();
        long num = random.nextInt((int)max) % (max - min + 1) + min;
        return num;
    }

    /**
     * 获取所传入List<Note>中的最小权值
     * @param list
     * @return 1~9
     */
    public static int getMinimumPriority(List<Note> list) {
        int cnt = list.size();
        int res = 9;
        for (int i = 0; i < cnt; i++) {
            if (list.get(i).getPriority() < res) {
                res = list.get(i).getPriority();
            }
        }
        return res;
    }
}