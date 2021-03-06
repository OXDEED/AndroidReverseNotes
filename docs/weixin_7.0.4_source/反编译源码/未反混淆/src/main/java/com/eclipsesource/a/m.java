package com.eclipsesource.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Writer;

final class m extends Writer {
    private final char[] aLx;
    private int aLz = 0;
    private final Writer writer;

    m(Writer writer) {
        AppMethodBeat.i(70608);
        this.writer = writer;
        this.aLx = new char[128];
        AppMethodBeat.o(70608);
    }

    public final void write(int i) {
        AppMethodBeat.i(70609);
        if (this.aLz > this.aLx.length - 1) {
            flush();
        }
        char[] cArr = this.aLx;
        int i2 = this.aLz;
        this.aLz = i2 + 1;
        cArr[i2] = (char) i;
        AppMethodBeat.o(70609);
    }

    public final void write(char[] cArr, int i, int i2) {
        AppMethodBeat.i(70610);
        if (this.aLz > this.aLx.length - i2) {
            flush();
            if (i2 > this.aLx.length) {
                this.writer.write(cArr, i, i2);
                AppMethodBeat.o(70610);
                return;
            }
        }
        System.arraycopy(cArr, i, this.aLx, this.aLz, i2);
        this.aLz += i2;
        AppMethodBeat.o(70610);
    }

    public final void write(String str, int i, int i2) {
        AppMethodBeat.i(70611);
        if (this.aLz > this.aLx.length - i2) {
            flush();
            if (i2 > this.aLx.length) {
                this.writer.write(str, i, i2);
                AppMethodBeat.o(70611);
                return;
            }
        }
        str.getChars(i, i + i2, this.aLx, this.aLz);
        this.aLz += i2;
        AppMethodBeat.o(70611);
    }

    public final void flush() {
        AppMethodBeat.i(70612);
        this.writer.write(this.aLx, 0, this.aLz);
        this.aLz = 0;
        AppMethodBeat.o(70612);
    }

    public final void close() {
    }
}
