package eu.programisci.app.pkwiu.converters;

import eu.programisci.app.pkwiu.dto.PKWiUDTO;
import eu.programisci.app.pkwiu.dto.PKWiUDictDTO;
import eu.programisci.app.pkwiu.ob.PKWiUOB;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PKWiUConverter {

    public PKWiUDTO obToDto(PKWiUOB in) {
        PKWiUDTO out = new PKWiUDTO();
        out.setId(in.getId());
        out.setKolejnosc(in.getKolejnosc());
        out.setNazwa(in.getNazwa());
        out.setSymbol(in.getSymbol());
        out.setNumerPoziomu(in.getNumerPoziomu());
        return out;
    }

    public PKWiUOB dtoToOb(PKWiUDTO in) {
        PKWiUOB out = new PKWiUOB();
        out.setId(in.getId());
        out.setKolejnosc(in.getKolejnosc());
        out.setSymbol(in.getSymbol());
        out.setNazwa(in.getNazwa());
        out.setNumerPoziomu(in.getNumerPoziomu());
        return out;
    }

    public PKWiUDictDTO dtoToDictDto(PKWiUDTO in) {
        PKWiUDictDTO out = new PKWiUDictDTO();
        out.setNazwa(in.getNazwa());
        out.setSymbol(in.getSymbol());
        out.setNumerPoziomu(in.getNumerPoziomu());
        return out;
    }

    public List<PKWiUDictDTO> dtoListToDictDtoList(List<PKWiUDTO> inList) {
        if(inList == null)
            return null;
        List<PKWiUDictDTO> outList = new ArrayList<>();
        for(PKWiUDTO dto : inList)
            outList.add(dtoToDictDto(dto));
        return outList;
    }
}
