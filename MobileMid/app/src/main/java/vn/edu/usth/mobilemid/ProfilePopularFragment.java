package vn.edu.usth.mobilemid;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProfilePopularFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfilePopularFragment extends Fragment {
    private TextView go_profileLayout;
    private TextView open_action;
    private TextView open_pull;
    private TextView open_more;
    private ImageView open_setting;
    private TextView open_branch;
    private TextView open_commit;
    private TextView open_code;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ProfilePopularFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ProfilePopularFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ProfilePopularFragment newInstance(String param1, String param2) {
        ProfilePopularFragment fragment = new ProfilePopularFragment();
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
        View view = inflater.inflate(R.layout.fragment_profile_popular, container, false);
        go_profileLayout = view.findViewById(R.id.back_button);
        open_action = view.findViewById(R.id.open_action);
        open_pull = view.findViewById(R.id.open_pull);
        open_more = view.findViewById(R.id.open_more);
        open_branch = view.findViewById(R.id.open_branch);
        open_code = view.findViewById(R.id.open_code);
        open_commit = view.findViewById(R.id.open_commits);
        open_setting = view.findViewById(R.id.open_setting);

        go_profileLayout.setOnClickListener(v -> switchToFragment(3));
        open_action.setOnClickListener(v -> switchToFragment(20));
        open_pull.setOnClickListener(v -> switchToFragment(20));
        open_more.setOnClickListener(v -> switchToFragment(20));
        open_branch.setOnClickListener(v -> switchToFragment(20));
        open_commit.setOnClickListener(v -> switchToFragment(20));
        open_code.setOnClickListener(v -> switchToFragment(20));
        open_setting.setOnClickListener(v -> switchToFragment(20));
        return view;
    }
    private void switchToFragment(int position){
        if (getActivity()instanceof PrimeActivity){
            ((PrimeActivity)getActivity()).switchToFragment(position);
        }
    }
}