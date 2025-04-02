package com.grass.project.model;

import lombok.*;

import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity

//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

@Table(name = "grantType", uniqueConstraints = @UniqueConstraint(columnNames = "id"))
public class grantType {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    private String type;
    private String g_name;
}
