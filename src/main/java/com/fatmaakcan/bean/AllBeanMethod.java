package com.fatmaakcan.bean;

import jakarta.annotation.PreDestroy;

abstract public class AllBeanMethod {

    // Bean oluşturulduğunda çalışacak method
   abstract public void onInit();

    // Bean yok edilemeden hemen önde çalışacak metot

    abstract public void onDestroy();

}
