package com.example.groupview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class GroupAdapter extends RecyclerView.Adapter<GroupAdapter.GroupHolder> {

    private Context mCtx;
    private List<Group> groupList;

    public GroupAdapter(Context mCtx, List<Group> groupList) {
        this.mCtx = mCtx;
        this.groupList = groupList;
    }

    @NonNull
    @Override
    public GroupHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.group_list, null);
        GroupHolder holder = new GroupHolder(view);
        return holder;
    }


    public void onBindViewHolder(GroupHolder holder, int position) {
        Group group = groupList.get(position);

        holder.textViewGroupName.setText(group.getGroupName());
        holder.textViewGroupType.setText(group.getGroupType());
        holder.textViewGroupMembers.setText(String.valueOf(group.getNumberOfMembers()));
        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(group.getImage(), null));
    }

    @Override
    public int getItemCount() {
        return groupList.size();
    }

    public class GroupHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textViewGroupName, textViewGroupType, textViewGroupMembers;
        public GroupHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.group_photo);
            textViewGroupName = itemView.findViewById(R.id.group_name);
            textViewGroupType = itemView.findViewById(R.id.group_type);
            textViewGroupMembers = itemView.findViewById(R.id.group_members);
        }
    }

}
