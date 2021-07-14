package com.example.recycler_view4_we;

public class SenderModel extends BaseModel {

    private String senderMessage;

    public SenderModel(String senderMessage) {
        this.senderMessage = senderMessage;
    }

    public String getMessage(){
        return senderMessage;
    }

    @Override
    int getViewType() {
        return 0;
    }
}
