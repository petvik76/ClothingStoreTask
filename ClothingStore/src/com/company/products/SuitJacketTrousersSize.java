package com.company.products;

public enum SuitJacketTrousersSize {
    SIZE1(42),
    SIZE2(44),
    SIZE3(46),
    SIZE4(48),
    SIZE5(50),
    SIZE6(52),
    SIZE7(54),
    SIZE8(56),
    SIZE9(58),
    SIZE10(60),
    SIZE11(62),
    SIZE12(64),
    SIZE13(66);

    private final int value;

    SuitJacketTrousersSize(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
