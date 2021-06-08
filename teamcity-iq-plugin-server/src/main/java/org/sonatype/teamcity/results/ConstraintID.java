
// ConstraintID.java

package org.sonatype.teamcity.results;

import java.io.IOException;

public enum ConstraintID {
    B14580730_A124_B2292_C3_C53708_AECEE8, E309_DDA31_E464693_B18_E2470_B73_A9_A40, THE_0_DFA1_CE1_B7_C146049_A3_F8309_E857081_F, THE_2_BB9_B555_D0254_DD2_A7248_FFC5_EDFADF0, THE_5_BF28_C777_E704_AEC95_FD337678_F0575_F, THE_611_B1_B38955_E44199731_C393_DDABF67_C, THE_6_C330_D5_C0_A584_D969_E25_C05371_FDB3_FC;

    public String toValue() {
        switch (this) {
            case B14580730_A124_B2292_C3_C53708_AECEE8: return "b14580730a124b2292c3c53708aecee8";
            case E309_DDA31_E464693_B18_E2470_B73_A9_A40: return "e309dda31e464693b18e2470b73a9a40";
            case THE_0_DFA1_CE1_B7_C146049_A3_F8309_E857081_F: return "0dfa1ce1b7c146049a3f8309e857081f";
            case THE_2_BB9_B555_D0254_DD2_A7248_FFC5_EDFADF0: return "2bb9b555d0254dd2a7248ffc5edfadf0";
            case THE_5_BF28_C777_E704_AEC95_FD337678_F0575_F: return "5bf28c777e704aec95fd337678f0575f";
            case THE_611_B1_B38955_E44199731_C393_DDABF67_C: return "611b1b38955e44199731c393ddabf67c";
            case THE_6_C330_D5_C0_A584_D969_E25_C05371_FDB3_FC: return "6c330d5c0a584d969e25c05371fdb3fc";
        }
        return null;
    }

    public static ConstraintID forValue(String value) throws IOException {
        if (value.equals("b14580730a124b2292c3c53708aecee8")) return B14580730_A124_B2292_C3_C53708_AECEE8;
        if (value.equals("e309dda31e464693b18e2470b73a9a40")) return E309_DDA31_E464693_B18_E2470_B73_A9_A40;
        if (value.equals("0dfa1ce1b7c146049a3f8309e857081f")) return THE_0_DFA1_CE1_B7_C146049_A3_F8309_E857081_F;
        if (value.equals("2bb9b555d0254dd2a7248ffc5edfadf0")) return THE_2_BB9_B555_D0254_DD2_A7248_FFC5_EDFADF0;
        if (value.equals("5bf28c777e704aec95fd337678f0575f")) return THE_5_BF28_C777_E704_AEC95_FD337678_F0575_F;
        if (value.equals("611b1b38955e44199731c393ddabf67c")) return THE_611_B1_B38955_E44199731_C393_DDABF67_C;
        if (value.equals("6c330d5c0a584d969e25c05371fdb3fc")) return THE_6_C330_D5_C0_A584_D969_E25_C05371_FDB3_FC;
        throw new IOException("Cannot deserialize ConstraintID");
    }
}
