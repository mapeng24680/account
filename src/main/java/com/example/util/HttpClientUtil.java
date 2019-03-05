package com.example.util;

//public class HttpClientUtil {
//
//    private static final Logger logger = Logger.getLogger(HttpClientUtil.class);
//
//    public static String executeGet(String url, String charset) throws Exception {
//    	logger.info("executeGet["+url+"]");
//        HttpClient client = HttpClientBuilder.create().build();
//        HttpGet get = new HttpGet(url);
//        String responseString = null;
//        if (null == url || !url.startsWith("http")) {
//            throw new Exception("请求地址格式不对");
//        }
//
//        // 设置请求的编码方式
//        if (null != charset) {
//            get.addHeader("Content-Type", "application/x-www-form-urlencoded; charset=" + charset);
//        } else {
//            get.addHeader("Content-Type", "application/x-www-form-urlencoded; charset=" + "utf-8");
//        }
//        HttpResponse response = client.execute(get);
//        int statusCode = response.getStatusLine().getStatusCode();
//
//        if (statusCode >= 200 && statusCode < 300) { // 打印服务器返回的状态
//            HttpEntity entity = response.getEntity();
//            // 在返回响应消息使用编码(utf-8或gb2312)
//            responseString = EntityUtils.toString(entity, "utf-8");
//        }
//        // 释放连接
//        get.releaseConnection();
//    	logger.info("executeGet:response["+responseString+"]");
//        return responseString;
//    }
//
//    public static String executePost(String url, String requestEntity, String charset) throws Exception {
//    	logger.info("executePost:url["+url+"]reqStr["+requestEntity+"]");
//        HttpClient client = HttpClientBuilder.create().build();
//        HttpPost post = new HttpPost(url);
//        post.setHeader("Content-Type", "application/json");
//        if (null == url || !url.startsWith("http")) {
//            throw new Exception("请求地址格式不对");
//        }
//        String responseString = "";
//        try {
//            StringEntity entity = new StringEntity(requestEntity, "UTF-8");
//            post.setEntity(entity);
//            // 执行postMethod
//            HttpResponse response = client.execute(post);
//            int statusCode = response.getStatusLine().getStatusCode();
//
//            if (statusCode >= 200 && statusCode < 300) {
//                HttpEntity entityResp = response.getEntity();
//                responseString = EntityUtils.toString(entityResp, "utf-8");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            if (post != null) {
//                post.releaseConnection();
//                post = null;
//            }
//        }
//    	logger.info("executePost:response["+responseString+"]");
//        return responseString;
//    }
//
//    public static InputStream executeFile(String url, String charset) throws Exception {
//        HttpClient client = HttpClientBuilder.create().build();
//        HttpPost post = new HttpPost(url);
//
//        if (null == url || !url.startsWith("http")) {
//            throw new Exception("请求地址格式不对");
//        }
//        // 设置请求的编码方式
//        if (null != charset) {
//            post.addHeader("Content-Type", "application/x-www-form-urlencoded; charset=" + charset);
//        } else {
//            post.addHeader("Content-Type", "application/x-www-form-urlencoded; charset=" + "utf-8");
//        }
//        InputStream response = null;
//        try {
//            // 执行postMethod
//            HttpResponse resp = client.execute(post);
//            int statusCode = resp.getStatusLine().getStatusCode();
//            if (statusCode == HttpStatus.SC_OK) {
//                HttpEntity entity = resp.getEntity();
//                response = entity.getContent();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            if (post != null) {
//                post.releaseConnection();
//                post = null;
//            }
//        }
//        return response;
//    }
//
//    /**
//     * 获取客户端的IP
//     *
//     * @param request
//     * @return
//     */
//    public static String getIpAddr(HttpServletRequest request) {
//        String ip = request.getHeader("x-forwarded-for");
//        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
//            ip = request.getHeader("Proxy-Client-IP");
//        }
//        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
//            ip = request.getHeader("WL-Proxy-Client-IP");
//        }
//        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
//            ip = request.getRemoteAddr();
//        }
//        return ip;
//    }
//
//    /**
//     * 获取request里所有请求参数
//     * @param request
//     * @return
//     * @author KongXiangyu
//     */
//    public static String getRequestParamStr(HttpServletRequest request) {
//        Enumeration enu = request.getParameterNames();
//        String requestStr = "";
//        while (enu.hasMoreElements()) {
//            String paraName = (String) enu.nextElement();
//            requestStr += paraName + "=" + request.getParameter(paraName) + "&";
//        }
//        return requestStr;
//    }
//
//    /**
//     * 获取服务器url根目录
//     * @param request
//     * @return
//     * @author KongXiangyu
//     */
//    public static String getServerPath(HttpServletRequest request) {
//        String path = request.getContextPath();
//        String basePath = request.getScheme() + "://" + request.getServerName() + ((request.getServerPort() == 80) ? "" : (":" + request.getServerPort())) + path;
//        return basePath;
//    }
//
//}
