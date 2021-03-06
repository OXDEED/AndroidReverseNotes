package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class zzaay<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private boolean zzbls;
    private final int zzbtx;
    private List<zzabd> zzbty;
    private Map<K, V> zzbtz;
    private volatile zzabf zzbua;
    private Map<K, V> zzbub;

    private zzaay(int i) {
        AppMethodBeat.m2504i(3367);
        this.zzbtx = i;
        this.zzbty = Collections.emptyList();
        this.zzbtz = Collections.emptyMap();
        this.zzbub = Collections.emptyMap();
        AppMethodBeat.m2505o(3367);
    }

    /* synthetic */ zzaay(int i, zzaaz zzaaz) {
        this(i);
    }

    private final int zza(K k) {
        int compareTo;
        AppMethodBeat.m2504i(3379);
        int i = 0;
        int size = this.zzbty.size() - 1;
        if (size >= 0) {
            compareTo = k.compareTo((Comparable) ((zzabd) this.zzbty.get(size)).getKey());
            if (compareTo > 0) {
                compareTo = -(size + 2);
                AppMethodBeat.m2505o(3379);
                return compareTo;
            } else if (compareTo == 0) {
                AppMethodBeat.m2505o(3379);
                return size;
            }
        }
        int i2 = size;
        while (i <= i2) {
            size = (i + i2) / 2;
            compareTo = k.compareTo((Comparable) ((zzabd) this.zzbty.get(size)).getKey());
            if (compareTo < 0) {
                i2 = size - 1;
            } else if (compareTo > 0) {
                i = size + 1;
            } else {
                AppMethodBeat.m2505o(3379);
                return size;
            }
        }
        compareTo = -(i + 1);
        AppMethodBeat.m2505o(3379);
        return compareTo;
    }

    static <FieldDescriptorType extends zzzo<FieldDescriptorType>> zzaay<FieldDescriptorType, Object> zzag(int i) {
        AppMethodBeat.m2504i(3366);
        zzaaz zzaaz = new zzaaz(i);
        AppMethodBeat.m2505o(3366);
        return zzaaz;
    }

    private final V zzai(int i) {
        AppMethodBeat.m2504i(3378);
        zzul();
        Object value = ((zzabd) this.zzbty.remove(i)).getValue();
        if (!this.zzbtz.isEmpty()) {
            Iterator it = zzum().entrySet().iterator();
            this.zzbty.add(new zzabd(this, (Entry) it.next()));
            it.remove();
        }
        AppMethodBeat.m2505o(3378);
        return value;
    }

    private final void zzul() {
        AppMethodBeat.m2504i(3381);
        if (this.zzbls) {
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
            AppMethodBeat.m2505o(3381);
            throw unsupportedOperationException;
        }
        AppMethodBeat.m2505o(3381);
    }

    private final SortedMap<K, V> zzum() {
        AppMethodBeat.m2504i(3382);
        zzul();
        if (this.zzbtz.isEmpty() && !(this.zzbtz instanceof TreeMap)) {
            this.zzbtz = new TreeMap();
            this.zzbub = ((TreeMap) this.zzbtz).descendingMap();
        }
        SortedMap sortedMap = (SortedMap) this.zzbtz;
        AppMethodBeat.m2505o(3382);
        return sortedMap;
    }

    public void clear() {
        AppMethodBeat.m2504i(3376);
        zzul();
        if (!this.zzbty.isEmpty()) {
            this.zzbty.clear();
        }
        if (!this.zzbtz.isEmpty()) {
            this.zzbtz.clear();
        }
        AppMethodBeat.m2505o(3376);
    }

    public boolean containsKey(Object obj) {
        AppMethodBeat.m2504i(3373);
        Comparable comparable = (Comparable) obj;
        if (zza(comparable) >= 0 || this.zzbtz.containsKey(comparable)) {
            AppMethodBeat.m2505o(3373);
            return true;
        }
        AppMethodBeat.m2505o(3373);
        return false;
    }

    public Set<Entry<K, V>> entrySet() {
        AppMethodBeat.m2504i(3380);
        if (this.zzbua == null) {
            this.zzbua = new zzabf(this, null);
        }
        zzabf zzabf = this.zzbua;
        AppMethodBeat.m2505o(3380);
        return zzabf;
    }

    public boolean equals(Object obj) {
        AppMethodBeat.m2504i(3383);
        boolean equals;
        if (this == obj) {
            AppMethodBeat.m2505o(3383);
            return true;
        } else if (obj instanceof zzaay) {
            zzaay zzaay = (zzaay) obj;
            int size = size();
            if (size != zzaay.size()) {
                AppMethodBeat.m2505o(3383);
                return false;
            }
            int zzuj = zzuj();
            if (zzuj != zzaay.zzuj()) {
                equals = entrySet().equals(zzaay.entrySet());
                AppMethodBeat.m2505o(3383);
                return equals;
            }
            int i = 0;
            while (i < zzuj) {
                if (zzah(i).equals(zzaay.zzah(i))) {
                    i++;
                } else {
                    AppMethodBeat.m2505o(3383);
                    return false;
                }
            }
            if (zzuj != size) {
                equals = this.zzbtz.equals(zzaay.zzbtz);
                AppMethodBeat.m2505o(3383);
                return equals;
            }
            AppMethodBeat.m2505o(3383);
            return true;
        } else {
            equals = super.equals(obj);
            AppMethodBeat.m2505o(3383);
            return equals;
        }
    }

    public V get(Object obj) {
        AppMethodBeat.m2504i(3374);
        Comparable comparable = (Comparable) obj;
        int zza = zza(comparable);
        Object value;
        if (zza >= 0) {
            value = ((zzabd) this.zzbty.get(zza)).getValue();
            AppMethodBeat.m2505o(3374);
            return value;
        }
        value = this.zzbtz.get(comparable);
        AppMethodBeat.m2505o(3374);
        return value;
    }

    public int hashCode() {
        AppMethodBeat.m2504i(3384);
        int i = 0;
        for (int i2 = 0; i2 < zzuj(); i2++) {
            i += ((zzabd) this.zzbty.get(i2)).hashCode();
        }
        int hashCode = this.zzbtz.size() > 0 ? this.zzbtz.hashCode() + i : i;
        AppMethodBeat.m2505o(3384);
        return hashCode;
    }

    public final boolean isImmutable() {
        return this.zzbls;
    }

    public /* synthetic */ Object put(Object obj, Object obj2) {
        AppMethodBeat.m2504i(3385);
        Object zza = zza((Comparable) obj, obj2);
        AppMethodBeat.m2505o(3385);
        return zza;
    }

    public V remove(Object obj) {
        AppMethodBeat.m2504i(3377);
        zzul();
        Comparable comparable = (Comparable) obj;
        int zza = zza(comparable);
        Object zzai;
        if (zza >= 0) {
            zzai = zzai(zza);
            AppMethodBeat.m2505o(3377);
            return zzai;
        } else if (this.zzbtz.isEmpty()) {
            AppMethodBeat.m2505o(3377);
            return null;
        } else {
            zzai = this.zzbtz.remove(comparable);
            AppMethodBeat.m2505o(3377);
            return zzai;
        }
    }

    public int size() {
        AppMethodBeat.m2504i(3372);
        int size = this.zzbty.size() + this.zzbtz.size();
        AppMethodBeat.m2505o(3372);
        return size;
    }

    public final V zza(K k, V v) {
        AppMethodBeat.m2504i(3375);
        zzul();
        int zza = zza((Comparable) k);
        Object value;
        if (zza >= 0) {
            value = ((zzabd) this.zzbty.get(zza)).setValue(v);
            AppMethodBeat.m2505o(3375);
            return value;
        }
        zzul();
        if (this.zzbty.isEmpty() && !(this.zzbty instanceof ArrayList)) {
            this.zzbty = new ArrayList(this.zzbtx);
        }
        int i = -(zza + 1);
        if (i >= this.zzbtx) {
            value = zzum().put(k, v);
            AppMethodBeat.m2505o(3375);
            return value;
        }
        if (this.zzbty.size() == this.zzbtx) {
            zzabd zzabd = (zzabd) this.zzbty.remove(this.zzbtx - 1);
            zzum().put((Comparable) zzabd.getKey(), zzabd.getValue());
        }
        this.zzbty.add(i, new zzabd(this, k, v));
        AppMethodBeat.m2505o(3375);
        return null;
    }

    public final Entry<K, V> zzah(int i) {
        AppMethodBeat.m2504i(3370);
        Entry entry = (Entry) this.zzbty.get(i);
        AppMethodBeat.m2505o(3370);
        return entry;
    }

    public void zzrg() {
        AppMethodBeat.m2504i(3368);
        if (!this.zzbls) {
            this.zzbtz = this.zzbtz.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzbtz);
            this.zzbub = this.zzbub.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzbub);
            this.zzbls = true;
        }
        AppMethodBeat.m2505o(3368);
    }

    public final int zzuj() {
        AppMethodBeat.m2504i(3369);
        int size = this.zzbty.size();
        AppMethodBeat.m2505o(3369);
        return size;
    }

    public final Iterable<Entry<K, V>> zzuk() {
        AppMethodBeat.m2504i(3371);
        if (this.zzbtz.isEmpty()) {
            Iterable zzun = zzaba.zzun();
            AppMethodBeat.m2505o(3371);
            return zzun;
        }
        Set entrySet = this.zzbtz.entrySet();
        AppMethodBeat.m2505o(3371);
        return entrySet;
    }
}
