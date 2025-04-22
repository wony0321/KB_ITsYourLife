package ch07.exam;

public class HttpServletExample {
    public static void main(String[] args) {
        method(new LoginServlet());
        method(new FileDownloadServlet());
    }

    // 부모에서 자식을 정의할때
//    HttpServlet servlet = new LoginServlet();

    public static void method(HttpServlet servlet) {
        servlet.service();
    }
}
