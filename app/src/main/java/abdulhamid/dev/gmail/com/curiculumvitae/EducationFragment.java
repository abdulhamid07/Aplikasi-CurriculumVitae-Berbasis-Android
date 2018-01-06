package abdulhamid.dev.gmail.com.curiculumvitae;

import android.app.Fragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link EducationFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link EducationFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EducationFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    ListView listView;
    ArrayAdapter<CharSequence> adapter;

    private OnFragmentInteractionListener mListener;
    public EducationFragment() {
        // Required empty public constructor
        ;
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment EducationFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static EducationFragment newInstance(String param1, String param2) {
        EducationFragment fragment = new EducationFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
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
        View rootView = inflater.inflate(R.layout.fragment_education, container, false);
        ListView listview =(ListView) rootView.findViewById(R.id.listView1);
        final String[] items = new String[] {"STMIK AKAKOM YOGYAKARTA", "SMK MUHAMMADIYAH 1 BANTUL", "MTS NEGERI UJUNG TANJUNG", "SD NEGERI 065 TANAH PUTIH","MADRASAH DINIYAH AWALIYAH"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, items);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0) {
                    Toast.makeText(getActivity().getApplicationContext(), "TAHUN 2015-SEKARANG", Toast.LENGTH_SHORT).show();
                }else if(i==1) {
                    Toast.makeText(getActivity().getApplicationContext(), "TAHUN 2012-2015", Toast.LENGTH_SHORT).show();
                }else if(i==2) {
                    Toast.makeText(getActivity().getApplicationContext(), "TAHUN 2009-2012", Toast.LENGTH_SHORT).show();
                }else if(i==3) {
                    Toast.makeText(getActivity().getApplicationContext(), "TAHUN 2003-2009", Toast.LENGTH_SHORT).show();
                }else if(i==4) {
                    Toast.makeText(getActivity().getApplicationContext(), "TAHUN 2004-2008", Toast.LENGTH_SHORT).show();
                }

            }
        });
        return rootView;
        /*
        final String[] items = new String[] {"STMIK AKAKOM YOGYAKARTA", "SMK MUHAMMADIYAH 1 BANTUL", "MTS NEGERI UJUNG TANJUNG", "SD NEGERI 065 TANAH PUTIH"};

        View rootView = inflater.inflate(R.layout.fragment_education, container, false);
        ListView listView=(ListView) rootView.findViewById(R.id.listView1);
        List<Student> listStudent=new ArrayList<Student>();

        Student student,student2,student3;

        student=new Student();
        student.setImage(R.drawable.ic_school_black_24dp);
        student.setSekolah("STMIK AKAKOM YOGYAKARTA");
        student.setTahun("2015-sekarang");

        listStudent.add(student);

        student2=new Student();
        student2.setImage(R.drawable.ic_school_black_24dp);
        student2.setSekolah("SMK MUHAMMADIYAH 1 BANTUL");
        student2.setTahun("2012-2015");

        listStudent.add(student2);

        student3=new Student();
        student3.setImage(R.drawable.ic_school_black_24dp);
        student3.setSekolah("MTS NEGERI UJUNG TANJUNG");
        student3.setTahun("2009-2012");
        listStudent.add(student3);

        listView.setAdapter(new StudentAdapter(getActivity(),R.layout.fragment_education,listStudent));
       // ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, items);
        //listview.setAdapter(adapter);
        return rootView;*/
    }
    //TODO: Rename method, update argument and hook method into UI event
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
