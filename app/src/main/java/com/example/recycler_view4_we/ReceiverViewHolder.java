package com.example.recycler_view4_we;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ReceiverViewHolder extends RecyclerView.ViewHolder {

    private TextView mTvReceiverSendMessage;

    public ReceiverViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mTvReceiverSendMessage = itemView.findViewById(R.id.tvReceiverMessage);
    }

    public void setData(ReceiverModel receiverModel){
        mTvReceiverSendMessage.setText(receiverModel.getReceiverMessage());
    }
}
