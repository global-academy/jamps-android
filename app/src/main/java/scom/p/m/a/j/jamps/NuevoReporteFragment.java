package scom.p.m.a.j.jamps;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link NuevoReporteFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link NuevoReporteFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NuevoReporteFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private ArrayList<Reporte> reportes;

    private OnFragmentInteractionListener mListener;
    private ListView listView;


    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment NuevoReporteFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static NuevoReporteFragment newInstance(String param1, String param2) {
        NuevoReporteFragment fragment = new NuevoReporteFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public NuevoReporteFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragmentView = inflater.inflate(R.layout.fragment_nuevo_reporte, container, false);
        reportes =new ArrayList<Reporte>();

        reportes.add(new Reporte("Pelea 1", "direccion de la imagen"));
        reportes.add(new Reporte("Pelea 2", "direccion de la imagen"));
        reportes.add(new Reporte("Pelea 3", "direccion de la imagen"));
        reportes.add(new Reporte("Pelea 4", "direccion de la imagen"));
        reportes.add(new Reporte("Pelea 5", "direccion de la imagen"));
        reportes.add(new Reporte("Pelea 6", "direccion de la imagen"));
        reportes.add(new Reporte("Pelea 7", "direccion de la imagen"));

        listView = (ListView) fragmentView.findViewById(R.id.listView);

       ReporteAdapter adapter = new ReporteAdapter(getActivity(), R.layout.reporte, reportes);
        listView.setAdapter(adapter);
        Button button = (Button) fragmentView.findViewById(R.id.nuevo_reporte);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), CrearReporteActivity.class);
                startActivity(i);
            }
        });
        return fragmentView;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnFragmentInteractionListener) activity;
        } catch (ClassCastException e) {
          //  throw new ClassCastException(activity.toString()
          //          + " must implement OnFragmentInteractionListener");
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
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragmenbutton3ts/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onFragmentInteraction(Uri uri);
    }

    public void okAceptar(View view)
    {
        Intent i = new Intent(getActivity(), CrearReporteActivity.class);
        startActivity(i);
    }


}





