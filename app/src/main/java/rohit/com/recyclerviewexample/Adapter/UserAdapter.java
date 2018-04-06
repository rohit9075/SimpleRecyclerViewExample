package rohit.com.recyclerviewexample.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import rohit.com.recyclerviewexample.Model.PersonItem;
import rohit.com.recyclerviewexample.R;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    private ArrayList<PersonItem> itemList;

    public UserAdapter(ArrayList<PersonItem> itemList) {
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);

        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {

        TextView name = holder.mTextView;
        name.setText(itemList.get(position).getName());



    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    class UserViewHolder extends RecyclerView.ViewHolder {

        TextView mTextView;

        UserViewHolder(View itemView) {
            super(itemView);

            mTextView = itemView.findViewById(R.id.textView);
        }
    }
}
