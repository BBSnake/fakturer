package eu.programisci.app.pkwiu.ob;

import javax.persistence.*;

@Entity
@Table(name = "pkwiu")
@SequenceGenerator(allocationSize = 1, name = "SEKWENCJA", sequenceName = "gen_pkwiu_id")
public class PKWiUOB {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEKWENCJA")
    private Long id;

    @Column(name = "kolejnosc")
    private Long kolejnosc;

    @Column(name = "symbol")
    private String symbol;

    @Column(name = "nazwa")
    private String nazwa;

    @Column(name = "numerPoziomu")
    private Integer numerPoziomu;

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
