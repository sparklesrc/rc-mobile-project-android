package pe.com.sparkles.rc_mobile_project_android;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import pe.com.sparkles.model.Amistad;
import pe.com.sparkles.model.HolaResponse;
import pe.com.sparkles.model.LugarRequest;
import pe.com.sparkles.model.LugarResponse;
import pe.com.sparkles.model.MusicaLugar;
import pe.com.sparkles.model.Preferencia;
import pe.com.sparkles.model.TipoLugar;
import pe.com.sparkles.model.Ubicacion;
import pe.com.sparkles.service.ApiService;
import pe.com.sparkles.service.ApiUtils;
import pe.com.sparkles.service.RetrofitClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragmentLosPoints.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class FragmentLosPoints extends Fragment {

    private OnFragmentInteractionListener mListener;

    private TextView mResponseTv;
    private ApiService mAPIService;

    public FragmentLosPoints() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_los_points, container, false);
        mResponseTv = getTextViewById(view, R.id.textLosPoints);

        ApiService apiService = RetrofitClient.createService(ApiService.class, "sparkles", "sparkles");

        LugarRequest request = getRequest();

        Call<LugarResponse> call = apiService.getLugares(request);
        call.enqueue(new Callback<LugarResponse>() {
            @Override
            public void onResponse(Call<LugarResponse> call, Response<LugarResponse> response) {
                mResponseTv.setText((CharSequence) response.body().toString());
            }

            @Override
            public void onFailure(Call<LugarResponse> call, Throwable t) {
                mResponseTv.setText("BASSSURA");
            }
        });

        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    private TextView getTextViewById(View view, int id) {
        return (TextView) view.findViewById(id);
    }

    private LugarRequest getRequest(){
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
