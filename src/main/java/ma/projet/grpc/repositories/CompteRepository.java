package ma.projet.grpc.repositories;

import ma.projet.grpc.entities.Comppte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Comppte, String> {
}
