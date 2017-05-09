package eu.programisci.app.pkwiu.dto;


public class PKWiUDictDTO {
    private String symbol;
    private String nazwa;
    private Integer numerPoziomu;

    public PKWiUDictDTO() {}

    public PKWiUDictDTO(String aSymbol, String aNazwa, Integer aNumerPoziomu) {
        symbol = aSymbol;
        nazwa = aNazwa;
        numerPoziomu = aNumerPoziomu;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Integer getNumerPoziomu() {
        return numerPoziomu;
    }

    public void setNumerPoziomu(Integer numerPoziomu) {
        this.numerPoziomu = numerPoziomu;
    }
}
