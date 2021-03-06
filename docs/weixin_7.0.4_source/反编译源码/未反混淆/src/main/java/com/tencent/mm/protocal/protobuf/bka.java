package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import e.a.a.c.a;
import java.util.LinkedList;

public final class bka extends btd {
    public int wNe;
    public String wNf;
    public SKBuiltinBuffer_t wxA;
    public int wxB;
    public String wxC;
    public int wxD;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(56916);
        b bVar;
        int ix;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(56916);
                throw bVar;
            }
            if (this.BaseResponse != null) {
                aVar.iy(1, this.BaseResponse.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            if (this.wxA != null) {
                aVar.iy(2, this.wxA.computeSize());
                this.wxA.writeFields(aVar);
            }
            aVar.iz(3, this.wxB);
            if (this.wxC != null) {
                aVar.e(4, this.wxC);
            }
            aVar.iz(5, this.wxD);
            aVar.iz(6, this.wNe);
            if (this.wNf != null) {
                aVar.e(7, this.wNf);
            }
            AppMethodBeat.o(56916);
            return 0;
        } else if (i == 1) {
            if (this.BaseResponse != null) {
                ix = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.wxA != null) {
                ix += e.a.a.a.ix(2, this.wxA.computeSize());
            }
            ix += e.a.a.b.b.a.bs(3, this.wxB);
            if (this.wxC != null) {
                ix += e.a.a.b.b.a.f(4, this.wxC);
            }
            ix = (ix + e.a.a.b.b.a.bs(5, this.wxD)) + e.a.a.b.b.a.bs(6, this.wNe);
            if (this.wNf != null) {
                ix += e.a.a.b.b.a.f(7, this.wNf);
            }
            AppMethodBeat.o(56916);
            return ix;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(56916);
                throw bVar;
            }
            AppMethodBeat.o(56916);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            bka bka = (bka) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            byte[] bArr;
            e.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        BaseResponse baseResponse = new BaseResponse();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = baseResponse.populateBuilderWithField(aVar4, baseResponse, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        bka.BaseResponse = baseResponse;
                    }
                    AppMethodBeat.o(56916);
                    return 0;
                case 2:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        SKBuiltinBuffer_t sKBuiltinBuffer_t = new SKBuiltinBuffer_t();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = sKBuiltinBuffer_t.populateBuilderWithField(aVar4, sKBuiltinBuffer_t, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        bka.wxA = sKBuiltinBuffer_t;
                    }
                    AppMethodBeat.o(56916);
                    return 0;
                case 3:
                    bka.wxB = aVar3.BTU.vd();
                    AppMethodBeat.o(56916);
                    return 0;
                case 4:
                    bka.wxC = aVar3.BTU.readString();
                    AppMethodBeat.o(56916);
                    return 0;
                case 5:
                    bka.wxD = aVar3.BTU.vd();
                    AppMethodBeat.o(56916);
                    return 0;
                case 6:
                    bka.wNe = aVar3.BTU.vd();
                    AppMethodBeat.o(56916);
                    return 0;
                case 7:
                    bka.wNf = aVar3.BTU.readString();
                    AppMethodBeat.o(56916);
                    return 0;
                default:
                    AppMethodBeat.o(56916);
                    return -1;
            }
        } else {
            AppMethodBeat.o(56916);
            return -1;
        }
    }
}
