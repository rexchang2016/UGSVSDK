package com.tencent.qcloud.ugckit.component.bubbleview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;

import com.tencent.qcloud.ugckit.R;


/**
 * 创建 OperationView的工厂
 */
public class BubbleViewFactory {

    @NonNull
    public static BubbleView newOperationView(Context context) {
        return (BubbleView) View.inflate(context, R.layout.layout_default_bubble_view, null);
    }
}
