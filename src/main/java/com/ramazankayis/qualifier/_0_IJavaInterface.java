package com.ramazankayis.qualifier;

//@Alternative ==> 1 tane interface 2 farklı class implements etmiş ve bunlarda sadece bir tanesi çalışır yani
//birisi kapalı olur diğeri açık olur

//@Qualifer    ==> 1 tane interface 2 farklı class implements etmiş ve bunlardan ikiside çalışır ancak biz default olarak
//çalışmasını istediğimizde kullanırız


//@Alternative : aynı anda sadece 1 tane proje çalışıyor diğerleri kapalı  ==> Dikkat: Beans.xml eklenmesi gerekiyor
//@@ualifier   : aynı anda birden fazla proje aktif ancak default olarak çalışacak projeyi seçebiliyoruz. ==> Bean Birşey ekleme

public interface _0_IJavaInterface {

    public String versions(String data);
}
