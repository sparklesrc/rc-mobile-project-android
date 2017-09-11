package pe.com.sparkles.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by SPARKLES on 06/09/2017.
 */

public class LugarResponse {
    @SerializedName("lugar")
    @Expose
    private List<Lugar> lugar = null;

    public List<Lugar> getLugar() {
        return lugar;
    }

    public void setLugar(List<Lugar> lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        String resp = "";
        for(Lugar lug : lugar){
            resp += lug.toString() + "\n";
        }
        return resp;
    }
}
