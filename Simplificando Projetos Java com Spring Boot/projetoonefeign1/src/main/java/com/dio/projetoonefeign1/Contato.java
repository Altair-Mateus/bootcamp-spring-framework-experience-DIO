package com.dio.projetoonefeign1;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Contato {
    
    private Long id;
    private String nome;
    private String telefone;

}
