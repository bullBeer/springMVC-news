package com.bullBeer.configurations;
import java.util.HashMap;
import java.util.Map;
// 请求配置类
public class RequestUrl {
  private static Map<String, String> map = new HashMap<>();
  static {
    map.put("requestHome", "/api/home"); // 首页
    map.put("requestNav", "/api/nav"); // 导航
    map.put("requestNewsDetail", "/api/news_detail"); // 新闻详情
  }
  public static String getUrl(String name) {
    return map.get(name);
  }
}
