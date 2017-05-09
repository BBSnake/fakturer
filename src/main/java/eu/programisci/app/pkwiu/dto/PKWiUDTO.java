package eu.programisci.app.pkwiu.dto;


public class PKWiUDTO {

    private Long id;
    private Long kolejnosc;
    private String symbol;
    private String nazwa;
    private Integer numerPoziomu;

    public PKWiUDTO() {}

    public PKWiUDTO(Long aKolejnosc, String aSymbol, String aNazwa, Integer aNumerPoziomu) {
        kolejnosc = aKolejnosc;
        symbol = aSymbol;
        nazwa = aNazwa;
        numerPoziomu = aNumerPoziomu;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getKolejnosc() {
        return kolejnosc;
    }

    public void setKolejnosc(Long kolejnosc) {
        this.kolejnosc = kolejnosc;
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
