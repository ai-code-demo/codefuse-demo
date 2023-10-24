package com.alipay.codefuse;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * 代码补全案例
 * 可在任意位置删除某些代码,或者某些函数,触发codefuse代码被动补全,验证补全能力
 * 也可以直接使用option/alt + \ 触发主动补全
 * @author junlong.njl
 * 创建时间 2023-10-17
 */
public class CommonUtils {

    /**
     * 字符判空
     *
     * @param cs
     * @return
     */
    public static boolean isEmpty(final CharSequence cs) {
        return cs == null || cs.length() == 0;
    }


    /**
     * 将指定内容写入文件
     *
     * @param content
     * @param file
     */
    public static void writeContentToFile(String content, File file) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(content);
        } catch (Exception e) {
            System.out.println("writeContentToFile error");
        }
    }

    /**
     * 遍历List列表,找到其中的偶数并相加,返回所有偶数的和
     */
    public int sumEvenNumbers(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i : numbers) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
