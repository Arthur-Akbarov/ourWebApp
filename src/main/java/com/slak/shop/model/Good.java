package com.slak.shop.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.text.DecimalFormat;
import java.util.Comparator;

@Data
@AllArgsConstructor
public class Good implements Comparable<Good> {
    final int Id;
    String title;
    final double price;

    @Override
    public int compareTo(Good good) {
        Comparator<Good> cmp1 = Comparator.comparing(g -> g.title);
        Comparator<Good> cmp2 = Comparator.comparing(g -> g.price);
        Comparator<Good> cmp = cmp1.thenComparing(cmp2);

        return cmp.compare(this, good);
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00$"); //₽
        return title + " : " + df.format(price);
    }
}
