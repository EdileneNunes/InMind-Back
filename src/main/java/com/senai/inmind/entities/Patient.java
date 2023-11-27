package com.senai.inmind.entities;

import java.time.LocalDate;

import com.senai.inmind.dtos.PatientInputDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@EqualsAndHashCode(callSuper=true)
@Data @AllArgsConstructor @NoArgsConstructor
public class Patient extends User{

    public Patient(PatientInputDTO dto){
        this.cpf = dto.getCpf();
        this.bornDate = dto.getBornDate();
    }

    @Column(length = 11)
    private String cpf;
    private LocalDate bornDate;

}
