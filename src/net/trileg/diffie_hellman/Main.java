package net.trileg.diffie_hellman;

import java.math.BigInteger;

public class Main {

  public static void main(String[] args) {
    DH dh = new DH();
    BigInteger result = dh.generateP();
    System.out.println(result);
  }
}
