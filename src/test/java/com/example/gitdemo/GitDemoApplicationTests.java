package com.example.gitdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GitDemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testStringSplitV1() {
        String str = "aa a aaa aaaa a aaa aaa aaaa aaaaaaaa aaa";
        final String[] s = str.split(" ");
        int len = 0;

        for (String value : s) {
            if (" ".equals(value)) {
                continue;
            }

            if (value.length() > len) {
                len = value.length();
            }
        }

        System.out.println(len);
    }

    @Test
    void testMaxSubLengthV2() {
        String str = "aa a aaa aaaa a aaa aaa aaaa aaaaaaaa aaa ";

        int len = 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count++;
            } else {
                if (len < count) {
                    len = count;
                }
                count = 0;
            }
        }

        System.out.println(len);
    }

}
