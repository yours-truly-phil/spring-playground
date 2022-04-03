package com.example.auditingplayground.data;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Data
@ToString(callSuper = true)
@Entity
@RequiredArgsConstructor
@NoArgsConstructor
public class Person extends AuditModel {

    @Id @GeneratedValue
    private Long id;
    @NonNull
    private String name;

}
