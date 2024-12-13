package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalculatorTest {
    @Test
    @DisplayName("1 + 2 = 3")
    public void t1() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.plus(1, 2);

        assertEquals(3, rs);
    }

    @Test
    @DisplayName("2 + 10 = 12")
    public void t2() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.plus(2, 10);

        assertEquals(12, rs);
    }

    @Test
    @DisplayName("20 + 10 = 30")
    public void t3() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.plus(20, 10);

        assertEquals(30, rs);
    }

    @Test
    @DisplayName("20 - 10 = 10")
    public void t4() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.minus(20, 10);

        assertThat(rs).isEqualTo(10);
    }

    @Test
    @DisplayName("10 - 5 = 5")
    public void t5() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.minus(10, 5);

        assertThat(rs).isEqualTo(5);
    }

    @Test
    @DisplayName("10 * 5 = 50")
    public void t6() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.multiply(10, 5);

        assertThat(rs).isEqualTo(50);
    }

    @Test
    @DisplayName("10 / 5 = 2")
    public void t7() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.division(10, 5);

        assertThat(rs).isEqualTo(2);
    }
}
