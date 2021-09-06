package com.demo.domain.common;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author: zhucj_sh
 * @Date: 2021/7/12 17:27
 */
public class CountryCurrencyRelation {
    private String countryCode;

    private List<String> currency = new ArrayList<String>();

    private Map<String,List<String>> relation;

    @PostConstruct
    private void init(){
        // init relation map
    }

    CountryCurrencyRelation(String countryCode,List<String> currency){
        this.countryCode = countryCode;
        this.currency = currency;
    }

    CountryCurrencyRelation(String countryCode,String currency){
        this.countryCode = countryCode;
        this.currency.add(currency);
    }

}
