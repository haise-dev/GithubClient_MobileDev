package vn.edu.usth.mobilemid;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ExploreTrendingRepFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ExploreTrendingRepFragment extends Fragment {
    private TextView go_exploreLayout;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ExploreTrendingRepFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ExploreTrendingRepFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ExploreTrendingRepFragment newInstance(String param1, String param2) {
        ExploreTrendingRepFragment fragment = new ExploreTrendingRepFragment();
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
        View view = inflater.inflate(R.layout.fragment_explore_trending_rep, container, false);
        go_exploreLayout = view.findViewById(R.id.trending_back);
        go_exploreLayout.setOnClickListener(v -> switchToFragment(2));
        return view;
    }
    private void switchToFragment(int position){
        if (getActivity()instanceof PrimeActivity){
            ((PrimeActivity)getActivity()).switchToFragment(position);
        }
    }
}