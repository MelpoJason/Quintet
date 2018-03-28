package com.quintet.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class BaseModel {
    /**
     * @return
     * @see Object#toString()
     */
    public String toString() {
        try {
            return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
        } catch (Exception e) {
            // NOTICE: 这样做的目的是避免由于toString()的异常导致系统异常终止
            // 大部分情况下，toString()用在日志输出等调试场景
            return super.toString();
        }
    }
}
