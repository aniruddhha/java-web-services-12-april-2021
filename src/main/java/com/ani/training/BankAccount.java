package com.ani.training;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BankAccount {

    @Id
    private Integer id;
    private String acNm;
    private Integer bal;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAcNm() {
        return acNm;
    }

    public void setAcNm(String acNm) {
        this.acNm = acNm;
    }

    public Integer getBal() {
        return bal;
    }

    public void setBal(Integer bal) {
        this.bal = bal;
    }
}
