package eu.programisci.app.pkwiu.service;

import eu.programisci.app.pkwiu.converters.PKWiUConverter;
import eu.programisci.app.pkwiu.dto.PKWiUDTO;
import eu.programisci.app.pkwiu.ob.PKWiUOB;
import eu.programisci.app.pkwiu.repository.IPKWiURepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PKWiUServiceImpl implements IPKWiUService {

    @Autowired
    private IPKWiURepository repository;

    @Autowired
    private PKWiUConverter converter;

    @Override
    public PKWiUDTO save(PKWiUDTO pkWiUDTO) {
        if(pkWiUDTO.getId() == null)
            return converter.obToDto(create(pkWiUDTO));
        return converter.obToDto(update(pkWiUDTO));
    }

    private PKWiUOB create(PKWiUDTO pkWiUDTO) {
        PKWiUOB ob = converter.dtoToOb(pkWiUDTO);
        ob = repository.save(ob);
        return ob;
    }

    private PKWiUOB update(PKWiUDTO pkWiUDTO) {
        PKWiUOB ob = repository.findOne(pkWiUDTO.getId());
        ob.setNazwa(pkWiUDTO.getNazwa());
        ob.setNumerPoziomu(pkWiUDTO.getNumerPoziomu());
        ob.setSymbol(pkWiUDTO.getSymbol());
        ob.setKolejnosc(pkWiUDTO.getKolejnosc());
        ob = repository.save(ob);
        return ob;
    }
}
