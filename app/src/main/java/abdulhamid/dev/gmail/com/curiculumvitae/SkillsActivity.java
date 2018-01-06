package abdulhamid.dev.gmail.com.curiculumvitae;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

public class SkillsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skills);
        GridView gridView = (GridView) findViewById(R.id.gridview_followed);
        gridView.setAdapter(new ItemGridAdapter(this));
        /*gvItem = (GridView) findViewById(R.id.gv_item);
        ItemGridAdapter itemGridAdapter = new ItemGridAdapter(SkillsActivity.this, images);
        gvItem.setAdapter(itemGridAdapter);*/
    }

}
