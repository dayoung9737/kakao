package com.hanbit.kakao.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.hanbit.kakao.domain.MemberBean;

import java.util.ArrayList;

/**
 * Created by hb2004 on 2017-01-07.
 */

public class MemberDAO extends SQLiteOpenHelper {
    public MemberDAO(Context applicationContext) {
        super(applicationContext, "hanbit.db", null, 1);
        this.getWritableDatabase();//쓰기 전용

    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXIST Member(\n" +
                "\tid TEXT PRIMARY KEY,\n" +
                "    pw TEXT,\n" +
                "    name TEXT,\n" +
                "    email TEXT,\n" +
                "    phone TEXT,\n" +
                "    photo TEXT,\n" +
                "    addr TEXT\n" +
                ");\n" +
                "\n" +
                "\n" +
                "        ");
        db.execSQL("CREATE TABLE Message(\n" +
                " _id INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                "sender TEXT,\n" +
                "receier TEXT,\n" +
                "content TEXT,\n" +
                " writeTime TEXT,\n" +
                "id TEXT,\n" +
                "FOREIGN KEY(id) REFERENCES Member(id)\n" +
                ");");

        db.execSQL("INSERT INTO Member(id, pw, name, email, phone, photo, addr)\n" +
                "VALUES('hong','1','홍길동','hong@test.com','010-2059-9738','default.jpg','서울');");
        db.execSQL("INSERT INTO Member(id, pw, name, email, phone, photo, addr)\n" +
                "VALUES('hong','1','김김김','hong@test.com','010-2000-9738','default.jpg','서울');");
        db.execSQL("INSERT INTO Member(id, pw, name, email, phone, photo, addr)\n" +
                "VALUES('hong','1','박박박','hong@test.com','010-20001-9738','default.jpg','서울');");
        db.execSQL("INSERT INTO Member(id, pw, name, email, phone, photo, addr)\n" +
                "VALUES('hong','1','이이이','hong@test.com','010-2002-9738','default.jpg','서울');");
        db.execSQL("INSERT INTO Member(id, pw, name, email, phone, photo, addr)\n" +
                "VALUES('hong','1','전전전','hong@test.com','010-2333-9738','default.jpg','서울');");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public void insert(MemberBean param) { //create Member
        String sql="";
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL(sql);
        db.close();

    }

    public ArrayList<MemberBean> selectAll() { //read All
        ArrayList<MemberBean> list = new ArrayList<MemberBean>();
        String sql="";
        SQLiteDatabase db = this.getReadableDatabase();

        db.close();


        return list;
    }

    public ArrayList<MemberBean> selectByName(String name) {//readGroup
        ArrayList<MemberBean> list = new ArrayList<MemberBean>();
        String sql="";
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(sql, null);
        return  list;
    }

    public MemberBean selectById(String id) {//readOne
        MemberBean member = new MemberBean();
        String sql="";
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(sql, null);
        return member;

    }

    public MemberBean login(MemberBean param) {
        MemberBean member = new MemberBean();
        String sql="SELECT id,pw,name,email,phone,photo,addr FROM member WHERE id ='"+param.getId()
                    +"' AND pw='"+param.getPw()+"';";
        Log.d("login SQL:", sql);
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(sql, null);
        if(cursor.moveToNext()){

            Log.d("아이디결과 : ", cursor.getString(1));
            member.setId(cursor.getString(0));
            member.setPw(cursor.getString(1));
            member.setName(cursor.getString(2));
            member.setEmail(cursor.getString(3));
            member.setPhone(cursor.getString(4));
            member.setPhoto(cursor.getString(5));
            member.setAddr(cursor.getString(6));

        }else {


            member.setId("fail");
        }
        Log.d("login result:", member.getId());
        return member;
    }

    public int count() { //readCount
        int count = 0;
        String sql="";
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(sql, null);
        return count;
    }

    public void update(MemberBean param) { //updateMember
        String sql="";
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL(sql);
        db.close();
    }

    public void delete(String id) { //deleteMember
        String sql="";
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL(sql);
        db.close();

    }


}