package pl.us.obslugaZamowienBl.domain.kluczeZlozone;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by Kuba on 2014-12-25.
 */

@Embeddable
public class ListaSkladnikowPK implements Serializable {

    @Column(name = "idDanie")
    private Integer danieId;

    @Column(name = "idSkladnik")
    private Integer skladnikId;

    public Integer getDanieId() {
        return danieId;
    }

    public void setDanieId(Integer danieId) {
        this.danieId = danieId;
    }

    public Integer getSkladnikId() {
        return skladnikId;
    }

    public void setSkladnikId(Integer skladnikId) {
        this.skladnikId = skladnikId;
    }
}
