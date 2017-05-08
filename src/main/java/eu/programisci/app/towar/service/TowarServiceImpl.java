package eu.programisci.app.towar.service;

import eu.programisci.app.towar.converters.TowarConverter;
import eu.programisci.app.towar.dto.EJednostkaMiary;
import eu.programisci.app.towar.dto.TowarDTO;
import eu.programisci.app.towar.ob.TowarOB;
import eu.programisci.app.towar.repository.ITowarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class TowarServiceImpl implements ITowarService {

    @Autowired
    private ITowarRepository towarRepository;

    @Autowired
    private TowarConverter towarConverter;

    @Override
    public TowarDTO findOne(Long id) {
        TowarOB ob = towarRepository.findOne(id);
        return towarConverter.obToDto(ob);
    }

    @Override
    public List<TowarDTO> findAll() {
        List<TowarOB> obList = towarRepository.findAll();
        return towarConverter.obListToDtoList(obList);
    }

    @Override
    public void deleteOne(Long id) {
        towarRepository.delete(id);
    }

    @Override
    public TowarDTO save(TowarDTO towarDTO) {
        if(towarDTO.getId() == null)
            return towarConverter.obToDto(create(towarDTO));
        return towarConverter.obToDto(update(towarDTO));
    }

    private TowarOB create(TowarDTO towarDTO) {
        TowarOB ob = towarConverter.dtoToOb(towarDTO);
        ob.setCreationDate(new Date());
        ob = towarRepository.save(ob);
        return ob;
    }

    private TowarOB update(TowarDTO towarDTO) {
        TowarOB ob = towarRepository.findOne(towarDTO.getId());
        ob.setNazwa(towarDTO.getNazwa());
        ob.setPkwiu(towarDTO.getPkwiu());
        ob.setJednostkaMiary(towarDTO.getJednostkaMiary());
        ob.setVat(towarDTO.getVat());
        ob.setCenaNetto(towarDTO.getCenaNetto());
        ob = towarRepository.save(ob);
        return ob;
    }

    @Override
    public List<EJednostkaMiary> getJednostkiMiary() {
        return Arrays.asList(EJednostkaMiary.values());
    }


}
