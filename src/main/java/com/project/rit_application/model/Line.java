package com.project.rit_application.model;

import javax.persistence.*;

@Entity
@Table(name = "line")
public class Line {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long line_id;
    private int count;
}
