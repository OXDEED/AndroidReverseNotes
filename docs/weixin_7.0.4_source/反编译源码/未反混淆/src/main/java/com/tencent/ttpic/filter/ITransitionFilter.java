package com.tencent.ttpic.filter;

import com.tencent.filter.h;

public interface ITransitionFilter {
    void RenderProcess(int i, int i2, int i3, int i4, double d, h hVar);

    void reset();

    void setDataPath(String str);

    void setLastTex(int i);

    void updatePreview(long j);
}
