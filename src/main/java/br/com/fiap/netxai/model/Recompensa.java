package br.com.fiap.netxai.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Recompensa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRecompensa;

    @NotBlank(message = "O tipo de recompensa é obrigatório.")
    @Size(max = 50, message = "O tipo de recompensa deve ter no máximo 50 caracteres.")
    private String tipoRecompensa;

    @NotBlank(message = "A descrição é obrigatória.")
    @Size(max = 255, message = "A descrição deve ter no máximo 255 caracteres.")
    private String descricao;

    private LocalDateTime dataResgate;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;  // Relacionamento com o cliente que resgatou a recompensa

}
