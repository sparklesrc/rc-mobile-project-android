package pe.com.sparkles.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by SPARKLES on 06/09/2017.
 */

public class Amistad {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("idUsuario")
    @Expose
    private String idUsuario;
    @SerializedName("idAmistad")
    @Expose
    private String idAmistad;
    @SerializedName("ubicacion")
    @Expose
    private Ubicacion ubicacion;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdAmistad() {
        return idAmistad;
    }

    public void setIdAmistad(String idAmistad) {
        this.idAmistad = idAmistad;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }
}
