package uts.if2.pkg10119049.nursasongko.no3;
public class Rnb implements Jazz, Blues{

    @Override
    public void genreJazz(String artistName) {
        System.out.printf("%s adalah musisi Jazz\n",artistName);
    }

    @Override
    public void genreBlues(String artistName) {
        System.out.printf("%s adalah musisi Blues\n",artistName);
    }
    
}
