package com.damm.common.utils;

import org.slf4j.MDC;

/**
 * @author 黄林强
 * @ClassName MDCUtil
 * @description: TODO
 * @date 2024年07月07日
 * @version: 1.0
 */
public class MDCUtil {

    public static String getRecordId() {
        return MDC.get("recordId");
    }
}
