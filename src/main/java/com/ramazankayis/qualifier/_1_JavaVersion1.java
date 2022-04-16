package com.ramazankayis.qualifier;


import javax.enterprise.inject.Default;

@Default
public class _1_JavaVersion1 implements _0_IJavaInterface {

    @Override
    public String versions(String data) {
        return "Default : "+data;
    }
}
