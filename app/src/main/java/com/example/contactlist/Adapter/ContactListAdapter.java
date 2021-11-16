package com.example.contactlist.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.contactlist.Model.ContactListModel;
import com.example.contactlist.R;

import java.util.List;

public class ContactListAdapter extends RecyclerView.Adapter<ContactListAdapter.ViewHolder>{
    private ContactListModel[] listdata;
    Context context;

    public ContactListAdapter(List<ContactListModel> listdata) {
        this.listdata = listdata.toArray(new ContactListModel[0]);
        this.context = context;

    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.contact_details_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final ContactListModel ContactListModel = listdata[position];
        holder.contact_name.setText(listdata[position].getContact_name());
        holder.contact_number.setText(listdata[position].getContact_number());
        holder.contact_email.setText(listdata[position].getContact_email());
        holder.contact_type.setText(listdata[position].getContact_type());
    }


    @Override
    public int getItemCount() {
        return listdata.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView contact_name,contact_number,contact_email,contact_type;
        CardView contact_details_card;
        public ViewHolder(View itemView) {
            super(itemView);
            contact_name = (TextView) itemView.findViewById(R.id.contact_name);
            contact_number = (TextView) itemView.findViewById(R.id.contact_number);
            contact_email = (TextView) itemView.findViewById(R.id.contact_email);
            contact_type = (TextView) itemView.findViewById(R.id.contact_type);
            contact_details_card = (CardView) itemView.findViewById(R.id.contact_details_card);
        }
    }
}  
