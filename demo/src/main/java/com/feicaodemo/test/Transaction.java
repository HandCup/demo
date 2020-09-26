package com.feicaodemo.test;

import lombok.Data;
import lombok.ToString;

/**
 * @author Caofei
 * @className Transaction
 * @description TODO
 * @date {2020/9/13} 18:48
 */
@Data
@ToString
public class Transaction {
    private final Trader trader;
    private final int year;
    private final int value;
}
