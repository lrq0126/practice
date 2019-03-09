package com.example.modelbuilderdemo.controller;

import com.example.modelbuilderdemo.pojo.Compute;
import com.example.modelbuilderdemo.service.ComputerBuilder;

public class ComputeDirector {

    private ComputerBuilder builder;

    public ComputeDirector(ComputerBuilder builder){    //这里实则运用了策略模式
        this.builder = builder;
    }

    public Compute constructComputer(){     //建造者模式的集中体现
        builder.buildCpu();
        builder.buildDisk();
        builder.buildFan();
        builder.buildGraphicsCard();
        builder.buildMainboard();
        builder.buildMemory();
        builder.buildPower();
        return builder.buildCompute();
    }

}
