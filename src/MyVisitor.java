import java.util.*;

public class MyVisitor<T> extends PHPParserBaseVisitor<T> {
    HashMap<String,String> ids = new HashMap<>();
    HashMap<String, ArrayList<String>> scope = new HashMap<String, ArrayList<String>>();
    String multiple;
    String ambito;
}