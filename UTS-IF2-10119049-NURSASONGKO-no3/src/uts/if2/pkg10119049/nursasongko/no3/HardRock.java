package uts.if2.pkg10119049.nursasongko.no3;
public class HardRock implements PopRock, ProgressiveRock,PsycehedellicRock{
    public void genreHardRock(String artistName){
        System.out.printf("%s adalah musisi HardRock\n",artistName);
    } 
    @Override
    public void genrePopRock(String artistName){
        System.out.printf("%s adalah musisi PopRock\n",artistName);
    } 
    @Override
    public void genrePsycehedellicRock(String artistName){        
        System.out.printf("%s adalah musisi PsycehedellicRock\n",artistName);
    } 
    @Override
    public void genreProgressiveRock(String artistName){
        System.out.printf("%s adalah musisi Progressive Rock\n",artistName);
    } 
}
