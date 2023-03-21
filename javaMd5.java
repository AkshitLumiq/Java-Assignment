import java.io.*;
import java.util.*;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    try {
      // get md5 instance of message digest
      MessageDigest md5 = MessageDigest.getInstance("MD5");

      // input msg(int bytes) is passed into md5 msgDigest to get byte arr digest
      byte[] msgdigest = md5.digest(str.getBytes());

      // System.out.println(digest[0]);
      // byte to signum
      BigInteger no = new BigInteger(1, msgdigest);

      // hex value
      String res = no.toString(16);

      // need value to be 32 character
      // while(res.length() < 32)
      // res = "0" + res;

      System.out.println(res);
    } catch (NoSuchAlgorithmException e) {
      e.printStackTrace();
    }
  }
}
