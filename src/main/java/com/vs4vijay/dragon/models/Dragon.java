package com.vs4vijay.dragon.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Dragon {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String power;

}