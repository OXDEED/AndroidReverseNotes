package com.tencent.mm.plugin.emojicapture.model.c;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;

@l(dWo = {1, 1, 13}, dWp = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0014R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, dWq = {"Lcom/tencent/mm/plugin/emojicapture/model/xml/ResourceCompressConfig;", "Lcom/tencent/mm/plugin/emojicapture/model/xml/BaseXmlContent;", "()V", "copyList", "Ljava/util/LinkedList;", "Lcom/tencent/mm/plugin/emojicapture/model/xml/ResourceCompressItem;", "getCopyList", "()Ljava/util/LinkedList;", "parse", "", "parser", "Lorg/xmlpull/v1/XmlPullParser;", "parseTag", "tag", "", "plugin-emojicapture_release"})
public final class g extends a {
    public final LinkedList<h> ljF = new LinkedList();

    public g() {
        AppMethodBeat.i(2730);
        AppMethodBeat.o(2730);
    }

    public final void f(XmlPullParser xmlPullParser) {
        AppMethodBeat.i(2728);
        j.p(xmlPullParser, "parser");
        xmlPullParser.nextTag();
        super.f(xmlPullParser);
        AppMethodBeat.o(2728);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(String str, XmlPullParser xmlPullParser) {
        AppMethodBeat.i(2729);
        j.p(str, "tag");
        j.p(xmlPullParser, "parser");
        switch (str.hashCode()) {
            case 180673241:
                if (str.equals("EmoticonLensResouceCompreItem")) {
                    h hVar = new h();
                    hVar.f(xmlPullParser);
                    this.ljF.add(hVar);
                    AppMethodBeat.o(2729);
                    return;
                }
                break;
        }
        a.a(xmlPullParser);
        AppMethodBeat.o(2729);
    }
}
