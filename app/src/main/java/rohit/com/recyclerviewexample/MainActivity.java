package rohit.com.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import rohit.com.recyclerviewexample.Adapter.UserAdapter;
import rohit.com.recyclerviewexample.Model.PersonItem;

public class MainActivity extends AppCompatActivity {

    public RecyclerView recyclerView;
    ArrayList<PersonItem> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserAdapter userAdapter = new UserAdapter(items);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(userAdapter);

        Additemss();

    }

    public void Additemss(){

        for (int i = 0; i < 50 ; i++) {

            items.add(new PersonItem("0012548","Rohit","Saran" ));

        }
    }
}
