package com.wampinfotech.turkish;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link WordAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Word} objects.
 */
class WordAdapter extends ArrayAdapter<Word> {

    /** Resource ID for the background color of this list of words */
    private final int _ColorResourceId;

    /**
     * Create a new {@link WordAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param words   is the list of {@link Word}s to be displayed.
     */
    WordAdapter(Context context, ArrayList<Word> words, int colorResId) {
        super(context, 0, words);
        _ColorResourceId = colorResId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID turkish_text_view.
        TextView turkishTextView = listItemView.findViewById(R.id.turkish_text_view);
        // Get the Turkish translation from the currentWord object and set this text on
        // the Turkish TextView.
        turkishTextView.setText(currentWord != null ? currentWord.getTurkishTranslation() : null);

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView defaultTextView = listItemView.findViewById(R.id.default_text_view);
        // Get the default translation from the currentWord object and set this text on
        // the default TextView.
        defaultTextView.setText(currentWord != null ? currentWord.getDefaultTranslation() : null);

        // Find the ImageView in the list_item.xml layout with the ID image_icon.
        ImageView imageView = listItemView.findViewById(R.id.image_icon);

        if(currentWord != null && currentWord.hasImage()) {
            // Set the ImageView to the image resource specified in the current word
            imageView.setImageResource(currentWord.getImageIcon());

            // Make sure view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility GONE)
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list
        View textContainer = listItemView.findViewById(R.id.text_container);

        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), _ColorResourceId);

        // Set the background color of the text container view
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and 1 ImageView) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}