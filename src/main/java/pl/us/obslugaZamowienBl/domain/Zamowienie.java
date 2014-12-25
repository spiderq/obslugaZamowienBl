package pl.us.obslugaZamowienBl.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by kuba
 */
@Entity
@Table(name = "Zamowienie")
public class Zamowienie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "dataRealizacji")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataRealizacji;

    @Column(name = "dataZamowienia")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataZamowienia;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "idPracownikKasa"),
            @JoinColumn(name = "idStanowiskoKasa")
    })
    private Pracownik pracownikKasa;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "idPracownikKierownik"),
            @JoinColumn(name = "idStanowiskoKierownik")
    })
    private Pracownik pracownikKierownik;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataRealizacji() {
        return dataRealizacji;
    }

    public void setDataRealizacji(Date dataRealizacji) {
        this.dataRealizacji = dataRealizacji;
    }

    public Date getDataZamowienia() {
        return dataZamowienia;
    }

    public void setDataZamowienia(Date dataZamowienia) {
        this.dataZamowienia = dataZamowienia;
    }

    public Pracownik getPracownikKasa() {
        return pracownikKasa;
    }

    public void setPracownikKasa(Pracownik pracownikKasa) {
        this.pracownikKasa = pracownikKasa;
    }

    public Pracownik getPracownikKierownik() {
        return pracownikKierownik;
    }

    public void setPracownikKierownik(Pracownik pracownikKierownik) {
        this.pracownikKierownik = pracownikKierownik;
    }
}
