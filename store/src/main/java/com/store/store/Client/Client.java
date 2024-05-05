package com.store.store.Client;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Client 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String names;
    private String surnames;
    private String address;
    private String cellphone;
    private String email;
}
