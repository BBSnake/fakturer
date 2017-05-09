package eu.programisci.app.pkwiu.repository;

import eu.programisci.app.pkwiu.ob.PKWiUOB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPKWiURepository extends JpaRepository<PKWiUOB, Long>{
}
