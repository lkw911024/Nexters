package com.nexters.gathering.nexters.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nexters.gathering.nexters.Model.Notice;
import com.nexters.gathering.nexters.R;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Leekyeongwon on 2017-04-04.
 */

public class NoticeListViewAdapter extends BaseAdapter {
    private Context mContext = null;
    LayoutInflater inflater;
    private ArrayList<Notice> noticeList = new ArrayList<Notice>() ;

    // ListViewAdapter의 생성자
    public NoticeListViewAdapter() {
        super();
    }

    public NoticeListViewAdapter(LayoutInflater inflater, ArrayList<Notice> noticeList)
    {
        this.inflater = inflater;
        this.noticeList = noticeList;


        //테스트 데이터
        noticeList.add(new Notice());
        noticeList.add(new Notice("2", "1", "넥스터즈 전체", "공지2", true, new Date(), "마루일공팔공", "넥스터즈 CEO", new Date()));
        noticeList.add(new Notice("3", "1", "넥스터즈 전체", "공지3", false, new Date(), "카우앤독", "김대경", new Date()));
        noticeList.add(new Notice("4", "2", "넥스터즈 전체", "공지4", true, new Date(), "넥스터즈", "9기 이경원", new Date()));
        noticeList.add(new Notice("5", "3", "넥스터즈 전체", "공지5", false, new Date(), "카우앤독", "10기 우종희", new Date()));
        noticeList.add(new Notice("6", "4", "넥스터즈 전체", "공지6", true, new Date(), "마루일공팔공", "10기 이승기", new Date()));

    }

    // Adapter에 사용되는 데이터의 개수를 리턴. : 필수 구현
    //ListView에서 Adapter 객체에게 요청하는 값으로서
    //Adapter 객체가 만들어낼 View의 개수를 리턴하는 메소드
    //특별한 경우가 아니라면 보통 data의 size 를 리턴함.
    @Override
    public int getCount() {
        return noticeList.size() ;
    }

    //Adapter의 특정 위치(position)에 해당하는 Data를 리턴하는 메소드
    //ListView의 position은 가장 위에 목록부터(0,1,2,3...)으로 지정됨.
    @Override
    public Object getItem(int position) {
        return noticeList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if( convertView==null) {
            //null이라면 재활용할 View가 없으므로 새로운 객체 생성
            //xml로 선언된 레이아웃(layout)파일을 객체로 부풀려주는 LayoutInflater 객체 활용.
            convertView = inflater.inflate(R.layout.listitem_noti, null);
        }

        // View binding
        //아이디 추가할 것
        TextView type = (TextView)convertView.findViewById(R.id.noti_type);
        TextView target = (TextView)convertView.findViewById(R.id.noti_target);
        TextView title = (TextView)convertView.findViewById(R.id.noti_title);
        TextView time = (TextView)convertView.findViewById(R.id.noti_time);
        TextView place = (TextView)convertView.findViewById(R.id.noti_map);
        TextView writer = (TextView)convertView.findViewById(R.id.noti_writer);
        TextView writeTime = (TextView)convertView.findViewById(R.id.noti_write_time);
        ImageView favor = (ImageView)convertView.findViewById(R.id.noti_favor);


        // 공지에 해당하는 내용 삽입
        target.setText(noticeList.get(position).getTarget());
        title.setText(noticeList.get(position).getTitle());
        time.setText(noticeList.get(position).getTime().toString());
        place.setText(noticeList.get(position).getPlace());
        writer.setText(noticeList.get(position).getWriter());
        writeTime.setText(noticeList.get(position).getWriteTime().toString());


        // 즐겨찾기 상태에 따라 아이콘 변경
        if(noticeList.get(position).isFavor() == true)
        {
            favor.setBackgroundResource(R.drawable.icon_favor_act);
        }
        else
        {
            favor.setBackgroundResource(R.drawable.icon_favor_deact);
        }

        // 공지의 타입에 따라 색 변경
        switch (Integer.parseInt(noticeList.get(position).getType()))
        {
            case 1:
                type.setBackgroundResource(R.color.noti_nexters);
                break;
            case 2:
                type.setBackgroundResource(R.color.noti_team);
                break;
            case 3:
                type.setBackgroundResource(R.color.noti_position);
                break;
            case 4:
                type.setBackgroundResource(R.color.noti_general);
                break;
        }

        return convertView;
    }
}
