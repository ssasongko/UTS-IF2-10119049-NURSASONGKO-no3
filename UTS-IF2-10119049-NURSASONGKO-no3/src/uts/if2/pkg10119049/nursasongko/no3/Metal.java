package uts.if2.pkg10119049.nursasongko.no3;

public class Metal implements HeavyMetal{

    @Override
    public void genreHeavyMetal(String artistName) {
        System.out.printf("%s adalah musisi HeavyMetal\n",artistName);
    }

    @Override
    public void genrePunk(String artistName) {
        System.out.printf("%s adalah musisi Punk\n",artistName);
    }
 
}
