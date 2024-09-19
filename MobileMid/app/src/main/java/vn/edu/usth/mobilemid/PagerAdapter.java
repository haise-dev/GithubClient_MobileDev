package vn.edu.usth.mobilemid;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class PagerAdapter extends FragmentStateAdapter {

    public PagerAdapter(@NonNull FragmentActivity fragmentActivity, @NonNull Lifecycle lifecycle) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Log.d("Pager", "Fragment" + position);
        switch (position){
            case 0:
                return new HomeFragment();
            case 1:
                return new NotificationFragment();
            case 2:
                return new ExploreFragment();
            case 3:
                return new ProfileFragment();
            case 4:
                return new HomeIssuesFragment();
            case 5:
                return new HomePullRequestFragment();
            case 6:
                return new HomeDiscussionsFragment();
            case 7:
                return new HomeProjectFragment();
            case 8:
                return new HomeRepositoriesFragment();
            case 9:
                return new HomeOrganizationsFragment();
            case 10:
                return new HomeStarredFragment();
            case 11:
                return new HomeFavoritesFragment();
            case 12:
                return new HomeShortcutsFragment();
            case 13:
                return new ExploreTrendingRepFragment();
            case 14:
                return new ExploreAwesomeFragment();
            case 15:
                return new ProfileStatusFragment();
            case 16:
                return new ProfilePopularFragment();
            case 17:
                return new ProfileRepositoriesFragment();
            case 18:
                return new ProfileStarredFragment();
            case 19:
                return new ProfileOrganizationsFragment();
            case 20:
                return new ErrorFragment();
            default:
                return new HomeFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 21;
    }
}
