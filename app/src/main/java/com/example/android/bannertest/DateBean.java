package com.example.android.bannertest;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DateBean implements Serializable {
    public String imageUrl;
    public String title;
//    public String url;

    public DateBean(String imageUrl, String title){
        this.imageUrl = imageUrl;
        this.title = title;
    }

//    public void setImageUrl(String imageUrl){
//        this.imageUrl = imageUrl;
//    }
//
//    public String getUrl(){
//        return url;
//    }
//
//    public void setUrl(String url){
//        this.url = url;
//    }
//
//    public void setTitle(String title){
//        this.title = title;
//    }
//
//    public String getImageUrl(){
//        return imageUrl;
//    }
//
//    public String getTitle(){
//        return title;
//    }

    public static List<DateBean> getTestData(){
        List<DateBean> list = new ArrayList<>();
        list.add(new DateBean("https://www.planetware.com/photos-large/USCA/california-golden-gate-bridge-night.jpg","PIC-0"));
        list.add(new DateBean("https://i1.wp.com/www.escapenormal.com/wp-content/uploads/2019/12/hollywood-sign.jpg?fit=1920%2C1280&ssl=1","PIC-1"));
        list.add(new DateBean("https://assets3.thrillist.com/v1/image/1602035/792x503/flatten;scale;jpeg_quality=70","PIC-2"));
        list.add(new DateBean("https://media.california.com/media/_versions/articles/ca_historical_landmarks__4088x2725___v1222x580.jpg","PIC-3"));
        list.add(new DateBean("https://3m4r5618el913vtfz3jffby9-wpengine.netdna-ssl.com/wp-content/uploads/famous-landmarks-in-california.jpg","PIC-4"));
        return list;
    }

}
