package 装设者模式;

public class 小写转换输入流 extends java.io.FilterInputStream {
    public 小写转换输入流(java.io.InputStream in) {
        super(in);
    }

    @Override
    public int read() throws java.io.IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase((char) c));
    }

    @Override
    public int read(byte[] b, int offset, int len) throws java.io.IOException {
        int result = super.read(b, offset, len);
        for (int i = offset; i < offset + result; i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }
        return result;
    }
}
