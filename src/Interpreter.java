import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Interpreter {

    public static void main(String [] args) throws Exception{
        System.out.println("llega");
        /*InputStream originalInput = System.in;
        System.setIn(new FileInputStream(new File("input.txt")));
        CaseInsensitiveInputStream input = new CaseInsensitiveInputStream(System.in);
        PHPLexer lexer = new PHPLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PHPParser parser = new PHPParser(tokens);
        ParseTree tree = parser.htmlDocument();
        System.setIn(originalInput);
        MyVisitor<Object> loader = new MyVisitor<Object>();
        loader.visit(tree);*/
    }
}