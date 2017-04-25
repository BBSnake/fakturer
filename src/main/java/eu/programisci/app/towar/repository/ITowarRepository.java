package eu.programisci.app.towar.repository;

import eu.programisci.app.towar.dto.TowarDTO;
import eu.programisci.app.towar.ob.TowarOB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITowarRepository extends JpaRepository<TowarOB, Long> {
}
