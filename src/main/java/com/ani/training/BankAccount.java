package com.ani.training;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BankAccount {

    @Id
    private Integer id;
    private String acNm;
    private Integer bal;
}
