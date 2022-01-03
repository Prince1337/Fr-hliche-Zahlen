package main;

public class FroehlicheZahlen {
  public boolean isFroehlich(int zahl) {
    int ergebnis = 0;
    int ziffer;
    int runde = 1;

    while(ergebnis != 1 && runde < 10) {
      ergebnis = 0;
      while (zahl != 0) {
        ziffer = nehmeZiffer(zahl);
        ergebnis += quadriere(ziffer);
        zahl = naechsteZiffer(zahl);
      }
      runde++;
      zahl = ergebnis;
    }

    return ergebnis == 1;
  }

  private int nehmeZiffer(int zahl) {
    return zahl % 10;
  }

  private int quadriere(int quadratZahl) {
    return quadratZahl * quadratZahl;
  }

  private int naechsteZiffer(int zahl) {
    zahl = zahl / 10;
    return zahl;
  }


}
