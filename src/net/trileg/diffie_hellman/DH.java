package net.trileg.diffie_hellman;

import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class DH {
  public BigInteger generateP() {
    BigInteger result = BigInteger.ONE;

    try {
      SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
      result = BigInteger.probablePrime(4096, secureRandom);
    } catch (NoSuchAlgorithmException e) {
      e.printStackTrace();
      System.exit(-1);
    }

    return result;
  }
}
