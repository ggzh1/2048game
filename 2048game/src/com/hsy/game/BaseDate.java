package com.hsy.game;
import java.awt.*;
public interface BaseDate {
    Font topicFont = new Font("微软雅黑", Font.BOLD, 50);//字体  风格 字号
    Font scoreFont = new Font("微软雅黑", Font.BOLD, 28);
    Font normalFont = new Font("宋体", Font.PLAIN, 20);
    Font font1 = new Font("宋体", Font.BOLD, 46);
    Font font2 = new Font("宋体", Font.BOLD, 40);
    Font font3 = new Font("宋体", Font.BOLD, 34);
    Font font4 = new Font("宋体", Font.BOLD, 28);
    Font font5 = new Font("宋体", Font.BOLD, 22);
    void init();
    void showView();
}

