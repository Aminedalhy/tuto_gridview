package com.example.pc.customgridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.design.widget.Snackbar;


/**
 * Created by pc on 14/10/2016.
 */
public class Custom_gridview extends BaseAdapter {
    private Context context ;


    private LayoutInflater inflater=null ;
    public  Custom_gridview(Context c )
    {
        this.context=c;
        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }
    @Override
    public int getCount() {
        return ref_image.length ;
    }

    @Override
    public Object getItem(int position) {

        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View view, ViewGroup viewGroup) {
        ImageView imageView ;
        TextView textView ;

        View rowView ;
        rowView = inflater.inflate(R.layout.custom_gridview,null);
        textView = (TextView) rowView.findViewById(R.id.textview1);
        imageView = (ImageView) rowView.findViewById(R.id.imageView1);




        imageView.setImageResource(ref_image[position]);
        textView.setText(Text_list[position]);

        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar snackbar =Snackbar.make(view, "You clicked"+Text_list[position], Snackbar.LENGTH_LONG);
                view=snackbar.getView();
                TextView txtv = (TextView) view.findViewById(android.support.design.R.id.snackbar_text);
                txtv.setTextAlignment(view.TEXT_ALIGNMENT_CENTER);
                snackbar.show();
            }
        });

        return  rowView ;


    }


    private Integer[] ref_image = { R.drawable.ic_facebook ,R.drawable.ic_twitter,R.drawable.ic_instagram ,
            R.drawable.ic_whatsapp,R.drawable.ic_amazon , R.drawable.ic_skype,
            R.drawable.ic_linkdin  , R.drawable.ic_google_plus,R.drawable.ic_apple,
            R.drawable.ic_microsoft,R.drawable.ic_camera , R.drawable.ic_android,


    };

    private String[] Text_list={"Facebook","Twitter","Instagram","Whatsapp","amazon","skype","Linkdin","Google+","apple","microsoft","camera","Android"} ;




}
