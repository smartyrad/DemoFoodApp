package com.example.currentplacedetailsonmap;

import android.content.Context;
import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Field;
import java.util.List;

public class ListAdapter extends BaseAdapter {

    public Context contextnew;
    private LayoutInflater lInflater;
    private List<ItemObjects> listStorage;

    public ListAdapter(Context context, List<ItemObjects> customizedListView) {
        lInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        listStorage = customizedListView;
        this.contextnew = context;
    }

    @Override
    public int getCount() {
        return listStorage.size();
    }

    @Override
    public Object getItem(int position) {
        return listStorage.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder listViewHolder;
        if (convertView == null) {
            listViewHolder = new ViewHolder();
            convertView = lInflater.inflate(R.layout.list_row, parent, false);

            listViewHolder.image = (ImageView) convertView.findViewById(R.id.thumbnail);

            listViewHolder.name = (TextView) convertView.findViewById(R.id.title);
            listViewHolder.date = (TextView) convertView.findViewById(R.id.rating);
            listViewHolder.duration = (TextView) convertView.findViewById(R.id.genre);
            listViewHolder.type1 = (TextView) convertView.findViewById(R.id.releaseYear);

            convertView.setTag(listViewHolder);
        } else {
            listViewHolder = (ViewHolder) convertView.getTag();
        }
        listViewHolder.name.setText(listStorage.get(position).getName());
        listViewHolder.date.setText(listStorage.get(position).getDate());
        listViewHolder.duration.setText(listStorage.get(position).getDuration());
        String uri = "@drawable/a"+String.valueOf(position+1);

        int imageResource = contextnew.getResources().getIdentifier(uri, null, contextnew.getPackageName());
        listViewHolder.image.setImageResource(imageResource);
        listViewHolder.type1.setText(listStorage.get(position).getType1());
        return convertView;
    }

    static class ViewHolder {

        ImageView image;
        TextView name;
        TextView date;
        TextView duration;
        TextView type1;

    }

    public static int getResId(String resName, Class<?> c) {

        try {
            Field idField = c.getDeclaredField(resName);
            return idField.getInt(idField);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}