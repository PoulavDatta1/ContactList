package com.example.contactlist.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.Menu;
import android.view.MenuItem;

import com.example.contactlist.Adapter.ContactListAdapter;
import com.example.contactlist.Model.ContactListModel;
import com.example.contactlist.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContactListActivity extends AppCompatActivity {

    ContactListModel[] ContactListModel;
    RecyclerView recyclerView;
    ContactListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_list_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ContactListModel = new ContactListModel[] {
                new ContactListModel("Rajesh","9198027891","rajesh@gmail.com","Personal contact"),
                new ContactListModel("Poulav","8198027882","poulav@gmail.com","Business contact"),
                new ContactListModel("Marvin","7198027873","deb@gmail.com","Personal contact"),
                new ContactListModel("John","6198027864","vishal@gmail.com","Business contact"),
                new ContactListModel("Vanya","8898027775","sai@gmail.com","Personal contact"),
                new ContactListModel("Hasibul","8698026796","hasibul@gmail.com","Business contact"),
                new ContactListModel("Vasleena","7798027855","vijay@gmail.com","Personal contact"),
                new ContactListModel("Pradeep","6098027870","pradeep@gmail.com","Business contact"),
                new ContactListModel("Praksh","8598027878","prakash@gmail.com","Personal contact"),
                new ContactListModel("Suresh","8898027890","suresh@gmail.com","Business contact"),
        };

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        adapter = new ContactListAdapter(Arrays.asList(ContactListModel));
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.personal_contact) {
            List<ContactListModel> list=new ArrayList();
            for(int i=0;i<ContactListModel.length;i++){
                if(ContactListModel[i].getContact_type().equals("Personal contact")){
                    list.add(ContactListModel[i]);
                }
            }
            adapter = new ContactListAdapter(list);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter(adapter);

            return true;
        }
        if (id == R.id.business_contact) {
            List<ContactListModel> list=new ArrayList();
            for(int i=0;i<ContactListModel.length;i++){
                if(ContactListModel[i].getContact_type().equals("Business contact")){
                    list.add(ContactListModel[i]);
                }
            }
            adapter = new ContactListAdapter(list);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter(adapter);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}