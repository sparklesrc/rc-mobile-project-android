package pe.com.sparkles.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by SPARKLES on 06/09/2017.
 */

public class Preferencia {

    @SerializedName("tipoLugar")
    @Expose
    private List<TipoLugar> tipoLugar = null;
    @SerializedName("musicaLugar")
    @Expose
    private List<MusicaLugar> musicaLugar = null;

    public List<TipoLugar> getTipoLugar() {
        return tipoLugar;
    }

    public void setTipoLugar(List<TipoLugar> tipoLugar) {
        this.tipoLugar = tipoLugar;
    }

    public List<MusicaLugar> getMusicaLugar() {
        return musicaLugar;
    }

    public void setMusicaLugar(List<MusicaLugar> musicaLugar) {
        this.musicaLugar = musicaLugar;
    }
}
