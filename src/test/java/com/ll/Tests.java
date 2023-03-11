package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("1 + 1 = 2")
    void t1() {
        assertThat(Calc.run("1 + 1")).isEqualTo(2);
    }

    @Test
    @DisplayName("2 + 1 = 3")
    void t2() {
        assertThat(Calc.run("2 + 1")).isEqualTo(3);
    }

    @Test
    @DisplayName("100 + 210 = 310")
    void t3() {
        assertThat(Calc.run("100 + 210")).isEqualTo(310);
    }

    @Test
    @DisplayName("1 - 2 = -1")
    void t4() {
        assertThat(Calc.run("1 - 2")).isEqualTo(-1);
    }

    @Test
    @DisplayName("1 - 2 + 3 = 2")
    void t5() {
        assertThat(Calc.run("1 - 2 + 3")).isEqualTo(2);
    }
}
