package vn.edu.usth.mobilemid;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProfileFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfileFragment extends Fragment {
    private ImageView go_statusLayout;
    private LinearLayout go_repoLayout;
    private LinearLayout go_starLayout;
    private LinearLayout go_orgLayout;
    private LinearLayout go_popularLayout;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ProfileFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ProfileFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ProfileFragment newInstance(String param1, String param2) {
        ProfileFragment fragment = new ProfileFragment();
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
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        go_statusLayout = view.findViewById(R.id.open_status);
        go_repoLayout = view.findViewById(R.id.repositoriesLayout);
        go_starLayout = view.findViewById(R.id.starredLayout);
        go_orgLayout = view.findViewById(R.id.organizationsLayout);
        go_popularLayout = view.findViewById(R.id.profile_popular);

        go_statusLayout.setOnClickListener(view10 -> switchToFragment(15));
        go_popularLayout.setOnClickListener(view11 -> switchToFragment(16));
        go_repoLayout.setOnClickListener(view12 -> switchToFragment(17));
        go_starLayout.setOnClickListener(view13 -> switchToFragment(18));
        go_orgLayout.setOnClickListener(view14 -> switchToFragment(19));


        return view;
    }
    private void switchToFragment(int position){
        if (getActivity()instanceof PrimeActivity){
            ((PrimeActivity)getActivity()).switchToFragment(position);
        }
    }
}