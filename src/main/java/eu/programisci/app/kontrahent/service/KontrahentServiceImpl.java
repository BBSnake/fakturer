package eu.programisci.app.kontrahent.service;

import eu.programisci.app.kontrahent.converters.KontrahentConverter;
import eu.programisci.app.kontrahent.dto.KontrahentDTO;
import eu.programisci.app.kontrahent.ob.KontrahentOB;
import eu.programisci.app.kontrahent.repository.IKontrahentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class KontrahentServiceImpl implements IKontrahentService {

    @Autowired
    private IKontrahentRepository kontrahentRepository;

    @Autowired
    private KontrahentConverter kontrahentConverter;

    @Override
    public KontrahentDTO findOne(Long id) {
        KontrahentOB ob = kontrahentRepository.findOne(id);
        return kontrahentConverter.obToDto(ob);
    }

    @Override
    public List<KontrahentDTO> findAll() {
        List<KontrahentOB> obList = kontrahentRepository.findAll();
        return kontrahentConverter.obListToDtoList(obList);
    }

    @Override
    public void deleteOne(Long id) {
        kontrahentRepository.delete(id);
    }

    @Override
    public KontrahentDTO save(KontrahentDTO kontrahentDTO) {
        if(kontrahentDTO.getId() == null)
            return kontrahentConverter.obToDto(create(kontrahentDTO));
        return kontrahentConverter.obToDto(update(kontrahentDTO));
    }

    private KontrahentOB create(KontrahentDTO dto) {
        KontrahentOB ob = kontrahentConverter.dtoToOb(dto);
        ob.setCreationDate(new Date());
        ob = kontrahentRepository.save(ob);
        return ob;
    }

    private KontrahentOB update(KontrahentDTO dto) {
        KontrahentOB ob = kontrahentRepository.findOne(dto.getId());
        ob.setNazwa(dto.getNazwa());
        ob.setAdres(dto.getAdres());
        ob.setNip(dto.getNip());
        ob = kontrahentRepository.save(ob);
        return ob;
    }
}
