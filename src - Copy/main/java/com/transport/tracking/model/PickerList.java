package com.transport.tracking.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "XTMSPICKERSLIST")
public class PickerList implements Serializable {

    @Id
    @Column(name= "CODE")
    private String code;
    @Column(name= "DESCRIPTION")
    private String description;
    @Column(name= "LOGIN")
    private String login;

}
