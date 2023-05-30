package com.example.Formula1Data.Piloto;

import jakarta.persistence.*;

@Table(name = "pilots")
@Entity(name = "pilots")
public class Piloto {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String imagemPiloto;
    private String equipe;
    private String imagemEquipe;
    private Integer vitorias;
}
