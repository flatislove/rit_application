package com.project.rit_application.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Table(name = "selling")
public class Selling {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long selling_id;
    private long selling_line;
    private Date selling_date;
}
