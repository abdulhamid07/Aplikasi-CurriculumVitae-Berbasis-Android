package abdulhamid.dev.gmail.com.curiculumvitae;

/**
 * Created by putri on 30/10/2017.
 */
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ItemGridAdapter extends BaseAdapter {
    private Context mContext;

    public ItemGridAdapter(Context c)
    {
        mContext = c;
    }

    public static Integer[] mThumbIds =
            {
                    //Gambar-gambar yang ada disimpan dalam array

                    R.drawable.html5, R.drawable.css,
                    R.drawable.mysql, R.drawable.php,
                    R.drawable.ps, R.drawable.java,
            };

    @Override
    public int getCount() {
        // Jumlah total gambar
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Mengambil satu gambar dari gallery
        ImageView imageView;
        if (convertView == null) {  // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(180, 180));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }
}