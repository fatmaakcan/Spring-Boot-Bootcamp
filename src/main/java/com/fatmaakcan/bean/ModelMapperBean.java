package com.fatmaakcan.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperBean extends AllBeanMethod{

    private final ModelMapper modelMapper = new ModelMapper();

    @Bean(name = "modelMapper")
    public ModelMapper modelMapperMethod(){
        // 1.YOL
        // ModelMapper data = new modelMapper();

        // 2.YOL
        // return new ModelMapper();

        // 3.Yol
        return modelMapper;
    }


@PostConstruct // Bean oluşturulduğunda çalışacak method
@Override
public void onInit(){
    System.out.println("ModelMapper basladi...");
}

@PreDestroy // Bean yok edilemeden hemen önde çalışacak metot
@Override
public void onDestroy(){
        System.out.println("ModelMapper bean oldu...");

    }

} // end ModelMapper