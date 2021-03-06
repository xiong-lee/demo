package demo.com.xiongyantest01.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import demo.com.xiongyantest01.adpater.viewholder.TabSpecialViewHolder;

/**
 * @author by xiongyan on 2018/4/11.
 */
public class MyRecylerView extends RecyclerView {
    public MyRecylerView(Context context) {
        super(context);
    }

    public MyRecylerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyRecylerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (ev.getAction() == MotionEvent.ACTION_DOWN) {
            View childViewUnder = findChildViewUnder(ev.getX(), ev.getY());
            RecyclerView.ViewHolder childViewHolder = childViewUnder == null ? null : getChildViewHolder(childViewUnder);
            if (childViewHolder != null && childViewHolder instanceof TabSpecialViewHolder) {
                requestDisallowInterceptTouchEvent(true);
                return false;
            }
        }
        return super.onInterceptTouchEvent(ev);
    }

}
