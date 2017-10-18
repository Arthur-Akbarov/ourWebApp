package com.slak.shop.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Comparator;

@Data
@AllArgsConstructor
public class Client implements Comparable<Client> {
    final int Id;
    final String firstName;
    final String lastName;
    final String login;
    final String password;

    @Override
    public int compareTo(Client client) {
        Comparator<Client> cmp1 = Comparator.comparing(a -> a.lastName);
        Comparator<Client> cmp2 = Comparator.comparing(a -> a.firstName);
        Comparator<Client> cmp = cmp1.thenComparing(cmp2);

        return cmp.compare(this, client);
    }

    @Override
    public String toString() {
        return lastName + " " + firstName;
    }
}
