package com.example.modelbuilderdemo.pojo;

import com.example.modelbuilderdemo.pojo.vo.*;

public class Compute {
    private CPU cpu;    //dpu
    private Mainboard mainboard;    //主板
    private Memory memory;  //内存
    private Disk disk;  //硬盘
    private Fan fan;    //风扇
    private GraphicsCard graphicsCard;  //显卡
    private Power power;    //电源

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Mainboard getMainboard() {
        return mainboard;
    }

    public void setMainboard(Mainboard mainboard) {
        this.mainboard = mainboard;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Disk getDisk() {
        return disk;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    public Fan getFan() {
        return fan;
    }

    public void setFan(Fan fan) {
        this.fan = fan;
    }

    public GraphicsCard getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public Power getPower() {
        return power;
    }

    public void setPower(Power power) {
        this.power = power;
    }

}