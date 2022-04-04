package com.company.products;

public enum ShoeSize {
    SIZE1(39),
    SIZE2(40),
    SIZE3(41),
    SIZE4(42),
    SIZE5(43),
    SIZE6(44),
    SIZE7(45),
    SIZE8(46);
    private final int value;

    ShoeSize(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
