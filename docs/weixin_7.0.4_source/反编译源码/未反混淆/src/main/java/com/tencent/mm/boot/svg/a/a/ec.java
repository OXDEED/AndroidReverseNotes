package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;
import com.tencent.smtt.sdk.WebView;

public final class ec extends c {
    private final int height = 58;
    private final int width = 58;

    public final int a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 58;
            case 1:
                return 58;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                Matrix h = c.h(looper);
                float[] g = c.g(looper);
                Paint k = c.k(looper);
                k.setFlags(385);
                k.setStyle(Style.FILL);
                Paint k2 = c.k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.STROKE);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                k2.setStrokeWidth(1.0f);
                k2.setStrokeCap(Cap.BUTT);
                k2.setStrokeJoin(Join.MITER);
                k2.setStrokeMiter(4.0f);
                k2.setPathEffect(null);
                c.a(k2, looper).setStrokeWidth(1.0f);
                canvas.save();
                Paint a = c.a(k, looper);
                a.setColor(-1);
                g = c.a(g, 1.0f, 0.0f, -249.0f, 0.0f, 1.0f, -79.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                a = c.a(a, looper);
                g = c.a(g, 0.70710677f, 0.70710677f, 4.6425705f, -0.70710677f, 0.70710677f, 229.20816f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                Path l = c.l(looper);
                l.moveTo(277.0f, 118.906f);
                l.lineTo(277.0f, 141.0f);
                l.lineTo(283.0f, 141.0f);
                l.lineTo(283.0f, 118.61951f);
                l.cubicTo(292.68488f, 116.751785f, 300.0f, 108.23016f, 300.0f, 98.0f);
                l.cubicTo(300.0f, 86.40202f, 290.598f, 77.0f, 279.0f, 77.0f);
                l.cubicTo(267.402f, 77.0f, 258.0f, 86.40202f, 258.0f, 98.0f);
                l.cubicTo(258.0f, 108.92341f, 266.34015f, 117.89888f, 277.0f, 118.906f);
                l.close();
                l.moveTo(279.0f, 113.0f);
                l.cubicTo(287.28427f, 113.0f, 294.0f, 106.28427f, 294.0f, 98.0f);
                l.cubicTo(294.0f, 89.71573f, 287.28427f, 83.0f, 279.0f, 83.0f);
                l.cubicTo(270.71573f, 83.0f, 264.0f, 89.71573f, 264.0f, 98.0f);
                l.cubicTo(264.0f, 106.28427f, 270.71573f, 113.0f, 279.0f, 113.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.restore();
                c.j(looper);
                break;
        }
        return 0;
    }
}
