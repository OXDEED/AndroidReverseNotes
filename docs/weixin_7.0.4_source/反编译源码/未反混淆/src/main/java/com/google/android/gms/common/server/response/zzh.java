package com.google.android.gms.common.server.response;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.BufferedReader;
import java.math.BigDecimal;

final class zzh implements zza<BigDecimal> {
    zzh() {
    }

    public final /* synthetic */ Object zzh(FastParser fastParser, BufferedReader bufferedReader) {
        AppMethodBeat.i(61633);
        BigDecimal zzg = FastParser.zzg(fastParser, bufferedReader);
        AppMethodBeat.o(61633);
        return zzg;
    }
}
