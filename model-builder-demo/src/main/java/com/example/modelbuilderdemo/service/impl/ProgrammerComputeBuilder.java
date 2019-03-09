package com.example.modelbuilderdemo.service.impl;

import com.example.modelbuilderdemo.pojo.Compute;
import com.example.modelbuilderdemo.pojo.vo.impl.*;
import com.example.modelbuilderdemo.service.ComputerBuilder;

public class ProgrammerComputeBuilder implements ComputerBuilder { //构建行为封装
    Compute compute = new Compute();
    @Override
    public void buildMainboard() {
        //华硕主板
        compute.setMainboard(new AsusMainboardB450M());
    }

    @Override
    public void buildCpu() {
        // amd r5 2400g
        compute.setCpu(new AmdCpuR52400G());
    }

    @Override
    public void buildFan() {
        //玄冰400
        compute.setFan(new XuanBing400Fan());
    }

    @Override
    public void buildMemory() {
        // DDR4 3000 16G
        compute.setMemory(new MemoryDDR4300016G());
    }

    @Override
    public void buildDisk() {
        //inter 512 PCIE 固态硬盘
        compute.setDisk(new Inter512GPCIEDisk());
    }

    @Override
    public void buildGraphicsCard() {
        //Vegall AMD核心显卡
        compute.setGraphicsCard(new AmdGraphicsCardVegall());
    }

    @Override
    public void buildPower() {
        //金河田 500W
        compute.setPower(new JinHeTian500WPower());
    }

    @Override
    public Compute buildCompute() {
        return compute;
    }
}
