package vn.edu.usth.mobilemid;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {
    private LinearLayout go_starredLayout;
    private LinearLayout go_orgnizationsLayout;
    private LinearLayout go_repositoriesLayout;
    private LinearLayout go_projectLayout;
    private LinearLayout go_discussionsLayout;
    private LinearLayout go_pullLayout;
    private LinearLayout go_issuesLayout;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
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
        View view = inflater.inflate(R.layout.fragment_home,container,false);

        Button switchButton11 = view.findViewById(R.id.go_to_home_fav);
        switchButton11.setOnClickListener(v ->{
            ((PrimeActivity)getActivity()).switchToFragment(11);
        });

        Button switchButton12 = view.findViewById(R.id.go_to_home_shortcuts);
        switchButton12.setOnClickListener(v ->{
            ((PrimeActivity)getActivity()).switchToFragment(12);
        });

        go_issuesLayout = view.findViewById(R.id.issues_button_home);
        go_pullLayout = view.findViewById(R.id.pull_request_button_home);
        go_discussionsLayout = view.findViewById(R.id.discussion_button_home);
        go_projectLayout = view.findViewById(R.id.project_button_home);
        go_repositoriesLayout = view.findViewById(R.id.Repositories_button_home);
        go_orgnizationsLayout = view.findViewById(R.id.organizations_button_home);
        go_starredLayout = view.findViewById(R.id.starred_button_home);

        go_issuesLayout.setOnClickListener(view1 -> switchToFragment(4));
        go_pullLayout.setOnClickListener(view2 -> switchToFragment(5));
        go_discussionsLayout.setOnClickListener(view3 -> switchToFragment(6));
        go_projectLayout.setOnClickListener(view4 -> switchToFragment(7));
        go_repositoriesLayout.setOnClickListener(view5 -> switchToFragment(8));
        go_orgnizationsLayout.setOnClickListener(view6 -> switchToFragment(9));
        go_starredLayout.setOnClickListener(view7 -> switchToFragment(10));

        return view;
    }
    private void switchToFragment(int position){
        if (getActivity() instanceof PrimeActivity){
            ((PrimeActivity)getActivity()).switchToFragment(position);
        }
    }
}