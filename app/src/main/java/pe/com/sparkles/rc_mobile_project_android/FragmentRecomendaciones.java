package pe.com.sparkles.rc_mobile_project_android;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import pe.com.sparkles.model.Lugar;
import pe.com.sparkles.model.LugarRequest;
import pe.com.sparkles.model.LugarResponse;
import pe.com.sparkles.service.ApiService;
import pe.com.sparkles.service.ApiUtils;
import pe.com.sparkles.service.RetrofitClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragmentRecomendaciones.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class FragmentRecomendaciones extends Fragment {

    private OnFragmentInteractionListener mListener;

    public FragmentRecomendaciones() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_fragment_recomendaciones, container, false);
        final String[] cosasPorHacer = new String[] { "Aprender a programar en Android",
                "Hacer una aplicación famosa","Vender la aplicación","Esperar a que llegue el dinero"};

        ApiService apiService = RetrofitClient.createService(ApiService.class, ApiUtils.APP_USER, ApiUtils.APP_PASS);

        LugarRequest request = ApiUtils.prepareLugarRequest();

        Call<LugarResponse> call = apiService.getLugares(request);
        call.enqueue(new Callback<LugarResponse>() {
            @Override
            public void onResponse(Call<LugarResponse> call, Response<LugarResponse> response) {
                /*
                ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(),
                        android.R.layout.simple_list_item_1, response.body().getLugar());
                */

                String[] nombres = new String[2];
                String[] descripciones = new String[2];

                for(int i=0; i<response.body().getLugar().size(); i++){
                    nombres[i] = response.body().getLugar().get(i).getRazonSocial();
                    descripciones[i] = response.body().getLugar().get(i).getDireccion();
                }

                RecomendacionesAdapter adapter = new RecomendacionesAdapter(getActivity(), null, nombres, descripciones);


                ListView lv = (ListView) rootView.findViewById(R.id.listaRecomendaciones);

                lv.setAdapter(adapter);

                lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Toast.makeText(getActivity(), "Hiciste click en el número " + position,
                                Toast.LENGTH_LONG).show();
                    }
                });

            }

            @Override
            public void onFailure(Call<LugarResponse> call, Throwable t) {
                ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(),
                        android.R.layout.simple_list_item_1, cosasPorHacer);
                ListView miLista = (ListView) rootView.findViewById(R.id.listaRecomendaciones);
                miLista.setAdapter(arrayAdapter);
            }
        });






        return rootView;
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
}
