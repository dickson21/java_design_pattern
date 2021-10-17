import java.io.*;

public class HTMLBuilder extends Builder {
    private String filename;                           // ���ͪ��ɦW
    private PrintWriter writer;                        // �g�J���ɮת�PrintWriter
    public void makeTitle(String title) {              // HTML�ɪ����D
        filename = title + ".html";                    // �ھڼ��D�M�w�ɦW
        try {
            writer = new PrintWriter(new FileWriter(filename));  // �إ�PrintWriter
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head><title>" + title + "</title></head><body>");
        // ��X���D
        writer.println("<h1>" + title + "</h1>");
    }
    public void makeString(String str) {               // HTML�ɪ��r��
        writer.println("<p>" + str + "</p>");          // �H<p>���ҿ�X
    }
    public void makeItems(String[] items) {            // HTML�ɪ�����
        writer.println("<ul>");                        // �H<ul>�M<li>��X
        for (int i = 0; i < items.length; i++) {
            writer.println("<li>" + items[i] + "</li>");
        }
        writer.println("</ul>");
    }
    public Object getResult() {                        // ���������
        writer.println("</body></html>");              // ��������
        writer.close();                                // �����ɮ�
        return filename;                               // �Ǧ^�ɦW
    }
}
