package grassl.ben.odis.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import grassl.ben.odis.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BeaconFragment extends Fragment {


    public BeaconFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_beacon, container, false);
    }

}
