import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.runtime.CharStream;

import java.io.IOException;
import java.io.InputStream;

public class CaseInsensitiveInputStream extends ANTLRInputStream {


    public CaseInsensitiveInputStream(InputStream inputStream) throws IOException {
        super(inputStream);
    }

    @Override
    public int LA(int i) {
        if (i == 0) return 0;
        if (i < 0) i++;
        if ((p + i - 1) >= n) return CharStream.EOF;
        return Character.toLowerCase(data[p + i - 1]);
    }
}
