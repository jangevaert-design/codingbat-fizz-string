public class fizzString {
  public String fizzString(String str) {
    if (str.startsWith("f") && str.endsWith("b")) {
      return ("FizzBuzz");
    } else if (str.endsWith("b")) {
      return ("Buzz");
    } else if (str.startsWith("f")) {
      return ("Fizz");
    } else {
      return str;
    }
  }

/* more concise
public String fizzString(String str) {
boolean fizz = str.charAt(0) == 'f';
boolean buzz = str.charAt(str.length() - 1) == 'b';

if (fizz && buzz)
return "FizzBuzz";

if (fizz)
  return "Fizz";

if (buzz)
  return "Buzz";

return str;
}
*/

}
