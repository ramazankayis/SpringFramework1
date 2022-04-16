package com.ramazankayis.qualifier;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value="qualifer")
@ApplicationScoped
public class _3_OracleVersion {

    //default
    //@Inject
    //private _0_IJavaInterface iJavaInterface;

    @Inject
    @QualifierMultiple
    private _0_IJavaInterface iJavaInterface;


    public String oracleVersionMethod(String data){
        return iJavaInterface.versions(data);
    }
}
