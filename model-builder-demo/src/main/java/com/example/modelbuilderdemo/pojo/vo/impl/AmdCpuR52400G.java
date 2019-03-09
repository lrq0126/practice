package com.example.modelbuilderdemo.pojo.vo.impl;

import com.example.modelbuilderdemo.pojo.vo.CPU;

public class AmdCpuR52400G implements CPU {
    private static final String NAME = "AMD R5 2400G";
    @Override
    public void name() {
        System.out.println("This is a " + NAME);
    }
}