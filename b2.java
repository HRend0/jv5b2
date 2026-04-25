import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        int lap = 100000;
        long start, end;

        String str = "Hello";
        start = System.currentTimeMillis();
        for (int i = 0; i < lap; i++) {
            str += " World";
        }
        end = System.currentTimeMillis();
        long string = end - start;

        StringBuilder sBuilder = new StringBuilder("Hello");
        start = System.currentTimeMillis();
        for (int i = 0; i < lap; i++) {
            sBuilder.append(" World");
        }
        end = System.currentTimeMillis();
        long builder = end - start;

        StringBuffer sBuffer = new StringBuffer("Hello");
        start = System.currentTimeMillis();
        for (int i = 0; i < lap; i++) {
            sBuffer.append(" World");
        }
        end = System.currentTimeMillis();
        long buffer = end - start;

        System.out.println("Thời gian thực hiện với String: " + string + " ms");
        System.out.println("Thời gian thực hiện với StringBuilder: " + builder + " ms");
        System.out.println("Thời gian thực hiện với StringBuffer: " + buffer + " ms");

        System.out.println("\nNhận xét:");
        System.out.println("- String: Không hiệu quả cho phép nối chuỗi nhiều lần do tạo ra nhiều đối tượng mới.");
        System.out.println("- StringBuilder: Hiệu quả và nhanh chóng, thích hợp cho nhiều thao tác nối chuỗi trong một luồng.");
        System.out.println("- StringBuffer: Tương tự như StringBuilder nhưng an toàn với đa luồng, có thể chậm hơn một chút do đồng bộ hóa.");
    }
}