import java.util.Hashtable;

public class BigCharFactory {
    // �޲z�{����BigChar���������
    private Hashtable pool = new Hashtable();
    // Singleton Pattern
    private static BigCharFactory singleton = new BigCharFactory();
    // �غc�l
    private BigCharFactory() {
    }
    // ���o�ߤ@���������
    public static BigCharFactory getInstance() {
        return singleton;
    }
    // ���͡]�@�Ρ^BigChar���������
    public synchronized BigChar getBigChar(char charname) {
        BigChar bc = (BigChar)pool.get("" + charname);
        if (bc == null) {
            bc = new BigChar(charname); 	// �b������BigChar���������
            pool.put("" + charname, bc);
        }
        return bc;
    }
}
