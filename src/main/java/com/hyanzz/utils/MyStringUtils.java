package com.hyanzz.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import java.util.Random;

/**
 * 字符串工具
 *
 * User: fsj
 * Date: 2017/12/8 09:32
 */
@Slf4j
public class MyStringUtils extends StringUtils {

    /**
     * 获得0-9,A-Z范围的随机数
     *
     * @param length 随机数长度
     *
     * @return String
     */
    public static String getRandomChar(int length) {

        char[] chr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G',
                'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        Random random = new Random();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < length; i++) {
            buffer.append(chr[random.nextInt(36)]);
        }
        return buffer.toString();
    }


    /**
     * 获得随机数据
     *
     * @return String
     */
    public static String getRandomAddress() {
        String[] str = {"北京","上海","广州","深圳","武汉"};
        Random random = new Random();
        return str[random.nextInt(4)];
    }


    /**
     * 获得0-9范围的随机数
     *
     * @param length 随机数长度
     *
     * @return String
     */
    public static String getRandomNum(int length) {

        char[] chr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        Random random = new Random();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < length; i++) {
            buffer.append(chr[random.nextInt(10)]);
        }
        return buffer.toString();
    }

    /**
     * 获取制定范围内的随机整数
     *
     * @param min
     * @param max
     *
     * @return
     */
    public static int getRandomNum(int min, int max) {
        Random random = new Random();
        int s = random.nextInt(max) % (max - min + 1) + min;
        return s;
    }
}