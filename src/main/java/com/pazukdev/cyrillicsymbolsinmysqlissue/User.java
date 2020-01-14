package com.pazukdev.cyrillicsymbolsinmysqlissue;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Siarhei Sviarkaltsau
 */
@Data
@Entity
@Table(name = "user_table")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String name;

}
