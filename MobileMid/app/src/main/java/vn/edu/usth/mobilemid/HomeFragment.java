    package vn.edu.usth.mobilemid;

    import android.os.Bundle;
    import android.view.LayoutInflater;
    import android.view.View;
    import android.view.ViewGroup;
    import androidx.annotation.NonNull;
    import androidx.fragment.app.Fragment;
    import androidx.recyclerview.widget.ItemTouchHelper;
    import androidx.recyclerview.widget.LinearLayoutManager;
    import androidx.recyclerview.widget.RecyclerView;
    import java.util.ArrayList;
    import java.util.List;


    public class HomeFragment extends Fragment implements AdapterforHomedrag.OnItemClickListener {
        private RecyclerView recyclerView;
        private AdapterforHomedrag recyclerAdapter;
        private List<Item> itemsList;

        public HomeFragment() {
            // Required empty public constructor
        }

        public static HomeFragment newInstance(String param1, String param2) {
            HomeFragment fragment = new HomeFragment();
            Bundle args = new Bundle();
            args.putString("param1", param1);
            args.putString("param2", param2);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            // Khởi tạo danh sách
            itemsList = new ArrayList<>();
            itemsList.add(new Item("Issues", R.drawable.issue));
            itemsList.add(new Item("Pull Request", R.drawable.pull));
            itemsList.add(new Item("Discussions", R.drawable.discussion));
            itemsList.add(new Item("Project", R.drawable.project));
            itemsList.add(new Item("Repositories", R.drawable.repo));
            itemsList.add(new Item("Organizations", R.drawable.org));
            itemsList.add(new Item("Starred", R.drawable.star));
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_home, container, false);

            // Khởi tạo RecyclerView
            recyclerView = view.findViewById(R.id.recyclerView);
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

            // Thiết lập adapter
            recyclerAdapter = new AdapterforHomedrag(itemsList);
            recyclerAdapter.setOnItemClickListener(this);
            recyclerView.setAdapter(recyclerAdapter);

            // Thiết lập drag & drop
            ItemTouchHelper.SimpleCallback simpleCallback = new ItemTouchHelper.SimpleCallback(
                    ItemTouchHelper.UP | ItemTouchHelper.DOWN, 0) {
                @Override
                public boolean onMove(@NonNull RecyclerView recyclerView,
                                      @NonNull RecyclerView.ViewHolder viewHolder,
                                      @NonNull RecyclerView.ViewHolder target) {
                    int fromPosition = viewHolder.getAdapterPosition();
                    int toPosition = target.getAdapterPosition();

                    // Hoán đổi items trong list
                    Item movedItem = itemsList.remove(fromPosition);
                    itemsList.add(toPosition, movedItem);

                    // Thông báo cho adapter
                    recyclerAdapter.notifyItemMoved(fromPosition, toPosition);
                    return true;
                }

                @Override
                public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
                    // Không cần xử lý swipe
                }
            };

            ItemTouchHelper itemTouchHelper = new ItemTouchHelper(simpleCallback);
            itemTouchHelper.attachToRecyclerView(recyclerView);

            View addFavoritesButton = view.findViewById(R.id.go_to_home_fav);
            View getStartedButton = view.findViewById(R.id.go_to_home_shortcuts);

            addFavoritesButton.setOnClickListener(v -> {
                switchToFragment(11);
            });

            getStartedButton.setOnClickListener(v -> {
                switchToFragment(12);
            });

            return view;
        }
        @Override
        public void onItemClick(int position) {
            Item clickedItem = itemsList.get(position);
            String itemName = clickedItem.getTitle();

            // Chuyển đến fragment tương ứng dựa trên tên của item
            switch (itemName) {
                case "Issues":
                    switchToFragment(4);
                    break;
                case "Pull Request":
                    switchToFragment(5);
                    break;
                case "Discussions":
                    switchToFragment(6);
                    break;
                case "Project":
                    switchToFragment(7);
                    break;
                case "Repositories":
                    switchToFragment(8);
                    break;
                case "Organizations":
                    switchToFragment(9);
                    break;
                case "Starred":
                    switchToFragment(10);
                    break;
            }
        }

        private void switchToFragment(int position) {
            if (getActivity() instanceof PrimeActivity) {
                ((PrimeActivity) getActivity()).switchToFragment(position);
            }
        }
    }

