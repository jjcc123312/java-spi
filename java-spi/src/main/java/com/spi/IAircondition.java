package com.spi;

public interface IAircondition {

    // 获取型号
    String getType();

    // 开关
    void turnOnOff();

    // 调节温度
    void adjustTemperature(int temperature);

    // 模式变更
    void changeModel(int modelId);
}