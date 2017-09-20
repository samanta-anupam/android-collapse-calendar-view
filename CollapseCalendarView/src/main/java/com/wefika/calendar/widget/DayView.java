package com.wefika.calendar.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import com.wefika.calendar.R;

/**
 * Created by Blaz Solar on 24/05/14.
 */
public class DayView extends TextView {

    private static final int[] STATE_CURRENT = {R.attr.state_current};
    private static final int[] STATE_HIGHLIGHTED = {R.attr.state_highlighted};

    private boolean mCurrent;
    private boolean mHighlighted;

    public DayView(Context context) {
        super(context);
    }

    public DayView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DayView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public void setCurrent(boolean current) {
        if (mCurrent != current) {
            mCurrent = current;
            refreshDrawableState();
        }
    }

    public boolean isCurrent() {
        return mCurrent;
    }

    public void setHighlighted(boolean highlighted) {
        if (mHighlighted != highlighted) {
            mHighlighted = highlighted;
            refreshDrawableState();
        }
    }

    public boolean isHighlighted() {
        return mHighlighted;
    }

    @Override
    protected int[] onCreateDrawableState(int extraSpace) {
        final int[] state = super.onCreateDrawableState(extraSpace + 2);

        if (mCurrent) {
            mergeDrawableStates(state, STATE_CURRENT);
        }
        if(mHighlighted)
        {
            mergeDrawableStates(state, STATE_HIGHLIGHTED);
        }

        return state;
    }
}
