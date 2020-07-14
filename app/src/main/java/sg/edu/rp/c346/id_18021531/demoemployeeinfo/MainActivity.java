package sg.edu.rp.c346.id_18021531.demoemployeeinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvEmployee;
    ArrayList<Employee> alEm;
    ArrayAdapter<Employee> aaEm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvEmployee  = findViewById(R.id.listviewemployee);
        alEm = new ArrayList<Employee>();
         alEm.add(new Employee("  John","Software Technical Leader",3400.0));
         alEm.add(new Employee("  May","programmer",2200.0));
        aaEm = new EmployeeAdapter(this,R.layout.row,alEm);
        lvEmployee.setAdapter(aaEm);
    }
}
