package com.egitimyazilim.iletisim.vbs.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import com.egitimyazilim.iletisim.vbs.R;
import com.egitimyazilim.iletisim.vbs.activities.Activity2;
import com.egitimyazilim.iletisim.vbs.activities.Activity3;
import com.egitimyazilim.iletisim.vbs.activities.Activity4;
import com.egitimyazilim.iletisim.vbs.activities.Activity5;
import com.egitimyazilim.iletisim.vbs.activities.Activity6;
import com.egitimyazilim.iletisim.vbs.activities.MainActivity;
import com.egitimyazilim.iletisim.vbs.interfaces.MenuContentComm;

import java.util.ArrayList;
import java.util.List;

public class MenuContentFragment extends Fragment {

    Intent intent;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_menu_content,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final Button buttonMenuOpen=(Button)view.findViewById(R.id.buttonMenuOpen);
        final Button buttonMenuClose=(Button)view.findViewById(R.id.buttonMenuClose);
        ListView listView=view.findViewById(R.id.listViewMenuContent);
        List<String> menuButtonList=new ArrayList<>();
        menuButtonList.add("List Item 1");
        menuButtonList.add("List Item 2");
        menuButtonList.add("List Item 3");
        menuButtonList.add("List Item 4");
        menuButtonList.add("List Item 5");
        menuButtonList.add("List Item 6");

        ArrayAdapter adapter=new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,menuButtonList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        intent=new Intent(getActivity(), MainActivity.class);
                        if(!(getActivity().getClass().getSimpleName()).equals("MainActivity")){
                            startActivityForResult(intent,1001);
                            getActivity().finish();
                        }else{
                            MenuContentComm comm=(MenuContentComm)getActivity();
                            comm.menuButtonsVisibility();
                        }
                        break;

                    case 1:
                        intent=new Intent(getActivity(), Activity2.class);
                        if(!(getActivity().getClass().getSimpleName()).equals("Activity2")){
                            startActivityForResult(intent,1002);
                            getActivity().finish();
                        }else{
                            MenuContentComm comm=(MenuContentComm)getActivity();
                            comm.menuButtonsVisibility();
                        }
                        break;

                    case 2:
                        intent=new Intent(getActivity(), Activity3.class);
                        if(!(getActivity().getClass().getSimpleName()).equals("Activity3")){
                            startActivityForResult(intent,1003);
                            getActivity().finish();
                        }else{
                            MenuContentComm comm=(MenuContentComm)getActivity();
                            comm.menuButtonsVisibility();
                        }
                        break;

                    case 3:
                        intent=new Intent(getActivity(), Activity4.class);
                        if(!(getActivity().getClass().getSimpleName()).equals("Activity4")){
                            startActivityForResult(intent,1004);
                            getActivity().finish();
                        }else{
                            MenuContentComm comm=(MenuContentComm)getActivity();
                            comm.menuButtonsVisibility();
                        }
                        break;

                    case 4:
                        intent=new Intent(getActivity(), Activity5.class);
                        if(!(getActivity().getClass().getSimpleName()).equals("Activity5")){
                            startActivityForResult(intent,1005);
                            getActivity().finish();
                        }else{
                            MenuContentComm comm=(MenuContentComm)getActivity();
                            comm.menuButtonsVisibility();
                        }
                        break;

                    case 5:
                        intent=new Intent(getActivity(), Activity6.class);
                        if(!(getActivity().getClass().getSimpleName()).equals("Activity6")){
                            startActivityForResult(intent,1006);
                            getActivity().finish();
                        }else{
                            MenuContentComm comm=(MenuContentComm)getActivity();
                            comm.menuButtonsVisibility();
                        }
                        break;
                }
            }
        });
    }
}
