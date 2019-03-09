package com.example.modelbuilderdemo.uitls;

import com.example.modelbuilderdemo.controller.ComputeDirector;
import com.example.modelbuilderdemo.pojo.Compute;
import com.example.modelbuilderdemo.pojo.vo.CPU;
import com.example.modelbuilderdemo.service.impl.ProgrammerComputeBuilder;

public class Test {

    public static void main(String [] args){
        //我想要一台符合程序员使用的电脑
        Compute programmerCompute = new ComputeDirector(new ProgrammerComputeBuilder()).constructComputer();

        //查一下cpu
        CPU cpu = programmerCompute.getCpu();
        cpu.name();
    }

}
