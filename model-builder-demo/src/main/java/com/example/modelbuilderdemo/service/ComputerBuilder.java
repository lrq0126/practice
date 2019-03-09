package com.example.modelbuilderdemo.service;

import com.example.modelbuilderdemo.pojo.Compute;

public interface ComputerBuilder {

    void buildMainboard();
    void buildCpu();
    void buildFan();
    void buildMemory();
    void buildDisk();
    void buildGraphicsCard();
    void buildPower();
    Compute buildCompute();

}
