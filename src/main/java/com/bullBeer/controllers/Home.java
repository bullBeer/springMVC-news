package com.bullBeer.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class Home {
  @RequestMapping("/api/home")
  @ResponseBody
  public Object doRequest() {
    Map<String, String> result = new HashMap<String, String>();
    result.put("name", "Tom");
    result.put("age", "18");
    result.put("city", "Shenzhen");
    return result;
  }
}
