package com.hanbit.kakao.dao;

import com.hanbit.kakao.domain.MessageBean;

import java.util.ArrayList;

/**
 * Created by hb2004 on 2017-01-07.
 */

public class MessageDAO {
    public void write(MessageBean msg){

    }
    public ArrayList<MessageBean> list(){
        ArrayList<MessageBean> list = new ArrayList<MessageBean>();
        return list;

    }
    public ArrayList<MessageBean> findByWrite(String id){
        ArrayList<MessageBean> list = new ArrayList<MessageBean>();
        return list;
    }
    public MessageBean findBySeq(int seq){
        MessageBean msg = new MessageBean();
        return msg;
    }
    public int count(){
        int count = 0;
        return count;

    }
    public int countByWriter(String id){
        int count = 0;
        return count;
    }
    public void updateMessage(MessageBean msg){

    }
    public void deleteMessage(int seq){

    }

}
