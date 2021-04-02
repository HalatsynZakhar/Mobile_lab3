package ua.kpi.comsys.io8207;

import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class Lab3_BookFragment extends Fragment {

    View v;
    private RecyclerView myRecycleView;
    private List<Lab3_Book> books_array;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.lab3_books, container, false);
        myRecycleView = v.findViewById(R.id.book_item_id);
        Lab3_AdapterRecView recyclerAdapter = new Lab3_AdapterRecView(getContext(), books_array);
        myRecycleView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myRecycleView.setAdapter(recyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        books_array = new ArrayList<>();

        //books_array.add(new Lab3_Book("Long title that want to break your layout. Long title that want to break your layout. Long title that want to break your layout. Long title that want to break your layout","", "Priceless", R.drawable.no_image));
        books_array.add(new Lab3_Book("iOS Components and Frameworks", "Understanding the Advanced Features of the iOS SDK",  "$23.30", R.drawable.image_01));
        books_array.add(new Lab3_Book("Learning iOS Development", "A Hands-on Guide to the Fundamentals of iOS Programming","$3.99",R.drawable.image_02));
        books_array.add(new Lab3_Book("Beginning iOS Programming", "Building and Deploying iOS Applications","$6.35", R.drawable.image_03));
        books_array.add(new Lab3_Book("Beginning iOS 5 Development", "Exploring the iOS SDK","$3.65",R.drawable.no_image));
        books_array.add(new Lab3_Book("Beginning iOS 5 Games Development", "Using the iOS SDK for iPad, iPhone and iPod touch","$36.31",R.drawable.image_05));
        books_array.add(new Lab3_Book("More iOS 6 Development", "Further Explorations of the iOS SDK","$4.95",R.drawable.image_06));
        books_array.add(new Lab3_Book("Beginning iOS 6 Development", "Exploring the iOS SDK", "$5.34",R.drawable.image_07));
        books_array.add(new Lab3_Book("Beginning iOS 7 Development", "Exploring the iOS SDK","$3.65",R.drawable.image_08));
        books_array.add(new Lab3_Book("Developing iOS Applications with Flex 4.5", "", "$12.99",R.drawable.no_image));
        books_array.add(new Lab3_Book("iOS 6 Programming Cookbook", "Solutions for iOS Developers", "$4.45",R.drawable.image_10));

    }
}