package team.bsru.apirat.hotline;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by ikool009 on 26/2/2560.
 */

public class hot_line_adapter extends BaseAdapter{
    private Context context;
    private String[] call_number;
    private int[] img_call;
    private ImageView imageView;

    public hot_line_adapter(Context context, String[] call_number, int[] img_call) {
        this.context = context;
        this.call_number = call_number;
        this.img_call = img_call;
    }

    @Override
    public int getCount() {
        return call_number.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.item_view, viewGroup, false);
        imageView = (ImageView) view1.findViewById(R.id.img_hot);
        imageView.setImageResource(img_call[i]);



        return view1;
    }
}
