package br.com.fiap.netxai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.fiap.netxai.model.Recompensa;

public interface RecompensaRepository extends JpaRepository<Recompensa, Long> {
    // Métodos de consulta específicos podem ser adicionados aqui, se necessário
}
