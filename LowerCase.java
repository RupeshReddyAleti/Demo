import java.util.Optional;
public class LowerCase{
public static void main(String args[]){
String[] str = new String[10];
Optional<String> checkNull = Optional.ofNullable(str[5]);
if (checkNull.isPresent()){
String word = str[5].toLowerCase();
System.out.println(word);
}else
{
System.out.println("String is null");
}
}
}