package graphql;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import entite.Logement;
import repository.LogementRepository;

public class Mutations implements GraphQLRootResolver {

    public LogementRepository repository;

    public Mutations(LogementRepository repository) {
        this.repository = repository;
    }

    public Logement addLogement(int reference, String adresse, String delegation, String gouvernorat, Logement.TypeL typeL, String description, float prix) {
        Logement logement = new Logement(reference, adresse, delegation, gouvernorat, typeL, description, prix);
        repository.saveLogement(logement);
        return logement;
    }
}
