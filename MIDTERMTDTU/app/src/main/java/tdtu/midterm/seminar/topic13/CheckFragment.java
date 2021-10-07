package tdtu.midterm.seminar.topic13;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class CheckFragment extends Fragment {

    View view;
    ListView listView;
    List<Check> checks;
    CheckAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.check_fragment,container,false);
        listView = (ListView) view.findViewById(R.id.listCheck);
        checks = new ArrayList<Check>();
        adapter = new CheckAdapter(
                getActivity(),
                android.R.layout.simple_list_item_1,
                checks
        );
        listView.setAdapter(adapter);
        return view;
    }

}
