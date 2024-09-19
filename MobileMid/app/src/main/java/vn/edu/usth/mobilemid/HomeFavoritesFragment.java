package vn.edu.usth.mobilemid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HomeFavoritesFragment extends Fragment {
    private Button go_homeLayout;

    private Button btnCancel, btnDone;
    private EditText searchBar;
    private TextView noRepositoriesSelected, selectRepositories;
    private LinearLayout pp2024Layout, mobiledev2024Layout;
    private ImageButton pp2024Icon, mobiledev2024Icon;
    private TextView pp2024TextView, mobiledev2024TextView;
    private TextView haisedevPp2024, haisedevMd2024;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home_favorites, container, false);
        go_homeLayout = view.findViewById(R.id.btn_cancel);
        go_homeLayout.setOnClickListener(v -> switchToFragment(0));
        return view;
    }
    private void switchToFragment(int position){
        if (getActivity()instanceof PrimeActivity){
            ((PrimeActivity)getActivity()).switchToFragment(position);
        }
    }
}