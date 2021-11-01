/*
 * 文件名：PersonInfo.java
 * 版权：Copyright 2020-2020 Love. Co. Ltd. All Rights Reserved.
 * 描述：anthony_zcc
 * 修改人：anthony_zcc
 * 修改时间：2020年12月18日
 * 系统名称：study-project
 */
package com.sunshine.studyproject;

import lombok.Data;

import java.io.Serializable;

/**
 * <功能简述>
 *
 * @author anthony_zcc
 * @version 1.0 2020年12月18日
 * @see PersonInfo
 * @since 1.0
 */
@Data
public class PersonInfo implements Serializable {

    private String contactMobile;
    private String name;

}