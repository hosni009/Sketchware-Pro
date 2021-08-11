package a.a.a;

import android.util.Pair;

import com.besome.sketch.beans.BlockBean;

import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import mod.hey.studios.editor.manage.block.code.ExtraBlockCode;
import mod.hey.studios.moreblock.ReturnMoreblockManager;

public class Fx {
    public String[] a = {"repeat", "+", "-", "*", "/", "%", ">", "=", "<", "&&", "||", "not"};
    public String[] b = {"+", "-", "*", "/", "%", ">", "=", "<", "&&", "||"};
    public String c;
    public String d;
    public jq e;
    public ArrayList<BlockBean> f;
    public Map<String, BlockBean> g = null;
    public ExtraBlockCode mceb;

    public Fx(String str, jq jqVar, String str2, ArrayList<BlockBean> arrayList) {
        this.c = str;
        this.e = jqVar;
        this.d = str2;
        this.f = arrayList;
        this.mceb = new ExtraBlockCode(this);
    }

    public String a() {
        this.g = new HashMap<>();
        if (f == null || f.size() <= 0) {
            return "";
        }
        for (BlockBean next : this.f) {
            this.g.put(next.id, next);
        }
        return a(this.f.get(0), "");
    }

    public final boolean b(String str, String str2) {
        boolean z;
        boolean z2;
        int i = 0;
        while (true) {
            if (i >= a.length) {
                z = false;
                break;
            } else if (a[i].equals(str2)) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        int i2 = 0;
        while (true) {
            if (i2 >= b.length) {
                z2 = false;
                break;
            } else if (b[i2].equals(str)) {
                z2 = true;
                break;
            } else {
                i2++;
            }
        }
        return z && z2;
    }

    public final String a(String str, String str2) {
        if (!this.g.containsKey(str)) {
            return "";
        }
        return a(this.g.get(str), str2);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:2265:0x35d9, code lost:
        if (r10.length() > 0) goto L_0x40cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2605:0x40c9, code lost:
        if (r7 != false) goto L_0x0fcb;
     */
    public final String a(BlockBean blockBean, String str) {
        char c2;
        String sb;
        String str2;
        String str3;
        String str4;
        int i;
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < blockBean.parameters.size(); i2++) {
            String str5 = blockBean.parameters.get(i2);
            Gx gx = blockBean.getParamClassInfo().get(i2);
            if (gx.b("boolean")) {
                i = 0;
            } else if (gx.b("double")) {
                i = 1;
            } else {
                i = gx.b("String") ? 2 : 3;
            }
            arrayList.add(a(str5, i, blockBean.opCode));
        }
        String str6 = blockBean.opCode;
        String str7 = "false";
        switch (str6.hashCode()) {
            case -2135695280:
                if (str6.equals("webViewLoadUrl")) {
                    c2 = 171;
                    break;
                }
                c2 = 65535;
                break;
            case -2120571577:
                if (str6.equals("mapIsEmpty")) {
                    c2 = 15;
                    break;
                }
                c2 = 65535;
                break;
            case -2114384168:
                if (str6.equals("firebasestorageDownloadFile")) {
                    c2 = 262;
                    break;
                }
                c2 = 65535;
                break;
            case -2055793167:
                if (str6.equals("fileutillistdir")) {
                    c2 = 271;
                    break;
                }
                c2 = 65535;
                break;
            case -2037144358:
                if (str6.equals("bluetoothConnectStartConnectionToUuid")) {
                    c2 = 315;
                    break;
                }
                c2 = 65535;
                break;
            case -2027093331:
                if (str6.equals("calendarViewSetDate")) {
                    c2 = 184;
                    break;
                }
                c2 = 65535;
                break;
            case -2020761366:
                if (str6.equals("fileRemoveData")) {
                    c2 = 133;
                    break;
                }
                c2 = 65535;
                break;
            case -1998407506:
                if (str6.equals("listSetData")) {
                    c2 = 159;
                    break;
                }
                c2 = 65535;
                break;
            case -1989678633:
                if (str6.equals("mapViewSetMarkerVisible")) {
                    c2 = 198;
                    break;
                }
                c2 = 65535;
                break;
            case -1979147952:
                if (str6.equals("stringContains")) {
                    c2 = '?';
                    break;
                }
                c2 = 65535;
                break;
            case -1975568730:
                if (str6.equals("copyToClipboard")) {
                    c2 = 'x';
                    break;
                }
                c2 = 65535;
                break;
            case -1966668787:
                if (str6.equals("firebaseauthSignOutUser")) {
                    c2 = 215;
                    break;
                }
                c2 = 65535;
                break;
            case -1937348542:
                if (str6.equals("firebaseStartListen")) {
                    c2 = 216;
                    break;
                }
                c2 = 65535;
                break;
            case -1922362317:
                if (str6.equals("getExternalStorageDir")) {
                    c2 = 278;
                    break;
                }
                c2 = 65535;
                break;
            case -1920517885:
                if (str6.equals("setVarBoolean")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -1919300188:
                if (str6.equals("toNumber")) {
                    c2 = 'C';
                    break;
                }
                c2 = 65535;
                break;
            case -1910071024:
                if (str6.equals("objectanimatorSetDuration")) {
                    c2 = 251;
                    break;
                }
                c2 = 65535;
                break;
            case -1886802639:
                if (str6.equals("soundpoolLoad")) {
                    c2 = 238;
                    break;
                }
                c2 = 65535;
                break;
            case -1834369666:
                if (str6.equals("setBitmapFileBrightness")) {
                    c2 = 290;
                    break;
                }
                c2 = 65535;
                break;
            case -1812313351:
                if (str6.equals("setColorFilter")) {
                    c2 = 'u';
                    break;
                }
                c2 = 65535;
                break;
            case -1778201036:
                if (str6.equals("listSmoothScrollTo")) {
                    c2 = 166;
                    break;
                }
                c2 = 65535;
                break;
            case -1776922004:
                if (str6.equals("toString")) {
                    c2 = 'H';
                    break;
                }
                c2 = 65535;
                break;
            case -1749698255:
                if (str6.equals("mediaplayerPause")) {
                    c2 = 228;
                    break;
                }
                c2 = 65535;
                break;
            case -1747734390:
                if (str6.equals("mediaplayerReset")) {
                    c2 = 232;
                    break;
                }
                c2 = 65535;
                break;
            case -1746380899:
                if (str6.equals("mediaplayerStart")) {
                    c2 = 227;
                    break;
                }
                c2 = 65535;
                break;
            case -1718917155:
                if (str6.equals("mediaplayerSeek")) {
                    c2 = 229;
                    break;
                }
                c2 = 65535;
                break;
            case -1699631195:
                if (str6.equals("isDrawerOpen")) {
                    c2 = 'i';
                    break;
                }
                c2 = 65535;
                break;
            case -1699349926:
                if (str6.equals("objectanimatorSetRepeatMode")) {
                    c2 = 252;
                    break;
                }
                c2 = 65535;
                break;
            case -1684072208:
                if (str6.equals("intentSetData")) {
                    c2 = '{';
                    break;
                }
                c2 = 65535;
                break;
            case -1679834825:
                if (str6.equals("setTrackResource")) {
                    c2 = 242;
                    break;
                }
                c2 = 65535;
                break;
            case -1678257956:
                if (str6.equals("gridSetCustomViewData")) {
                    c2 = 160;
                    break;
                }
                c2 = 65535;
                break;
            case -1666623936:
                if (str6.equals("speechToTextShutdown")) {
                    c2 = 311;
                    break;
                }
                c2 = 65535;
                break;
            case -1573371685:
                if (str6.equals("stringJoin")) {
                    c2 = ':';
                    break;
                }
                c2 = 65535;
                break;
            case -1541653284:
                if (str6.equals("objectanimatorStart")) {
                    c2 = 255;
                    break;
                }
                c2 = 65535;
                break;
            case -1530840255:
                if (str6.equals("stringIndex")) {
                    c2 = ';';
                    break;
                }
                c2 = 65535;
                break;
            case -1528850031:
                if (str6.equals("startActivity")) {
                    c2 = 128;
                    break;
                }
                c2 = 65535;
                break;
            case -1526161572:
                if (str6.equals("setBgColor")) {
                    c2 = 'q';
                    break;
                }
                c2 = 65535;
                break;
            case -1513446476:
                if (str6.equals("dialogCancelButton")) {
                    c2 = 224;
                    break;
                }
                c2 = 65535;
                break;
            case -1512519571:
                if (str6.equals("definedFunc")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1483954587:
                if (str6.equals("fileutilisdir")) {
                    c2 = 272;
                    break;
                }
                c2 = 65535;
                break;
            case -1477942289:
                if (str6.equals("mediaplayerIsLooping")) {
                    c2 = 236;
                    break;
                }
                c2 = 65535;
                break;
            case -1471049951:
                if (str6.equals("fileutilwrite")) {
                    c2 = 265;
                    break;
                }
                c2 = 65535;
                break;
            case -1440042085:
                if (str6.equals("spnSetSelection")) {
                    c2 = 169;
                    break;
                }
                c2 = 65535;
                break;
            case -1438040951:
                if (str6.equals("seekBarGetMax")) {
                    c2 = 246;
                    break;
                }
                c2 = 65535;
                break;
            case -1422112391:
                if (str6.equals("bluetoothConnectIsBluetoothEnabled")) {
                    c2 = 318;
                    break;
                }
                c2 = 65535;
                break;
            case -1405157727:
                if (str6.equals("fileutilmakedir")) {
                    c2 = 270;
                    break;
                }
                c2 = 65535;
                break;
            case -1385076635:
                if (str6.equals("dialogShow")) {
                    c2 = 222;
                    break;
                }
                c2 = 65535;
                break;
            case -1384861688:
                if (str6.equals("getAtListInt")) {
                    c2 = 19;
                    break;
                }
                c2 = 65535;
                break;
            case -1384858251:
                if (str6.equals("getAtListMap")) {
                    c2 = 29;
                    break;
                }
                c2 = 65535;
                break;
            case -1384851894:
                if (str6.equals("getAtListStr")) {
                    c2 = 24;
                    break;
                }
                c2 = 65535;
                break;
            case -1377080719:
                if (str6.equals("decreaseInt")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -1376608975:
                if (str6.equals("calendarSetTime")) {
                    c2 = 140;
                    break;
                }
                c2 = 65535;
                break;
            case -1361468284:
                if (str6.equals("viewOnClick")) {
                    c2 = 'h';
                    break;
                }
                c2 = 65535;
                break;
            case -1348085287:
                if (str6.equals("mapViewZoomIn")) {
                    c2 = 191;
                    break;
                }
                c2 = 65535;
                break;
            case -1348084945:
                if (str6.equals("mapViewZoomTo")) {
                    c2 = 190;
                    break;
                }
                c2 = 65535;
                break;
            case -1304067438:
                if (str6.equals("firebaseDelete")) {
                    c2 = 206;
                    break;
                }
                c2 = 65535;
                break;
            case -1272546178:
                if (str6.equals("dialogSetTitle")) {
                    c2 = 220;
                    break;
                }
                c2 = 65535;
                break;
            case -1271141237:
                if (str6.equals("clearList")) {
                    c2 = '%';
                    break;
                }
                c2 = 65535;
                break;
            case -1249367264:
                if (str6.equals("getArg")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1249347599:
                if (str6.equals("getVar")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1217704075:
                if (str6.equals("objectanimatorSetValue")) {
                    c2 = 249;
                    break;
                }
                c2 = 65535;
                break;
            case -1206794099:
                if (str6.equals("getLocationX")) {
                    c2 = 155;
                    break;
                }
                c2 = 65535;
                break;
            case -1206794098:
                if (str6.equals("getLocationY")) {
                    c2 = 156;
                    break;
                }
                c2 = 65535;
                break;
            case -1195899442:
                if (str6.equals("bluetoothConnectSendData")) {
                    c2 = 317;
                    break;
                }
                c2 = 65535;
                break;
            case -1192544266:
                if (str6.equals("ifElse")) {
                    c2 = ')';
                    break;
                }
                c2 = 65535;
                break;
            case -1185284274:
                if (str6.equals("gyroscopeStopListen")) {
                    c2 = 219;
                    break;
                }
                c2 = 65535;
                break;
            case -1182878167:
                if (str6.equals("firebaseauthGetUid")) {
                    c2 = 213;
                    break;
                }
                c2 = 65535;
                break;
            case -1160374245:
                if (str6.equals("bluetoothConnectReadyConnectionToUuid")) {
                    c2 = 313;
                    break;
                }
                c2 = 65535;
                break;
            case -1149848189:
                if (str6.equals("toStringFormat")) {
                    c2 = 'J';
                    break;
                }
                c2 = 65535;
                break;
            case -1149458632:
                if (str6.equals("objectanimatorSetRepeatCount")) {
                    c2 = 253;
                    break;
                }
                c2 = 65535;
                break;
            case -1143684675:
                if (str6.equals("firebaseauthGetCurrentUser")) {
                    c2 = 212;
                    break;
                }
                c2 = 65535;
                break;
            case -1139353316:
                if (str6.equals("setListMap")) {
                    c2 = 30;
                    break;
                }
                c2 = 65535;
                break;
            case -1137582698:
                if (str6.equals("toLowerCase")) {
                    c2 = 'G';
                    break;
                }
                c2 = 65535;
                break;
            case -1123431291:
                if (str6.equals("calnedarViewSetMaxDate")) {
                    c2 = 186;
                    break;
                }
                c2 = 65535;
                break;
            case -1107376988:
                if (str6.equals("webViewGoForward")) {
                    c2 = 177;
                    break;
                }
                c2 = 65535;
                break;
            case -1106141754:
                if (str6.equals("webViewCanGoBack")) {
                    c2 = 174;
                    break;
                }
                c2 = 65535;
                break;
            case -1094491139:
                if (str6.equals("seekBarSetMax")) {
                    c2 = 245;
                    break;
                }
                c2 = 65535;
                break;
            case -1083547183:
                if (str6.equals("spnSetCustomViewData")) {
                    c2 = 160;
                    break;
                }
                c2 = 65535;
                break;
            case -1081400230:
                if (str6.equals("mapGet")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case -1081391085:
                if (str6.equals("mapPut")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case -1081250015:
                if (str6.equals("mathPi")) {
                    c2 = 'S';
                    break;
                }
                c2 = 65535;
                break;
            case -1069525505:
                if (str6.equals("pagerSetCustomViewData")) {
                    c2 = 160;
                    break;
                }
                c2 = 65535;
                break;
            case -1063598745:
                if (str6.equals("resizeBitmapFileRetainRatio")) {
                    c2 = 281;
                    break;
                }
                c2 = 65535;
                break;
            case -1043233275:
                if (str6.equals("mediaplayerGetDuration")) {
                    c2 = 231;
                    break;
                }
                c2 = 65535;
                break;
            case -1033658254:
                if (str6.equals("mathGetDisplayWidth")) {
                    c2 = 'Q';
                    break;
                }
                c2 = 65535;
                break;
            case -1021852352:
                if (str6.equals("objectanimatorCancel")) {
                    c2 = 256;
                    break;
                }
                c2 = 65535;
                break;
            case -1007787615:
                if (str6.equals("mediaplayerSetLooping")) {
                    c2 = 235;
                    break;
                }
                c2 = 65535;
                break;
            case -996870276:
                if (str6.equals("insertMapToList")) {
                    c2 = '!';
                    break;
                }
                c2 = 65535;
                break;
            case -995908985:
                if (str6.equals("soundpoolCreate")) {
                    c2 = 237;
                    break;
                }
                c2 = 65535;
                break;
            case -941420147:
                if (str6.equals("fileSetFileName")) {
                    c2 = 130;
                    break;
                }
                c2 = 65535;
                break;
            case -938285885:
                if (str6.equals("random")) {
                    c2 = '8';
                    break;
                }
                c2 = 65535;
                break;
            case -934531685:
                if (str6.equals("repeat")) {
                    c2 = '\'';
                    break;
                }
                c2 = 65535;
                break;
            case -918173448:
                if (str6.equals("listGetCheckedPosition")) {
                    c2 = 163;
                    break;
                }
                c2 = 65535;
                break;
            case -917343271:
                if (str6.equals("getJpegRotate")) {
                    c2 = 292;
                    break;
                }
                c2 = 65535;
                break;
            case -911199919:
                if (str6.equals("objectanimatorSetProperty")) {
                    c2 = 248;
                    break;
                }
                c2 = 65535;
                break;
            case -903177036:
                if (str6.equals("resizeBitmapFileWithRoundedBorder")) {
                    c2 = 284;
                    break;
                }
                c2 = 65535;
                break;
            case -883988307:
                if (str6.equals("dialogSetMessage")) {
                    c2 = 221;
                    break;
                }
                c2 = 65535;
                break;
            case -869293886:
                if (str6.equals("finishActivity")) {
                    c2 = 129;
                    break;
                }
                c2 = 65535;
                break;
            case -854558288:
                if (str6.equals("setVisible")) {
                    c2 = 141;
                    break;
                }
                c2 = 65535;
                break;
            case -853550561:
                if (str6.equals("timerCancel")) {
                    c2 = 202;
                    break;
                }
                c2 = 65535;
                break;
            case -831887360:
                if (str6.equals("textToSpeechShutdown")) {
                    c2 = 308;
                    break;
                }
                c2 = 65535;
                break;
            case -733318734:
                if (str6.equals("strToListMap")) {
                    c2 = 'N';
                    break;
                }
                c2 = 65535;
                break;
            case -697616870:
                if (str6.equals("camerastarttakepicture")) {
                    c2 = 294;
                    break;
                }
                c2 = 65535;
                break;
            case -677662361:
                if (str6.equals("forever")) {
                    c2 = '&';
                    break;
                }
                c2 = 65535;
                break;
            case -668992194:
                if (str6.equals("stringReplaceAll")) {
                    c2 = 'B';
                    break;
                }
                c2 = 65535;
                break;
            case -664474111:
                if (str6.equals("intentSetFlags")) {
                    c2 = '~';
                    break;
                }
                c2 = 65535;
                break;
            case -649691581:
                if (str6.equals("objectanimatorSetInterpolator")) {
                    c2 = 254;
                    break;
                }
                c2 = 65535;
                break;
            case -636363854:
                if (str6.equals("webViewGetUrl")) {
                    c2 = 172;
                    break;
                }
                c2 = 65535;
                break;
            case -628607128:
                if (str6.equals("webViewGoBack")) {
                    c2 = 176;
                    break;
                }
                c2 = 65535;
                break;
            case -621198621:
                if (str6.equals("speechToTextStartListening")) {
                    c2 = 309;
                    break;
                }
                c2 = 65535;
                break;
            case -602241037:
                if (str6.equals("fileutilcopy")) {
                    c2 = 266;
                    break;
                }
                c2 = 65535;
                break;
            case -601942961:
                if (str6.equals("fileutilmove")) {
                    c2 = 267;
                    break;
                }
                c2 = 65535;
                break;
            case -601804268:
                if (str6.equals("fileutilread")) {
                    c2 = 264;
                    break;
                }
                c2 = 65535;
                break;
            case -578987803:
                if (str6.equals("setChecked")) {
                    c2 = 157;
                    break;
                }
                c2 = 65535;
                break;
            case -509946902:
                if (str6.equals("spnRefresh")) {
                    c2 = 168;
                    break;
                }
                c2 = 65535;
                break;
            case -439342016:
                if (str6.equals("webViewClearHistory")) {
                    c2 = 179;
                    break;
                }
                c2 = 65535;
                break;
            case -437272040:
                if (str6.equals("bluetoothConnectGetRandomUuid")) {
                    c2 = 322;
                    break;
                }
                c2 = 65535;
                break;
            case -425293664:
                if (str6.equals("setClickable")) {
                    c2 = 142;
                    break;
                }
                c2 = 65535;
                break;
            case -418212114:
                if (str6.equals("firebaseGetChildren")) {
                    c2 = 207;
                    break;
                }
                c2 = 65535;
                break;
            case -411705840:
                if (str6.equals("fileSetData")) {
                    c2 = 132;
                    break;
                }
                c2 = 65535;
                break;
            case -399551817:
                if (str6.equals("toUpperCase")) {
                    c2 = 'F';
                    break;
                }
                c2 = 65535;
                break;
            case -390304998:
                if (str6.equals("mapViewAddMarker")) {
                    c2 = 193;
                    break;
                }
                c2 = 65535;
                break;
            case -356866884:
                if (str6.equals("webViewSetCacheMode")) {
                    c2 = 173;
                    break;
                }
                c2 = 65535;
                break;
            case -353129373:
                if (str6.equals("calendarDiff")) {
                    c2 = 138;
                    break;
                }
                c2 = 65535;
                break;
            case -329562760:
                if (str6.equals("insertListInt")) {
                    c2 = 18;
                    break;
                }
                c2 = 65535;
                break;
            case -329559323:
                if (str6.equals("insertListMap")) {
                    c2 = 28;
                    break;
                }
                c2 = 65535;
                break;
            case -329552966:
                if (str6.equals("insertListStr")) {
                    c2 = 23;
                    break;
                }
                c2 = 65535;
                break;
            case -322651344:
                if (str6.equals("stringEquals")) {
                    c2 = '>';
                    break;
                }
                c2 = 65535;
                break;
            case -283328259:
                if (str6.equals("intentPutExtra")) {
                    c2 = '}';
                    break;
                }
                c2 = 65535;
                break;
            case -258774775:
                if (str6.equals("closeDrawer")) {
                    c2 = 'k';
                    break;
                }
                c2 = 65535;
                break;
            case -247015294:
                if (str6.equals("mediaplayerRelease")) {
                    c2 = 233;
                    break;
                }
                c2 = 65535;
                break;
            case -208762465:
                if (str6.equals("toStringWithDecimal")) {
                    c2 = 'I';
                    break;
                }
                c2 = 65535;
                break;
            case -189292433:
                if (str6.equals("stringSub")) {
                    c2 = '=';
                    break;
                }
                c2 = 65535;
                break;
            case -152473824:
                if (str6.equals("firebaseauthIsLoggedIn")) {
                    c2 = 211;
                    break;
                }
                c2 = 65535;
                break;
            case -149850417:
                if (str6.equals("fileutilisexist")) {
                    c2 = 269;
                    break;
                }
                c2 = 65535;
                break;
            case -133532073:
                if (str6.equals("stringLength")) {
                    c2 = '9';
                    break;
                }
                c2 = 65535;
                break;
            case -96313603:
                if (str6.equals("containListInt")) {
                    c2 = 21;
                    break;
                }
                c2 = 65535;
                break;
            case -96310166:
                if (str6.equals("containListMap")) {
                    c2 = 31;
                    break;
                }
                c2 = 65535;
                break;
            case -96303809:
                if (str6.equals("containListStr")) {
                    c2 = 26;
                    break;
                }
                c2 = 65535;
                break;
            case -83301935:
                if (str6.equals("webViewZoomIn")) {
                    c2 = 181;
                    break;
                }
                c2 = 65535;
                break;
            case -83186725:
                if (str6.equals("openDrawer")) {
                    c2 = 'j';
                    break;
                }
                c2 = 65535;
                break;
            case -75125341:
                if (str6.equals("getText")) {
                    c2 = 'p';
                    break;
                }
                c2 = 65535;
                break;
            case -60494417:
                if (str6.equals("vibratorAction")) {
                    c2 = 199;
                    break;
                }
                c2 = 65535;
                break;
            case -60048101:
                if (str6.equals("firebaseauthResetPassword")) {
                    c2 = 214;
                    break;
                }
                c2 = 65535;
                break;
            case -24451690:
                if (str6.equals("dialogOkButton")) {
                    c2 = 223;
                    break;
                }
                c2 = 65535;
                break;
            case -14362103:
                if (str6.equals("bluetoothConnectIsBluetoothActivated")) {
                    c2 = 319;
                    break;
                }
                c2 = 65535;
                break;
            case -10599306:
                if (str6.equals("firebaseauthCreateUser")) {
                    c2 = 208;
                    break;
                }
                c2 = 65535;
                break;
            case -9742826:
                if (str6.equals("firebaseGetPushKey")) {
                    c2 = 205;
                    break;
                }
                c2 = 65535;
                break;
            case 37:
                if (str6.equals("%")) {
                    c2 = '2';
                    break;
                }
                c2 = 65535;
                break;
            case 42:
                if (str6.equals("*")) {
                    c2 = '0';
                    break;
                }
                c2 = 65535;
                break;
            case 43:
                if (str6.equals("+")) {
                    c2 = '.';
                    break;
                }
                c2 = 65535;
                break;
            case 45:
                if (str6.equals("-")) {
                    c2 = '/';
                    break;
                }
                c2 = 65535;
                break;
            case 47:
                if (str6.equals("/")) {
                    c2 = '1';
                    break;
                }
                c2 = 65535;
                break;
            case 60:
                if (str6.equals("<")) {
                    c2 = '4';
                    break;
                }
                c2 = 65535;
                break;
            case 61:
                if (str6.equals("=")) {
                    c2 = '5';
                    break;
                }
                c2 = 65535;
                break;
            case 62:
                if (str6.equals(">")) {
                    c2 = '3';
                    break;
                }
                c2 = 65535;
                break;
            case 1216:
                if (str6.equals("&&")) {
                    c2 = '6';
                    break;
                }
                c2 = 65535;
                break;
            case 3357:
                if (str6.equals("if")) {
                    c2 = '(';
                    break;
                }
                c2 = 65535;
                break;
            case 3968:
                if (str6.equals("||")) {
                    c2 = '7';
                    break;
                }
                c2 = 65535;
                break;
            case 109267:
                if (str6.equals("not")) {
                    c2 = '-';
                    break;
                }
                c2 = 65535;
                break;
            case 3568674:
                if (str6.equals("trim")) {
                    c2 = 'E';
                    break;
                }
                c2 = 65535;
                break;
            case 3569038:
                if (str6.equals("true")) {
                    c2 = '+';
                    break;
                }
                c2 = 65535;
                break;
            case 8255701:
                if (str6.equals("calendarFormat")) {
                    c2 = 137;
                    break;
                }
                c2 = 65535;
                break;
            case 16308074:
                if (str6.equals("resizeBitmapFileToCircle")) {
                    c2 = 283;
                    break;
                }
                c2 = 65535;
                break;
            case 25469951:
                if (str6.equals("bluetoothConnectActivateBluetooth")) {
                    c2 = 320;
                    break;
                }
                c2 = 65535;
                break;
            case 27679870:
                if (str6.equals("calendarGetNow")) {
                    c2 = 134;
                    break;
                }
                c2 = 65535;
                break;
            case 56167279:
                if (str6.equals("setBitmapFileContrast")) {
                    c2 = 291;
                    break;
                }
                c2 = 65535;
                break;
            case 61585857:
                if (str6.equals("firebasePush")) {
                    c2 = 204;
                    break;
                }
                c2 = 65535;
                break;
            case 94001407:
                if (str6.equals("break")) {
                    c2 = '*';
                    break;
                }
                c2 = 65535;
                break;
            case 97196323:
                if (str6.equals(str7)) {
                    c2 = ',';
                    break;
                }
                c2 = 65535;
                break;
            case 103668285:
                if (str6.equals("mathE")) {
                    c2 = 'T';
                    break;
                }
                c2 = 65535;
                break;
            case 125431087:
                if (str6.equals("speechToTextStopListening")) {
                    c2 = 310;
                    break;
                }
                c2 = 65535;
                break;
            case 134874756:
                if (str6.equals("listSetCustomViewData")) {
                    c2 = 160;
                    break;
                }
                c2 = 65535;
                break;
            case 152967761:
                if (str6.equals("mapClear")) {
                    c2 = 14;
                    break;
                }
                c2 = 65535;
                break;
            case 163812602:
                if (str6.equals("cropBitmapFileFromCenter")) {
                    c2 = 285;
                    break;
                }
                c2 = 65535;
                break;
            case 168740282:
                if (str6.equals("mapToStr")) {
                    c2 = 'M';
                    break;
                }
                c2 = 65535;
                break;
            case 182549637:
                if (str6.equals("setEnable")) {
                    c2 = 'l';
                    break;
                }
                c2 = 65535;
                break;
            case 207764385:
                if (str6.equals("calendarViewGetDate")) {
                    c2 = 183;
                    break;
                }
                c2 = 65535;
                break;
            case 255417137:
                if (str6.equals("adViewLoadAd")) {
                    c2 = 187;
                    break;
                }
                c2 = 65535;
                break;
            case 262073061:
                if (str6.equals("bluetoothConnectReadyConnection")) {
                    c2 = 312;
                    break;
                }
                c2 = 65535;
                break;
            case 276674391:
                if (str6.equals("mapViewMoveCamera")) {
                    c2 = 189;
                    break;
                }
                c2 = 65535;
                break;
            case 297379706:
                if (str6.equals("textToSpeechSetSpeechRate")) {
                    c2 = 304;
                    break;
                }
                c2 = 65535;
                break;
            case 300372142:
                if (str6.equals("mathAcos")) {
                    c2 = 'a';
                    break;
                }
                c2 = 65535;
                break;
            case 300387327:
                if (str6.equals("mathAsin")) {
                    c2 = '`';
                    break;
                }
                c2 = 65535;
                break;
            case 300388040:
                if (str6.equals("mathAtan")) {
                    c2 = 'b';
                    break;
                }
                c2 = 65535;
                break;
            case 300433453:
                if (str6.equals("mathCeil")) {
                    c2 = '[';
                    break;
                }
                c2 = 65535;
                break;
            case 300921928:
                if (str6.equals("mathSqrt")) {
                    c2 = 'X';
                    break;
                }
                c2 = 65535;
                break;
            case 317453636:
                if (str6.equals("textToSpeechIsSpeaking")) {
                    c2 = 306;
                    break;
                }
                c2 = 65535;
                break;
            case 342026220:
                if (str6.equals("interstitialadShow")) {
                    c2 = 260;
                    break;
                }
                c2 = 65535;
                break;
            case 348377823:
                if (str6.equals("soundpoolStreamPlay")) {
                    c2 = 239;
                    break;
                }
                c2 = 65535;
                break;
            case 348475309:
                if (str6.equals("soundpoolStreamStop")) {
                    c2 = 240;
                    break;
                }
                c2 = 65535;
                break;
            case 362605827:
                if (str6.equals("recyclerSetCustomViewData")) {
                    c2 = 160;
                    break;
                }
                c2 = 65535;
                break;
            case 389111867:
                if (str6.equals("spnSetData")) {
                    c2 = 167;
                    break;
                }
                c2 = 65535;
                break;
            case 397166713:
                if (str6.equals("getEnable")) {
                    c2 = 'm';
                    break;
                }
                c2 = 65535;
                break;
            case 401012285:
                if (str6.equals("getTranslationX")) {
                    c2 = 148;
                    break;
                }
                c2 = 65535;
                break;
            case 401012286:
                if (str6.equals("getTranslationY")) {
                    c2 = 150;
                    break;
                }
                c2 = 65535;
                break;
            case 404247683:
                if (str6.equals("calendarAdd")) {
                    c2 = 135;
                    break;
                }
                c2 = 65535;
                break;
            case 404265028:
                if (str6.equals("calendarSet")) {
                    c2 = 136;
                    break;
                }
                c2 = 65535;
                break;
            case 442768763:
                if (str6.equals("mapGetAllKeys")) {
                    c2 = 16;
                    break;
                }
                c2 = 65535;
                break;
            case 463560551:
                if (str6.equals("mapContainKey")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case 463594049:
                if (str6.equals("objectanimatorSetFromTo")) {
                    c2 = 250;
                    break;
                }
                c2 = 65535;
                break;
            case 470160234:
                if (str6.equals("fileutilGetLastSegmentPath")) {
                    c2 = 277;
                    break;
                }
                c2 = 65535;
                break;
            case 475815924:
                if (str6.equals("setTextColor")) {
                    c2 = 's';
                    break;
                }
                c2 = 65535;
                break;
            case 481850295:
                if (str6.equals("resizeBitmapFileToSquare")) {
                    c2 = 282;
                    break;
                }
                c2 = 65535;
                break;
            case 490702942:
                if (str6.equals("filepickerstartpickfiles")) {
                    c2 = 293;
                    break;
                }
                c2 = 65535;
                break;
            case 501171279:
                if (str6.equals("mathToDegree")) {
                    c2 = 'g';
                    break;
                }
                c2 = 65535;
                break;
            case 530759231:
                if (str6.equals("progressBarSetIndeterminate")) {
                    c2 = 302;
                    break;
                }
                c2 = 65535;
                break;
            case 548860462:
                if (str6.equals("webViewClearCache")) {
                    c2 = 178;
                    break;
                }
                c2 = 65535;
                break;
            case 556217437:
                if (str6.equals("setRotate")) {
                    c2 = 143;
                    break;
                }
                c2 = 65535;
                break;
            case 571046965:
                if (str6.equals("scaleBitmapFile")) {
                    c2 = 287;
                    break;
                }
                c2 = 65535;
                break;
            case 573208400:
                if (str6.equals("setScaleX")) {
                    c2 = 151;
                    break;
                }
                c2 = 65535;
                break;
            case 573208401:
                if (str6.equals("setScaleY")) {
                    c2 = 153;
                    break;
                }
                c2 = 65535;
                break;
            case 573295520:
                if (str6.equals("listGetCheckedCount")) {
                    c2 = 165;
                    break;
                }
                c2 = 65535;
                break;
            case 601235430:
                if (str6.equals("currentTime")) {
                    c2 = 'D';
                    break;
                }
                c2 = 65535;
                break;
            case 610313513:
                if (str6.equals("getMapInList")) {
                    c2 = '\"';
                    break;
                }
                c2 = 65535;
                break;
            case 615286641:
                if (str6.equals("dialogNeutralButton")) {
                    c2 = 225;
                    break;
                }
                c2 = 65535;
                break;
            case 657721930:
                if (str6.equals("setVarInt")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 683193060:
                if (str6.equals("bluetoothConnectStartConnection")) {
                    c2 = 314;
                    break;
                }
                c2 = 65535;
                break;
            case 725249532:
                if (str6.equals("intentSetAction")) {
                    c2 = 'z';
                    break;
                }
                c2 = 65535;
                break;
            case 726487524:
                if (str6.equals("mathFloor")) {
                    c2 = '\\';
                    break;
                }
                c2 = 65535;
                break;
            case 726877492:
                if (str6.equals("mapViewSetMarkerIcon")) {
                    c2 = 197;
                    break;
                }
                c2 = 65535;
                break;
            case 726887785:
                if (str6.equals("mapViewSetMarkerInfo")) {
                    c2 = 194;
                    break;
                }
                c2 = 65535;
                break;
            case 732108347:
                if (str6.equals("mathLog10")) {
                    c2 = 'e';
                    break;
                }
                c2 = 65535;
                break;
            case 737664870:
                if (str6.equals("mathRound")) {
                    c2 = 'Z';
                    break;
                }
                c2 = 65535;
                break;
            case 738846120:
                if (str6.equals("textToSpeechSetPitch")) {
                    c2 = 303;
                    break;
                }
                c2 = 65535;
                break;
            case 747168008:
                if (str6.equals("mapCreateNew")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 754442829:
                if (str6.equals("increaseInt")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 762282303:
                if (str6.equals("indexListInt")) {
                    c2 = 20;
                    break;
                }
                c2 = 65535;
                break;
            case 762292097:
                if (str6.equals("indexListStr")) {
                    c2 = 25;
                    break;
                }
                c2 = 65535;
                break;
            case 770834513:
                if (str6.equals("getRotate")) {
                    c2 = 144;
                    break;
                }
                c2 = 65535;
                break;
            case 787825476:
                if (str6.equals("getScaleX")) {
                    c2 = 152;
                    break;
                }
                c2 = 65535;
                break;
            case 787825477:
                if (str6.equals("getScaleY")) {
                    c2 = 154;
                    break;
                }
                c2 = 65535;
                break;
            case 797861524:
                if (str6.equals("addMapToList")) {
                    c2 = ' ';
                    break;
                }
                c2 = 65535;
                break;
            case 836692861:
                if (str6.equals("mapSize")) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            case 840973386:
                if (str6.equals("mathAbs")) {
                    c2 = 'Y';
                    break;
                }
                c2 = 65535;
                break;
            case 840975711:
                if (str6.equals("mathCos")) {
                    c2 = '^';
                    break;
                }
                c2 = 65535;
                break;
            case 840977909:
                if (str6.equals("mathExp")) {
                    c2 = 'c';
                    break;
                }
                c2 = 65535;
                break;
            case 840984348:
                if (str6.equals("mathLog")) {
                    c2 = 'd';
                    break;
                }
                c2 = 65535;
                break;
            case 840984892:
                if (str6.equals("mathMax")) {
                    c2 = 'W';
                    break;
                }
                c2 = 65535;
                break;
            case 840985130:
                if (str6.equals("mathMin")) {
                    c2 = 'V';
                    break;
                }
                c2 = 65535;
                break;
            case 840988208:
                if (str6.equals("mathPow")) {
                    c2 = 'U';
                    break;
                }
                c2 = 65535;
                break;
            case 840990896:
                if (str6.equals("mathSin")) {
                    c2 = ']';
                    break;
                }
                c2 = 65535;
                break;
            case 840991609:
                if (str6.equals("mathTan")) {
                    c2 = '_';
                    break;
                }
                c2 = 65535;
                break;
            case 845089750:
                if (str6.equals("setVarString")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 848786445:
                if (str6.equals("objectanimatorSetTarget")) {
                    c2 = 247;
                    break;
                }
                c2 = 65535;
                break;
            case 858248741:
                if (str6.equals("calendarGetTime")) {
                    c2 = 139;
                    break;
                }
                c2 = 65535;
                break;
            case 898187172:
                if (str6.equals("mathToRadian")) {
                    c2 = 'f';
                    break;
                }
                c2 = 65535;
                break;
            case 932259189:
                if (str6.equals("setBgResource")) {
                    c2 = 'r';
                    break;
                }
                c2 = 65535;
                break;
            case 937017988:
                if (str6.equals("gyroscopeStartListen")) {
                    c2 = 218;
                    break;
                }
                c2 = 65535;
                break;
            case 948234497:
                if (str6.equals("webViewStopLoading")) {
                    c2 = 180;
                    break;
                }
                c2 = 65535;
                break;
            case 950609198:
                if (str6.equals("setBitmapFileColorFilter")) {
                    c2 = 289;
                    break;
                }
                c2 = 65535;
                break;
            case 1053179400:
                if (str6.equals("mapViewSetMarkerColor")) {
                    c2 = 196;
                    break;
                }
                c2 = 65535;
                break;
            case 1068548733:
                if (str6.equals("mathGetDip")) {
                    c2 = 'P';
                    break;
                }
                c2 = 65535;
                break;
            case 1086207657:
                if (str6.equals("fileutildelete")) {
                    c2 = 268;
                    break;
                }
                c2 = 65535;
                break;
            case 1088879149:
                if (str6.equals("setHintTextColor")) {
                    c2 = 298;
                    break;
                }
                c2 = 65535;
                break;
            case 1090517587:
                if (str6.equals("getPackageDataDir")) {
                    c2 = 279;
                    break;
                }
                c2 = 65535;
                break;
            case 1102670563:
                if (str6.equals("requestnetworkSetHeaders")) {
                    c2 = 300;
                    break;
                }
                c2 = 65535;
                break;
            case 1129709718:
                if (str6.equals("setImageUrl")) {
                    c2 = 296;
                    break;
                }
                c2 = 65535;
                break;
            case 1142897724:
                if (str6.equals("firebaseauthSignInUser")) {
                    c2 = 209;
                    break;
                }
                c2 = 65535;
                break;
            case 1156598140:
                if (str6.equals("fileutilEndsWith")) {
                    c2 = 276;
                    break;
                }
                c2 = 65535;
                break;
            case 1159035162:
                if (str6.equals("mapViewZoomOut")) {
                    c2 = 192;
                    break;
                }
                c2 = 65535;
                break;
            case 1160674468:
                if (str6.equals("lengthList")) {
                    c2 = '$';
                    break;
                }
                c2 = 65535;
                break;
            case 1162069698:
                if (str6.equals("setThumbResource")) {
                    c2 = 241;
                    break;
                }
                c2 = 65535;
                break;
            case 1179719371:
                if (str6.equals("stringLastIndex")) {
                    c2 = '<';
                    break;
                }
                c2 = 65535;
                break;
            case 1187505507:
                if (str6.equals("stringReplace")) {
                    c2 = '@';
                    break;
                }
                c2 = 65535;
                break;
            case 1216249183:
                if (str6.equals("firebasestorageDelete")) {
                    c2 = 263;
                    break;
                }
                c2 = 65535;
                break;
            case 1219071185:
                if (str6.equals("firebasestorageUploadFile")) {
                    c2 = 261;
                    break;
                }
                c2 = 65535;
                break;
            case 1219299503:
                if (str6.equals("objectanimatorIsRunning")) {
                    c2 = 257;
                    break;
                }
                c2 = 65535;
                break;
            case 1220078450:
                if (str6.equals("addSourceDirectly")) {
                    c2 = 'K';
                    break;
                }
                c2 = 65535;
                break;
            case 1236956449:
                if (str6.equals("mediaplayerCreate")) {
                    c2 = 226;
                    break;
                }
                c2 = 65535;
                break;
            case 1240510514:
                if (str6.equals("intentSetScreen")) {
                    c2 = '|';
                    break;
                }
                c2 = 65535;
                break;
            case 1242107556:
                if (str6.equals("fileutilisfile")) {
                    c2 = 273;
                    break;
                }
                c2 = 65535;
                break;
            case 1252547704:
                if (str6.equals("listMapToStr")) {
                    c2 = 'O';
                    break;
                }
                c2 = 65535;
                break;
            case 1280029577:
                if (str6.equals("requestFocus")) {
                    c2 = 'v';
                    break;
                }
                c2 = 65535;
                break;
            case 1303367340:
                if (str6.equals("textToSpeechStop")) {
                    c2 = 307;
                    break;
                }
                c2 = 65535;
                break;
            case 1305932583:
                if (str6.equals("spnGetSelection")) {
                    c2 = 170;
                    break;
                }
                c2 = 65535;
                break;
            case 1311764809:
                if (str6.equals("setTranslationX")) {
                    c2 = 147;
                    break;
                }
                c2 = 65535;
                break;
            case 1311764810:
                if (str6.equals("setTranslationY")) {
                    c2 = 149;
                    break;
                }
                c2 = 65535;
                break;
            case 1313527577:
                if (str6.equals("setTypeface")) {
                    c2 = 'o';
                    break;
                }
                c2 = 65535;
                break;
            case 1315302372:
                if (str6.equals("fileutillength")) {
                    c2 = 274;
                    break;
                }
                c2 = 65535;
                break;
            case 1330354473:
                if (str6.equals("firebaseauthSignInAnonymously")) {
                    c2 = 210;
                    break;
                }
                c2 = 65535;
                break;
            case 1343794064:
                if (str6.equals("listSetItemChecked")) {
                    c2 = 162;
                    break;
                }
                c2 = 65535;
                break;
            case 1348133645:
                if (str6.equals("stringReplaceFirst")) {
                    c2 = 'A';
                    break;
                }
                c2 = 65535;
                break;
            case 1387622940:
                if (str6.equals("setAlpha")) {
                    c2 = 145;
                    break;
                }
                c2 = 65535;
                break;
            case 1395026457:
                if (str6.equals("setImage")) {
                    c2 = 't';
                    break;
                }
                c2 = 65535;
                break;
            case 1397501021:
                if (str6.equals("listRefresh")) {
                    c2 = 161;
                    break;
                }
                c2 = 65535;
                break;
            case 1405084438:
                if (str6.equals("setTitle")) {
                    c2 = 'y';
                    break;
                }
                c2 = 65535;
                break;
            case 1410284340:
                if (str6.equals("seekBarSetProgress")) {
                    c2 = 243;
                    break;
                }
                c2 = 65535;
                break;
            case 1431171391:
                if (str6.equals("mapRemoveKey")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case 1437288110:
                if (str6.equals("getPublicDir")) {
                    c2 = 280;
                    break;
                }
                c2 = 65535;
                break;
            case 1470831563:
                if (str6.equals("intentGetString")) {
                    c2 = 127;
                    break;
                }
                c2 = 65535;
                break;
            case 1498864168:
                if (str6.equals("seekBarGetProgress")) {
                    c2 = 244;
                    break;
                }
                c2 = 65535;
                break;
            case 1601394299:
                if (str6.equals("listGetCheckedPositions")) {
                    c2 = 164;
                    break;
                }
                c2 = 65535;
                break;
            case 1633341847:
                if (str6.equals("timerAfter")) {
                    c2 = 200;
                    break;
                }
                c2 = 65535;
                break;
            case 1635356258:
                if (str6.equals("requestnetworkStartRequestNetwork")) {
                    c2 = 301;
                    break;
                }
                c2 = 65535;
                break;
            case 1637498582:
                if (str6.equals("timerEvery")) {
                    c2 = 201;
                    break;
                }
                c2 = 65535;
                break;
            case 1695890133:
                if (str6.equals("fileutilStartsWith")) {
                    c2 = 275;
                    break;
                }
                c2 = 65535;
                break;
            case 1712613410:
                if (str6.equals("webViewZoomOut")) {
                    c2 = 182;
                    break;
                }
                c2 = 65535;
                break;
            case 1749552744:
                if (str6.equals("textToSpeechSpeak")) {
                    c2 = 305;
                    break;
                }
                c2 = 65535;
                break;
            case 1764351209:
                if (str6.equals("deleteList")) {
                    c2 = '#';
                    break;
                }
                c2 = 65535;
                break;
            case 1775620400:
                if (str6.equals("strToMap")) {
                    c2 = 'L';
                    break;
                }
                c2 = 65535;
                break;
            case 1779174257:
                if (str6.equals("getChecked")) {
                    c2 = 158;
                    break;
                }
                c2 = 65535;
                break;
            case 1792552710:
                if (str6.equals("rotateBitmapFile")) {
                    c2 = 286;
                    break;
                }
                c2 = 65535;
                break;
            case 1814870108:
                if (str6.equals("doToast")) {
                    c2 = 'w';
                    break;
                }
                c2 = 65535;
                break;
            case 1820536363:
                if (str6.equals("interstitialadCreate")) {
                    c2 = 258;
                    break;
                }
                c2 = 65535;
                break;
            case 1823151876:
                if (str6.equals("fileGetData")) {
                    c2 = 131;
                    break;
                }
                c2 = 65535;
                break;
            case 1848365301:
                if (str6.equals("mapViewSetMapType")) {
                    c2 = 188;
                    break;
                }
                c2 = 65535;
                break;
            case 1873103950:
                if (str6.equals("locationManagerRemoveUpdates")) {
                    c2 = 324;
                    break;
                }
                c2 = 65535;
                break;
            case 1883337723:
                if (str6.equals("mathGetDisplayHeight")) {
                    c2 = 'R';
                    break;
                }
                c2 = 65535;
                break;
            case 1885231494:
                if (str6.equals("webViewCanGoForward")) {
                    c2 = 175;
                    break;
                }
                c2 = 65535;
                break;
            case 1908132964:
                if (str6.equals("mapViewSetMarkerPosition")) {
                    c2 = 195;
                    break;
                }
                c2 = 65535;
                break;
            case 1908582864:
                if (str6.equals("firebaseStopListen")) {
                    c2 = 217;
                    break;
                }
                c2 = 65535;
                break;
            case 1923980937:
                if (str6.equals("requestnetworkSetParams")) {
                    c2 = 299;
                    break;
                }
                c2 = 65535;
                break;
            case 1941634330:
                if (str6.equals("firebaseAdd")) {
                    c2 = 203;
                    break;
                }
                c2 = 65535;
                break;
            case 1948735400:
                if (str6.equals("getAlpha")) {
                    c2 = 146;
                    break;
                }
                c2 = 65535;
                break;
            case 1964823036:
                if (str6.equals("bluetoothConnectStopConnection")) {
                    c2 = 316;
                    break;
                }
                c2 = 65535;
                break;
            case 1973523807:
                if (str6.equals("mediaplayerIsPlaying")) {
                    c2 = 234;
                    break;
                }
                c2 = 65535;
                break;
            case 1974249461:
                if (str6.equals("skewBitmapFile")) {
                    c2 = 288;
                    break;
                }
                c2 = 65535;
                break;
            case 1976325370:
                if (str6.equals("setImageFilePath")) {
                    c2 = 295;
                    break;
                }
                c2 = 65535;
                break;
            case 1984630281:
                if (str6.equals("setHint")) {
                    c2 = 297;
                    break;
                }
                c2 = 65535;
                break;
            case 1984984239:
                if (str6.equals("setText")) {
                    c2 = 'n';
                    break;
                }
                c2 = 65535;
                break;
            case 2017929665:
                if (str6.equals("calendarViewSetMinDate")) {
                    c2 = 185;
                    break;
                }
                c2 = 65535;
                break;
            case 2075310296:
                if (str6.equals("interstitialadLoadAd")) {
                    c2 = 259;
                    break;
                }
                c2 = 65535;
                break;
            case 2090179216:
                if (str6.equals("addListInt")) {
                    c2 = 17;
                    break;
                }
                c2 = 65535;
                break;
            case 2090182653:
                if (str6.equals("addListMap")) {
                    c2 = 27;
                    break;
                }
                c2 = 65535;
                break;
            case 2090189010:
                if (str6.equals("addListStr")) {
                    c2 = 22;
                    break;
                }
                c2 = 65535;
                break;
            case 2127377128:
                if (str6.equals("mediaplayerGetCurrent")) {
                    c2 = 230;
                    break;
                }
                c2 = 65535;
                break;
            case 2130649194:
                if (str6.equals("bluetoothConnectGetPairedDevices")) {
                    c2 = 321;
                    break;
                }
                c2 = 65535;
                break;
            case 2138225950:
                if (str6.equals("locationManagerRequestLocationUpdates")) {
                    c2 = 323;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        String str8 = "\"\"";
        String str9 = "0";
        String str10 = "";
        switch (c2) {
            case 0:
                if (blockBean.parameters.size() > 0) {
                    String str11 = "_" + blockBean.spec.substring(0, blockBean.spec.indexOf(" ")) + "(";
                    int i3 = 0;
                    boolean z = false;
                    boolean z2 = true;
                    while (i3 < arrayList.size()) {
                        if (!z2) {
                            str11 = str11 + ", ";
                        }
                        String str12 = (String) arrayList.get(i3);
                        if (str12.length() <= 0) {
                            Gx gx2 = blockBean.getParamClassInfo().get(i3);
                            if (gx2.b("boolean")) {
                                str11 = str11 + "true";
                            } else if (gx2.b("double")) {
                                str11 = str11 + str9;
                            } else if (gx2.b("String")) {
                                z = true;
                            }
                        } else {
                            str11 = str11 + str12;
                        }
                        i3++;
                        z2 = false;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str11);
                    sb2.append(")");
                    str10 = blockBean.type;
                    sb2.append(ReturnMoreblockManager.getMbEnd(str10));
                    sb = sb2.toString();
                    break;
                } else {
                    int indexOf = blockBean.spec.indexOf(" ");
                    if (indexOf < 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("_");
                        sb3.append(blockBean.spec);
                        sb3.append("()");
                        str10 = blockBean.type;
                        sb3.append(ReturnMoreblockManager.getMbEnd(str10));
                        sb = sb3.toString();
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("_");
                        sb4.append(blockBean.spec.substring(0, indexOf));
                        sb4.append("()");
                        str10 = blockBean.type;
                        sb4.append(ReturnMoreblockManager.getMbEnd(str10));
                        sb = sb4.toString();
                    }
                }
                str7 = sb;
                break;
            case 1:
                str7 = "_" + blockBean.spec;
                break;
            case 2:
                str7 = blockBean.spec;
                break;
            case 3:
                String str13 = (String) arrayList.get(0);
                String str14 = (String) arrayList.get(1);
                if (str14.length() <= 0) {
                    str14 = str7;
                }
                if (str13.length() > 0) {
                    str7 = String.format("%s = %s;", str13, str14);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 4:
                String str15 = (String) arrayList.get(0);
                String str16 = (String) arrayList.get(1);
                if (str16.length() > 0) {
                    str9 = str16;
                }
                if (str15.length() > 0) {
                    str7 = String.format("%s = %s;", str15, str9);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 5:
                String str17 = (String) arrayList.get(0);
                if (str17.length() > 0) {
                    str7 = String.format("%s++;", str17);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 6:
                String str18 = (String) arrayList.get(0);
                if (str18.length() > 0) {
                    str7 = String.format("%s--;", str18);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 7:
                String str19 = (String) arrayList.get(0);
                String str20 = (String) arrayList.get(1);
                if (str19.length() > 0) {
                    str7 = String.format("%s = %s;", str19, str20);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case '\b':
                String str21 = (String) arrayList.get(0);
                if (str21.length() > 0) {
                    str7 = String.format("%s = new HashMap<>();", str21);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case '\t':
                String str22 = (String) arrayList.get(0);
                String str23 = (String) arrayList.get(1);
                String str24 = (String) arrayList.get(2);
                if (str23.length() <= 0) {
                    str23 = str10;
                }
                if (str24.length() <= 0) {
                    str24 = str10;
                }
                if (str22.length() > 0) {
                    str7 = String.format("%s.put(%s, %s);", str22, str23, str24);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case '\n':
                String str25 = (String) arrayList.get(0);
                String str26 = (String) arrayList.get(1);
                if (str26.length() <= 0) {
                    str26 = str10;
                }
                if (str25.length() > 0) {
                    str7 = String.format("%s.get(%s).toString()", str25, str26);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 11:
                String str27 = (String) arrayList.get(0);
                String str28 = (String) arrayList.get(1);
                if (str28.length() <= 0) {
                    str28 = str10;
                }
                if (str27.length() > 0) {
                    str7 = String.format("%s.containsKey(%s)", str27, str28);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case '\f':
                String str29 = (String) arrayList.get(0);
                String str30 = (String) arrayList.get(1);
                if (str30.length() <= 0) {
                    str30 = str10;
                }
                if (str29.length() > 0) {
                    str7 = String.format("%s.remove(%s);", str29, str30);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case '\r':
                String str31 = (String) arrayList.get(0);
                if (str31.length() > 0) {
                    str7 = String.format("%s.size()", str31);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 14:
                String str32 = (String) arrayList.get(0);
                if (str32.length() > 0) {
                    str7 = String.format("%s.clear();", str32);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 15:
                String str33 = (String) arrayList.get(0);
                if (str33.length() > 0) {
                    str7 = String.format("%s.isEmpty()", str33);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 16:
                String str34 = (String) arrayList.get(0);
                String str35 = (String) arrayList.get(1);
                if (str34.length() > 0 && str35.length() > 0) {
                    str7 = String.format("SketchwareUtil.getAllKeysFromMap(%s, %s);", str34, str35);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 17:
                String str36 = (String) arrayList.get(0);
                String str37 = (String) arrayList.get(1);
                if (str36.length() > 0 && str37.length() > 0) {
                    str7 = String.format("%s.add(Double.valueOf(%s));", str37, str36);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 18:
                String str38 = (String) arrayList.get(0);
                String str39 = (String) arrayList.get(1);
                String str40 = (String) arrayList.get(2);
                if (str38.length() > 0 && str39.length() > 0 && str40.length() > 0) {
                    str7 = String.format("%s.add((int)(%s), Double.valueOf(%s));", str40, str39, str38);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 19:
                String str41 = (String) arrayList.get(0);
                String str42 = (String) arrayList.get(1);
                if (str41.length() > 0 && str42.length() > 0) {
                    str7 = String.format("%s.get((int)(%s)).doubleValue()", str42, str41);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 20:
                String str43 = (String) arrayList.get(0);
                String str44 = (String) arrayList.get(1);
                if (str43.length() > 0 && str44.length() > 0) {
                    str7 = String.format("%s.indexOf(%s)", str44, str43);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 21:
                String str45 = (String) arrayList.get(0);
                String str46 = (String) arrayList.get(1);
                if (str45.length() > 0 && str46.length() > 0) {
                    str7 = String.format("%s.contains(%s)", str45, str46);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 22:
                String str47 = (String) arrayList.get(0);
                String str48 = (String) arrayList.get(1);
                if (str47.length() > 0 && str48.length() > 0) {
                    str7 = String.format("%s.add(%s);", str48, str47);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 23:
                String str49 = (String) arrayList.get(0);
                String str50 = (String) arrayList.get(1);
                String str51 = (String) arrayList.get(2);
                if (str49.length() > 0 && str50.length() > 0 && str51.length() > 0) {
                    str7 = String.format("%s.add((int)(%s), %s);", str51, str50, str49);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 24:
                String str52 = (String) arrayList.get(0);
                String str53 = (String) arrayList.get(1);
                if (str52.length() > 0 && str53.length() > 0) {
                    str7 = String.format("%s.get((int)(%s))", str53, str52);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 25:
                String str54 = (String) arrayList.get(0);
                String str55 = (String) arrayList.get(1);
                if (str54.length() > 0 && str55.length() > 0) {
                    str7 = String.format("%s.indexOf(%s)", str55, str54);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 26:
                String str56 = (String) arrayList.get(0);
                String str57 = (String) arrayList.get(1);
                if (str56.length() > 0 && str57.length() > 0) {
                    str7 = String.format("%s.contains(%s)", str56, str57);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 27:
                String str58 = (String) arrayList.get(0);
                String str59 = (String) arrayList.get(1);
                String str60 = (String) arrayList.get(2);
                if (str58.length() <= 0) {
                    str58 = str10;
                }
                if (str59.length() <= 0) {
                    str59 = str10;
                }
                if (str60.length() > 0) {
                    str7 = "{\r\n" + String.format("HashMap<String, Object> _item = new HashMap<>();", new Object[0]) + "\r\n" + String.format("_item.put(%s, %s);", str58, str59) + "\r\n" + String.format("%s.add(_item);", str60) + "\r\n" + "}" + "\r\n";
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 28:
                String str61 = (String) arrayList.get(0);
                String str62 = (String) arrayList.get(1);
                String str63 = (String) arrayList.get(2);
                String str64 = (String) arrayList.get(3);
                if (str61.length() <= 0) {
                    str61 = str10;
                }
                if (str62.length() <= 0) {
                    str62 = str10;
                }
                if (str63.length() > 0) {
                    str9 = str63;
                }
                if (str64.length() > 0) {
                    str7 = "{\r\n" + String.format("HashMap<String, Object> _item = new HashMap<>();", new Object[0]) + "\r\n" + String.format("_item.put(%s, %s);", str61, str62) + "\r\n" + String.format("%s.add((int)%s, _item);", str64, str9) + "\r\n" + "}" + "\r\n";
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 29:
                String str65 = (String) arrayList.get(0);
                String str66 = (String) arrayList.get(1);
                String str67 = (String) arrayList.get(2);
                if (str65.length() > 0) {
                    str9 = str65;
                }
                if (str66.length() <= 0) {
                    str66 = str10;
                }
                if (str67.length() > 0) {
                    str7 = String.format("%s.get((int)%s).get(%s).toString()", str67, str9, str66);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 30:
                String str68 = (String) arrayList.get(0);
                String str69 = (String) arrayList.get(1);
                String str70 = (String) arrayList.get(2);
                String str71 = (String) arrayList.get(3);
                if (str68.length() <= 0) {
                    str68 = str10;
                }
                if (str69.length() <= 0) {
                    str69 = str10;
                }
                if (str70.length() > 0) {
                    str9 = str70;
                }
                if (str71.length() > 0) {
                    str7 = String.format("%s.get((int)%s).put(%s, %s);", str71, str9, str68, str69);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 31:
                String str72 = (String) arrayList.get(0);
                String str73 = (String) arrayList.get(1);
                String str74 = (String) arrayList.get(2);
                if (str73.length() > 0) {
                    str9 = str73;
                }
                if (str74.length() <= 0) {
                    str74 = str10;
                }
                if (str72.length() > 0) {
                    str7 = String.format("%s.get((int)%s).containsKey(%s)", str72, str9, str74);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case ' ':
                String str75 = (String) arrayList.get(0);
                String str76 = (String) arrayList.get(1);
                if (str75.length() > 0 && str76.length() > 0) {
                    str7 = String.format("%s.add(%s);", str76, str75);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case '!':
                String str77 = (String) arrayList.get(0);
                String str78 = (String) arrayList.get(1);
                String str79 = (String) arrayList.get(2);
                if (str78.length() > 0) {
                    str9 = str78;
                }
                if (str77.length() > 0 && str79.length() > 0) {
                    str7 = String.format("%s.add((int)%s, %s);", str79, str9, str77);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case '\"':
                String str80 = (String) arrayList.get(0);
                String str81 = (String) arrayList.get(1);
                String str82 = (String) arrayList.get(2);
                if (str80.length() > 0) {
                    str9 = str80;
                }
                if (str81.length() > 0 && str82.length() > 0) {
                    str7 = String.format("%s = %s.get((int)%s);", str82, str81, str9);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case '#':
                String str83 = (String) arrayList.get(0);
                String str84 = (String) arrayList.get(1);
                if (str83.length() > 0 && str84.length() > 0) {
                    str7 = String.format("%s.remove((int)(%s));", str84, str83);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case '$':
                String str85 = (String) arrayList.get(0);
                if (str85.length() > 0) {
                    str7 = String.format("%s.size()", str85);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case '%':
                String str86 = (String) arrayList.get(0);
                if (str86.length() > 0) {
                    str7 = String.format("%s.clear();", str86);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case '&':
                int i4 = blockBean.subStack1;
                str7 = String.format("while(true) {\r\n%s\r\n}", i4 >= 0 ? a(String.valueOf(i4), str10) : str10);
                break;
            case '\'':
                String str87 = (String) arrayList.get(0);
                int i5 = blockBean.subStack1;
                String a2 = i5 >= 0 ? a(String.valueOf(i5), str10) : str10;
                if (str87.length() > 0) {
                    str9 = str87;
                }
                String str88 = "_repeat" + blockBean.id;
                str7 = String.format("for(int %s = 0; %s < (int)(%s); %s++) {\r\n%s\r\n}", str88, str88, str9, str88, a2);
                break;
            case '(':
                String str89 = (String) arrayList.get(0);
                int i6 = blockBean.subStack1;
                String a3 = i6 >= 0 ? a(String.valueOf(i6), str10) : str10;
                if (str89.length() <= 0) {
                    str89 = "true";
                }
                str7 = String.format("if (%s) {\r\n%s\r\n}", str89, a3);
                break;
            case ')':
                String str90 = (String) arrayList.get(0);
                int i7 = blockBean.subStack1;
                String a4 = i7 >= 0 ? a(String.valueOf(i7), str10) : str10;
                int i8 = blockBean.subStack2;
                String a5 = i8 >= 0 ? a(String.valueOf(i8), str10) : str10;
                if (str90.length() <= 0) {
                    str90 = "true";
                }
                str7 = String.format("if (%s) {\r\n%s\r\n}\r\nelse {\r\n%s\r\n}", str90, a4, a5);
                break;
            case '*':
                str7 = "break;";
                break;
            case '+':
            case ',':
                str7 = blockBean.opCode;
                break;
            case '-':
                String str91 = (String) arrayList.get(0);
                if (str91.length() > 0) {
                    str7 = String.format("!%s", str91);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case '.':
            case '/':
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
                String str92 = (String) arrayList.get(0);
                String str93 = (String) arrayList.get(1);
                if (str92.length() <= 0) {
                    str92 = str9;
                }
                if (str93.length() > 0) {
                    str9 = str93;
                }
                str7 = String.format("%s %s %s", str92, blockBean.opCode, str9);
                break;
            case '5':
                String str94 = (String) arrayList.get(0);
                String str95 = (String) arrayList.get(1);
                if (str94.length() <= 0) {
                    str94 = str9;
                }
                if (str95.length() > 0) {
                    str9 = str95;
                }
                str7 = String.format("%s == %s", str94, str9);
                break;
            case '6':
            case '7':
                String str96 = (String) arrayList.get(0);
                String str97 = (String) arrayList.get(1);
                if (str96.length() <= 0) {
                    str96 = "true";
                }
                if (str97.length() <= 0) {
                    str97 = "true";
                }
                str7 = String.format("%s %s %s", str96, blockBean.opCode, str97);
                break;
            case '8':
                String str98 = (String) arrayList.get(0);
                String str99 = (String) arrayList.get(1);
                if (str98.length() <= 0) {
                    str98 = str9;
                }
                if (str99.length() > 0) {
                    str9 = str99;
                }
                str7 = String.format("SketchwareUtil.getRandom((int)(%s), (int)(%s))", str98, str9);
                break;
            case '9':
                String str100 = (String) arrayList.get(0);
                if (str100.length() > 0) {
                    str7 = String.format("%s.length()", str100);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case ':':
                str7 = String.format("%s.concat(%s)", (String) arrayList.get(0), (String) arrayList.get(1));
                break;
            case ';':
                str7 = String.format("%s.indexOf(%s)", (String) arrayList.get(1), (String) arrayList.get(0));
                break;
            case '<':
                str7 = String.format("%s.lastIndexOf(%s)", (String) arrayList.get(1), (String) arrayList.get(0));
                break;
            case '=':
                String str101 = (String) arrayList.get(0);
                String str102 = (String) arrayList.get(1);
                String str103 = (String) arrayList.get(2);
                if (str102.length() <= 0) {
                    str102 = str9;
                }
                if (str103.length() > 0) {
                    str9 = str103;
                }
                str7 = String.format("%s.substring((int)(%s), (int)(%s))", str101, str102, str9);
                break;
            case '>':
                str7 = String.format("%s.equals(%s)", (String) arrayList.get(0), (String) arrayList.get(1));
                break;
            case '?':
                str7 = String.format("%s.contains(%s)", (String) arrayList.get(0), (String) arrayList.get(1));
                break;
            case '@':
                str7 = String.format("%s.replace(%s, %s)", (String) arrayList.get(0), (String) arrayList.get(1), (String) arrayList.get(2));
                break;
            case 'A':
                str7 = String.format("%s.replaceFirst(%s, %s)", (String) arrayList.get(0), (String) arrayList.get(1), (String) arrayList.get(2));
                break;
            case 'B':
                str7 = String.format("%s.replaceAll(%s, %s)", (String) arrayList.get(0), (String) arrayList.get(1), (String) arrayList.get(2));
                break;
            case 'C':
                String str104 = (String) arrayList.get(0);
                if (str104.length() <= 0 || str104.equals(str8)) {
                    str104 = "\"0\"";
                }
                str7 = String.format("Double.parseDouble(%s)", str104);
                break;
            case 'D':
                str7 = "System.currentTimeMillis()";
                break;
            case 'E':
                str7 = String.format("%s.trim()", (String) arrayList.get(0));
                break;
            case 'F':
                str7 = String.format("%s.toUpperCase()", (String) arrayList.get(0));
                break;
            case 'G':
                str7 = String.format("%s.toLowerCase()", (String) arrayList.get(0));
                break;
            case 'H':
                String str105 = (String) arrayList.get(0);
                if (str105.length() > 0) {
                    str9 = str105;
                }
                str7 = String.format("String.valueOf((long)(%s))", str9);
                break;
            case 'I':
                String str106 = (String) arrayList.get(0);
                if (str106.length() > 0) {
                    str9 = str106;
                }
                str7 = String.format("String.valueOf(%s)", str9);
                break;
            case 'J':
                String str107 = (String) arrayList.get(0);
                String str108 = (String) arrayList.get(1);
                if (str108.length() <= 0) {
                    str108 = str10;
                }
                if (str107.length() > 0) {
                    str9 = str107;
                }
                str7 = String.format("new DecimalFormat(%s).format(%s)", str108, str9);
                break;
            case 'K':
                str7 = blockBean.parameters.get(0);
                if (str7 != null) {
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 'L':
                String str109 = (String) arrayList.get(0);
                String str110 = (String) arrayList.get(1);
                if (str109.length() > 0 && str110.length() > 0) {
                    str7 = String.format("%s = new Gson().fromJson(%s, new TypeToken<HashMap<String, Object>>(){}.getType());", str110, str109);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 'M':
                String str111 = (String) arrayList.get(0);
                if (str111.length() > 0) {
                    str7 = String.format("new Gson().toJson(%s)", str111);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 'N':
                String str112 = (String) arrayList.get(0);
                String str113 = (String) arrayList.get(1);
                if (str112.length() > 0 && str113.length() > 0) {
                    str7 = String.format("%s = new Gson().fromJson(%s, new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());", str113, str112);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 'O':
                String str114 = (String) arrayList.get(0);
                if (str114.length() > 0) {
                    str7 = String.format("new Gson().toJson(%s)", str114);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 'P':
                String str115 = (String) arrayList.get(0);
                if (str115.length() > 0) {
                    str9 = str115;
                }
                str7 = String.format("SketchwareUtil.getDip(getApplicationContext(), (int)(%s))", str9);
                break;
            case 'Q':
                str7 = "SketchwareUtil.getDisplayWidthPixels(getApplicationContext())";
                break;
            case 'R':
                str7 = "SketchwareUtil.getDisplayHeightPixels(getApplicationContext())";
                break;
            case 'S':
                str7 = "Math.PI";
                break;
            case 'T':
                str7 = "Math.E";
                break;
            case 'U':
                String str116 = (String) arrayList.get(0);
                String str117 = (String) arrayList.get(1);
                if (str117.length() <= 0) {
                    str117 = str9;
                }
                if (str116.length() > 0) {
                    str9 = str116;
                }
                str7 = String.format("Math.pow(%s, %s)", str9, str117);
                break;
            case 'V':
                String str118 = (String) arrayList.get(0);
                String str119 = (String) arrayList.get(1);
                if (str119.length() <= 0) {
                    str119 = str9;
                }
                if (str118.length() > 0) {
                    str9 = str118;
                }
                str7 = String.format("Math.min(%s, %s)", str9, str119);
                break;
            case 'W':
                String str120 = (String) arrayList.get(0);
                String str121 = (String) arrayList.get(1);
                if (str121.length() <= 0) {
                    str121 = str9;
                }
                if (str120.length() > 0) {
                    str9 = str120;
                }
                str7 = String.format("Math.max(%s, %s)", str9, str121);
                break;
            case 'X':
                String str122 = (String) arrayList.get(0);
                if (str122.length() <= 0) {
                    str122 = "1";
                }
                str7 = String.format("Math.sqrt(%s)", str122);
                break;
            case 'Y':
                String str123 = (String) arrayList.get(0);
                if (str123.length() > 0) {
                    str9 = str123;
                }
                str7 = String.format("Math.abs(%s)", str9);
                break;
            case 'Z':
                String str124 = (String) arrayList.get(0);
                if (str124.length() > 0) {
                    str9 = str124;
                }
                str7 = String.format("Math.round(%s)", str9);
                break;
            case '[':
                String str125 = (String) arrayList.get(0);
                if (str125.length() > 0) {
                    str9 = str125;
                }
                str7 = String.format("Math.ceil(%s)", str9);
                break;
            case '\\':
                String str126 = (String) arrayList.get(0);
                if (str126.length() > 0) {
                    str9 = str126;
                }
                str7 = String.format("Math.floor(%s)", str9);
                break;
            case ']':
                String str127 = (String) arrayList.get(0);
                if (str127.length() > 0) {
                    str9 = str127;
                }
                str7 = String.format("Math.sin(%s)", str9);
                break;
            case '^':
                String str128 = (String) arrayList.get(0);
                if (str128.length() > 0) {
                    str9 = str128;
                }
                str7 = String.format("Math.cos(%s)", str9);
                break;
            case '_':
                String str129 = (String) arrayList.get(0);
                if (str129.length() > 0) {
                    str9 = str129;
                }
                str7 = String.format("Math.tan(%s)", str9);
                break;
            case '`':
                String str130 = (String) arrayList.get(0);
                if (str130.length() > 0) {
                    str9 = str130;
                }
                str7 = String.format("Math.asin(%s)", str9);
                break;
            case 'a':
                String str131 = (String) arrayList.get(0);
                if (str131.length() > 0) {
                    str9 = str131;
                }
                str7 = String.format("Math.acos(%s)", str9);
                break;
            case 'b':
                String str132 = (String) arrayList.get(0);
                if (str132.length() > 0) {
                    str9 = str132;
                }
                str7 = String.format("Math.atan(%s)", str9);
                break;
            case 'c':
                String str133 = (String) arrayList.get(0);
                if (str133.length() > 0) {
                    str9 = str133;
                }
                str7 = String.format("Math.exp(%s)", str9);
                break;
            case 'd':
                String str134 = (String) arrayList.get(0);
                if (str134.length() > 0) {
                    str9 = str134;
                }
                str7 = String.format("Math.log(%s)", str9);
                break;
            case 'e':
                String str135 = (String) arrayList.get(0);
                if (str135.length() > 0) {
                    str9 = str135;
                }
                str7 = String.format("Math.log10(%s)", str9);
                break;
            case 'f':
                String str136 = (String) arrayList.get(0);
                if (str136.length() > 0) {
                    str9 = str136;
                }
                str7 = String.format("Math.toRadians(%s)", str9);
                break;
            case 'g':
                String str137 = (String) arrayList.get(0);
                if (str137.length() > 0) {
                    str9 = str137;
                }
                str7 = String.format("Math.toDegrees(%s)", str9);
                break;
            case 'h':
                String str138 = (String) arrayList.get(0);
                int i9 = blockBean.subStack1;
                String a6 = i9 >= 0 ? a(String.valueOf(i9), str10) : str10;
                if (str138.length() > 0) {
                    str7 = String.format("%s.setOnClickListener(new View.OnClickListener() {\n@Override\npublic void onClick(View _view) {\n%s\n}\n});", str138, a6);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 'i':
                if (this.e.a(this.c).a) {
                    str7 = "_drawer.isDrawerOpen(GravityCompat.START)";
                    break;
                }
                break;
            case 'j':
                if (this.e.a(this.c).a) {
                    str7 = "_drawer.openDrawer(GravityCompat.START);";
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 'k':
                if (this.e.a(this.c).a) {
                    str7 = "_drawer.closeDrawer(GravityCompat.START);";
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 'l':
                String str139 = (String) arrayList.get(0);
                String str140 = (String) arrayList.get(1);
                if (str140.length() <= 0) {
                    str140 = "true";
                }
                if (str139.length() > 0) {
                    str7 = String.format("%s.setEnabled(%s);", str139, str140);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 'm':
                String str141 = (String) arrayList.get(0);
                if (str141.length() > 0) {
                    str7 = String.format("%s.isEnabled()", str141);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 'n':
                String str142 = (String) arrayList.get(0);
                String str143 = (String) arrayList.get(1);
                if (str142.length() > 0) {
                    str7 = String.format("%s.setText(%s);", str142, str143);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 'o':
                String str144 = (String) arrayList.get(0);
                String str145 = (String) arrayList.get(1);
                String str146 = (String) arrayList.get(2);
                if (str146.length() > 0) {
                    Pair<Integer, String>[] a7 = sq.a("property_text_style");
                    str9 = str146;
                    for (Pair<Integer, String> pair : a7) {
                        if (pair.second.equals(str9)) {
                            str9 = pair.first + str10;
                        }
                    }
                }
                if (str145.length() > 0 && str144.length() > 0) {
                    str7 = String.format("%s.setTypeface(Typeface.createFromAsset(getAssets(),\"fonts/%s.ttf\"), %s);", str144, str145, str9);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 'p':
                String str147 = (String) arrayList.get(0);
                if (str147.length() > 0) {
                    str7 = String.format("%s.getText().toString()", str147);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 'q':
                String str148 = (String) arrayList.get(0);
                String str149 = (String) arrayList.get(1);
                if (str149.length() <= 0) {
                    str149 = "0xFF000000";
                }
                if (str148.length() > 0 && str149.length() > 0) {
                    str7 = String.format("%s.setBackgroundColor(%s);", str148, str149);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 'r':
                String str150 = (String) arrayList.get(0);
                String str151 = (String) arrayList.get(1);
                if (str150.length() > 0 && str151.length() > 0) {
                    if (!str151.equals("NONE")) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("R.drawable.");
                        if (str151.endsWith(".9")) {
                            str151 = str151.replaceAll("\\.9", str10);
                        }
                        sb5.append(str151);
                        str9 = sb5.toString();
                    }
                    str7 = String.format("%s.setBackgroundResource(%s);", str150, str9);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 's':
                String str152 = (String) arrayList.get(0);
                String str153 = (String) arrayList.get(1);
                if (str153.length() <= 0) {
                    str153 = "0xFF000000";
                }
                if (str152.length() > 0) {
                    str7 = String.format("%s.setTextColor(%s);", str152, str153);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 't':
                String str154 = (String) arrayList.get(0);
                String str155 = (String) arrayList.get(1);
                if (str155.endsWith(".9")) {
                    str155 = str155.replaceAll("\\.9", str10);
                }
                if (str154.length() > 0 && str155.length() > 0) {
                    str7 = String.format("%s.setImageResource(R.drawable.%s);", str154, str155.toLowerCase());
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 'u':
                String str156 = (String) arrayList.get(0);
                String str157 = (String) arrayList.get(1);
                if (str157.length() <= 0) {
                    str157 = "0x00000000";
                }
                if (!str156.equals(str8)) {
                    str7 = String.format("%s.setColorFilter(%s, PorterDuff.Mode.MULTIPLY);", str156, str157);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 'v':
                String str158 = (String) arrayList.get(0);
                str158.equals(str8);
                str7 = String.format("%s.requestFocus();", str158);
                break;
            case 'w':
                str7 = String.format("SketchwareUtil.showMessage(getApplicationContext(), %s);", (String) arrayList.get(0));
                break;
            case 'x':
                str7 = String.format("((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText(\"clipboard\", %s));", (String) arrayList.get(0));
                break;
            case 'y':
                str7 = String.format("setTitle(%s);", (String) arrayList.get(0));
                break;
            case 'z':
                String str159 = (String) arrayList.get(0);
                String str160 = (String) arrayList.get(1);
                if (str160.length() > 0 && !str160.equals(str8)) {
                    str8 = "Intent." + str160;
                }
                if (str159.length() > 0) {
                    str7 = String.format("%s.setAction(%s);", str159, str8);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case '{':
                String str161 = (String) arrayList.get(0);
                String str162 = (String) arrayList.get(1);
                if (str161.length() > 0) {
                    str7 = String.format("%s.setData(Uri.parse(%s));", str161, str162);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case '|':
                String str163 = (String) arrayList.get(0);
                String str164 = (String) arrayList.get(1);
                if (str164.length() > 0 && str163.length() > 0) {
                    str7 = String.format("%s.setClass(getApplicationContext(), %s.class);", str163, str164);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case '}':
                String str165 = (String) arrayList.get(0);
                String str166 = (String) arrayList.get(1);
                String str167 = (String) arrayList.get(2);
                if (str165.length() > 0) {
                    str7 = String.format("%s.putExtra(%s, %s);", str165, str166, str167);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case '~':
                String str168 = (String) arrayList.get(0);
                String str169 = (String) arrayList.get(1);
                String str170 = str169.length() <= 0 ? str10 : "Intent.FLAG_ACTIVITY_" + str169;
                if (str168.length() > 0 && str170.length() > 0) {
                    str7 = String.format("%s.setFlags(%s);", str168, str170);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 127:
                str7 = String.format("getIntent().getStringExtra(%s)", (String) arrayList.get(0));
                break;
            case 128:
                String str171 = (String) arrayList.get(0);
                if (str171.length() > 0) {
                    str7 = String.format("startActivity(%s);", str171);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 129:
                str7 = "finish();";
                break;
            case 130:
                String str172 = (String) arrayList.get(0);
                String str173 = (String) arrayList.get(1);
                if (str172.length() > 0 && str173.length() > 0) {
                    str7 = String.format("%s = getApplicationContext().getSharedPreferences(%s, Activity.MODE_PRIVATE);", str172, str173);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 131:
                String str174 = (String) arrayList.get(0);
                String str175 = (String) arrayList.get(1);
                if (str174.length() > 0) {
                    str7 = String.format("%s.getString(%s, \"\")", str174, str175);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 132:
                String str176 = (String) arrayList.get(0);
                String str177 = (String) arrayList.get(1);
                String str178 = (String) arrayList.get(2);
                if (str176.length() > 0) {
                    str7 = String.format("%s.edit().putString(%s, %s).commit();", str176, str177, str178);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 133:
                String str179 = (String) arrayList.get(0);
                String str180 = (String) arrayList.get(1);
                if (str179.length() > 0) {
                    str7 = String.format("%s.edit().remove(%s).commit();", str179, str180);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 134:
                String str181 = (String) arrayList.get(0);
                if (str181.length() > 0) {
                    str7 = String.format("%s = Calendar.getInstance();", str181);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 135:
                String str182 = (String) arrayList.get(0);
                String str183 = (String) arrayList.get(1);
                String str184 = (String) arrayList.get(2);
                if (str184.length() > 0) {
                    str9 = str184;
                }
                if (str182.length() > 0 && str183.length() > 0) {
                    str7 = String.format("%s.add(Calendar.%s, (int)(%s));", str182, str183, str9);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 136:
                String str185 = (String) arrayList.get(0);
                String str186 = (String) arrayList.get(1);
                String str187 = (String) arrayList.get(2);
                if (str187.length() > 0) {
                    str9 = str187;
                }
                if (str185.length() > 0 && str186.length() > 0) {
                    str7 = String.format("%s.set(Calendar.%s, (int)(%s));", str185, str186, str9);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 137:
                String str188 = (String) arrayList.get(0);
                String str189 = (String) arrayList.get(1);
                if (str189.length() <= 0 || str189.equals(str8)) {
                    str189 = "\"yyyy/MM/dd hh:mm:ss\"";
                }
                if (str188.length() > 0) {
                    str7 = String.format("new SimpleDateFormat(%s).format(%s.getTime())", str189, str188);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 138:
                String str190 = (String) arrayList.get(0);
                String str191 = (String) arrayList.get(1);
                if (str190.length() > 0 && str191.length() > 0) {
                    str7 = String.format("(long)(%s.getTimeInMillis() - %s.getTimeInMillis())", str190, str191);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 139:
                String str192 = (String) arrayList.get(0);
                if (str192.length() > 0) {
                    str7 = String.format("%s.getTimeInMillis()", str192);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 140:
                String str193 = (String) arrayList.get(0);
                String str194 = (String) arrayList.get(1);
                if (str193.length() > 0 && str194.length() > 0) {
                    str7 = String.format("%s.setTimeInMillis((long)(%s));", str193, str194);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 141:
                String str195 = (String) arrayList.get(0);
                String str196 = (String) arrayList.get(1);
                if (str196.length() <= 0) {
                    str196 = "VISIBLE";
                }
                if (str195.length() > 0) {
                    str7 = String.format("%s.setVisibility(View.%s);", str195, str196);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 142:
                String str197 = (String) arrayList.get(0);
                String str198 = (String) arrayList.get(1);
                if (str198.length() <= 0) {
                    str198 = "true";
                }
                if (str197.length() > 0) {
                    str7 = String.format("%s.setClickable(%s);", str197, str198);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 143:
                String str199 = (String) arrayList.get(0);
                String str200 = (String) arrayList.get(1);
                if (str200.length() > 0) {
                    str9 = str200;
                }
                if (str199.length() > 0) {
                    str7 = String.format("%s.setRotation((float)(%s));", str199, str9);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 144:
                String str201 = (String) arrayList.get(0);
                if (str201.length() > 0) {
                    str7 = String.format("%s.getRotation()", str201);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 145:
                String str202 = (String) arrayList.get(0);
                String str203 = (String) arrayList.get(1);
                if (str203.length() > 0) {
                    str9 = str203;
                }
                if (str202.length() > 0) {
                    str7 = String.format("%s.setAlpha((float)(%s));", str202, str9);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 146:
                String str204 = (String) arrayList.get(0);
                if (str204.length() > 0) {
                    str7 = String.format("%s.getAlpha()", str204);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 147:
                String str205 = (String) arrayList.get(0);
                String str206 = (String) arrayList.get(1);
                if (str206.length() > 0) {
                    str9 = str206;
                }
                if (str205.length() > 0) {
                    str7 = String.format("%s.setTranslationX((float)(%s));", str205, str9);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 148:
                String str207 = (String) arrayList.get(0);
                if (str207.length() > 0) {
                    str7 = String.format("%s.getTranslationX()", str207);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 149:
                String str208 = (String) arrayList.get(0);
                String str209 = (String) arrayList.get(1);
                if (str209.length() > 0) {
                    str9 = str209;
                }
                if (str208.length() > 0) {
                    str7 = String.format("%s.setTranslationY((float)(%s));", str208, str9);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 150:
                String str210 = (String) arrayList.get(0);
                if (str210.length() > 0) {
                    str7 = String.format("%s.getTranslationY()", str210);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 151:
                String str211 = (String) arrayList.get(0);
                String str212 = (String) arrayList.get(1);
                if (str212.length() > 0) {
                    str9 = str212;
                }
                if (str211.length() > 0) {
                    str7 = String.format("%s.setScaleX((float)(%s));", str211, str9);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 152:
                String str213 = (String) arrayList.get(0);
                if (str213.length() > 0) {
                    str7 = String.format("%s.getScaleX()", str213);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 153:
                String str214 = (String) arrayList.get(0);
                String str215 = (String) arrayList.get(1);
                if (str215.length() > 0) {
                    str9 = str215;
                }
                if (str214.length() > 0) {
                    str7 = String.format("%s.setScaleY((float)(%s));", str214, str9);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 154:
                String str216 = (String) arrayList.get(0);
                if (str216.length() > 0) {
                    str7 = String.format("%s.getScaleY()", str216);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 155:
                String str217 = (String) arrayList.get(0);
                if (str217.length() > 0) {
                    str7 = String.format("SketchwareUtil.getLocationX(%s)", str217);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 156:
                String str218 = (String) arrayList.get(0);
                if (str218.length() > 0) {
                    str7 = String.format("SketchwareUtil.getLocationY(%s)", str218);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 157:
                String str219 = (String) arrayList.get(0);
                String str220 = (String) arrayList.get(1);
                if (str220.length() <= 0) {
                    str220 = str7;
                }
                if (str219.length() > 0) {
                    str7 = String.format("%s.setChecked(%s);", str219, str220);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 158:
                String str221 = (String) arrayList.get(0);
                if (str221.length() > 0) {
                    str7 = String.format("%s.isChecked()", str221);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 159:
                String str222 = (String) arrayList.get(0);
                String str223 = (String) arrayList.get(1);
                if (str222.length() > 0 && str223.length() > 0) {
                    str7 = String.format("%s.setAdapter(new ArrayAdapter<String>(getBaseContext(), %s, %s));", str222, "android.R.layout.simple_list_item_1", str223);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 160:
            case 325:
            case 326:
            case 327:
            case 328:
                String str224 = (String) arrayList.get(0);
                String str225 = (String) arrayList.get(1);
                if (str224.length() > 0 && str225.length() > 0) {
                    str7 = String.format("%s.setAdapter(new " + Lx.a(str224) + "(%s));", str224, str225);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 161:
                String str226 = (String) arrayList.get(0);
                if (str226.length() > 0) {
                    str7 = String.format("((BaseAdapter)%s.getAdapter()).notifyDataSetChanged();", str226);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 162:
                String str227 = (String) arrayList.get(0);
                String str228 = (String) arrayList.get(1);
                String str229 = (String) arrayList.get(2);
                if (str228.length() > 0) {
                    str9 = str228;
                }
                if (str229.length() <= 0) {
                    str229 = str7;
                }
                if (str227.length() > 0) {
                    str7 = String.format("%s.setItemChecked((int)(%s), %s);", str227, str9, str229);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 163:
                String str230 = (String) arrayList.get(0);
                if (str230.length() > 0) {
                    str7 = String.format("%s.getCheckedItemPosition()", str230);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 164:
                String str231 = (String) arrayList.get(0);
                String str232 = (String) arrayList.get(1);
                if (str231.length() > 0 && str232.length() > 0) {
                    str7 = String.format("%s = SketchwareUtil.getCheckedItemPositionsToArray(%s);", str232, str231);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 165:
                String str233 = (String) arrayList.get(0);
                if (str233.length() > 0) {
                    str7 = String.format("%s.getCheckedItemCount()", str233);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 166:
                String str234 = (String) arrayList.get(0);
                String str235 = (String) arrayList.get(1);
                str234.length();
                if (str235.length() > 0) {
                    str7 = String.format("%s.smoothScrollToPosition((int)(%s));", str234, str235);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 167:
                String str236 = (String) arrayList.get(0);
                String str237 = (String) arrayList.get(1);
                if (str236.length() > 0 && str237.length() > 0) {
                    str7 = String.format("%s.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, %s));", str236, str237);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 168:
                String str238 = (String) arrayList.get(0);
                if (str238.length() > 0) {
                    str7 = String.format("((ArrayAdapter)%s.getAdapter()).notifyDataSetChanged();", str238);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 169:
                String str239 = (String) arrayList.get(0);
                String str240 = (String) arrayList.get(1);
                if (str240.length() > 0) {
                    str9 = str240;
                }
                if (str239.length() > 0) {
                    str7 = String.format("%s.setSelection((int)(%s));", str239, str9);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 170:
                String str241 = (String) arrayList.get(0);
                if (str241.length() > 0) {
                    str7 = String.format("%s.getSelectedItemPosition()", str241);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 171:
                String str242 = (String) arrayList.get(0);
                String str243 = (String) arrayList.get(1);
                if (str242.length() > 0 && str243.length() > 0) {
                    str7 = String.format("%s.loadUrl(%s);", str242, str243);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 172:
                String str244 = (String) arrayList.get(0);
                if (str244.length() > 0) {
                    str7 = String.format("%s.getUrl()", str244);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 173:
                String str245 = (String) arrayList.get(0);
                String str246 = (String) arrayList.get(1);
                if (str246.length() <= 0) {
                    str246 = "LOAD_DEFAULT";
                }
                if (str245.length() > 0) {
                    str7 = String.format("%s.getSettings().setCacheMode(WebSettings.%s);", str245, str246);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 174:
                String str247 = (String) arrayList.get(0);
                if (str247.length() > 0) {
                    str7 = String.format("%s.canGoBack()", str247);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 175:
                String str248 = (String) arrayList.get(0);
                if (str248.length() > 0) {
                    str7 = String.format("%s.canGoForward()", str248);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 176:
                String str249 = (String) arrayList.get(0);
                if (str249.length() > 0) {
                    str7 = String.format("%s.goBack();", str249);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 177:
                String str250 = (String) arrayList.get(0);
                if (str250.length() > 0) {
                    str7 = String.format("%s.goForward();", str250);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 178:
                String str251 = (String) arrayList.get(0);
                if (str251.length() > 0) {
                    str7 = String.format("%s.clearCache(true);", str251);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 179:
                String str252 = (String) arrayList.get(0);
                if (str252.length() > 0) {
                    str7 = String.format("%s.clearHistory();", str252);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 180:
                String str253 = (String) arrayList.get(0);
                if (str253.length() > 0) {
                    str7 = String.format("%s.stopLoading();", str253);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 181:
                String str254 = (String) arrayList.get(0);
                if (str254.length() > 0) {
                    str7 = String.format("%s.zoomIn();", str254);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 182:
                String str255 = (String) arrayList.get(0);
                if (str255.length() > 0) {
                    str7 = String.format("%s.zoomOut();", str255);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 183:
                String str256 = (String) arrayList.get(0);
                if (str256.length() > 0) {
                    str7 = String.format("%s.getDate()", str256);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 184:
                String str257 = (String) arrayList.get(0);
                String str258 = (String) arrayList.get(1);
                if (str257.length() > 0 && str258.length() > 0) {
                    str7 = String.format("%s.setDate((long)(%s), true, true);", str257, str258);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 185:
                String str259 = (String) arrayList.get(0);
                String str260 = (String) arrayList.get(1);
                if (str259.length() > 0 && str260.length() > 0) {
                    str7 = String.format("%s.setMinDate((long)(%s));", str259, str260);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 186:
                String str261 = (String) arrayList.get(0);
                String str262 = (String) arrayList.get(1);
                if (str261.length() > 0 && str262.length() > 0) {
                    str7 = String.format("%s.setMaxDate((long)(%s));", str261, str262);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 187:
                String str263 = (String) arrayList.get(0);
                if (this.e.t.size() > 0) {
                    Iterator<String> it = this.e.t.iterator();
                    str2 = str10;
                    while (it.hasNext()) {
                        str2 = str2 + ".addTestDevice(\"" + it.next() + "\")\n";
                    }
                } else {
                    str2 = str10;
                }
                if (str263.length() > 0) {
                    str7 = String.format("%s.loadAd(new AdRequest.Builder()%s.build());", str263, str2);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 188:
                String str264 = (String) arrayList.get(0);
                String str265 = (String) arrayList.get(1);
                if (str265.length() <= 0) {
                    str265 = uq.q[0];
                }
                if (str264.length() > 0) {
                    str7 = String.format("_%s_controller.setMapType(GoogleMap.%s);", str264, str265);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 189:
                String str266 = (String) arrayList.get(0);
                String str267 = (String) arrayList.get(1);
                if (str267.length() <= 0) {
                    str267 = str9;
                }
                String str268 = (String) arrayList.get(2);
                if (str268.length() > 0) {
                    str9 = str268;
                }
                if (str266.length() > 0) {
                    str7 = String.format("_%s_controller.moveCamera(%s, %s);", str266, str267, str9);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 190:
                String str269 = (String) arrayList.get(0);
                String str270 = (String) arrayList.get(1);
                if (str270.length() > 0) {
                    str9 = str270;
                }
                if (str269.length() > 0) {
                    str7 = String.format("_%s_controller.zoomTo(%s);", str269, str9);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 191:
                String str271 = (String) arrayList.get(0);
                if (str271.length() > 0) {
                    str7 = String.format("_%s_controller.zoomIn();", str271);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 192:
                String str272 = (String) arrayList.get(0);
                if (str272.length() > 0) {
                    str7 = String.format("_%s_controller.zoomOut();", str272);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 193:
                String str273 = (String) arrayList.get(0);
                String str274 = (String) arrayList.get(1);
                String str275 = (String) arrayList.get(2);
                if (str275.length() <= 0) {
                    str275 = str9;
                }
                String str276 = (String) arrayList.get(3);
                if (str276.length() > 0) {
                    str9 = str276;
                }
                if (str273.length() > 0 && str274.length() > 0) {
                    str7 = String.format("_%s_controller.addMarker(%s, %s, %s);", str273, str274, str275, str9);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 194:
                String str277 = (String) arrayList.get(0);
                String str278 = (String) arrayList.get(1);
                String str279 = (String) arrayList.get(2);
                String str280 = (String) arrayList.get(3);
                if (str277.length() > 0 && str278.length() > 0) {
                    str7 = String.format("_%s_controller.setMarkerInfo(%s, %s, %s);", str277, str278, str279, str280);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 195:
                String str281 = (String) arrayList.get(0);
                String str282 = (String) arrayList.get(1);
                String str283 = (String) arrayList.get(2);
                if (str283.length() <= 0) {
                    str283 = str9;
                }
                String str284 = (String) arrayList.get(3);
                if (str284.length() > 0) {
                    str9 = str284;
                }
                if (str281.length() > 0 && str282.length() > 0) {
                    str7 = String.format("_%s_controller.setMarkerPosition(%s, %s, %s);", str281, str282, str283, str9);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 196:
                String str285 = (String) arrayList.get(0);
                String str286 = (String) arrayList.get(1);
                String str287 = (String) arrayList.get(2);
                if (str287.length() <= 0) {
                    str287 = uq.r[0];
                }
                String str288 = (String) arrayList.get(3);
                if (str288.length() <= 0) {
                    str288 = "1";
                }
                if (str285.length() > 0 && str286.length() > 0) {
                    str7 = String.format("_%s_controller.setMarkerColor(%s, BitmapDescriptorFactory.%s, %s);", str285, str286, str287, str288);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 197:
                String str289 = (String) arrayList.get(0);
                String str290 = (String) arrayList.get(1);
                String str291 = (String) arrayList.get(2);
                if (str291.endsWith(".9")) {
                    str291 = str291.replaceAll("\\.9", str10);
                }
                if (str289.length() > 0 && str290.length() > 0 && str291.length() > 0) {
                    str7 = String.format("_%s_controller.setMarkerIcon(%s, R.drawable.%s);", str289, str290, str291.toLowerCase());
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 198:
                String str292 = (String) arrayList.get(0);
                String str293 = (String) arrayList.get(1);
                String str294 = (String) arrayList.get(2);
                if (str294.length() <= 0) {
                    str294 = "true";
                }
                if (str292.length() > 0 && str293.length() > 0) {
                    str7 = String.format("_%s_controller.setMarkerVisible(%s, %s);", str292, str293, str294);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 199:
                String str295 = (String) arrayList.get(0);
                String str296 = (String) arrayList.get(1);
                if (str296.length() > 0) {
                    str9 = str296;
                }
                if (str295.length() > 0) {
                    str7 = String.format("%s.vibrate((long)(%s));", str295, str9);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 200:
                String str297 = (String) arrayList.get(0);
                String str298 = (String) arrayList.get(1);
                int i10 = blockBean.subStack1;
                String a8 = i10 >= 0 ? a(String.valueOf(i10), str10) : str10;
                if (str298.length() > 0) {
                    str9 = str298;
                }
                if (str297.length() > 0) {
                    str7 = String.format("%s = new TimerTask() {\n@Override\npublic void run() {\nrunOnUiThread(new Runnable() {\n@Override\npublic void run() {\n%s\n}\n});\n}\n};\n_timer.schedule(%s, (int)(%s));", str297, a8, str297, str9);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 201:
                String str299 = (String) arrayList.get(0);
                String str300 = (String) arrayList.get(1);
                String str301 = (String) arrayList.get(2);
                int i11 = blockBean.subStack1;
                String a9 = i11 >= 0 ? a(String.valueOf(i11), str10) : str10;
                if (str301.length() <= 0) {
                    str301 = str9;
                }
                if (str300.length() > 0) {
                    str9 = str300;
                }
                if (str299.length() > 0) {
                    str7 = String.format("%s = new TimerTask() {\n@Override\npublic void run() {\nrunOnUiThread(new Runnable() {\n@Override\npublic void run() {\n%s\n}\n});\n}\n};\n_timer.scheduleAtFixedRate(%s, (int)(%s), (int)(%s));", str299, a9, str299, str9, str301);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 202:
                String str302 = (String) arrayList.get(0);
                if (str302.length() > 0) {
                    str7 = String.format("%s.cancel();", str302);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 203:
                String str303 = (String) arrayList.get(0);
                String str304 = (String) arrayList.get(1);
                String str305 = (String) arrayList.get(2);
                if (str304.length() <= 0) {
                    str304 = str10;
                }
                if (str303.length() > 0 && str305.length() > 0) {
                    str7 = String.format("%s.child(%s).updateChildren(%s);", str303, str304, str305);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 204:
                String str306 = (String) arrayList.get(0);
                String str307 = (String) arrayList.get(1);
                if (str306.length() > 0 && str307.length() > 0) {
                    str7 = String.format("%s.push().updateChildren(%s);", str306, str307);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 205:
                String str308 = (String) arrayList.get(0);
                if (str308.length() > 0) {
                    str7 = String.format("%s.push().getKey()", str308);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 206:
                String str309 = (String) arrayList.get(0);
                String str310 = (String) arrayList.get(1);
                if (str310.length() <= 0) {
                    str310 = str10;
                }
                if (str309.length() > 0) {
                    str7 = String.format("%s.child(%s).removeValue();", str309, str310);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 207:
                String str311 = (String) arrayList.get(0);
                String str312 = (String) arrayList.get(1);
                int i12 = blockBean.subStack1;
                String a10 = i12 >= 0 ? a(String.valueOf(i12), str10) : str10;
                if (str312.length() > 0 && str311.length() > 0) {
                    str7 = String.format("%s.addListenerForSingleValueEvent(new ValueEventListener() {", str311) + "\n@Override\npublic void onDataChange(DataSnapshot _dataSnapshot) {\n" + String.format("%s = new ArrayList<>();", str312) + "\ntry {\nGenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};\nfor (DataSnapshot _data : _dataSnapshot.getChildren()) {\nHashMap<String, Object> _map = _data.getValue(_ind);\n" + String.format("%s.add(_map);", str312) + "\n}\n}\ncatch (Exception _e) {\n_e.printStackTrace();\n}\n" + a10 + "\n}\n@Override\npublic void onCancelled(DatabaseError _databaseError) {\n}\n});";
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 208:
                String str313 = (String) arrayList.get(0);
                String str314 = (String) arrayList.get(1);
                String str315 = (String) arrayList.get(2);
                if (str313.length() > 0 && !str314.equals(str8) && !str315.equals(str8)) {
                    str7 = String.format("%s.createUserWithEmailAndPassword(%s, %s).addOnCompleteListener(%s.this, %s);", str313, str314, str315, this.c, "_" + str313 + "_create_user_listener");
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 209:
                String str316 = (String) arrayList.get(0);
                String str317 = (String) arrayList.get(1);
                String str318 = (String) arrayList.get(2);
                if (str316.length() > 0 && !str317.equals(str8) && !str318.equals(str8)) {
                    str7 = String.format("%s.signInWithEmailAndPassword(%s, %s).addOnCompleteListener(%s.this, %s);", str316, str317, str318, this.c, "_" + str316 + "_sign_in_listener");
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 210:
                String str319 = (String) arrayList.get(0);
                if (str319.length() > 0) {
                    str7 = String.format("%s.signInAnonymously().addOnCompleteListener(%s.this, %s);", str319, this.c, "_" + str319 + "_sign_in_listener");
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 211:
                if (this.e.a(this.c).b) {
                    str7 = String.format("(FirebaseAuth.getInstance().getCurrentUser() != null)", new Object[0]);
                    break;
                }
                break;
            case 212:
                if (this.e.a(this.c).b) {
                    str7 = String.format("FirebaseAuth.getInstance().getCurrentUser().getEmail()", new Object[0]);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 213:
                if (this.e.a(this.c).b) {
                    str7 = String.format("FirebaseAuth.getInstance().getCurrentUser().getUid()", new Object[0]);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 214:
                String str320 = (String) arrayList.get(0);
                String str321 = (String) arrayList.get(1);
                if (str320.length() > 0 && !str321.equals(str8)) {
                    str7 = String.format("%s.sendPasswordResetEmail(%s).addOnCompleteListener(%s);", str320, str321, "_" + str320 + "_reset_password_listener");
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 215:
                if (this.e.a(this.c).b) {
                    str7 = String.format("FirebaseAuth.getInstance().signOut();", new Object[0]);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 216:
                String str322 = (String) arrayList.get(0);
                if (str322.length() > 0) {
                    str7 = String.format("%s.addChildEventListener(_%s_child_listener);", str322, str322);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 217:
                String str323 = (String) arrayList.get(0);
                if (str323.length() > 0) {
                    str7 = String.format("%s.removeEventListener(_%s_child_listener);", str323, str323);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 218:
                String str324 = (String) arrayList.get(0);
                if (str324.length() > 0) {
                    str7 = String.format("%s.registerListener(_%s_sensor_listener, %s.getDefaultSensor(Sensor.TYPE_GAME_ROTATION_VECTOR), SensorManager.SENSOR_DELAY_NORMAL);", str324, str324, str324);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 219:
                String str325 = (String) arrayList.get(0);
                if (str325.length() > 0) {
                    str7 = String.format("%s.unregisterListener(_%s_sensor_listener);", str325, str325);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 220:
                String str326 = (String) arrayList.get(0);
                String str327 = (String) arrayList.get(1);
                if (str327.length() <= 0 || str327.equals(str8)) {
                    str327 = "\"Title\"";
                }
                if (str326.length() > 0) {
                    str7 = String.format("%s.setTitle(%s);", str326, str327);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 221:
                String str328 = (String) arrayList.get(0);
                String str329 = (String) arrayList.get(1);
                if (str329.length() <= 0 || str329.equals(str8)) {
                    str329 = "\"Message\"";
                }
                if (str328.length() > 0) {
                    str7 = String.format("%s.setMessage(%s);", str328, str329);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 222:
                String str330 = (String) arrayList.get(0);
                if (str330.length() > 0) {
                    str7 = String.format("%s.create().show();", str330);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 223:
                String str331 = (String) arrayList.get(0);
                String str332 = (String) arrayList.get(1);
                int i13 = blockBean.subStack1;
                String a11 = i13 >= 0 ? a(String.valueOf(i13), str10) : str10;
                if (str332.length() <= 0 || str332.equals(str8)) {
                    str332 = "\"OK\"";
                }
                if (str331.length() > 0) {
                    str7 = String.format("%s.setPositiveButton(%s, new DialogInterface.OnClickListener() {\n@Override\npublic void onClick(DialogInterface _dialog, int _which) {\n%s\n}\n});", str331, str332, a11);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 224:
                String str333 = (String) arrayList.get(0);
                String str334 = (String) arrayList.get(1);
                int i14 = blockBean.subStack1;
                String a12 = i14 >= 0 ? a(String.valueOf(i14), str10) : str10;
                if (str334.length() <= 0 || str334.equals(str8)) {
                    str334 = "\"Cancel\"";
                }
                if (str333.length() > 0) {
                    str7 = String.format("%s.setNegativeButton(%s, new DialogInterface.OnClickListener() {\n@Override\npublic void onClick(DialogInterface _dialog, int _which) {\n%s\n}\n});", str333, str334, a12);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 225:
                String str335 = (String) arrayList.get(0);
                String str336 = (String) arrayList.get(1);
                int i15 = blockBean.subStack1;
                String a13 = i15 >= 0 ? a(String.valueOf(i15), str10) : str10;
                if (str336.length() <= 0 || str336.equals(str8)) {
                    str336 = "\"Neutral\"";
                }
                if (str335.length() > 0) {
                    str7 = String.format("%s.setNeutralButton(%s, new DialogInterface.OnClickListener() {\n@Override\npublic void onClick(DialogInterface _dialog, int _which) {\n%s\n}\n});", str335, str336, a13);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 226:
                String str337 = (String) arrayList.get(0);
                String str338 = (String) arrayList.get(1);
                if (str337.length() > 0 && str338.length() > 0) {
                    str7 = String.format("%s = MediaPlayer.create(getApplicationContext(), R.raw.%s);", str337, str338.toLowerCase());
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 227:
                String str339 = (String) arrayList.get(0);
                if (str339.length() > 0) {
                    str7 = String.format("%s.start();", str339);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 228:
                String str340 = (String) arrayList.get(0);
                if (str340.length() > 0) {
                    str7 = String.format("%s.pause();", str340);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 229:
                String str341 = (String) arrayList.get(0);
                String str342 = (String) arrayList.get(1);
                if (str342.length() > 0) {
                    str9 = str342;
                }
                if (str341.length() > 0) {
                    str7 = String.format("%s.seekTo((int)(%s));", str341, str9);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 230:
                String str343 = (String) arrayList.get(0);
                if (str343.length() > 0) {
                    str7 = String.format("%s.getCurrentPosition()", str343);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 231:
                String str344 = (String) arrayList.get(0);
                if (str344.length() > 0) {
                    str7 = String.format("%s.getDuration()", str344);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 232:
                String str345 = (String) arrayList.get(0);
                if (str345.length() > 0) {
                    str7 = String.format("%s.reset();", str345);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 233:
                String str346 = (String) arrayList.get(0);
                if (str346.length() > 0) {
                    str7 = String.format("%s.release();", str346);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 234:
                String str347 = (String) arrayList.get(0);
                if (str347.length() > 0) {
                    str7 = String.format("%s.isPlaying()", str347);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 235:
                String str348 = (String) arrayList.get(0);
                String str349 = (String) arrayList.get(1);
                if (str349.length() <= 0) {
                    str349 = str7;
                }
                if (str348.length() > 0) {
                    str7 = String.format("%s.setLooping(%s);", str348, str349);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 236:
                String str350 = (String) arrayList.get(0);
                if (str350.length() > 0) {
                    str7 = String.format("%s.isLooping()", str350);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 237:
                String str351 = (String) arrayList.get(0);
                String str352 = (String) arrayList.get(1);
                if (str352.length() <= 0) {
                    str352 = "1";
                }
                if (str351.length() > 0) {
                    str7 = String.format("%s = new SoundPool((int)(%s), AudioManager.STREAM_MUSIC, 0);", str351, str352);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 238:
                String str353 = (String) arrayList.get(0);
                String str354 = (String) arrayList.get(1);
                if (str354.length() > 0 && str353.length() > 0) {
                    str7 = String.format("%s.load(getApplicationContext(), R.raw.%s, 1)", str353, str354);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 239:
                String str355 = (String) arrayList.get(0);
                String str356 = (String) arrayList.get(1);
                String str357 = (String) arrayList.get(2);
                if (str357.length() > 0) {
                    str9 = str357;
                }
                if (str356.length() > 0 && str355.length() > 0) {
                    str7 = String.format("%s.play((int)(%s), 1.0f, 1.0f, 1, (int)(%s), 1.0f)", str355, str356, str9);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 240:
                String str358 = (String) arrayList.get(0);
                String str359 = (String) arrayList.get(1);
                if (str359.length() > 0 && str358.length() > 0) {
                    str7 = String.format("%s.stop((int)(%s));", str358, str359);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 241:
                String str360 = (String) arrayList.get(0);
                String str361 = (String) arrayList.get(1);
                if (str361.endsWith(".9")) {
                    str361 = str361.replaceAll("\\.9", str10);
                }
                if (str360.length() > 0 && str361.length() > 0) {
                    str7 = String.format("%s.setThumbResource(R.drawable.%s);", str360, str361.toLowerCase());
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 242:
                String str362 = (String) arrayList.get(0);
                String str363 = (String) arrayList.get(1);
                if (str363.endsWith(".9")) {
                    str363 = str363.replaceAll("\\.9", str10);
                }
                if (str362.length() > 0 && str363.length() > 0) {
                    str7 = String.format("%s.setTrackResource(R.drawable.%s);", str362, str363.toLowerCase());
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 243:
                String str364 = (String) arrayList.get(0);
                String str365 = (String) arrayList.get(1);
                if (str365.length() > 0) {
                    str9 = str365;
                }
                if (str364.length() > 0) {
                    str7 = String.format("%s.setProgress((int)%s);", str364, str9);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 244:
                String str366 = (String) arrayList.get(0);
                if (str366.length() > 0) {
                    str7 = String.format("%s.getProgress()", str366);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 245:
                String str367 = (String) arrayList.get(0);
                String str368 = (String) arrayList.get(1);
                if (str368.length() > 0) {
                    str9 = str368;
                }
                if (str367.length() > 0) {
                    str7 = String.format("%s.setMax((int)%s);", str367, str9);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 246:
                String str369 = (String) arrayList.get(0);
                if (str369.length() > 0) {
                    str7 = String.format("%s.getMax()", str369);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 247:
                String str370 = (String) arrayList.get(0);
                String str371 = (String) arrayList.get(1);
                if (str370.length() > 0 && str371.length() > 0) {
                    str7 = String.format("%s.setTarget(%s);", str370, str371);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 248:
                String str372 = (String) arrayList.get(0);
                String str373 = (String) arrayList.get(1);
                if (str372.length() > 0 && str373.length() > 0) {
                    str7 = String.format("%s.setPropertyName(\"%s\");", str372, str373);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 249:
                String str374 = (String) arrayList.get(0);
                String str375 = (String) arrayList.get(1);
                if (str375.length() > 0) {
                    str9 = str375;
                }
                if (str374.length() > 0) {
                    str7 = String.format("%s.setFloatValues((float)(%s));", str374, str9);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 250:
                String str376 = (String) arrayList.get(0);
                String str377 = (String) arrayList.get(1);
                String str378 = (String) arrayList.get(2);
                if (str378.length() <= 0) {
                    str378 = str9;
                }
                if (str377.length() > 0) {
                    str9 = str377;
                }
                if (str376.length() > 0) {
                    str7 = String.format("%s.setFloatValues((float)(%s), (float)(%s));", str376, str9, str378);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 251:
                String str379 = (String) arrayList.get(0);
                String str380 = (String) arrayList.get(1);
                if (str380.length() > 0) {
                    str9 = str380;
                }
                if (str379.length() > 0) {
                    str7 = String.format("%s.setDuration((int)(%s));", str379, str9);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 252:
                String str381 = (String) arrayList.get(0);
                String str382 = (String) arrayList.get(1);
                if (str381.length() > 0 && str382.length() > 0) {
                    str7 = String.format("%s.setRepeatMode(ValueAnimator.%s);", str381, str382);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 253:
                String str383 = (String) arrayList.get(0);
                String str384 = (String) arrayList.get(1);
                if (str384.length() > 0) {
                    str9 = str384;
                }
                if (str383.length() > 0) {
                    str7 = String.format("%s.setRepeatCount((int)(%s));", str383, str9);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 254:
                String str385 = (String) arrayList.get(0);
                String str386 = (String) arrayList.get(1);
                String str387 = str386.equals("Accelerate") ? "new AccelerateInterpolator()" : "new LinearInterpolator()";
                if (str386.equals("Decelerate")) {
                    str387 = "new DecelerateInterpolator()";
                }
                if (str386.equals("AccelerateDeccelerate")) {
                    str387 = "new AccelerateDecelerateInterpolator()";
                }
                if (str386.equals("Bounce")) {
                    str387 = "new BounceInterpolator()";
                }
                if (str385.length() > 0) {
                    str7 = String.format("%s.setInterpolator(%s);", str385, str387);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 255:
                String str388 = (String) arrayList.get(0);
                if (str388.length() > 0) {
                    str7 = String.format("%s.start();", str388);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 256:
                String str389 = (String) arrayList.get(0);
                if (str389.length() > 0) {
                    str7 = String.format("%s.cancel();", str389);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 257:
                String str390 = (String) arrayList.get(0);
                if (str390.length() > 0) {
                    str7 = String.format("%s.isRunning()", str390);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 258:
                String str391 = (String) arrayList.get(0);
                if (str391.length() > 0) {
                    str7 = String.format("%s = new InterstitialAd(getApplicationContext());\n%s.setAdListener(_%s_ad_listener);", str391, str391, str391);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 259:
                String str392 = (String) arrayList.get(0);
                if (this.e.t.size() > 0) {
                    Iterator<String> it2 = this.e.t.iterator();
                    str3 = str10;
                    while (it2.hasNext()) {
                        str3 = str3 + ".addTestDevice(\"" + it2.next() + "\")\n";
                    }
                } else {
                    str3 = str10;
                }
                jq jqVar = this.e;
                if (!jqVar.f) {
                    str4 = "ca-app-pub-3940256099942544/1033173712";
                } else {
                    str4 = jqVar.s;
                }
                if (str392.length() > 0) {
                    str7 = String.format("%s.setAdUnitId(\"%s\");\n%s.loadAd(new AdRequest.Builder()%s.build());", str392, str4, str392, str3);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 260:
                String str393 = (String) arrayList.get(0);
                if (str393.length() > 0) {
                    str7 = String.format("%s.show();", str393);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 261:
                String str394 = (String) arrayList.get(0);
                String str395 = (String) arrayList.get(1);
                String str396 = (String) arrayList.get(2);
                if (str394.length() > 0 && !str395.equals(str8) && !str396.equals(str8)) {
                    str7 = String.format("%s.child(%s).putFile(Uri.fromFile(new File(%s))).addOnFailureListener(_%s_failure_listener).addOnProgressListener(_%s_upload_progress_listener).continueWithTask(new Continuation<UploadTask.TaskSnapshot, Task<Uri>>() {\n@Override\npublic Task<Uri> then(Task<UploadTask.TaskSnapshot> task) throws Exception {\nreturn %s.child(%s).getDownloadUrl();\n}}).addOnCompleteListener(_%s_upload_success_listener);", str394, str396, str395, str394, str394, str394, str396, str394);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 262:
                String str397 = (String) arrayList.get(0);
                String str398 = (String) arrayList.get(1);
                String str399 = (String) arrayList.get(2);
                if (str397.length() > 0 && !str398.equals(str8) && !str399.equals(str8)) {
                    str7 = String.format("_firebase_storage.getReferenceFromUrl(%s).getFile(new File(%s)).addOnSuccessListener(_%s_download_success_listener).addOnFailureListener(_%s_failure_listener).addOnProgressListener(_%s_download_progress_listener);", str398, str399, str397, str397, str397);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 263:
                String str400 = (String) arrayList.get(0);
                String str401 = (String) arrayList.get(1);
                if (str400.length() > 0 && !str401.equals(str8)) {
                    str7 = String.format("_firebase_storage.getReferenceFromUrl(%s).delete().addOnSuccessListener(_%s_delete_success_listener).addOnFailureListener(_%s_failure_listener);", str401, str400, str400);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 264:
                String str402 = (String) arrayList.get(0);
                if (!str402.equals(str8)) {
                    str7 = String.format("FileUtil.readFile(%s)", str402);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 265:
                String str403 = (String) arrayList.get(0);
                String str404 = (String) arrayList.get(1);
                if (!str404.equals(str8)) {
                    str7 = String.format("FileUtil.writeFile(%s, %s);", str404, str403);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 266:
                String str405 = (String) arrayList.get(0);
                String str406 = (String) arrayList.get(1);
                if (!str405.equals(str8) && !str406.equals(str8)) {
                    str7 = String.format("FileUtil.copyFile(%s, %s);", str405, str406);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 267:
                String str407 = (String) arrayList.get(0);
                String str408 = (String) arrayList.get(1);
                if (!str407.equals(str8) && !str408.equals(str8)) {
                    str7 = String.format("FileUtil.moveFile(%s, %s);", str407, str408);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 268:
                String str409 = (String) arrayList.get(0);
                if (!str409.equals(str8)) {
                    str7 = String.format("FileUtil.deleteFile(%s);", str409);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 269:
                String str410 = (String) arrayList.get(0);
                if (!str410.equals(str8)) {
                    str7 = String.format("FileUtil.isExistFile(%s)", str410);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 270:
                String str411 = (String) arrayList.get(0);
                if (!str411.equals(str8)) {
                    str7 = String.format("FileUtil.makeDir(%s);", str411);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 271:
                String str412 = (String) arrayList.get(0);
                String str413 = (String) arrayList.get(1);
                if (!str412.equals(str8) && str413.length() > 0) {
                    str7 = String.format("FileUtil.listDir(%s, %s);", str412, str413);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 272:
                String str414 = (String) arrayList.get(0);
                if (!str414.equals(str8)) {
                    str7 = String.format("FileUtil.isDirectory(%s)", str414);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 273:
                String str415 = (String) arrayList.get(0);
                if (!str415.equals(str8)) {
                    str7 = String.format("FileUtil.isFile(%s)", str415);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 274:
                String str416 = (String) arrayList.get(0);
                if (!str416.equals(str8)) {
                    str7 = String.format("FileUtil.getFileLength(%s)", str416);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 275:
                String str417 = (String) arrayList.get(0);
                String str418 = (String) arrayList.get(1);
                if (!str417.equals(str8) && str418.length() > 0) {
                    str7 = String.format("%s.startsWith(%s)", str417, str418);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 276:
                String str419 = (String) arrayList.get(0);
                String str420 = (String) arrayList.get(1);
                if (!str419.equals(str8) && str420.length() > 0) {
                    str7 = String.format("%s.endsWith(%s)", str419, str420);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 277:
                String str421 = (String) arrayList.get(0);
                if (!str421.equals(str8)) {
                    str7 = String.format("Uri.parse(%s).getLastPathSegment()", str421);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 278:
                str7 = "FileUtil.getExternalStorageDir()";
                break;
            case 279:
                str7 = "FileUtil.getPackageDataDir(getApplicationContext())";
                break;
            case 280:
                String str422 = (String) arrayList.get(0);
                if (str422.length() > 0) {
                    str7 = String.format("FileUtil.getPublicDir(Environment.%s)", str422);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 281:
                String str423 = (String) arrayList.get(0);
                String str424 = (String) arrayList.get(1);
                String str425 = (String) arrayList.get(2);
                if (str425.length() <= 0) {
                    str425 = "1024";
                }
                if (!str423.equals(str8) && !str424.equals(str8)) {
                    str7 = String.format("FileUtil.resizeBitmapFileRetainRatio(%s, %s, %s);", str423, str424, str425);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 282:
                String str426 = (String) arrayList.get(0);
                String str427 = (String) arrayList.get(1);
                String str428 = (String) arrayList.get(2);
                if (str428.length() <= 0) {
                    str428 = "1024";
                }
                if (!str426.equals(str8) && !str427.equals(str8)) {
                    str7 = String.format("FileUtil.resizeBitmapFileToSquare(%s, %s, %s);", str426, str427, str428);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 283:
                String str429 = (String) arrayList.get(0);
                String str430 = (String) arrayList.get(1);
                if (!str429.equals(str8) && !str430.equals(str8)) {
                    str7 = String.format("FileUtil.resizeBitmapFileToCircle(%s, %s);", str429, str430);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 284:
                String str431 = (String) arrayList.get(0);
                String str432 = (String) arrayList.get(1);
                String str433 = (String) arrayList.get(2);
                if (str433.length() > 0) {
                    str9 = str433;
                }
                if (!str431.equals(str8) && !str432.equals(str8)) {
                    str7 = String.format("FileUtil.resizeBitmapFileWithRoundedBorder(%s, %s, %s);", str431, str432, str9);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 285:
                String str434 = (String) arrayList.get(0);
                String str435 = (String) arrayList.get(1);
                String str436 = (String) arrayList.get(2);
                String str437 = (String) arrayList.get(3);
                if (str436.length() <= 0) {
                    str436 = "1024";
                }
                if (str437.length() <= 0) {
                    str437 = "1024";
                }
                if (!str434.equals(str8) && !str435.equals(str8)) {
                    str7 = String.format("FileUtil.cropBitmapFileFromCenter(%s, %s, %s, %s);", str434, str435, str436, str437);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 286:
                String str438 = (String) arrayList.get(0);
                String str439 = (String) arrayList.get(1);
                String str440 = (String) arrayList.get(2);
                if (str440.length() > 0) {
                    str9 = str440;
                }
                if (!str438.equals(str8) && !str439.equals(str8)) {
                    str7 = String.format("FileUtil.rotateBitmapFile(%s, %s, %s);", str438, str439, str9);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 287:
                String str441 = (String) arrayList.get(0);
                String str442 = (String) arrayList.get(1);
                String str443 = (String) arrayList.get(2);
                String str444 = (String) arrayList.get(3);
                if (str443.length() <= 0) {
                    str443 = "1";
                }
                if (str444.length() <= 0) {
                    str444 = "1";
                }
                if (!str441.equals(str8) && !str442.equals(str8)) {
                    str7 = String.format("FileUtil.scaleBitmapFile(%s, %s, %s, %s);", str441, str442, str443, str444);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 288:
                String str445 = (String) arrayList.get(0);
                String str446 = (String) arrayList.get(1);
                String str447 = (String) arrayList.get(2);
                String str448 = (String) arrayList.get(3);
                if (str447.length() <= 0) {
                    str447 = str9;
                }
                if (str448.length() > 0) {
                    str9 = str448;
                }
                if (!str445.equals(str8) && !str446.equals(str8)) {
                    str7 = String.format("FileUtil.skewBitmapFile(%s, %s, %s, %s);", str445, str446, str447, str9);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 289:
                String str449 = (String) arrayList.get(0);
                String str450 = (String) arrayList.get(1);
                String str451 = (String) arrayList.get(2);
                if (str451.length() <= 0) {
                    str451 = "0x00000000";
                }
                if (!str449.equals(str8) && !str450.equals(str8)) {
                    str7 = String.format("FileUtil.setBitmapFileColorFilter(%s, %s, %s);", str449, str450, str451);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 290:
                String str452 = (String) arrayList.get(0);
                String str453 = (String) arrayList.get(1);
                String str454 = (String) arrayList.get(2);
                if (str454.length() > 0) {
                    str9 = str454;
                }
                if (!str452.equals(str8) && !str453.equals(str8)) {
                    str7 = String.format("FileUtil.setBitmapFileBrightness(%s, %s, %s);", str452, str453, str9);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 291:
                String str455 = (String) arrayList.get(0);
                String str456 = (String) arrayList.get(1);
                String str457 = (String) arrayList.get(2);
                if (str457.length() > 0) {
                    str9 = str457;
                }
                if (!str455.equals(str8) && !str456.equals(str8)) {
                    str7 = String.format("FileUtil.setBitmapFileContrast(%s, %s, %s);", str455, str456, str9);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 292:
                String str458 = (String) arrayList.get(0);
                if (!str458.equals(str8)) {
                    str7 = String.format("FileUtil.getJpegRotate(%s)", str458);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 293:
                String str459 = (String) arrayList.get(0);
                if (str459.length() > 0) {
                    str7 = String.format("startActivityForResult(%s, REQ_CD_%s);", str459, str459.toUpperCase());
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 294:
                String str460 = (String) arrayList.get(0);
                if (str460.length() > 0) {
                    str7 = String.format("startActivityForResult(%s, REQ_CD_%s);", str460, str460.toUpperCase());
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 295:
                String str461 = (String) arrayList.get(0);
                String str462 = (String) arrayList.get(1);
                if (str461.length() > 0 && !str462.equals(str8)) {
                    str7 = String.format("%s.setImageBitmap(FileUtil.decodeSampleBitmapFromPath(%s, 1024, 1024));", str461, str462);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 296:
                String str463 = (String) arrayList.get(0);
                String str464 = (String) arrayList.get(1);
                if (str463.length() > 0 && !str464.equals(str8)) {
                    str7 = String.format("Glide.with(getApplicationContext()).load(Uri.parse(%s)).into(%s);", str464, str463);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 297:
                String str465 = (String) arrayList.get(0);
                String str466 = (String) arrayList.get(1);
                if (str465.length() > 0 && !str466.equals(str8)) {
                    str7 = String.format("%s.setHint(%s);", str465, str466);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 298:
                String str467 = (String) arrayList.get(0);
                String str468 = (String) arrayList.get(1);
                if (str467.length() > 0 && !str468.equals(str8)) {
                    str7 = String.format("%s.setHintTextColor(%s);", str467, str468);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 299:
                String str469 = (String) arrayList.get(0);
                String str470 = (String) arrayList.get(1);
                String str471 = (String) arrayList.get(2);
                if (str469.length() > 0 && str470.length() > 0 && str471.length() > 0) {
                    str7 = String.format("%s.setParams(%s, RequestNetworkController.%s);", str469, str470, str471);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 300:
                String str472 = (String) arrayList.get(0);
                String str473 = (String) arrayList.get(1);
                if (str472.length() > 0 && str473.length() > 0) {
                    str7 = String.format("%s.setHeaders(%s);", str472, str473);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 301:
                String str474 = (String) arrayList.get(0);
                String str475 = (String) arrayList.get(1);
                String str476 = (String) arrayList.get(2);
                String str477 = (String) arrayList.get(3);
                if (str474.length() > 0 && str475.length() > 0 && !str476.equals(str8) && str477.length() > 0) {
                    str7 = String.format("%s.startRequestNetwork(RequestNetworkController.%s, %s, %s, _%s_request_listener);", str474, str475, str476, str477, str474);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 302:
                String str478 = (String) arrayList.get(0);
                String str479 = (String) arrayList.get(1);
                if (str479.length() <= 0) {
                    str479 = str7;
                }
                if (str478.length() > 0) {
                    str7 = String.format("%s.setIndeterminate(%s);", str478, str479);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 303:
                String str480 = (String) arrayList.get(0);
                String str481 = (String) arrayList.get(1);
                if (str481.length() <= 0) {
                    str481 = "1";
                }
                if (str480.length() > 0) {
                    str7 = String.format("%s.setPitch((float)%s);", str480, str481);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 304:
                String str482 = (String) arrayList.get(0);
                String str483 = (String) arrayList.get(1);
                if (str483.length() <= 0) {
                    str483 = "1";
                }
                if (str482.length() > 0) {
                    str7 = String.format("%s.setSpeechRate((float)%s);", str482, str483);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 305:
                String str484 = (String) arrayList.get(0);
                String str485 = (String) arrayList.get(1);
                if (str484.length() > 0 && str485.length() > 0) {
                    str7 = String.format("%s.speak(%s, TextToSpeech.QUEUE_ADD, null);", str484, str485);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 306:
                String str486 = (String) arrayList.get(0);
                if (str486.length() > 0) {
                    str7 = String.format("%s.isSpeaking()", str486);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 307:
                String str487 = (String) arrayList.get(0);
                if (str487.length() > 0) {
                    str7 = String.format("%s.stop();", str487);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 308:
                String str488 = (String) arrayList.get(0);
                if (str488.length() > 0) {
                    str7 = String.format("%s.shutdown();", str488);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 309:
                String str489 = (String) arrayList.get(0);
                if (str489.length() > 0) {
                    str7 = String.format("Intent _intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);\n_intent.putExtra(RecognizerIntent.EXTRA_CALLING_PACKAGE, getPackageName());\n_intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);\n_intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());\n%s.startListening(_intent);", str489);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 310:
                String str490 = (String) arrayList.get(0);
                if (str490.length() > 0) {
                    str7 = String.format("%s.stopListening();", str490);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 311:
                String str491 = (String) arrayList.get(0);
                if (str491.length() > 0) {
                    str7 = String.format("%s.cancel();\n%s.destroy();", str491, str491);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 312:
                String str492 = (String) arrayList.get(0);
                String str493 = (String) arrayList.get(1);
                if (str492.length() > 0 && str493.length() > 0) {
                    str7 = String.format("%s.readyConnection(_%s_bluetooth_connection_listener, %s);", str492, str492, str493);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 313:
                String str494 = (String) arrayList.get(0);
                String str495 = (String) arrayList.get(1);
                String str496 = (String) arrayList.get(2);
                if (str494.length() > 0 && str495.length() > 0 && str496.length() > 0) {
                    str7 = String.format("%s.readyConnection(_%s_bluetooth_connection_listener, %s, %s);", str494, str494, str495, str496);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 314:
                String str497 = (String) arrayList.get(0);
                String str498 = (String) arrayList.get(1);
                String str499 = (String) arrayList.get(2);
                if (str497.length() > 0 && str498.length() > 0 && str499.length() > 0) {
                    str7 = String.format("%s.startConnection(_%s_bluetooth_connection_listener, %s, %s);", str497, str497, str498, str499);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 315:
                String str500 = (String) arrayList.get(0);
                String str501 = (String) arrayList.get(1);
                String str502 = (String) arrayList.get(2);
                String str503 = (String) arrayList.get(3);
                if (str500.length() > 0 && str501.length() > 0 && str502.length() > 0 && str503.length() > 0) {
                    str7 = String.format("%s.startConnection(_%s_bluetooth_connection_listener, %s, %s, %s);", str500, str500, str501, str502, str503);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 316:
                String str504 = (String) arrayList.get(0);
                String str505 = (String) arrayList.get(1);
                if (str504.length() > 0 && str505.length() > 0) {
                    str7 = String.format("%s.stopConnection(_%s_bluetooth_connection_listener, %s);", str504, str504, str505);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 317:
                String str506 = (String) arrayList.get(0);
                String str507 = (String) arrayList.get(1);
                String str508 = (String) arrayList.get(2);
                if (str506.length() > 0 && str507.length() > 0 && str508.length() > 0) {
                    str7 = String.format("%s.sendData(_%s_bluetooth_connection_listener, %s, %s);", str506, str506, str507, str508);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 318:
                String str509 = (String) arrayList.get(0);
                if (str509.length() > 0) {
                    str7 = String.format("%s.isBluetoothEnabled()", str509);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 319:
                String str510 = (String) arrayList.get(0);
                if (str510.length() > 0) {
                    str7 = String.format("%s.isBluetoothActivated()", str510);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 320:
                String str511 = (String) arrayList.get(0);
                if (str511.length() > 0) {
                    str7 = String.format("%s.activateBluetooth();", str511);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 321:
                String str512 = (String) arrayList.get(0);
                String str513 = (String) arrayList.get(1);
                if (str512.length() > 0 && str513.length() > 0) {
                    str7 = String.format("%s.getPairedDevices(%s);", str512, str513);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 322:
                String str514 = (String) arrayList.get(0);
                if (str514.length() > 0) {
                    str7 = String.format("%s.getRandomUUID()", str514);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 323:
                String str515 = (String) arrayList.get(0);
                String str516 = (String) arrayList.get(1);
                if (str516.length() <= 0) {
                    str516 = uq.p[0];
                }
                String str517 = (String) arrayList.get(2);
                if (str517.length() <= 0) {
                    str517 = "1000";
                }
                String str518 = (String) arrayList.get(3);
                if (str518.length() > 0) {
                    str9 = str518;
                }
                if (str515.length() > 0) {
                    if (this.e.g) {
                        str7 = String.format("if (ContextCompat.checkSelfPermission(%s.this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {\n%s.requestLocationUpdates(LocationManager.%s, %s, %s, _%s_location_listener);\n}", this.c, str515, str516, str517, str9, str515);
                        break;
                    } else {
                        str7 = String.format("if (Build.VERSION.SDK_INT >= 23) {if (checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {\n%s.requestLocationUpdates(LocationManager.%s, %s, %s, _%s_location_listener);\n}\n}\nelse {\n%s.requestLocationUpdates(LocationManager.%s, %s, %s, _%s_location_listener);\n}", str515, str516, str517, str9, str515, str515, str516, str517, str9, str515);
                        break;
                    }
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            case 324:
                String str519 = (String) arrayList.get(0);
                if (str519.length() > 0) {
                    str7 = String.format("%s.removeUpdates(_%s_location_listener);", str519, str519);
                    break;
                }
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
            default:
                str10 = this.mceb.getCodeExtraBlock(blockBean, str10);
                str7 = str10;
                break;
        }
        if (b(blockBean.opCode, str)) {
            str7 = "(" + str7 + ")";
        }
        if (blockBean.nextBlock < 0) {
            return str7;
        }
        return str7 + "\r\n" + a(String.valueOf(blockBean.nextBlock), str10);
    }

    public final String a(String parameter, int blockType, String opCode) {
        if (parameter.length() > 0 && parameter.charAt(0) == '@') {
            if (blockType == 2 && a(parameter.substring(1), opCode).length() <= 0) {
                return "\"\"";
            } else {
                return parameter;
            }
        } else if (blockType == 2) {
            return "\"" + a(parameter) + "\"";
        } else if (blockType == 1) {
            try {
                Integer.parseInt(parameter);
                return parameter;
            } catch (NumberFormatException e) {
                try {
                    Double.parseDouble(parameter);
                    return parameter + "d";
                } catch (NumberFormatException ignored) {
                }
            }
        }
        return parameter;
    }

    /**
     * @return Escaped String, needed to have
     * <code>\"</code>, <code>\'</code>, <code>\n</code> and <code>\t</code>
     * show up in code instead of those special characters without <code>\</code>.
     */
    public final String a(String str) {
        StringBuilder sb = new StringBuilder(4096);
        CharBuffer wrap = CharBuffer.wrap(str);
        int i = 0;
        while (i < wrap.length()) {
            char c2 = wrap.get(i);
            if (c2 == '\"') {
                sb.append("\\\"");
            } else if (c2 == '\\') {
                if (i < wrap.length() - 1) {
                    int i2 = i + 1;
                    char c3 = wrap.get(i2);
                    if (c3 == 'n' || c3 == 't') {
                        sb.append("\\").append(c3);
                        i = i2;
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\\\");
                }
            } else if (c2 == '\n') {
                sb.append("\\n");
            } else {
                sb.append(c2);
            }
            i++;
        }
        return sb.toString();
    }
}
