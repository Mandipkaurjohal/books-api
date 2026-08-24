package com.luv2code.books.controller;

import com.luv2code.books.entity.Mobile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MobilePractiseController {

     List<Mobile> mobile=new ArrayList<>();

public  void addMobileData()
{
    mobile.addAll(List.of(
            new Mobile("Apple","iphone 15","black"),
            new Mobile("Samsung","Gallaxy","white")

            ));
}

@GetMapping("/mobile")
    public List<Mobile> getMobile()
{
    addMobileData();
    return mobile;
}


}
