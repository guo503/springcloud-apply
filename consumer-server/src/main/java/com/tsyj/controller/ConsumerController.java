package com.tsyj.controller;

import com.tsyj.remote.ProducerRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 594781919@qq.com
 * @date: 2018/5/8
 */
@RestController
public class ConsumerController {

    @Autowired
    private ProducerRemote producerRemote;

    @GetMapping("/")
    public String get() {
        return "Consumer: " + producerRemote.get();
    }

}
