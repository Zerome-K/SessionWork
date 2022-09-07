class ChessBoardCalculation {
    public static void main(String[] args) {
        int i= 1;
        double tot = 0,  a = 1;
        while(i++ <= 64){
            tot += a;
            a *= 2;
        }
        System.out.println("Total Kgs of Rice : " + tot);
    }
}
/* Result : Total Kgs of Rice : 1.8446744073709552E19 */
