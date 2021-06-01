
// PolicyID.java

package jetbrains.teamcity;

import java.io.IOException;

public enum PolicyID {
    E87_A77_D0767_F4_BAF8655_B9_FAE98_F4_FF7, THE_17_BF262_A9_B214_AD9_A5604372_A2_C78_CAA, THE_2_BFBF7_AB5_FFB4524_A953_CB3_F9_A4_BCE67, THE_4038_C5_A035_AC425_BADD2_BD6_AA8_B085_F9, THE_520_E3_E72_BD204556_AFCC2_CD255_E11317, THE_5_A319_B2_C53_E44_C988_CFB423777_ECB82_B;

    public String toValue() {
        switch (this) {
            case E87_A77_D0767_F4_BAF8655_B9_FAE98_F4_FF7: return "e87a77d0767f4baf8655b9fae98f4ff7";
            case THE_17_BF262_A9_B214_AD9_A5604372_A2_C78_CAA: return "17bf262a9b214ad9a5604372a2c78caa";
            case THE_2_BFBF7_AB5_FFB4524_A953_CB3_F9_A4_BCE67: return "2bfbf7ab5ffb4524a953cb3f9a4bce67";
            case THE_4038_C5_A035_AC425_BADD2_BD6_AA8_B085_F9: return "4038c5a035ac425badd2bd6aa8b085f9";
            case THE_520_E3_E72_BD204556_AFCC2_CD255_E11317: return "520e3e72bd204556afcc2cd255e11317";
            case THE_5_A319_B2_C53_E44_C988_CFB423777_ECB82_B: return "5a319b2c53e44c988cfb423777ecb82b";
        }
        return null;
    }

    public static PolicyID forValue(String value) throws IOException {
        if (value.equals("e87a77d0767f4baf8655b9fae98f4ff7")) return E87_A77_D0767_F4_BAF8655_B9_FAE98_F4_FF7;
        if (value.equals("17bf262a9b214ad9a5604372a2c78caa")) return THE_17_BF262_A9_B214_AD9_A5604372_A2_C78_CAA;
        if (value.equals("2bfbf7ab5ffb4524a953cb3f9a4bce67")) return THE_2_BFBF7_AB5_FFB4524_A953_CB3_F9_A4_BCE67;
        if (value.equals("4038c5a035ac425badd2bd6aa8b085f9")) return THE_4038_C5_A035_AC425_BADD2_BD6_AA8_B085_F9;
        if (value.equals("520e3e72bd204556afcc2cd255e11317")) return THE_520_E3_E72_BD204556_AFCC2_CD255_E11317;
        if (value.equals("5a319b2c53e44c988cfb423777ecb82b")) return THE_5_A319_B2_C53_E44_C988_CFB423777_ECB82_B;
        throw new IOException("Cannot deserialize PolicyID");
    }
}