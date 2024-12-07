package ma.projet.grpc.services;

import ma.projet.grpc.entities.Comppte;
import ma.projet.grpc.repositories.CompteRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CompteService {
    private final CompteRepository compteRepository;

    public CompteService(CompteRepository compteRepository) {
        this.compteRepository = compteRepository;
    }

    public List<Comppte> findAllComptes() {
        return compteRepository.findAll();
    }

    public Comppte findCompteById(String id) {
        return compteRepository.findById(id).orElse(null);
    }
    @Transactional
    public Comppte saveCompte(Comppte compte) {
        System.out.println("Saving compte: " + compte);
        return compteRepository.save(compte);
    }

    public void deleteCompte(String id) {
        compteRepository.deleteById(id);
    }
}