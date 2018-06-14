
package infoprojekt11;


public class Infoprojekt11 {

    
    public static void main(String[] args) {
        int n = 18;
        String mannschaft [] = new String [n];
        mannschaft[0] = "Bayern München";
        mannschaft[1] = "Schalke 04";
        mannschaft[2] = "TSG Hoffenheim";
        mannschaft[3] = "Borussia Dortmund";
        mannschaft[4] = "Bayer 04 Leverkusen";
        mannschaft[5] = "RB Leipzig";
        mannschaft[6] = "VfB Stuttgart";
        mannschaft[7] = "Eintracht Frankfurt";
        mannschaft[8] = "Borussia Mönchengladbach";
        mannschaft[9] = "Hertha BSC";
        mannschaft[10] = "Werder Bremen";
        mannschaft[11] = "FC Augsburg";
        mannschaft[12] = "Hannover 96";
        mannschaft[13] = "1. FSV Mainz 05";
        mannschaft[14] = "SC Freiburg";
        mannschaft[15] = "VfL Wolfsburg";
        mannschaft[16] = "Hamburger SV";
        mannschaft[17] = "1. FC Köln";
        
        int k[] = new int[(n/2)];
        k[0] = (n/2)-8;
        k[1] = (n/2)-7;
        k[2] = (n/2)-6;
        k[3] = (n/2)-5;
        k[4] = (n/2)-4;
        k[5] = (n/2)-3;
        k[6] = (n/2)-2;
        k[7] = (n/2)-1;
        
        for (int i=1; i<=17; i++){
        Spieltag s_i = new Spieltag();
        
        s_i.mannschaft18 = mannschaft[n-1];
        s_i.mannschaft1  = mannschaft[i-1];
        s_i.mannschaft2  = mannschaft[(i+k[0]+n)%(n-1)];
        s_i.mannschaft17 = mannschaft[(i-k[0]+n)%(n-1)];
        s_i.mannschaft3  = mannschaft[(i+k[1]+n)%(n-1)];
        s_i.mannschaft16 = mannschaft[(i-k[1]+n)%(n-1)];
        s_i.mannschaft4  = mannschaft[(i+k[2]+n)%(n-1)];
        s_i.mannschaft15 = mannschaft[(i-k[2]+n)%(n-1)];
        s_i.mannschaft5  = mannschaft[(i+k[3]+n)%(n-1)];
        s_i.mannschaft14 = mannschaft[(i-k[3]+n)%(n-1)];
        s_i.mannschaft6  = mannschaft[(i+k[4]+n)%(n-1)];
        s_i.mannschaft13 = mannschaft[(i-k[4]+n)%(n-1)];
        s_i.mannschaft7  = mannschaft[(i+k[5]+n)%(n-1)];
        s_i.mannschaft12 = mannschaft[(i-k[5]+n)%(n-1)];
        s_i.mannschaft8  = mannschaft[(i+k[6]+n)%(n-1)];
        s_i.mannschaft11 = mannschaft[(i-k[6]+n)%(n-1)];
        s_i.mannschaft9  = mannschaft[(i+k[7]+n)%(n-1)];
        s_i.mannschaft10 = mannschaft[(i-k[7]+n)%(n-1)];    
        
        System.out.println("\n\nSpieltag"+i);
        
        if(i%2==0){
            System.out.println(s_i.mannschaft18+"-"+s_i.mannschaft1);
        }
        else{
            System.out.println(s_i.mannschaft1+"-"+s_i.mannschaft18);
        }
        if(k[0]%2==0){
            System.out.println(s_i.mannschaft17+"-"+s_i.mannschaft2);
        }
        else{
            System.out.println(s_i.mannschaft2+"-"+s_i.mannschaft17);
        }
         if(k[1]%2==0){
            System.out.println(s_i.mannschaft16+"-"+s_i.mannschaft3);
        }
        else{
            System.out.println(s_i.mannschaft3+"-"+s_i.mannschaft16);
        }
          if(k[2]%2==0){
            System.out.println(s_i.mannschaft15+"-"+s_i.mannschaft4);
        }
        else{
            System.out.println(s_i.mannschaft4+"-"+s_i.mannschaft15);
        }
        if(k[3]%2==0){
            System.out.println(s_i.mannschaft14+"-"+s_i.mannschaft5);
        }
        else{
            System.out.println(s_i.mannschaft5+"-"+s_i.mannschaft14);
        }
        if(k[4]%2==0){
            System.out.println(s_i.mannschaft13+"-"+s_i.mannschaft6);
        }
        else{
            System.out.println(s_i.mannschaft6+"-"+s_i.mannschaft13);
        }
        if(k[5]%2==0){
            System.out.println(s_i.mannschaft12+"-"+s_i.mannschaft7);
        }
        else{
            System.out.println(s_i.mannschaft7+"-"+s_i.mannschaft12);
        }
        if(k[6]%2==0){
            System.out.println(s_i.mannschaft11+"-"+s_i.mannschaft8);
        }
        else{
            System.out.println(s_i.mannschaft8+"-"+s_i.mannschaft11);
        }
        if(k[7]%2==0){
            System.out.println(s_i.mannschaft10+"-"+s_i.mannschaft9);
        }
        else{
            System.out.println(s_i.mannschaft9+"-"+s_i.mannschaft10);
        }
         }
    
}

    }
    

