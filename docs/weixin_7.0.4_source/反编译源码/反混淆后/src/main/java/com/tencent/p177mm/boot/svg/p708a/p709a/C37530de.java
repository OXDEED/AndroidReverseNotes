package com.tencent.p177mm.boot.svg.p708a.p709a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.p177mm.svg.C5163c;
import com.tencent.p177mm.svg.WeChatSVGRenderC2Java;
import com.tencent.smtt.sdk.WebView;

/* renamed from: com.tencent.mm.boot.svg.a.a.de */
public final class C37530de extends C5163c {
    private final int height = 96;
    private final int width = 130;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 130;
            case 1:
                return 96;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                Matrix h = C5163c.m7881h(looper);
                float[] g = C5163c.m7880g(looper);
                Paint k = C5163c.m7883k(looper);
                k.setFlags(385);
                k.setStyle(Style.FILL);
                Paint k2 = C5163c.m7883k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.STROKE);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                k2.setStrokeWidth(1.0f);
                k2.setStrokeCap(Cap.BUTT);
                k2.setStrokeJoin(Join.MITER);
                k2.setStrokeMiter(4.0f);
                k2.setPathEffect(null);
                C5163c.m7876a(k2, looper).setStrokeWidth(1.0f);
                canvas.save();
                Paint a = C5163c.m7876a(k, looper);
                a.setColor(WebView.NIGHT_MODE_COLOR);
                g = C5163c.m7878a(g, 1.0f, 0.0f, -238.0f, 0.0f, 1.0f, -166.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                g = C5163c.m7878a(g, 1.0f, 0.0f, 238.0f, 0.0f, 1.0f, 166.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                a = C5163c.m7876a(a, looper);
                g = C5163c.m7878a(g, 0.70710677f, -0.70710677f, 50.78103f, 0.70710677f, 0.70710677f, -41.066437f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                Path l = C5163c.m7884l(looper);
                l.moveTo(75.89903f, 17.651163f);
                l.lineTo(92.860985f, 63.1806f);
                l.lineTo(92.860985f, 63.1806f);
                l.cubicTo(93.05379f, 63.698135f, 92.79054f, 64.27399f, 92.27301f, 64.46679f);
                l.cubicTo(91.96835f, 64.58029f, 91.62753f, 64.538605f, 91.359215f, 64.35502f);
                l.lineTo(74.96195f, 53.135838f);
                l.lineTo(58.56469f, 64.35502f);
                l.lineTo(58.56469f, 64.35502f);
                l.cubicTo(58.108883f, 64.666885f, 57.486565f, 64.5502f, 57.174698f, 64.09439f);
                l.cubicTo(56.99111f, 63.826077f, 56.949425f, 63.48526f, 57.062923f, 63.1806f);
                l.lineTo(74.02487f, 17.651163f);
                l.lineTo(74.02487f, 17.651163f);
                l.cubicTo(74.21768f, 17.133627f, 74.793526f, 16.870382f, 75.311066f, 17.063189f);
                l.cubicTo(75.58311f, 17.164541f, 75.79768f, 17.379114f, 75.89903f, 17.651163f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
