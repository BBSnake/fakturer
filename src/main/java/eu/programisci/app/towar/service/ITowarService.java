package eu.programisci.app.towar.service;

import eu.programisci.app.towar.dto.EJednostkaMiary;
import eu.programisci.app.towar.dto.TowarDTO;

import java.util.List;

public interface ITowarService {
    TowarDTO findOne(Long id);
    List<TowarDTO> findAll();
    void deleteOne(Long id);
    TowarDTO save(TowarDTO towarDTO);
    List<EJednostkaMiary> getJednostkiMiary();
}
