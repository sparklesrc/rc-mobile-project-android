package pe.com.sparkles.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by SPARKLES on 06/09/2017.
 */

public class LugarRequest {

    @SerializedName("ubicacion")
    @Expose
    private Ubicacion ubicacion;
    @SerializedName("preferencia")
    @Expose
    private Preferencia preferencia;
    @SerializedName("amistad")
    @Expose
    private List<Amistad> amistad = null;
    @SerializedName("idUsuario")
    @Expose
    private String idUsuario;

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Preferencia getPreferencia() {
        return preferencia;
    }

    public void setPreferencia(Preferencia preferencia) {
        this.preferencia = preferencia;
    }

    public List<Amistad> getAmistad() {
        return amistad;
    }

    public void setAmistad(List<Amistad> amistad) {
        this.amistad = amistad;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }
}
