/*
 * For personal use;
 */

/*
 * For personal use;
 */

package com.quintet.model.enums;

public enum Payment {

    CASH(0, "CASH"),
    CARD(1, "CARD"),
    COUPON(2, "COUPON"),
    VOUCHER(3, "VOUCHER");

    private Integer value;
    private String desc;

    Payment(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static boolean get(String desc) {
        for (Payment i : Payment.values()) {
            if (i.desc.equals(desc)) {
                return true;
            }
        }
        return false;
    }
}
