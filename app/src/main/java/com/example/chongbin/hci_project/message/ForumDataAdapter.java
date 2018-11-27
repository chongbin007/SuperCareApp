package com.example.chongbin.hci_project.message;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.example.chongbin.hci_project.R;
import com.example.chongbin.hci_project.sampledata.ForumDataItem;

import java.util.List;

public class ForumDataAdapter extends RecyclerView.Adapter<ForumDataAdapter.ProductViewHolder> {
    private static ClickListener clickListener;
    //this context we will use to inflate the layout
    private Context mCtx;

    //we are storing all the products in a list
    private List<ForumDataItem> productList;

    //getting the context and product list with constructor
    public ForumDataAdapter(Context mCtx, List<ForumDataItem> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.layout_cardview, null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        //getting the product of the specified position
        ForumDataItem product = productList.get(position);

        //binding the data with the viewholder views
        holder.textViewTitle.setText(product.getTitle());
        holder.textViewShortDesc.setText(product.getShortdesc());
        holder.textViewPrice.setText(product.getPrice());

    }


    @Override
    public int getItemCount() {
        return productList.size();
    }


    public static class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {
        private CardView cardView;
        public View view;
        TextView textViewTitle, textViewShortDesc, textViewPrice;

        //constructor
        public ProductViewHolder(View itemView) {
            super(itemView);

            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewShortDesc = itemView.findViewById(R.id.textViewShortDesc);
            textViewPrice = itemView.findViewById(R.id.textViewPrice);
            cardView = itemView.findViewById(R.id.cardview_item);
            cardView.setOnClickListener(this);
            cardView.setOnLongClickListener(this);
        }

        @Override
        public void onClick(View v) {
            clickListener.onItemClick(getAdapterPosition(), v);
        }

        @Override
        public boolean onLongClick(View v) {
            clickListener.onItemLongClick(getAdapterPosition(), v);
            return false;
        }


    }

    public void setOnItemClickListener(ClickListener clickListener) {
        ForumDataAdapter.clickListener = clickListener;
    }

    public interface ClickListener {
        void onItemClick(int position, View v);

        void onItemLongClick(int position, View v);
    }
}