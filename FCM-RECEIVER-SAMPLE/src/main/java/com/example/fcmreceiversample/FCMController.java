package com.example.fcmreceiversample;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class FCMController {
    private final FCMInit init;

    @GetMapping("/v1")
    public String v1() {
        init.init();
        return "fcm";
    }

}
