package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LogicNotTest {

    @Test
    public void isEvenWhen2ThenTrue() {
        int in = 2;
        boolean real = LogicNot.isEven(in);
        Assert.assertTrue(real);
    }

    @Test
    public void isEvenWhen1ThenFalse() {
        int in = 1;
        boolean real = LogicNot.isEven(in);
        Assert.assertFalse(real);
    }

    @Test
    public void isPositiveWhen2ThenTrue() {
        int in = 2;
        boolean real = LogicNot.isPositive(in);
        Assert.assertTrue(real);
    }

    @Test
    public void isPositiveWhenm2ThenFalse() {
        int in = -2;
        boolean real = LogicNot.isPositive(in);
        Assert.assertFalse(real);
    }

    @Test
    public void notEvenWhen7ThenTrue() {
        int in = 7;
        boolean real = LogicNot.notEven(in);
        Assert.assertTrue(real);
    }

    @Test
    public void notEvenWhen8ThenFalse() {
        int in = 8;
        boolean real = LogicNot.notEven(in);
        Assert.assertFalse(real);
    }

    @Test
    public void notPositiveWhenm2ThenTrue() {
        int in = -2;
        boolean real = LogicNot.notPositive(in);
        Assert.assertTrue(real);
    }

    @Test
    public void notPositiveWhen2ThenFalse() {
        int in = 2;
        boolean real = LogicNot.notPositive(in);
        Assert.assertFalse(real);
    }

    @Test
    public void notEvenAndPositiveWhen7ThenTrue() {
        int in = 7;
        boolean real = LogicNot.notEvenAndPositive(in);
        Assert.assertTrue(real);
    }

    @Test
    public void notEvenAndPositiveWhen8ThenFalse() {
        int in = 8;
        boolean real = LogicNot.notEvenAndPositive(in);
        Assert.assertFalse(real);
    }

    @Test
    public void notEvenAndPositiveWhenm7ThenFalse() {
        int in = -7;
        boolean real = LogicNot.notEvenAndPositive(in);
        Assert.assertFalse(real);
    }

    @Test
    public void evenOrNotPositiveWhen2ThenTrue() {
        int in = 2;
        boolean real = LogicNot.evenOrNotPositive(in);
        Assert.assertTrue(real);
    }

    @Test
    public void evenOrNotPositiveWhenm2ThenTrue() {
        int in = -2;
        boolean real = LogicNot.evenOrNotPositive(in);
        Assert.assertTrue(real);
    }

    @Test
    public void evenOrNotPositiveWhenm3ThenTrue() {
        int in = -3;
        boolean real = LogicNot.evenOrNotPositive(in);
        Assert.assertTrue(real);
    }

    @Test
    public void evenOrNotPositiveWhen3ThenFalse() {
        int in = 3;
        boolean real = LogicNot.evenOrNotPositive(in);
        Assert.assertFalse(real);
    }
}