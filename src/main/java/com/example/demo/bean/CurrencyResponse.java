package com.example.demo.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class CurrencyResponse implements Serializable {
    private Double usd;
    private Double eur;

}
