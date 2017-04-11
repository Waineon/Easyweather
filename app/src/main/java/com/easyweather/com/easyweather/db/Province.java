package com.easyweather.com.easyweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Lenovo on 2017/4/7.
 */

public class Province extends DataSupport {

    private int id;
    private int provinceCode;
    private String provinceName;

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
