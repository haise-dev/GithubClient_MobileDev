package vn.edu.usth.mobilemid;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;


public class PrimeActivity extends AppCompatActivity {
    public static final String on_command ="PrimeActivity";
    private ViewPager2 viewPager2;
    private PagerAdapter primePagerAdapter;
    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_prime);
        if (getSupportActionBar() !=null){
            getSupportActionBar().hide();
        }
        setContentView(R.layout.activity_prime);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        viewPager2 = findViewById(R.id.viewPager2);
        tabLayout = findViewById(R.id.tabLayout);

        primePagerAdapter = new PagerAdapter(this, getLifecycle());
        viewPager2.setAdapter(primePagerAdapter);
        viewPager2.setUserInputEnabled(false);

        new TabLayoutMediator(tabLayout, viewPager2, (tab, position) -> {
            switch (position){
                case 0:
                    tab.setIcon(R.drawable.home_tab);
                    break;
                case 1:
                    tab.setIcon(R.drawable.noti_tab);
                    break;
                case 2:
                    tab.setIcon(R.drawable.navigation);
                    break;
                case 3:
                    tab.setIcon(R.drawable.furina);
                    break;
                default:
                    tab.view.setVisibility(View.GONE);
            }
        }).attach();

    }
    public void switchToFragment(int position){
        Log.d("Prime", "Fragment placement" + position);
        viewPager2.setCurrentItem(position,false);
    }
}