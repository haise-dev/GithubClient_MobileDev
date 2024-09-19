package vn.edu.usth.mobilemid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HomeShortcutsFragment extends Fragment {

    private Button btnCancel, btnDone;
    private TextView title, createNewShortcut, suggestedShortcuts;
    private LinearLayout headerTitle, mentioned, assigned, reviewRequest;
    private ImageButton imgButtonMentioned, imgButtonAssigned, imgButtonReviewRequest;
    private ImageView imgViewMentioned, imgViewAssigned, imgViewReviewRequest;
    private RelativeLayout issuesMentionedLayout, issuesAssignedLayout, pullRequestLayout;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home_shortcuts,container, false);

        // Initialize Views
        btnCancel = view.findViewById(R.id.btn_cancel);
        btnDone = view.findViewById(R.id.btn_done);
        title = view.findViewById(R.id.title);
        createNewShortcut = view.findViewById(R.id.create_new_shortcut);
        suggestedShortcuts = view.findViewById(R.id.suggested_shortcuts);

        headerTitle = view.findViewById(R.id.header_title);
        mentioned = view.findViewById(R.id.mentioned);
        assigned = view.findViewById(R.id.assigned);
        reviewRequest = view.findViewById(R.id.reviewrequest);

        imgButtonMentioned = view.findViewById(R.id.img_button_mentioned);
        imgButtonAssigned = view.findViewById(R.id.img_button_assigned);
        imgButtonReviewRequest = view.findViewById(R.id.img_button_review_request);

        imgViewMentioned = view.findViewById(R.id.img_view_mentioned);
        imgViewAssigned = view.findViewById(R.id.img_view_assigned);
        imgViewReviewRequest = view.findViewById(R.id.img_view_review_request);

        // Setup onClickListeners
        btnCancel.setOnClickListener(v -> {
            // Handle Cancel Button Click
        });

        btnDone.setOnClickListener(v -> {
            // Handle Done Button Click
        });

        mentioned.setOnClickListener(v -> {
            // Handle Mentioned Click
        });

        assigned.setOnClickListener(v -> {
            // Handle Assigned Click
        });

        reviewRequest.setOnClickListener(v -> {
            // Handle Review Requested Click
        });
        btnCancel.setOnClickListener(v -> switchToFragment(0));

        return view;
    }
    private void switchToFragment(int position){
        if (getActivity()instanceof PrimeActivity){
            ((PrimeActivity)getActivity()).switchToFragment(position);
        }
    }
}