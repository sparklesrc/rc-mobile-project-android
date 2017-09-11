package pe.com.sparkles.service;

import java.util.ArrayList;
import java.util.List;

import pe.com.sparkles.model.Amistad;
import pe.com.sparkles.model.LugarRequest;
import pe.com.sparkles.model.MusicaLugar;
import pe.com.sparkles.model.Preferencia;
import pe.com.sparkles.model.TipoLugar;
import pe.com.sparkles.model.Ubicacion;
import pe.com.sparkles.service.RetrofitClient;

/**
 * Created by SPARKLES on 06/09/2017.
 */

public class ApiUtils {

    private ApiUtils() {}

    public static final String BASE_URL = "http://192.168.1.29:8080/";
    public static final String APP_USER = "sparkles";
    public static final String APP_PASS = "sparkles";
    /*
    public static ApiService getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(ApiService.class);
    }
    */

    public static LugarRequest prepareLugarRequest(){
        LugarRequest lr = new LugarRequest();

        Ubicacion ub = new Ubicacion();
        ub.setLatitude("latitude");
        ub.setLongitude("longitude");
        ub.setCodigoPostal("lima01");

        Preferencia pre = new Preferencia();
        TipoLugar tl = new TipoLugar();
        tl.setId("123");
        tl.setDescripcion("BAR");
        List<TipoLugar> ltl = new ArrayList<>();
        ltl.add(tl);

        MusicaLugar ml = new MusicaLugar();
        ml.setId("123");
        ml.setDescripcion("ROCK");
        List<MusicaLugar> lml = new ArrayList<>();
        lml.add(ml);

        pre.setTipoLugar(ltl);
        pre.setMusicaLugar(lml);

        Amistad am = new Amistad();
        am.setId("");
        am.setIdUsuario("");
        am.setIdAmistad("");
        am.setUbicacion(ub);
        List<Amistad> lam = new ArrayList<>();
        lam.add(am);

        lr.setUbicacion(ub);
        lr.setPreferencia(pre);
        lr.setAmistad(lam);
        lr.setIdUsuario("12345");

        return lr;
    }
}
