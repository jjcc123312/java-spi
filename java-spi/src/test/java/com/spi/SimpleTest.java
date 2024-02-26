package com.spi;

import java.util.ServiceLoader;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class SimpleTest {


    /**
     * spi 发现
     */
    @Test
    public void spi() {
        ServiceLoader<IAircondition> load = ServiceLoader
            .load(IAircondition.class);

        for (IAircondition iAircondition : load) {
            System.out.println("检测到:"+iAircondition.getClass().getSimpleName());
        }

    }

}
