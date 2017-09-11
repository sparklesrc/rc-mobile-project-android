package pe.com.sparkles.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by SPARKLES on 06/09/2017.
 */

public class Lugar {

    @SerializedName("id")
    @Expose
    private Object id;
    @SerializedName("razonSocial")
    @Expose
    private String razonSocial;
    @SerializedName("ruc")
    @Expose
    private String ruc;
    @SerializedName("telefono")
    @Expose
    private String telefono;
    @SerializedName("direccion")
    @Expose
    private String direccion;
    @SerializedName("representanteLegal")
    @Expose
    private String representanteLegal;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("paginaWeb")
    @Expose
    private String paginaWeb;
    @SerializedName("macroPlace")
    @Expose
    private Object macroPlace;
    @SerializedName("tipoLugar")
    @Expose
    private Object tipoLugar;
    @SerializedName("ubicacion")
    @Expose
    private Object ubicacion;
    @SerializedName("amistad")
    @Expose
    private Object amistad;
    @SerializedName("cantEstrellas")
    @Expose
    private Object cantEstrellas;
    @SerializedName("musicaLugar")
    @Expose
    private Object musicaLugar;

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public Object getMacroPlace() {
        return macroPlace;
    }

    public void setMacroPlace(Object macroPlace) {
        this.macroPlace = macroPlace;
    }

    public Object getTipoLugar() {
        return tipoLugar;
    }

    public void setTipoLugar(Object tipoLugar) {
        this.tipoLugar = tipoLugar;
    }

    public Object getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Object ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Object getAmistad() {
        return amistad;
    }

    public void setAmistad(Object amistad) {
        this.amistad = amistad;
    }

    public Object getCantEstrellas() {
        return cantEstrellas;
    }

    public void setCantEstrellas(Object cantEstrellas) {
        this.cantEstrellas = cantEstrellas;
    }

    public Object getMusicaLugar() {
        return musicaLugar;
    }

    public void setMusicaLugar(Object musicaLugar) {
        this.musicaLugar = musicaLugar;
    }

    @Override
    public String toString() {
        return "LUGAR: {" + "\n" +
                "Razon Social='" + razonSocial + '\'' + "\n" +
                "Direccion='" + direccion + '\'' + "\n" +
                "}";
    }
}
